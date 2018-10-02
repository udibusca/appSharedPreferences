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

public class PaisAdapter extends BaseAdapter {
    Context ctx;
    List<Pais> lista;

    public PaisAdapter(Context ctx, List<Pais> lista) {
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
        Pais pais = lista.get(i);

        //2º passo
        View linha = LayoutInflater.from(ctx).inflate(R.layout.linha,null);

        //3º passo
        TextView txrank = (TextView) linha.findViewById(R.id.textRank);
        TextView txpais = (TextView) linha.findViewById(R.id.textPais);
        TextView txpopulacao = (TextView) linha.findViewById(R.id.textPopulacao);
        ImageView img = (ImageView) linha.findViewById(R.id.imageView);

        TypedArray fotos = ctx.getResources().obtainTypedArray(R.array.fotos);
        txrank.setText("Rank : "+pais.rank);
        txpais.setText(("Country : "+pais.country));
        txpopulacao.setText("Population : "+pais.population);
        img.setImageDrawable(fotos.getDrawable(pais.foto));

        return linha;
    }
}
