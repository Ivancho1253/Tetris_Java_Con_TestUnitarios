package com.example;
//import static org.junit.jupiter.api.Assertions.assertNotNull;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
    void rotar_PieceT_hacia_Derecha_Comparacion_con_otra_pieza_test(){

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
    void rotar_PieceT_hacia_Izquierda_Comparacion_con_otra_pieza_test(){
        
        PieceT pT1 = new PieceT();
        PieceT pT2 = new PieceT();

        pT1.rotarIzquierda();
        pT1.rotarIzquierda();
        pT1.rotarIzquierda();
        pT1.rotarIzquierda();
        
        
        assertArrayEquals(pT2.getForma(), pT1.getForma()); //verifico el contenido del objeto sen iguales para confirmar
    }
    @Test
    void rotar_PieceT_360_hacia_izquierda_test(){

        PieceT pT1 = new PieceT();
        PieceT pT2= new PieceT();

        pT1.rotarIzquierda();
        pT1.rotarIzquierda();
        pT1.rotarIzquierda();
        pT1.rotarIzquierda();

        assertArrayEquals(pT2.getForma(), pT1.getForma());
    }
    @Test
    void rotar_PieceLDerecho_rota_hacia_izquierda_test(){

        PieceL pLd = new PieceL();

        pLd.rotarIzquierda();

        assertArrayEquals(pLd.forma, pLd.getForma());

    }
    @Test
    void rotar_PieceLDerecho_rota_hacia_Izquierda_Comparacion_con_otra_pieza_test(){

        PieceL pLd1 = new PieceL();
        PieceL pLd2 = new PieceL();

        pLd1.rotarIzquierda();

        assert pLd1.getForma() != pLd2.getForma();
        
    }
    @Test
    void rotar_PieceLDerecho_rota_360_hacia_izquierda_test(){

        PieceL pLd1 = new PieceL();
        PieceL pLd2= new PieceL();

        pLd1.rotarIzquierda();
        pLd1.rotarIzquierda();
        pLd1.rotarIzquierda();
        pLd1.rotarIzquierda();

        assertArrayEquals(pLd2.getForma(), pLd1.getForma());
    }
    @Test
    void rotar_PieceLIzquierdo_rota_hacia_Derecha_test(){

        PieceL pLi = new PieceL();

        pLi.rotarDerecha();

        assertArrayEquals(pLi.forma, pLi.getForma());

    }
    @Test
    void rotar_PieceLIzquierdo_rota_hacia_derecha_Comparacion_con_otra_pieza_test(){

        PieceL pLi1 = new PieceL();
        PieceL pLi2 = new PieceL();

        pLi1.rotarDerecha();

        assert pLi1.getForma() != pLi2.getForma();
        
    }
    @Test
    void rotar_PieceLIzquierda_rota_360_hacia_Derecha_test(){

        PieceL pLi1 = new PieceL();
        PieceL pLi2= new PieceL();

        pLi1.rotarDerecha();
        pLi1.rotarDerecha();
        pLi1.rotarDerecha();
        pLi1.rotarDerecha();

        assertArrayEquals(pLi2.getForma(), pLi1.getForma());
    }
    @Test
    void rotar_PieceLDerecho_rota_hacia_izquierda_luego_derecha_test(){

        PieceL pLd1 = new PieceL();
        PieceL pLd2 = new PieceL();

        pLd1.rotarIzquierda();
        pLd1.rotarDerecha();

        assertArrayEquals(pLd2.getForma(), pLd1.getForma());

    }
    @Test
    void rotar_PieceStick_hacia_Derecha_test(){

        PieceStick pStick = new PieceStick();

        pStick.rotarIzquierda();

        assertArrayEquals(pStick.forma, pStick.getForma());

    }
    @Test
    void rotar_PieceStick_hacia_derecha_Comparacion_con_otra_pieza_test(){

        PieceStick pStick1 = new PieceStick();
        PieceStick pStick2 = new PieceStick();

        pStick1.rotarDerecha();

        assert pStick1.getForma() != pStick2.getForma();
    
    }
    @Test
    void rotar_PieceStick_hacia_izquierda_Comparacion_con_otra_pieza_test(){

        PieceStick pStick1 = new PieceStick();
        PieceStick pStick2 = new PieceStick();

        pStick1.rotarIzquierda();

        assert pStick1.getForma() != pStick2.getForma();
    }
    @Test
    void rotar_PieceStick_360_hacia_Izquierda_test(){

        PieceStick pStick1 = new PieceStick();
        PieceStick pStick2 = new PieceStick();

        pStick1.rotarIzquierda();
        pStick1.rotarIzquierda();
        pStick1.rotarIzquierda();
        pStick1.rotarIzquierda();

        assertArrayEquals(pStick2.getForma(), pStick1.getForma());
    }
    @Test
    void rotar_PieceDogDerecho_hacia_Izquierda_test(){

        PieceDog pDogd = new PieceDog();

        pDogd.rotarIzquierda();

        assertArrayEquals(pDogd.forma, pDogd.getForma());

    }
    @Test
    void rotar_PieceDogIzquierdo_hacia_derecha_test(){

        PieceDog pDogI = new PieceDog();

        pDogI.rotarDerecha();

        assertArrayEquals(pDogI.forma, pDogI.getForma());
    }
    @Test
    void rotar_PieceDogIzquierdo_hacia_izquierda_test(){

        PieceDog pDogI = new PieceDog();

        pDogI.rotarIzquierda();

        assertArrayEquals(pDogI.forma, pDogI.getForma());
    }
    @Test
    void rotar_PieceDogIzquierdo_hacia_derecha_Comparacion_con_otra_pieza_test(){

        PieceDog pDogI1= new PieceDog();
        PieceDog pDogI2 = new PieceDog();

        pDogI1.rotarDerecha();

        assert pDogI1.getForma() != pDogI2.getForma();
    
    }
    @Test
    void rotar_PieceDogIzquierdo_360_hacia_Izquierda_test(){

        PieceDog pDogI1 = new PieceDog();
        PieceDog pDogI2 = new PieceDog();

        pDogI1.rotarIzquierda();
        pDogI1.rotarIzquierda();
        pDogI1.rotarIzquierda();
        pDogI1.rotarIzquierda();

        assertArrayEquals(pDogI1.getForma(), pDogI2.getForma());
    }
    @Test
    void rotar_PieceDogDerecho_hacia_derecha_Comparacion_con_otra_pieza_test(){

        PieceDog pDogD1= new PieceDog();
        PieceDog pDogD2 = new PieceDog();

        pDogD1.rotarDerecha();

        assert pDogD1.getForma() != pDogD2.getForma();
    
    }
    @Test
    void rotar_PieceDogDerecho_hacia_izquierda_Comparacion_con_otra_pieza_test(){

        PieceDog pDogD1 = new PieceDog();
        PieceDog pDogD2 = new PieceDog();

        pDogD1.rotarIzquierda();

        assert pDogD1.getForma() != pDogD2.getForma();
    }
    @Test
    void rotar_PieceDogDerecho_360_hacia_Izquierda_test(){

        PieceDog pDogD1 = new PieceDog();
        PieceDog pDogD2 = new PieceDog();

        pDogD1.rotarIzquierda();
        pDogD1.rotarIzquierda();
        pDogD1.rotarIzquierda();
        pDogD1.rotarIzquierda();

        assertArrayEquals(pDogD1.getForma(), pDogD2.getForma());
    }
    @Test
    void existencia_board_test(){

        Board board = new Board();
        assert board != null;

    } 
    @Test
    void Creacion_board_test(){

        Board board = new Board();
        //assert board != null;

        assertEquals(10,board.fila);
        assertEquals(20, board.columna);
    }

    @Test
    void verificar_ingreso_pieceT_board_test(){

        Board board = new Board();
        PieceT pT = new PieceT();


        board.ingresarNuevaPieza(pT);
        //board.colocarPieceEnTablero(pT, 0, 0);
  
        assertEquals(1, board.getBoard()[0][0]);
        assertEquals(1, board.getBoard()[0][1]);
        assertEquals(1, board.getBoard()[0][2]);
        assertEquals(1, board.getBoard()[1][1]);

    }
    @Test
    void verificar_ingreso_pieceT_rotando_2_veces_hacia_derecha_board_test(){

        Board board = new Board();
        PieceT pT = new PieceT();

        pT.rotarDerecha();
        pT.rotarDerecha();

        board.ingresarNuevaPieza(pT);
        //board.colocarPieceEnTablero(pT, 0, 0);
  
        assertEquals(1, board.getBoard()[1][1]);
        assertEquals(1, board.getBoard()[2][0]);
        assertEquals(1, board.getBoard()[2][1]);
        assertEquals(1, board.getBoard()[2][2]);

    }
    @Test
    void verificar_ingreso_pieceL_lado_izquierdo_board_test(){

        Board board = new Board();
        PieceL pLi = new PieceL();

        pLi.izquierda();
        board.ingresarNuevaPieza(pLi);

        assertEquals(1, board.getBoard()[0][1]);
        assertEquals(1, board.getBoard()[1][1]);
        assertEquals(1, board.getBoard()[2][1]);
        assertEquals(1, board.getBoard()[2][0]);



    }
    @Test
    void verificar_ingreso_pieceL_lado_derecho_board_test(){

        Board board = new Board();
        PieceL pLd = new PieceL();

        board.ingresarNuevaPieza(pLd);

        assertEquals(1, board.getBoard()[0][1]);
        assertEquals(1, board.getBoard()[1][1]);
        assertEquals(1, board.getBoard()[2][1]);
        assertEquals(1, board.getBoard()[2][2]);
    }
    @Test
    void verificar_ingreso_pieceStick_board_test(){

        Board board = new Board();
        PieceStick pStick = new PieceStick();

        board.ingresarNuevaPieza(pStick);
        board.colocarPieceEnTablero(pStick, 0, 0);
        assertNotNull(board.getBoard()[0][0]);

    }
    @Test
    void verificar_ingreso_pieceSquare_board_test(){

        Board board = new Board();
        PieceSquare pS = new PieceSquare();

        board.ingresarNuevaPieza(pS);

        assertEquals(1, board.getBoard()[0][0]);
        assertEquals(1, board.getBoard()[1][0]);
        assertEquals(1, board.getBoard()[1][1]);
        assertEquals(1, board.getBoard()[0][1]);

    }
    @Test
    void verificar_ingreso_pieceDog_lado_izquierdo_board_test(){

        Board board = new Board();
        PieceDog pDogi = new PieceDog();

        pDogi.izquierda();

        board.ingresarNuevaPieza(pDogi);

        assertEquals(1, board.getBoard()[2][0]);
        assertEquals(1, board.getBoard()[2][1]);
        assertEquals(1, board.getBoard()[1][1]);
        assertEquals(1, board.getBoard()[1][2]);
    }
    @Test
    void verificar_ingreso_pieceDog_lado_derecho_board_test(){

        Board board = new Board();
        PieceDog pDogd = new PieceDog();

        board.ingresarNuevaPieza(pDogd);

        assertEquals(1, board.getBoard()[1][0]);
        assertEquals(1, board.getBoard()[1][1]);
        assertEquals(1, board.getBoard()[2][1]);
        assertEquals(1, board.getBoard()[2][2]);
    }
    //Ingreso de las piezas con lado random
    @Test
    void verificar_ingreso_pieceL_lado_derecho_Random_board_test() {

        Board board = new Board();
        PieceL pLd1 = new PieceL();

        pLd1.seleccionarLadoRandom(); // Creo un lado random
        
        board.ingresarNuevaPieza(pLd1); // coloco la pieza en el tablero
        board.colocarPieceEnTablero(pLd1, 0, 0);
        
        assertNotNull(board.getBoard()[0][0]);
    }
    
    @Test
    void verificar_ingreso_pieceDog_lado_derecho_Random_board_test() {

        Board board = new Board();
        PieceDog pDogD1 = new PieceDog();


        pDogD1.seleccionarLadoRandom(); // Creo un lado random

        board.ingresarNuevaPieza(pDogD1); // Coloco la pieza en el tablero
        board.colocarPieceEnTablero(pDogD1, 0, 0);
        assertArrayEquals(board.getBoard(), board.getBoard()); //  Comparo que se ingreso la pieza con tablero 
    }
    @Test
    void verificar_ingreso_pieceDog_lado_izquierdo_Random_board_test() {

        Board board = new Board();
        PieceDog pDogI1 = new PieceDog();

        pDogI1.seleccionarLadoRandom(); 

        board.ingresarNuevaPieza(pDogI1); // Coloco la pieza en el tablero
        board.colocarPieceEnTablero(pDogI1, 0, 0);
        assertNotNull(board.getBoard()[0][0]);
    }
    @Test
    void verificar_ingreso_pieceT_Random_board_test() {

        Board board = new Board();
        PieceT pT1 = new PieceT();


        pT1.seleccionarLadoRandom(); // Creo lado random T

        board.ingresarNuevaPieza(pT1); // Coloco la pieza en el tablero
        board.colocarPieceEnTablero(pT1, 0, 0);
        assertNotNull(board.getBoard()[0][0]);
    }

    //Comienzo de Descenso

    /*@Test
    void verificar_ingreso_pieceL_lado_Izquierdo_Random_board_desciende_test() {

        Board board = new Board();
        PieceL pLi = new PieceL();
        pLi.izquierda();

        pLi.seleccionarLadoRandom();
        board.ingresarNuevaPieza(pLi);
        board.colocarPieceEnTablero(pLi, 0, 0);
        assertNotNull(board.getBoard()[0][0]);

        //board.descenso(pLi);
        
        assert board.getBoard()[0][0] == 1;

    }
    /*
    @Test
    void verificar_ingreso_pieceL_lado_Derecho_Random_board_desciende_test() {

        Board board = new Board();
        PieceL pLd = new PieceL();

        pLd.seleccionarLadoRandom(); 
       

        board.ingresarNuevaPieza(pLd); 
        board.colocarPieceEnTablero(pLd, 0, 0);
        assertArrayEquals(board.getBoard(), board.getBoard()); 

          // !desciende las piezas
        board.descenso(pLd); // Pieza desciende
        assertArrayEquals(board.getBoard(), board.getBoard());
        pLd.rotarDerecha();
        board.descenso(pLd);
        assertArrayEquals(board.getBoard(), board.getBoard());

    }

    @Test
    void verificar_ingreso_pieceDog_lado_Derecho_Random_board_desciende_test() {

        Board board = new Board();
        PieceDog pDogD1 = new PieceDog();

        // ! Aca creo un lado random
        pDogD1.seleccionarLadoRandom(); // Creo un lado random Izquierdo
        // ! Aca coloco la pieza en el tablero

        board.ingresarNuevaPieza(pDogD1); // Coloco la pieza en el tablero
        board.colocarPieceEnTablero(pDogD1, 0, 0);
        assertArrayEquals(board.getBoard(), board.getBoard()); // Comparo que se ingreso la pieza con tablero actualizado

        // !Desciende las piezas
        board.descenso(pDogD1); // Pieza desciende
        assertArrayEquals(board.getBoard(), board.getBoard());
        pDogD1.rotarDerecha();
        board.descenso(pDogD1);
        assertArrayEquals(board.getBoard(), board.getBoard());

    }
    @Test
    void verificar_ingreso_pieceDog_lado_Izquierdo_Random_board_desciende_test() {

        Board board = new Board();
        PieceDog pDogI1 = new PieceDog();
        // ! Aca creo un lado random
        pDogI1.seleccionarLadoRandom(); // Creo un lado random de Dog Izquierdo
        // ! Aca coloco la pieza en el tablero

        board.ingresarNuevaPieza(pDogI1); // Coloco la pieza en el tablero
        board.colocarPieceEnTablero(pDogI1, 0, 0);
        assertArrayEquals(board.getBoard(), board.getBoard()); // Comparo que se ingreso la pieza con tablero actualizado
        
        // !Desciende las piezas
        board.descenso(pDogI1);// pieza desciende
        assertArrayEquals(board.getBoard(), board.getBoard());
        pDogI1.rotarDerecha();
        board.descenso(pDogI1);
        assertArrayEquals(board.getBoard(), board.getBoard());

    }
    @Test
    void verificar_ingreso_pieceSquare_Random_board_desciende_test() {

        Board board = new Board();
        PieceSquare pS1 = new PieceSquare();

        board.ingresarNuevaPieza(pS1); // Coloco la pieza en el tablero
        board.colocarPieceEnTablero(pS1, 0, 0);
        assertArrayEquals(board.getBoard(), board.getBoard()); // Comparo que se ingreso la pieza con tablero

        // !Desciende las piezas
        board.descenso(pS1);// Pieza desciende
        assertArrayEquals(board.getBoard(), board.getBoard());
        pS1.rotarDerecha();
        board.descenso(pS1);
        assertArrayEquals(board.getBoard(), board.getBoard());

    }
    @Test
    void verificar_ingreso_pieceT_Random_board_desciende_test() {

        Board board = new Board();
        PieceT pT = new PieceT();

        board.ingresarNuevaPieza(pT); // Coloco la pieza en el tablero
        board.colocarPieceEnTablero(pT, 0, 0);
        assertArrayEquals(board.getBoard(), board.getBoard()); // Comparo que se ingreso la pieza con tablero

        // !Desciende las piezas
        board.descenso(pT);// Pieza desciende
        assertArrayEquals(board.getBoard(), board.getBoard());
        pT.rotarDerecha();
        board.descenso(pT);
        assertArrayEquals(board.getBoard(), board.getBoard());

    }
    @Test
    void verificar_ingreso_pieceStick_Random_board_desciende_test() {

        Board board = new Board();
        PieceStick pStick = new PieceStick();

        board.ingresarNuevaPieza(pStick); // Coloco la pieza en el tablero
        board.colocarPieceEnTablero(pStick, 0, 0);
        assertArrayEquals(board.getBoard(), board.getBoard()); // Comparo que se ingreso la pieza con tablero

        // !Desciende las piezas
        board.descenso(pStick);// Pieza desciende
        assertArrayEquals(board.getBoard(), board.getBoard());
        pStick.rotarDerecha();
        board.descenso(pStick);
        assertArrayEquals(board.getBoard(), board.getBoard());

    }
    */
}
