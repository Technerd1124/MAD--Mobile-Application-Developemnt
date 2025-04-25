package com.example.pract_15_custom_toast_a;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
Button b1;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
b1 = findViewById(R.id.button);
b1.setOnClickListener(new View.OnClickListener() {
@Override

public void onClick(View v) {
Toast toast = Toast.makeText(getApplicationContext(),
&quot;Message for you:\nYou have got mail!&quot;, Toast.LENGTH_LONG);
// Get the Toast view
View view = toast.getView();
if (view != null) {
// Customize the toast text
TextView text = view.findViewById(android.R.id.message);
if (text != null) {
text.setTextSize(20);
text.setTextColor(Color.WHITE);
text.setBackgroundColor(Color.BLACK);
}
}
// Set Toast position
toast.setGravity(Gravity.CENTER, 60, 100);
// Show the toast
toast.show();
}
});
}
}