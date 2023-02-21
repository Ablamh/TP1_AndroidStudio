package com.example.tp1_android_studio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class exo6AffichageActivity extends AppCompatActivity {
    TextView nom,prenom,telephone,age,dom;
    Button okc,retourc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exo6_affichage);
        Bundle b =getIntent().getExtras();
        nom=findViewById(R.id.Anom);

        nom.setText(b.getString("nom"));
        prenom=findViewById(R.id.Aprenom);
        prenom.setText(b.getString("prenom"));
        telephone=findViewById(R.id.Atele);
        /*int ttele=b.getInt("tele");
        telephone.setText(String.valueOf(ttele));*/

        /*age=findViewById(R.id.Aage);
        age.setText(String.valueOf(b.getInt("age")));*/
        dom=findViewById(R.id.Adom);
        dom.setText(b.getString("tdom_comp"));
        okc =(Button) findViewById(R.id.bok);
      okc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent( exo6AffichageActivity.this,lancementOkExo6Activity.class);
                startActivity(it);
            }
        });

       retourc =(Button) findViewById(R.id.bretour);
        retourc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent( exo6AffichageActivity.this,exo1Version2Activity.class);
                startActivity(it);
            }
        });





    }
}