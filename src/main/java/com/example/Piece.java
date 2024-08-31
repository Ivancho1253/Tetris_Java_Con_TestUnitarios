package com.example;

import java.util.Random;

public class Piece{

    public boolean  existencia;
    public int [][] forma;
    private Random random=new Random();
    
    public Piece() {
        
    }

    public Piece(boolean existencia, int [][] forma) {
        this.existencia = existencia;
        this.forma = forma;
    }

    public boolean getExistencia() {
        return existencia; 
    } 

    public void setForma(int [][] forma) {
        this.forma = forma;
    }
    
    public int [][] getForma(){
        return forma;
    }


    public void rotarDerecha() {

        int filas = forma.length;
        int columnas = forma[0].length;
        int[][] nuevaForma = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                nuevaForma[j][filas - 1 - i] = forma[i][j];
            }
        }
        setForma(nuevaForma);
    }

    public void rotarIzquierda() {

        int filas = forma.length;
        int columnas = forma[0].length;
        int[][] nuevaForma = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                nuevaForma[columnas - 1 - j][i] = forma[i][j];
            }
        }
        setForma(nuevaForma);
    }
    //funcion para ingresar una pieza en alguna posicion random
    public void seleccionarPiezaRandom(){
        int configuracion=random.nextInt(2);//genera aleatoriamente el 0 o 1
        if(configuracion==0){
            rotarDerecha();
        }else{
            rotarIzquierda();
        }
    }
}
