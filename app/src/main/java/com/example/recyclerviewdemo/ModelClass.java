package com.example.recyclerviewdemo;

public class ModelClass {
    String contactname,contactnumber;
    int contactphoto;

    public ModelClass() {
    }

    public ModelClass(String contactname, String contactnumber, int contactphoto) {
        this.contactname = contactname;
        this.contactnumber = contactnumber;
        this.contactphoto = contactphoto;
    }

    public String getContactname() {
        return contactname;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public int getContactphoto() {
        return contactphoto;
    }
}
