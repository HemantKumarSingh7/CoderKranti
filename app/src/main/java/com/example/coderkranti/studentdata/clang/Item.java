package com.example.coderkranti.studentdata.clang;

public class Item {
    String langlist;
    int imagelist;
    String langlist2;
    public Item(String s , int langimage, String langl2)
    {
        this.langlist=s;
        this.imagelist=langimage;
        this.langlist2=langl2;
    }

    public String getLanglist() {
        return langlist;
    }



    public int getImagelist() {
        return imagelist;
    }



    public String getLanglist2() {
        return langlist2;
    }


}
