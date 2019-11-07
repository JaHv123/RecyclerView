package com.example.bonetapp;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> implements View.OnClickListener {


    @Override
    public void onClick(View v) {

    }

    public static class ViewHolder extends RecyclerView.ViewHolder{



        private TextView cantante, nacionalidad;
        ImageView fotoCantante;
        Button btn;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            cantante = itemView.findViewById(R.id.txtCantante);
            nacionalidad = itemView.findViewById(R.id.txtNacionalidad);
            fotoCantante = itemView.findViewById(R.id.imgCantante);
            btn = itemView.findViewById(R.id.btnSeconActivity);

        }
    }



    public List<CantanteAdaptador> cantanteList;

    public RecyclerViewAdapter(List<CantanteAdaptador> cantanteList) {
        this.cantanteList = cantanteList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cantante,parent,false);
        ViewHolder viewHolder =  new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        holder.cantante.setText(cantanteList.get(position).getCantante());
        holder.nacionalidad.setText(cantanteList.get(position).getNacionalidad());
        holder.fotoCantante.setImageResource(cantanteList.get(position).getImgCantante());


        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, Main2Activity.class);
                intent.putExtra("cantante", holder.cantante.getText());
                intent.putExtra("nacionalidad", holder.nacionalidad.getText());
                context.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return cantanteList.size();
    }
}