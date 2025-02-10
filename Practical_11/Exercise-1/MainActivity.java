package com.example.practical_11_ex_1;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

     public  CheckBox mad,php,ajp,cpp,c;
     public  Button  submit;

 public Context context = getApplicationContext();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mad = findViewById(R.id.mad);
        php = findViewById(R.id.php);
        ajp = findViewById(R.id.ajp);
        cpp = findViewById(R.id.cpp);
        c = findViewById(R.id.cid);
        submit =findViewById(R.id.btn);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=" ";
                 if(mad.isChecked()){
                     val+="\n Android";
                 }
                 if(php.isChecked()){
                     val+="\n PHP";
                 }
                if(ajp.isChecked()){
                    val+="\n AJP";
                }
                if(cpp.isChecked()){
                    val+="\n CPP";
                }
                if(c.isChecked()){
                    val+="\n C ";
                }
                val="You have Selected" +val;
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, val, duration);
                toast.show();
            }
        });

    }
}