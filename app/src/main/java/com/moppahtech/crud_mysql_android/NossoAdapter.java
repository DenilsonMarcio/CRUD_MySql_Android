package com.moppahtech.crud_mysql_android;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by User on 10/06/2019.
 */

public class NossoAdapter extends RecyclerView.Adapter {

    private List<Contato> contatos;
    private Context context;

    public NossoAdapter(List<Contato> contatos, ListaActivity listaActivity) {

        this.contatos = contatos;
        this.context = context;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context)
                .inflate(R.layout.activity_lista, parent, false);

        NossoViewHolder holder = new NossoViewHolder(view);

        return holder;
    }



    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {

        NossoViewHolder holder = (NossoViewHolder) viewHolder;

        Contato contato  = contatos.get(position) ;

        holder.Nome.setText(contato.getNome());
        holder.Contato.setText(contato.getContatos());
        holder.Email.setText(contato.getEmail());
        holder.Historia.setText(contato.getHistoria());


    }

    @Override
    public int getItemCount() {
        return contatos.size();
    }
}