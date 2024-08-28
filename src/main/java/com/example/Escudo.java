package com.example;

public class Escudo {

    private int porcentajeEscudo;

    public int getPorcentaje(){
        return porcentajeEscudo;
    }

    public void setPorcentaje(int porcentajeEscudo){
        this.porcentajeEscudo = porcentajeEscudo;
    }

    public float reducirDanio(float danioOriginal){
        return (danioOriginal * (100 - porcentajeEscudo) / 100);
    }
}