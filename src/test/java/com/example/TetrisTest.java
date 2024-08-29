package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class TetrisTest {
    @Test
    void test_tetris(){

        Tetris tetris = new Tetris();
        assert tetris != null;

    }   

    @Test
    void existenciaPieceT() {

        PieceT pt = new PieceT(); 

        //assertEquals(true, pt.getExistencia()); 
        assert pt != null;
    }
    @Test
    void existenciaPieceSquare() {

        PieceSquare pt = new PieceSquare(); 

        //assertEquals(true, pt.getExistencia()); 
        assert pt != null;
    }


}
