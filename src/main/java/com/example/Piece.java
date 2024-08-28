package com.example;

public class Piece {
    int crear;

    public Piece(int crear) {
        this.crear = crear; // Inicializa la variable crear
    }

    public int getCrear() {
        return crear; // Retorna el valor de crear
    }

    public void setCrear(int crear) {
        this.crear = crear; // Permite modificar el valor de crear
    }

    public int getFueCreado() {
        return 1; // Retorna 1 para indicar que fue creado
    }
}