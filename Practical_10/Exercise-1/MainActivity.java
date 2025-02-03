package com.example.practical_10_ex_1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import  android.widget.*;


public class MainActivity extends AppCompatActivity {

    public Button loginBtn;
    public  EditText user,pass;
    public TextView resultState;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      user = (EditText) findViewById(R.id.usertv);
      pass = (EditText) findViewById(R.id.passtv);
      loginBtn = findViewById(R.id.button);





    }

}