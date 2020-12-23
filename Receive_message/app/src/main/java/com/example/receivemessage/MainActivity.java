package com.example.receivemessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=getIntent();
        //Toast.makeText(this, ""+intent.getData(), Toast.LENGTH_SHORT).show();
        if(intent.getStringExtra(Intent.EXTRA_TEXT)!=null){
            message=findViewById(R.id.messages);
            message.setText(intent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}