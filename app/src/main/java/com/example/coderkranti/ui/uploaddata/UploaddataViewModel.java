package com.example.coderkranti.ui.uploaddata;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UploaddataViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public UploaddataViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}

