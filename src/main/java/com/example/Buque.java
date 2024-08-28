package com.example;

public class Buque 
        extends Ejercito{
    
    public Buque(){
        setVida(3);
    }
    
    public Buque(int vida, Escudo escudo) {
        super(vida, escudo);
    }

    public void setEscudo(Escudo escudo){
        this.escudo = escudo;
    }

    public Escudo getEscudo(){
        return escudo;
    }

    
}
