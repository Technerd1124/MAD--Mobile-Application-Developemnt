package com.example.prac_15_customtoast_b;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
CheckBox c1, c2, c3;
Button b1;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);

// Initializing CheckBoxes and Button
c1 = findViewById(R.id.checkBox1);
c2 = findViewById(R.id.checkBox2);
c3 = findViewById(R.id.checkBox3);
b1 = findViewById(R.id.button);
// Set Click Listener for ORDER button
b1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
int total = 0;
StringBuilder bill = new StringBuilder();
bill.append(&quot;Selected Items:&quot;);
if (c1.isChecked()) {
bill.append(&quot;\nPizza = 100 Rs&quot;);
total += 100;
}
if (c2.isChecked()) {
bill.append(&quot;\nCoffee = 50 Rs&quot;);
total += 50;
}
if (c3.isChecked()) {
bill.append(&quot;\nBurger = 120 Rs&quot;);
total += 120;
}
if (total == 0) {
Toast.makeText(MainActivity.this, &quot;No items selected!&quot;,
Toast.LENGTH_SHORT).show();
} else {
bill.append(&quot;\nTotal: &quot; + total + &quot; Rs&quot;);
Toast.makeText(MainActivity.this, bill.toString(),
Toast.LENGTH_LONG).show();
}
}
});
}
}