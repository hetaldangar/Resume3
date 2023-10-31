package com.example.resume2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class FormActivity extends AppCompatActivity {

    TextView txtedu, txthobby, txtlan, txtpersonalinfo, txtskill, txtnumber, txtemail, txtaddress,txtyaer10,txtyaer12,txtmark10,txtmark12;

    EditText edtname, edtaddress, edtnumber, edtemail,edtgraduation,edtmark10,edtmark12,edtyear10,edtyear12,edtyearexperience;

    CheckBox cbcoding,cbcreativity,cbleadership,cbteamwork,cbmarketing,cblearning;

    RadioButton rbsinging,rbdancing,rbreading,rbtravelling,rbmovies,rblearning,rbplaying,rbwriting;

    RadioGroup rg01,rg02,rg03,rg04;

    Button btnsubmit;

    StringBuilder skill = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        initView();
    }

    private void initView() {



        txtnumber = findViewById(R.id.txtnumber);
        txtemail = findViewById(R.id.txtemail);
        txtaddress = findViewById(R.id.txtaddress);
        txtmark10 = findViewById(R.id.txtmark10);
        txtmark12 = findViewById(R.id.txtmark12);













        edtname = findViewById(R.id.edtname);
        edtnumber = findViewById(R.id.edtnumber);
        edtemail = findViewById(R.id.edtemail);
        edtaddress = findViewById(R.id.edtaddress);
        edtmark10 = findViewById(R.id.edtmark10);
        edtmark12 = findViewById(R.id.edtmark12);
        edtyear10 = findViewById(R.id.edtyear10);
        edtyear12 = findViewById(R.id.edtyear12);
        edtyearexperience = findViewById(R.id.edtyearexperience);



        btnsubmit = findViewById(R.id.btnsubmit);





        btnsubmit.setOnClickListener(v -> {

            String number = edtnumber.getText().toString();

            String email = edtemail.getText().toString();
            String name = edtname.getText().toString();
            String address = edtaddress.getText().toString();
            String mark10 = edtmark10.getText().toString();
            String mark12 = edtmark12.getText().toString();
            String year10  = edtyear10.getText().toString();
            String year12  = edtyear12.getText().toString();
            String yearexperience = edtyearexperience.getText().toString();






            Intent intent = new Intent(FormActivity.this, MainActivity.class);
            intent.putExtra("number", number);
            intent.putExtra("email",email );
            intent.putExtra("name", name);
            intent.putExtra("address", address);
            intent.putExtra("mark10", mark10);
            intent.putExtra("mark12", mark12);
            intent.putExtra("year10", year10);
            intent.putExtra("year12", year12);
            intent.putExtra("yearexperience", yearexperience);




            startActivity(intent);





        });




    }
}
