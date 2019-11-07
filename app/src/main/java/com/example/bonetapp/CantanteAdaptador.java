package com.example.bonetapp;

public class CantanteAdaptador {

    private String cantante, nacionalidad;
    private int imgCantante;

    public CantanteAdaptador() {

    }

    public CantanteAdaptador(String cantante, String nacionalidad, int imgCantante) {
        this.cantante = cantante;
        this.nacionalidad = nacionalidad;
        this.imgCantante = imgCantante;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getImgCantante() {
        return imgCantante;
    }

    public void setImgCantante(int imgCantante) {
        this.imgCantante = imgCantante;
    }
}
