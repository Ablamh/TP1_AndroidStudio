package com.example.tp1_android_studio;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class exo1Version2Activity extends AppCompatActivity {
    Button buttonValidation;
    EditText nomE, prenomE, ageE, telephoneE,compE;
    TextView nomV, prenomV, ageV, telephoneV,compV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exo1_version2);
        nomE =(EditText)findViewById(R.id.nom);
        prenomE =(EditText)findViewById(R.id.prenom);
        ageE =(EditText)findViewById(R.id.age);
        telephoneE=(EditText)findViewById(R.id.tele);
        compE =(EditText)findViewById(R.id.tdom_comp);
        buttonValidation = (Button) findViewById(R.id.buttonv);
        nomV =(TextView) findViewById(R.id.vnom);
        prenomV =(TextView) findViewById(R.id.vprenom);
        ageV =(TextView) findViewById(R.id.vage);
        telephoneV =(TextView) findViewById(R.id.vtele);
        compV =(TextView) findViewById(R.id.vcomp);

            buttonValidation.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder b= new AlertDialog.Builder(exo1Version2Activity.this);
                    b.setMessage("");
                    b.setTitle("Validation");
                    b.setNegativeButton("Annuler", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    }).setPositiveButton("Confirmer", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent it =new Intent(exo1Version2Activity.this,exo6AffichageActivity.class);
                            Bundle b= new Bundle();
                            b.putString("nom",nomE.getText().toString());//la cles et la valeur
                            b.putString("prenom",prenomE.getText().toString());
                            it.putExtras(b);
                            startActivity(it);
                        }
                    }).show();
                }
            });






    }
}