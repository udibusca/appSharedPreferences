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

    List<Animal> animais;
    AnimalAdapter adapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listView = new ListView(this);
        setContentView(listView);
        animais = new ArrayList<Animal>();
        animais.add(new Animal("Elefante",0));
        animais.add(new Animal("Gnu",1));
        animais.add(new Animal("Leão",2));
        animais.add(new Animal("Lobo",3));
        animais.add(new Animal("Panda",4));
        animais.add(new Animal("Tigre",5));
        animais.add(new Animal("Cachorro",6));
        animais.add(new Animal("Macaco",7));
        listView.setAdapter(new AnimalAdapter(this,animais));
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Animal animal = (Animal) adapterView.getItemAtPosition(i);
        Toast.makeText(this,animal.nome, Toast.LENGTH_SHORT).show();
    }
}
