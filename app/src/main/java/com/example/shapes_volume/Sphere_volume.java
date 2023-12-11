package com.example.shapes_volume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sphere_volume extends AppCompatActivity {
    TextView tv;
    EditText et;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere_volume);
        tv = findViewById(R.id.txt);
        et = findViewById(R.id.editText);
        b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radius = et.getText().toString();
                int r = Integer.parseInt(radius);
                double volume = (4/3) * 3.1415 * r * r* r;

                tv.setText("VOLUME = " + volume + " m^3");
            }
        });


    }
}