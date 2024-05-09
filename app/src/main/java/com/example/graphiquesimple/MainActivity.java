package com.example.graphiquesimple;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText1,editText2;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn);
        checkBox = findViewById(R.id.check);
        editText1 = findViewById(R.id.ed1);
        editText2 = findViewById(R.id.ed2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked()) {

                    String name = editText1.getText().toString();
                    String password = editText2.getText().toString();

                    Intent i = new Intent(MainActivity.this,MainActivity2.class);
                    i.putExtra("name",name);
                    i.putExtra("password",password);
                    startActivity(i);

                } else {
                    Toast.makeText(MainActivity.this, "Please agree withe the Conditions", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }




}
