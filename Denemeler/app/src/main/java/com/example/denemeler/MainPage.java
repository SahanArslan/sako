package com.example.denemeler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainPage extends AppCompatActivity {
        private Button sendMail,listUsers,settings,noteBook,sensors,about;

        private String username;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        sendMail=(Button)findViewById(R.id.button1);
        listUsers=(Button)findViewById(R.id.button2);
        settings=(Button)findViewById(R.id.button3);
        noteBook=(Button)findViewById(R.id.button4);
        sensors=(Button)findViewById(R.id.button5);
        about=(Button)findViewById(R.id.button6);

        Intent i=getIntent();
        username=i.getStringExtra("username");

        sendMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),SendMail.class);
                i.putExtra("username",username);
                startActivity(i);
                finish();
            }
        });
        listUsers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),ListUsers.class);
                i.putExtra("username",username);
                startActivity(i);
                finish();
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Settings.class);
                i.putExtra("username",username);
                startActivity(i);
                finish();
            }
        });

        noteBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),NoteBook.class);
                i.putExtra("username",username);
                startActivity(i);
                finish();
            }
        });

        sensors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Sensors.class);
                i.putExtra("username",username);
                startActivity(i);
                finish();
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),About.class);
                i.putExtra("username",username);
                startActivity(i);
                finish();
            }
        });


    }
}
