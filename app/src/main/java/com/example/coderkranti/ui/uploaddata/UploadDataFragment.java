package com.example.coderkranti.ui.uploaddata;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.coderkranti.R;
import com.example.coderkranti.ui.home.HomeViewModel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

public class UploadDataFragment extends Fragment {
    private ImageView upload;
    private ProgressDialog dialog;
    private Uri imageUri = null;
    private static final int REQUEST_PDF = 1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        UploaddataViewModel uploaddataViewModel =
                new ViewModelProvider(this).get(UploaddataViewModel.class);

        View root = inflater.inflate(R.layout.fragment_uploaddata, container, false);


        final TextView textView = root.findViewById(R.id.uploadtext);
        uploaddataViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        upload = root.findViewById(R.id.uploadpdf);
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent galleryIntent = new Intent();
                galleryIntent.setAction(Intent.ACTION_GET_CONTENT);
                galleryIntent.setType("application/pdf");
                startActivityForResult(galleryIntent, REQUEST_PDF);
            }
        });

        return root;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_PDF && resultCode == getActivity().RESULT_OK && data != null && data.getData() != null) {
            dialog = new ProgressDialog(getActivity());
            dialog.setMessage("Uploading");
            dialog.show();

            imageUri = data.getData();
            final String timestamp = String.valueOf(System.currentTimeMillis());
            StorageReference storageReference = FirebaseStorage.getInstance().getReference();
            final String messagePushID = timestamp;

            final StorageReference filepath = storageReference.child(messagePushID + ".pdf");

            filepath.putFile(imageUri)
                    .addOnCompleteListener(new OnCompleteListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<UploadTask.TaskSnapshot> task) {
                            if (task.isSuccessful()) {
                                dialog.dismiss();
                                filepath.getDownloadUrl().addOnCompleteListener(new OnCompleteListener<Uri>() {
                                    @Override
                                    public void onComplete(@NonNull Task<Uri> task) {
                                        if (task.isSuccessful()) {
                                            Uri uri = task.getResult();
                                            String myurl = uri.toString();
                                            Toast.makeText(getActivity(), "Uploaded Successfully", Toast.LENGTH_SHORT).show();
                                        } else {
                                            Toast.makeText(getActivity(), "Failed to get download URL", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                });
                            } else {
                                dialog.dismiss();
                                Toast.makeText(getActivity(), "Upload Failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }
    }
}
