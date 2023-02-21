package com.example.tp1_android_studio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button bexo1;
Button bexo12;
Button bexo8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bexo1=(Button)findViewById(R.id.exo1);
        bexo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent( MainActivity.this,exo1Vesrion1Activity.class);
                startActivity(it);
            }
        });
        bexo12=(Button)findViewById(R.id.exo2);
        bexo12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent( MainActivity.this,exo1Version2Activity.class);
                startActivity(it);
            }
        });
        bexo8=(Button) findViewById(R.id.exo8);
        bexo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent( MainActivity.this,trainHoraireActivity.class);
                startActivity(it);

            }
        });




    }
}