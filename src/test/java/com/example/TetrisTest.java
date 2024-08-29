package com.example;
//import static org.junit.jupiter.api.Assertions.assertNotNull;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;

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

        assert pDogi.getForma() != pDogd.getForma();//comparo que los dos objetos sean distintos en instancias distintas de la memoria

    }
    @Test
    void rotar_PieceT_Derecha_test(){

        PieceT pT1 = new PieceT();

        pT1.rotarDerecha();

        assertArrayEquals(pT1.forma, pT1.getForma());

    }
    @Test
    void rotar_PieceT_Derecha_Comparacion_con_otra_pieza_test(){

        PieceT pT1 = new PieceT();
        PieceT pT2 = new PieceT();

        pT1.rotarDerecha();

        assert pT1.getForma() != pT2.getForma();
        
    }
    @Test
    void rotar_PieceT_360_derecha_test(){

        PieceT pT1 = new PieceT();
        PieceT pT2 = new PieceT();

        pT1.rotarDerecha();
        pT1.rotarDerecha();
        pT1.rotarDerecha();
        pT1.rotarDerecha();

        assertArrayEquals(pT2.getForma(), pT1.getForma());
        
    }
    @Test
    void rotar_PieceT_Izquieda_test(){

        PieceT pT1 = new PieceT();

        pT1.rotarIzquierda();

        assertArrayEquals(pT1.forma, pT1.getForma());

    }
    @Test
    void rotar_PieceT_Izquierda_Comparacion_con_otra_pieza_test(){
        
        PieceT pT1 = new PieceT();
        PieceT pT2 = new PieceT();

        pT1.rotarIzquierda();
        pT1.rotarIzquierda();
        pT1.rotarIzquierda();
        pT1.rotarIzquierda();
        
        
        assertArrayEquals(pT2.getForma(), pT1.getForma());//verifico el contenido del objeto para confirmar que sean iguales
        
    }
    @Test
    void rotar_PieceT_360_izquierda_test(){

        PieceT pT1 = new PieceT();
        PieceT pT2= new PieceT();

        pT1.rotarIzquierda();
        pT1.rotarIzquierda();
        pT1.rotarIzquierda();
        pT1.rotarIzquierda();

        assertArrayEquals(pT2.getForma(), pT1.getForma());
    }
    @Test
    void rotar_PieceLDerecho_izquierda_test(){

        PieceT pLi = new PieceT();

        pLi.rotarIzquierda();

        assertArrayEquals(pLi.forma, pLi.getForma());

    }
    @Test
    void rotar_PieceLDerecho_Izquierda_Comparacion_con_otra_pieza_test(){

        PieceT pLi1 = new PieceT();
        PieceT pLi2 = new PieceT();

        pLi1.rotarIzquierda();

        assert pLi1.getForma() != pLi2.getForma();
        
    }
    @Test
    void rotar_PieceLDerecho_360_izquierda_test(){

        PieceT pLi1 = new PieceT();
        PieceT pLi2= new PieceT();

        pLi1.rotarIzquierda();
        pLi1.rotarIzquierda();
        pLi1.rotarIzquierda();
        pLi1.rotarIzquierda();

        assertArrayEquals(pLi2.getForma(), pLi1.getForma());
    }
    @Test
    void rotar_PieceLIzquierdo_Derecha_test(){

        PieceT pLd = new PieceT();

        pLd.rotarIzquierda();

        assertArrayEquals(pLd.forma, pLd.getForma());

    }
    @Test
    void rotar_PieceLIzquierdo_derecha_Comparacion_con_otra_pieza_test(){

        PieceT pLd1 = new PieceT();
        PieceT pLd2 = new PieceT();

        pLd1.rotarIzquierda();

        assert pLd1.getForma() != pLd2.getForma();
        
    }
    @Test
    void rotar_PieceLIzquierda_360_Derecha_test(){

        PieceT pLd1 = new PieceT();
        PieceT pLd2= new PieceT();

        pLd1.rotarIzquierda();
        pLd1.rotarIzquierda();
        pLd1.rotarIzquierda();
        pLd1.rotarIzquierda();

        assertArrayEquals(pLd2.getForma(), pLd1.getForma());
    }
    


    
}
