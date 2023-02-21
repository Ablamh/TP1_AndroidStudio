package com.example.tp1_android_studio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class trainHoraireActivity extends AppCompatActivity {
     Button afficherHoraire;
     EditText editVilleDep,editVilleArr;
     ListView myliste;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_horaire);


        afficherHoraire = (Button) findViewById(R.id.afficherb);
        editVilleArr = (EditText) findViewById(R.id.villearr);
        editVilleDep = (EditText) findViewById(R.id.villedep);
        myliste = (ListView) findViewById(R.id.maListe);
        ArrayList<TrainHoraire> hlist = new ArrayList<TrainHoraire>();
        hlist.add(new TrainHoraire("Montpellier", "Nimes","12:10","12:50"));
        hlist.add(new TrainHoraire("Montpellier", "Nimes","15:10","15:50"));
        C_Horaire c = new C_Horaire(hlist);



        afficherHoraire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                myliste.setAdapter(c);
                c.notifyDataSetChanged();
            }
        });

    }

        class  C_Horaire extends BaseAdapter{
            ArrayList<TrainHoraire> arr_ville=new ArrayList<TrainHoraire>();
            public C_Horaire(ArrayList<TrainHoraire> la) {
                this.arr_ville = la;
            }

            @Override
            public int getCount() {
                return arr_ville.size();
            }

            @Override
            public Object getItem(int i) {
                return arr_ville.get(i);
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {

                LayoutInflater li = getLayoutInflater();
                View v = li.inflate(R.layout.template_liste, null);
                TextView ldep,larr,ldated,ldater;
                Button lbtn;
                ldep=v.findViewById(R.id.tdep);
                larr=v.findViewById(R.id.tarr);
                ldated=v.findViewById(R.id.tdated);
                ldater=v.findViewById(R.id.tarri);
                ldated.setText(arr_ville.get(i).dated);
               ldep.setText(arr_ville.get(i).villeDepart);
                larr.setText(arr_ville.get(i).villeArrive);
                ldater.setText(arr_ville.get(i).datea);

                return v;
            }
        }







    }


