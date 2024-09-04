/*package com.example;
import java.time.Duration;
import java.time.Instant;

public class Clock extends Board {

    public Instant tiempoDespues;
    public Duration delayTime = Duration.ofSeconds(2);

    public  Clock() {
    
        tiempoDespues = Instant.now();
        delayTime = Duration.ofSeconds(2);
    }
    
    public void setTiempoDespues(Instant tiempoDespues){
        this.tiempoDespues = tiempoDespues;
    }



        public void descenso() {

        /* Calcula entre el tiempo final de la pieza con el inicio cuanto tarda con la
        restriccion de 2 seg 
        
        if (piezaActual != null && Duration.between(tiempoDespues, Instant.now()).compareTo(delayTime) >= 0) {

            for (int i = fila  ; i >= 0; i--) {   //Se mueve las filas hasta la penultima
                for (int j = 0; j < columna; j++){ 
                    
                    setBoard(fila + 1, columna, board[i][j]);
                  //Mueve el contenido a la fila de abajo
                }
            }
    
            setTiempoDespues(Instant.now());  //Actualiza el tiempo para que se mueva cada 2 segv czx
        }
    } 
}*/