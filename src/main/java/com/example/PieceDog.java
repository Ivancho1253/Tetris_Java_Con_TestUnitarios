package com.example;

public class PieceDog 
            extends Piece{

                

    public PieceDog(){

        int [][] formaDerecha = {

             {0, 0, 0},
             {1, 1, 0},
             {0, 1, 1}
                

        };
        
        setForma(formaDerecha);
    }
     public void izquierda(){

        int[][] formaIzquierda = {

            {0, 0, 0},
            {0, 1, 1},
            {1, 1, 0}
            
        };

       setForma(formaIzquierda);
    }
    


}