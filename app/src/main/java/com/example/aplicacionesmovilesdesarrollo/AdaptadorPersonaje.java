package com.example.aplicacionesmovilesdesarrollo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class AdaptadorPersonaje extends RecyclerView.Adapter<AdaptadorPersonaje.ViewHolder>{
    private List<Personaje> datos;

    public AdaptadorPersonaje(List<Personaje> datos) {
        this.datos = datos;
    }

    @NonNull
    @Override
    public AdaptadorPersonaje.ViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_personaje, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(
            @NonNull AdaptadorPersonaje.ViewHolder holder, int position) {
        Personaje dato = datos.get(position);
        holder.bind(dato);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView nombre_jsr, detalles_jsr;
        ImageView foto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nombre_jsr = itemView.findViewById(R.id.nombre_jsr);
            detalles_jsr = itemView.findViewById(R.id.detalles_jsr);
            foto = itemView.findViewById(R.id.foto);
        }

        public void bind(Personaje dato) {
            nombre_jsr.setText(dato.getNombre());
            detalles_jsr.setText(dato.getDetalles());

            // Cargar imagen con Picasso
            Picasso.get().load(dato.getFoto()).into(foto);
        }
    }
}
