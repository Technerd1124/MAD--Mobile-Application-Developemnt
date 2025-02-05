package com.example.practical_10_ex_1;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import  android.widget.*;

public class MainActivity extends AppCompatActivity {
    public Button loginBtn;
    public  EditText user,pass;
    public TextView resultState;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      user =  findViewById(R.id.usertv);
      pass =  findViewById(R.id.passtv);
      loginBtn = findViewById(R.id.button);
      resultState = findViewById(R.id.stateView);

     loginBtn.setOnClickListener(new View.OnClickListener() {

         @Override
         public void onClick(View view) {
             String  username = user.getText().toString().trim();
             String password = pass.getText().toString().trim();
             if (username.isEmpty() && password.isEmpty()) {
                 resultState.setText("Login Unsuccessful: Fields cannot be empty.");
             }else {
                 resultState.setText("Login Successful");
             }

         }
     });

    }

}