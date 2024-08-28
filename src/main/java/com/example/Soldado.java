package com.example;

public class Soldado 
            extends Ejercito{
    
    public Soldado(){
        setVida(1);
    }
    
    public Soldado(int vida, Escudo escudo) {
        super(vida, escudo);
    }

    public void setEscudo(Escudo escudo){
        this.escudo = escudo;
    }

    public Escudo getEscudo(){
        return escudo;
    } 
}
