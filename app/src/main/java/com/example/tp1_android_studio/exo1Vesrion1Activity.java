package com.example.tp1_android_studio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class exo1Vesrion1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exo1_vesrion1);
        TextView tnom = new TextView(this);
        tnom.setText("Nom");
        EditText nom = new EditText(this);
        TextView tprenom = new TextView(this);
        tprenom.setText("Prenom");
        EditText prenom = new EditText(this);
        TextView tage = new TextView(this);
        tage.setText("Age");
        EditText age = new EditText(this);
        TextView tdome = new TextView(this);
        tdome.setText("Domaine de compétence");
        EditText dome_comp = new EditText(this);
        TextView ttele = new TextView(this);
        ttele.setText("Téléphone");
        EditText num_tele =new EditText(this);
        LinearLayout ll = new LinearLayout(this);
        Button button1 =new Button(this);
        button1.setText("Enregistrer");
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.addView(tnom);
        ll.addView(nom);
        ll.addView(tprenom);
        ll.addView(prenom);
        ll.addView(tage);
        ll.addView(age);
        ll.addView(tdome);
        ll.addView(dome_comp);
        ll.addView(ttele);
        ll.addView(num_tele);
        ll.addView(button1);

        setContentView(ll);
    }
}