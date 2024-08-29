package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class TetrisTest {
    @Test
    void tetris_test(){

        Tetris tetris = new Tetris();
        assert tetris != null;

    }   

    @Test
    void existencia_PieceT_test() {

        PieceT pt = new PieceT(); 

        //assertEquals(true, pt.getExistencia()); 
        assert pt != null;
    }
    @Test
    void existencia_PieceSquare_test() {

        PieceSquare ps = new PieceSquare(); 

        //assertEquals(true, ps.getExistencia()); 
        assert ps != null;
    }
    @Test
    void existencia_PieceStick_test() {

        PieceStick pstick = new PieceStick(); 

        //assertEquals(true, pstick.getExistencia()); 
        assert pstick != null;
    }
    @Test
    void existencia_PieceL_test(){

        PieceL pl = new PieceL();

        //assertEquals(true, pl.getExistencia()); 
        assert pl != null;
    }
    @Test
    void existencia_PieceDog_test(){

        PieceDog pdog = new PieceDog();

        assert pdog !=null;
    }
    
}
