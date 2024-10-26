package com.example.ex01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText edtA, edtB, edtKQ;
    private Button btntong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        edtKQ = findViewById(R.id.edtKQ);
        btntong = findViewById(R.id.btntong);

       btntong.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int a = Integer.parseInt(edtA.getText().toString());
               int b = Integer.parseInt(edtB.getText().toString());
               int kq = a + b;
               edtKQ.setText(String.valueOf(kq));
           }
       });
    }
}