package com.example.aplicacionesmovilesdesarrollo;

public class Personaje {


    private String foto;
    private String nombre;
    private String detalles;

    public Personaje(String foto, String nombre, String detalles) {

        this.foto = foto;
        this.nombre = nombre;
        this.detalles = detalles;
    }


    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
}
