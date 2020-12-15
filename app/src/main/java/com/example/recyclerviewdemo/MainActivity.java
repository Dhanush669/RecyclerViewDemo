package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<ModelClass> contactlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerid);
        contactlist=new ArrayList<>();
        ModelClass mc=new ModelClass("Dev__gd","7684928476",R.drawable.photo1);
        ModelClass mc1=new ModelClass("Dev__gd","7684928476",R.drawable.photo2);
        ModelClass mc2=new ModelClass("Dev__gd","7684928476",R.drawable.photo3);
        ModelClass mc3=new ModelClass("Dev__gd","7684928476",R.drawable.photo4);
        ModelClass mc4=new ModelClass("Dev__gd","7684928476",R.drawable.photo5);
        ModelClass mc5=new ModelClass("Dev__gd","7684928476",R.drawable.photo6);
        ModelClass mc6=new ModelClass("Dev__gd","7684928476",R.drawable.photo1);
        ModelClass mc7=new ModelClass("Dev__gd","7684928476",R.drawable.photo2);
        ModelClass mc8=new ModelClass("Dev__gd","7684928476",R.drawable.photo3);
        ModelClass mc9=new ModelClass("Dev__gd","7684928476",R.drawable.photo4);
        ModelClass mc10=new ModelClass("Dev__gd","7684928476",R.drawable.photo5);
        ModelClass mc11=new ModelClass("Dev__gd","7684928476",R.drawable.photo6);
        contactlist.add(mc);
        contactlist.add(mc1);
        contactlist.add(mc2);
        contactlist.add(mc3);
        contactlist.add(mc4);
        contactlist.add(mc5);
        contactlist.add(mc6);
        contactlist.add(mc7);
        contactlist.add(mc8);
        contactlist.add(mc9);
        contactlist.add(mc10);
        contactlist.add(mc11);
        RecyclerAdapter recyclerAdapter=new RecyclerAdapter(contactlist,MainActivity.this);
        recyclerView.setAdapter(recyclerAdapter);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}