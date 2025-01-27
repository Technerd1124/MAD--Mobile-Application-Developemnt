package com.example.practical9_ex_2_calculator;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.*;



public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find views by their ID's

        EditText number1 ,number2;
        TextView result_box = findViewById(R.id.result_view);
        number1 = findViewById(R.id.no1);
        number2 = findViewById(R.id.no2);

        Button plus , minus, multiple,divide;
        plus = findViewById(R.id.pluse_btn);
        minus = findViewById(R.id.minus_btn);
        multiple = findViewById(R.id.mult_btn);
        divide = findViewById(R.id.divide_btn);


        plus  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String no1=number1.getText().toString();
               String no2=number2.getText().toString();
               if(no1.isEmpty() || no2.isEmpty()){
                   result_box.setText(" Please Enter Both the Numbers");
               }
               else {
                   int a= Integer.parseInt(no1);
                   int b= Integer.parseInt(no2);
                   int result_string =a+b;
                   result_box.setText(result_string);
               }
            }
        });







    }
}