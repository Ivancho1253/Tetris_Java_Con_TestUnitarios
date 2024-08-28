package com.example;

public class Ejercito {

  public float vida;
  public Escudo escudo;

  public Ejercito(){
  }

  public Ejercito(float vida, Escudo escudo) {
    this.vida = vida;
    this.escudo = escudo;
  }

  public float getVida() {
    return vida;
  }

  public void setVida(float vida) {
    this.vida = vida;
  }
  
  public void recibirDisparo(){

    float danio = 1.0f;

    if (escudo != null){
      
      danio = escudo.reducirDanio(danio);
    }
      setVida(getVida() - danio) ;
  }
  
  public void disparar(Ejercito objetivo){

    objetivo.recibirDisparo();
  }

  public void recibirChuck(){

    setVida(getVida() - 0);
  }

  public void dispararChuck(Ejercito objetivo){

    objetivo.recibirChuck();
  }

  public boolean estaVivo(){
    
    if (getVida() > 0.000f){
      return true;
    }
    else{
      return false;
    }
  }
}
