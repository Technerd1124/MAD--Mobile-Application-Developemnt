package com.example.practical_7_exerice_2;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find Views
        EditText etName = findViewById(R.id.student_name); // Ensure ID matches XML
        EditText etRollNumber = findViewById(R.id.editTextRollNumber); // Ensure ID matches XML
        Button btnSubmit = findViewById(R.id.submit_btn); // Ensure ID matches XML
        TextView tvDisplay = findViewById(R.id.TVdisplay); // Ensure ID matches XML

        // Set Button Click Listener
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get Input Values
                String name = etName.getText().toString().trim();
                String rollNumber = etRollNumber.getText().toString().trim();

                // Check for Empty Fields
                if (name.isEmpty() || rollNumber.isEmpty()) {
                    tvDisplay.setText("Please fill in all the fields.");
                } else {
                    // Display the Student Information
                    String studentInfo = "Name: " + name + "\n"
                            + "Roll Number: " + rollNumber;
                    tvDisplay.setText(studentInfo);
                }
            }
        });
    }
}
