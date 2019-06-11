package com.moppahtech.crud_mysql_android;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by User on 10/06/2019.
 */

public class NossoViewHolder extends RecyclerView.ViewHolder {

    final TextView Nome;
    final TextView Contato;
    final TextView Email;
    final TextView Historia;


    public NossoViewHolder(View view) {
        super(view);
        Nome =    view.findViewById(R.id.editName);
        Contato = view.findViewById(R.id.editContato);
        Email =   view.findViewById(R.id.editEmail);
        Historia =view.findViewById(R.id.editHistoria);
    }
}
