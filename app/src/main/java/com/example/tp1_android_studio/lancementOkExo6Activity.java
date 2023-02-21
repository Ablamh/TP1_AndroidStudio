package com.example.tp1_android_studio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class lancementOkExo6Activity extends AppCompatActivity {
    EditText numTele;
    ImageView image2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lancement_ok_exo6);
        numTele= (EditText) findViewById(R.id.bappl);
        image2 =(ImageButton) findViewById(R.id.bimage);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(Intent.ACTION_DIAL);
                it.setData(Uri.parse("tel:"+numTele.getText().toString()));
                startActivity(it);
            }
        });





    }
}