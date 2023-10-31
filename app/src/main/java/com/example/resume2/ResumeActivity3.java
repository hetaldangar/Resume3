package com.example.resume2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class ResumeActivity3 extends AppCompatActivity {
    TextView txtnumber,txtemail,txtaddress,txtmark10,txtmark12,txtyear10,txtyear12,txtname;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume3);
        initView();
    }

    private void initView() {
        txtemail = findViewById(R.id.txtemail);
        txtname = findViewById(R.id.txtname);
        txtaddress = findViewById(R.id.txtaddress);
        txtnumber = findViewById(R.id.txtnumber);
        txtmark10 = findViewById(R.id.txtmark10);
        txtmark12 = findViewById(R.id.txtmark12);
        txtyear10 = findViewById(R.id.txtyear10);
        txtyear12 = findViewById(R.id.txtyear12);



        Intent intent = getIntent();
        String number = intent.getStringExtra("number");
        String address = intent.getStringExtra("address");
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        String mark10 = intent.getStringExtra("mark10");
        String mark12 = intent.getStringExtra("mark12");
        String year10 = intent.getStringExtra("year10");
        String year12 = intent.getStringExtra("year12");





        txtemail.setText(email);
        txtname.setText(name);
        txtnumber.setText(number);
        txtaddress.setText(address);
        txtmark10.setText(mark10);
        txtmark12.setText(mark12);
        txtyear10.setText(year10);
        txtyear12.setText(year12);





    }
}