package com.example.graphiquesimple;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private TextView textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        textView1 = findViewById(R.id.txt1);
        textView2 = findViewById(R.id.txt2);

        Intent intent = getIntent();
        String n = intent.getStringExtra("name");
        String p = intent.getStringExtra("password");
        textView1.setText(n);
        textView2.setText(p);
        // i add this page


    }
}