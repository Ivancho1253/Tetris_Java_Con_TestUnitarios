package com.example;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TetrisTest {
    @Test
    void tetris_test(){

        Tetris tetris = new Tetris();
        assert tetris != null;

    }   
    @Test
    void existencia_PieceT_test() {

        PieceT pT = new PieceT(); 

        //assertEquals(true, pt.getExistencia()); 
        assert pT != null;
    }
    @Test
    void existencia_PieceSquare_test() {

        PieceSquare pS = new PieceSquare(); 

        //assertEquals(true, ps.getExistencia()); 
        assert pS != null;
    }
    @Test
    void existencia_PieceStick_test() {

        PieceStick pStick = new PieceStick(); 

        //assertEquals(true, pstick.getExistencia()); 
        assert pStick != null;
    }
    @Test
    void existencia_PieceL_test(){

        PieceL pL = new PieceL();

        //assertEquals(true, pl.getExistencia()); 
        assert pL != null;
    }
    @Test
    void existencia_PieceDog_test(){

        PieceDog pDog = new PieceDog();

        assert pDog !=null;
    }

    @Test
    void crear_PieceT_test(){

        PieceT pT = new PieceT();

        assert pT != null;

        assertArrayEquals(pT.forma, pT.getForma());
        
    }
    @Test
    void crear_PieceStick_test(){

        PieceStick pStick = new PieceStick();

        assert pStick != null;

        assertArrayEquals(pStick.forma, pStick.getForma());
        
    }
    @Test
    void crear_PieceSquare_test(){

        PieceSquare pS = new PieceSquare();

        assert pS != null;

        assertArrayEquals(pS.forma, pS.getForma());
        
    }
    @Test
    void crear_PieceL_Derecho_test(){

        PieceL pLd = new PieceL();

        assert pLd != null;

        assertArrayEquals(pLd.forma, pLd.getForma());
        
    }
    @Test
    void crear_PieceL_izquierda_test(){

        PieceL pLi = new PieceL();
        
        pLi.izquierda();
        
        assert pLi != null; 
        
        assertArrayEquals(pLi.forma, pLi.getForma());
    }
    @Test
    void comparar_PieceL_izquierda_con_derecha_test(){

        PieceL pLi = new PieceL();
        PieceL  pLd = new PieceL();
        
        pLi.izquierda();

        assert pLi.getForma() != pLd.getForma();

    }
    @Test
    void crear_PieceDog_Derecho_test(){

        PieceDog pDogd = new PieceDog();

        assert pDogd != null;

        assertArrayEquals(pDogd.forma, pDogd.getForma());
        
    }
    @Test
    void crear_PieceDog_Izquierdo_test(){

        PieceDog pDogi = new PieceDog();

        assert pDogi != null;

        assertArrayEquals(pDogi.forma, pDogi.getForma());
        
    }
    @Test
    void comparar_PieceDog_izquierda_con_derecha_test(){

        PieceDog pDogi = new PieceDog();

        PieceDog  pDogd = new PieceDog();
        
        pDogi.izquierda();

        assert pDogi.getForma() != pDogd.getForma();

    }
    /*@Test
    void rotar_PieceStick_test(){

        PieceStick pStick = new PieceStick();

        assert pStick != null;
        pStick.rotar();

        assertArrayEquals(pStick.forma, pStick.getForma());
        
    }

    @Test
    void rotar_PieceT_test(){

        PieceT pT = new PieceT();

        
    }*/

    
    
}
