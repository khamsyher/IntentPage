package com.example.testforexam7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtID=(EditText) findViewById(R.id.edtID);
        EditText edtname=(EditText) findViewById(R.id.edtname);
        EditText edtsurname=(EditText) findViewById(R.id.edtsurname);
        EditText edtage=(EditText) findViewById(R.id.edtage);
        Button btnShow = (Button) findViewById(R.id.btnShow);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ShowData.class);
                i.putExtra("ID",edtID.getText().toString());
                i.putExtra("name",edtname.getText().toString());
                i.putExtra("surname",edtsurname.getText().toString());
                i.putExtra("age",edtage.getText().toString());
                startActivity(i);
            }
        });
    }
}