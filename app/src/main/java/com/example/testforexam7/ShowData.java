package com.example.testforexam7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);
        TextView dis= (TextView) findViewById(R.id.dis);
        Intent ig = getIntent();
        String UID = ig.getStringExtra("ID");
        String name = ig.getStringExtra("name");
        String surname = ig.getStringExtra("surname");
        String age = ig.getStringExtra("age");
        dis.setText("ID:"+UID+"\n" + "name:" +name+ "\n" + "surname:" +surname +"\n"+"age:"+ age);

    }
}