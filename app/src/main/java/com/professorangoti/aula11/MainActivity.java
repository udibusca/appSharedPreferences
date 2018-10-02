package com.professorangoti.aula11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    List<Pais> paises;
    PaisAdapter adapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listView = new ListView(this);
        setContentView(listView);
        paises = new ArrayList<Pais>();
        paises.add(new Pais(1,"China",1354040000,0));
        paises.add(new Pais(2,"India",1210913422,1));
        paises.add(new Pais(3,"United State",315761000,2));
        paises.add(new Pais(4,"Indonesia",237461326,3));
        paises.add(new Pais(5,"Brazil",1934567,4));
        paises.add(new Pais(6,"Pakistan",1764555,5));
        paises.add(new Pais(7,"Nigeria",897226,6));
        paises.add(new Pais(8,"Bangladesh",767858,7));
        paises.add(new Pais(9,"Russia",998765,8));
        paises.add(new Pais(10,"Japan",76543,9));
        listView.setAdapter(new PaisAdapter(this,paises));
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Pais pais = (Pais) adapterView.getItemAtPosition(i);
        Toast.makeText(this,pais.country, Toast.LENGTH_SHORT).show();
    }
}
