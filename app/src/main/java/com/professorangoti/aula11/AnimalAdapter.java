package com.professorangoti.aula11;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by angoti on 13/09/2017.
 */

public class AnimalAdapter extends BaseAdapter {
    Context ctx;
    List<Animal> lista;

    public AnimalAdapter(Context ctx, List<Animal> lista) {
        this.ctx = ctx;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int i) {
        return lista.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //1º passo
        Animal animal = lista.get(i);

        //2º passo
        View linha = LayoutInflater.from(ctx).inflate(R.layout.linha,null);

        //3º passo
        ImageView img = (ImageView) linha.findViewById(R.id.imageView);
        TextView nome = (TextView) linha.findViewById(R.id.textView);

        TypedArray fotos = ctx.getResources().obtainTypedArray(R.array.fotos);
        img.setImageDrawable(fotos.getDrawable(animal.foto));
        nome.setText(animal.nome);

        return linha;
    }
}
