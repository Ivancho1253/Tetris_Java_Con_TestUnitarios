package com.example;

public class Tanque 
            extends Ejercito{

    public Tanque(){
        setVida(2);
    }

    public Tanque(int vida, Escudo escudo) {
        super(vida, escudo);
    }

    public void setEscudo(Escudo escudo){
        this.escudo = escudo;
    }
    
    public Escudo getEscudo(){
        return escudo;
    }
}
