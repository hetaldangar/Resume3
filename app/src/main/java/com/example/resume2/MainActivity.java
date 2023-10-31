package com.example.resume2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgresume1, imgresume2, imgresume3, imgresume4, imgresume5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
    }

    private void initview() {




        Intent intent = getIntent();
        String number = intent.getStringExtra("number");
        String address = intent.getStringExtra("address");
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        String mark10 = intent.getStringExtra("mark10");
        String mark12 = intent.getStringExtra("mark12");
        String year10 = intent.getStringExtra("year10");
        String year12 = intent.getStringExtra("year12");
        String yearexperience = intent.getStringExtra("yearexperience");











        imgresume1 = findViewById(R.id.imgresume1);
        imgresume2 = findViewById(R.id.imgresume2);
        imgresume3 = findViewById(R.id.imgresume3);
        imgresume4 = findViewById(R.id.imgresume4);
        imgresume5 = findViewById(R.id.imgresume5);

        imgresume1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResumeActivity5.class);
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

            }
        });
        imgresume2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResumeActivity2.class);
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

            }
        });

        imgresume3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResumeActivity3.class);
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
            }
        });
        imgresume4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResumeActivity4.class);
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
            }
        });
        imgresume5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResumeActivity1.class);
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
            }
        });

    }


}
