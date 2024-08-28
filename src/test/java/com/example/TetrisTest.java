package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals; // Importa assertEquals
import org.junit.jupiter.api.Test;

public class TetrisTest {
    @Test
    void CrearPieceT() {
        PieceT piecet = new PieceT(1); // Crear una instancia de PieceT con el valor 1
        assertEquals(1, piecet.getFueCreado()); // Llama al método de instancia
    }
}
