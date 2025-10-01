package com.iot.todaydestiny;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InputActivity extends AppCompatActivity {

    EditText editBirth, editName;
    Button btnShowResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_input);
        editBirth = findViewById(R.id.editBirth);
        editName = findViewById(R.id.editName);
        btnShowResult = findViewById(R.id.btnShowResult);

        btnShowResult.setOnClickListener(v -> {
            String birth = editBirth.getText().toString();
            String name = editName.getText().toString();

            Intent intent = new Intent(InputActivity.this, ResultActivity.class);
            intent.putExtra("birth", birth);
            intent.putExtra("name", name);
            startActivity(intent);
        });
    }
}