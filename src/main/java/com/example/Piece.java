package com.example;

import java.util.Random;

public class Piece{

    public int [][] forma;
    private Random random = new Random();
    
    public Piece() {
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
    //Funcion para ingresar una pieza en alguna posicion random
    
    public void seleccionarLadoRandom(){

        int configuracion = random.nextInt(3);  //Genera aleatoriamente el 0 o 1

        if(configuracion == 0){
            rotarDerecha();

        }if(configuracion==1){
            rotarIzquierda();
        }else{
            //No pasa nada, la pieza mantiene su forma original
        }
    }  
}
