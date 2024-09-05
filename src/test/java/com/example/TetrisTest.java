package com.example;
//import static org.junit.jupiter.api.Assertions.assertNotNull;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class TetrisTest {
    // -------------------------------------------Comprobar que no sean null las
    // class------------------------------------------//
    @Test
    void tetris_test() {

        Tetris tetris = new Tetris();
        assert tetris != null;

    }

    @Test
    void existencia_PieceT_test() {

        PieceT pT = new PieceT();

        // assertEquals(true, pt.getExistencia());
        assert pT != null;
    }

    @Test
    void existencia_PieceSquare_test() {

        PieceSquare pS = new PieceSquare();
        
        // assertEquals(true, ps.getExistencia());
        assert pS != null;
        assert pS.getForma() != null;
    }

    @Test
    void existencia_PieceStick_test() {

        PieceStick pStick = new PieceStick();

        // assertEquals(true, pstick.getExistencia());
        assert pStick != null;
    }

    @Test
    void existencia_PieceL_test() {

        PieceL pL = new PieceL();

        // assertEquals(true, pl.getExistencia());
        assert pL != null;
    }

    @Test
    void existencia_PieceDog_test() {

        PieceDog pDog = new PieceDog();

        assert pDog != null;
    }

    @Test
    void existencia_board_test() {

        Board board = new Board();
        assert board != null;


    }

    // -----------------------------------------------------Crear
    // piezas--------------------------------------------------------//
    @Test
    void crear_PieceT_test() {

        PieceT pT = new PieceT();

        assert pT != null;

        assertArrayEquals(pT.forma, pT.getForma());

    }

    @Test
    void crear_PieceStick_test() {

        PieceStick pStick = new PieceStick();

        assert pStick != null;

        assertArrayEquals(pStick.forma, pStick.getForma());

    }

    @Test
    void crear_PieceSquare_test() {

        PieceSquare pS = new PieceSquare();

        assert pS != null;

        assertArrayEquals(pS.forma, pS.getForma());

    }

    @Test
    void crear_PieceL_Derecho_test() {

        PieceL pLd = new PieceL();

        assert pLd != null;

        assertArrayEquals(pLd.forma, pLd.getForma());

    }

    @Test
    void crear_PieceL_izquierda_test() {

        PieceL pLi = new PieceL();

        pLi.izquierda();

        assert pLi != null;

        assertArrayEquals(pLi.forma, pLi.getForma());
    }

    @Test
    void comparar_PieceL_izquierda_con_derecha_test() {

        PieceL pLi = new PieceL();
        PieceL pLd = new PieceL();

        pLi.izquierda();

        assert pLi.getForma() != pLd.getForma();

    }

    @Test
    void crear_PieceDog_Derecho_test() {

        PieceDog pDogd = new PieceDog();

        assert pDogd != null;

        assertArrayEquals(pDogd.forma, pDogd.getForma());

    }

    @Test
    void crear_PieceDog_Izquierdo_test() {

        PieceDog pDogi = new PieceDog();

        assert pDogi != null;

        assertArrayEquals(pDogi.forma, pDogi.getForma());

    }

    @Test
    void comparar_PieceDog_izquierda_con_derecha_test() {

        PieceDog pDogi = new PieceDog();

        PieceDog pDogd = new PieceDog();

        pDogi.izquierda();

        assert pDogi.getForma() != pDogd.getForma();// comparo que los dos objetos sean distintos en instancias
                                                    // distintas de la memoria

    }

    @Test
    void Creacion_board_test() {

        Board board = new Board();
        // assert board != null;

        assertEquals(10, board.fila);
        assertEquals(20, board.columna);

    }
    

    // ----------------------------------------Rotar
    // Piezas---------------------------------------------------------------------//
    @Test
    void rotar_PieceSquare_Derecha_test() {

        PieceSquare pS1 = new PieceSquare();

        pS1.rotarDerecha();

        assertArrayEquals(pS1.forma, pS1.getForma());

    }

    @Test
    void rotar_PieceSquare_hacia_Derecha_Comparacion_con_otra_pieza_test() {

        PieceSquare pS1 = new PieceSquare();
        PieceSquare pS2 = new PieceSquare();

        pS1.rotarDerecha();

        assert pS1.getForma() != pS2.getForma();

    }

    @Test
    void rotar_PieceSquare_360_derecha_test() {

        PieceSquare pS1 = new PieceSquare();
        PieceSquare pS2 = new PieceSquare();

        pS1.rotarDerecha();
        pS1.rotarDerecha();
        pS1.rotarDerecha();
        pS1.rotarDerecha();

        assertArrayEquals(pS2.getForma(), pS1.getForma());

    }

    @Test
    void rotar_PieceSquare_Izquieda_test() {

        PieceSquare pS1 = new PieceSquare();

        pS1.rotarIzquierda();

        assertArrayEquals(pS1.forma, pS1.getForma());

    }

    @Test
    void rotar_PieceSquare_hacia_Izquierda_Comparacion_con_otra_pieza_test() {

        PieceSquare pS1 = new PieceSquare();
        PieceSquare pS2 = new PieceSquare();

        pS1.rotarIzquierda();
        pS1.rotarIzquierda();
        pS1.rotarIzquierda();
        pS1.rotarIzquierda();

        assertArrayEquals(pS2.getForma(), pS1.getForma()); // verifico el contenido del objeto sen iguales para
                                                           // confirmar
    }

    @Test
    void rotar_PieceSquare_360_hacia_izquierda_test() {

        PieceSquare pS1 = new PieceSquare();
        PieceSquare pS2 = new PieceSquare();

        pS1.rotarIzquierda();
        pS1.rotarIzquierda();
        pS1.rotarIzquierda();
        pS1.rotarIzquierda();

        assertArrayEquals(pS2.getForma(), pS1.getForma());
    }

    @Test
    void rotar_PieceT_Derecha_test() {

        PieceT pT1 = new PieceT();

        pT1.rotarDerecha();

        assertArrayEquals(pT1.forma, pT1.getForma());

    }

    @Test
    void rotar_PieceT_hacia_Derecha_Comparacion_con_otra_pieza_test() {

        PieceT pT1 = new PieceT();
        PieceT pT2 = new PieceT();

        pT1.rotarDerecha();

        assert pT1.getForma() != pT2.getForma();

    }

    @Test
    void rotar_PieceT_360_derecha_test() {

        PieceT pT1 = new PieceT();
        PieceT pT2 = new PieceT();

        pT1.rotarDerecha();
        pT1.rotarDerecha();
        pT1.rotarDerecha();
        pT1.rotarDerecha();

        assertArrayEquals(pT2.getForma(), pT1.getForma());

    }

    @Test
    void rotar_PieceT_Izquieda_test() {

        PieceT pT1 = new PieceT();

        pT1.rotarIzquierda();

        assertArrayEquals(pT1.forma, pT1.getForma());

    }

    @Test
    void rotar_PieceT_hacia_Izquierda_Comparacion_con_otra_pieza_test() {

        PieceT pT1 = new PieceT();
        PieceT pT2 = new PieceT();

        pT1.rotarIzquierda();
        pT1.rotarIzquierda();
        pT1.rotarIzquierda();
        pT1.rotarIzquierda();

        assertArrayEquals(pT2.getForma(), pT1.getForma()); // verifico el contenido del objeto sen iguales para
                                                           // confirmar
    }

    @Test
    void rotar_PieceT_360_hacia_izquierda_test() {

        PieceT pT1 = new PieceT();
        PieceT pT2 = new PieceT();

        pT1.rotarIzquierda();
        pT1.rotarIzquierda();
        pT1.rotarIzquierda();
        pT1.rotarIzquierda();

        assertArrayEquals(pT2.getForma(), pT1.getForma());
    }

    @Test
    void rotar_PieceLDerecho_rota_hacia_izquierda_test() {

        PieceL pLd = new PieceL();

        pLd.rotarIzquierda();

        assertArrayEquals(pLd.forma, pLd.getForma());

    }

    @Test
    void rotar_PieceLDerecho_rota_hacia_Izquierda_Comparacion_con_otra_pieza_test() {

        PieceL pLd1 = new PieceL();
        PieceL pLd2 = new PieceL();

        pLd1.rotarIzquierda();

        assert pLd1.getForma() != pLd2.getForma();

    }

    @Test
    void rotar_PieceLDerecho_rota_360_hacia_izquierda_test() {

        PieceL pLd1 = new PieceL();
        PieceL pLd2 = new PieceL();

        pLd1.rotarIzquierda();
        pLd1.rotarIzquierda();
        pLd1.rotarIzquierda();
        pLd1.rotarIzquierda();

        assertArrayEquals(pLd2.getForma(), pLd1.getForma());
    }

    @Test
    void rotar_PieceLIzquierdo_rota_hacia_Derecha_test() {

        PieceL pLi = new PieceL();

        pLi.rotarDerecha();

        assertArrayEquals(pLi.forma, pLi.getForma());

    }

    @Test
    void rotar_PieceLIzquierdo_rota_hacia_derecha_Comparacion_con_otra_pieza_test() {

        PieceL pLi1 = new PieceL();
        PieceL pLi2 = new PieceL();

        pLi1.rotarDerecha();

        assert pLi1.getForma() != pLi2.getForma();

    }

    @Test
    void rotar_PieceLIzquierda_rota_360_hacia_Derecha_test() {

        PieceL pLi1 = new PieceL();
        PieceL pLi2 = new PieceL();

        pLi1.rotarDerecha();
        pLi1.rotarDerecha();
        pLi1.rotarDerecha();
        pLi1.rotarDerecha();

        assertArrayEquals(pLi2.getForma(), pLi1.getForma());
    }

    @Test
    void rotar_PieceLDerecho_rota_hacia_izquierda_luego_derecha_test() {

        PieceL pLd1 = new PieceL();
        PieceL pLd2 = new PieceL();

        pLd1.rotarIzquierda();
        pLd1.rotarDerecha();

        assertArrayEquals(pLd2.getForma(), pLd1.getForma());

    }

    @Test
    void rotar_PieceStick_hacia_Derecha_test() {

        PieceStick pStick = new PieceStick();

        pStick.rotarIzquierda();

        assertArrayEquals(pStick.forma, pStick.getForma());

    }

    @Test
    void rotar_PieceStick_hacia_derecha_Comparacion_con_otra_pieza_test() {

        PieceStick pStick1 = new PieceStick();
        PieceStick pStick2 = new PieceStick();

        pStick1.rotarDerecha();

        assert pStick1.getForma() != pStick2.getForma();

    }

    @Test
    void rotar_PieceStick_hacia_izquierda_Comparacion_con_otra_pieza_test() {

        PieceStick pStick1 = new PieceStick();
        PieceStick pStick2 = new PieceStick();

        pStick1.rotarIzquierda();

        assert pStick1.getForma() != pStick2.getForma();
    }

    @Test
    void rotar_PieceStick_360_hacia_Izquierda_test() {

        PieceStick pStick1 = new PieceStick();
        PieceStick pStick2 = new PieceStick();

        pStick1.rotarIzquierda();
        pStick1.rotarIzquierda();
        pStick1.rotarIzquierda();
        pStick1.rotarIzquierda();

        assertArrayEquals(pStick2.getForma(), pStick1.getForma());
    }

    @Test
    void rotar_PieceDogDerecho_hacia_Izquierda_test() {

        PieceDog pDogd = new PieceDog();

        pDogd.rotarIzquierda();

        assertArrayEquals(pDogd.forma, pDogd.getForma());

    }

    @Test
    void rotar_PieceDogIzquierdo_hacia_derecha_test() {

        PieceDog pDogI = new PieceDog();

        pDogI.rotarDerecha();

        assertArrayEquals(pDogI.forma, pDogI.getForma());
    }

    @Test
    void rotar_PieceDogIzquierdo_hacia_izquierda_test() {

        PieceDog pDogI = new PieceDog();

        pDogI.rotarIzquierda();

        assertArrayEquals(pDogI.forma, pDogI.getForma());
    }

    @Test
    void rotar_PieceDogIzquierdo_hacia_derecha_Comparacion_con_otra_pieza_test() {

        PieceDog pDogI1 = new PieceDog();
        PieceDog pDogI2 = new PieceDog();

        pDogI1.rotarDerecha();

        assert pDogI1.getForma() != pDogI2.getForma();

    }

    @Test
    void rotar_PieceDogIzquierdo_360_hacia_Izquierda_test() {

        PieceDog pDogI1 = new PieceDog();
        PieceDog pDogI2 = new PieceDog();

        pDogI1.rotarIzquierda();
        pDogI1.rotarIzquierda();
        pDogI1.rotarIzquierda();
        pDogI1.rotarIzquierda();

        assertArrayEquals(pDogI1.getForma(), pDogI2.getForma());
    }

    @Test
    void rotar_PieceDogDerecho_hacia_derecha_Comparacion_con_otra_pieza_test() {

        PieceDog pDogD1 = new PieceDog();
        PieceDog pDogD2 = new PieceDog();

        pDogD1.rotarDerecha();

        assert pDogD1.getForma() != pDogD2.getForma();

    }

    @Test
    void rotar_PieceDogDerecho_hacia_izquierda_Comparacion_con_otra_pieza_test() {

        PieceDog pDogD1 = new PieceDog();
        PieceDog pDogD2 = new PieceDog();

        pDogD1.rotarIzquierda();

        assert pDogD1.getForma() != pDogD2.getForma();
    }

    @Test
    void rotar_PieceDogDerecho_360_hacia_Izquierda_test() {

        PieceDog pDogD1 = new PieceDog();
        PieceDog pDogD2 = new PieceDog();

        pDogD1.rotarIzquierda();
        pDogD1.rotarIzquierda();
        pDogD1.rotarIzquierda();
        pDogD1.rotarIzquierda();

        assertArrayEquals(pDogD1.getForma(), pDogD2.getForma());
    }

    // -------------------------------------Verificar ingreso de las piezas en el
    // board-------------------------------------------//

    @Test
    void verificar_ingreso_pieceT_board_test() {

        Board board = new Board();
        PieceT pT = new PieceT();

        board.ingresarNuevaPieza(pT);
        // board.colocarPieceEnTablero(pT, 0, 0);

        assertEquals(1, board.getBoard()[0][0]);
        assertEquals(1, board.getBoard()[0][1]);
        assertEquals(1, board.getBoard()[0][2]);
        assertEquals(1, board.getBoard()[1][1]);

    }

    @Test
    void verificar_ingreso_pieceT_rotando_2_veces_hacia_derecha_board_test() {

        Board board = new Board();
        PieceT pT = new PieceT();

        pT.rotarDerecha();
        pT.rotarDerecha();

        board.ingresarNuevaPieza(pT);
        // board.colocarPieceEnTablero(pT, 0, 0);

        assertEquals(1, board.getBoard()[1][1]);
        assertEquals(1, board.getBoard()[2][0]);
        assertEquals(1, board.getBoard()[2][1]);
        assertEquals(1, board.getBoard()[2][2]);

    }

    @Test
    void verificar_ingreso_pieceL_lado_izquierdo_board_test() {

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
    void verificar_ingreso_pieceL_lado_derecho_board_test() {

        Board board = new Board();
        PieceL pLd = new PieceL();

        board.ingresarNuevaPieza(pLd);

        assertEquals(1, board.getBoard()[0][1]);
        assertEquals(1, board.getBoard()[1][1]);
        assertEquals(1, board.getBoard()[2][1]);
        assertEquals(1, board.getBoard()[2][2]);
    }

    @Test
    void verificar_ingreso_pieceStick_board_test() {

        Board board = new Board();
        PieceStick pStick = new PieceStick();

        board.ingresarNuevaPieza(pStick);
        board.colocarPieceEnTablero(pStick, 0, 0);
        assertNotNull(board.getBoard()[0][0]);

    }

    @Test
    void verificar_ingreso_pieceSquare_board_test() {

        Board board = new Board();
        PieceSquare pS = new PieceSquare();

        board.ingresarNuevaPieza(pS);

        assertEquals(1, board.getBoard()[0][0]);
        assertEquals(1, board.getBoard()[1][0]);
        assertEquals(1, board.getBoard()[1][1]);
        assertEquals(1, board.getBoard()[0][1]);

    }

    @Test
    void verificar_ingreso_pieceDog_lado_izquierdo_board_test() {

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
    void verificar_ingreso_pieceDog_lado_derecho_board_test() {

        Board board = new Board();
        PieceDog pDogd = new PieceDog();

        board.ingresarNuevaPieza(pDogd);

        assertEquals(1, board.getBoard()[1][0]);
        assertEquals(1, board.getBoard()[1][1]);
        assertEquals(1, board.getBoard()[2][1]);
        assertEquals(1, board.getBoard()[2][2]);
    }

    // ----------------------------------Verificar Ingreso de las piezas con un lado
    // random-------------------------------------//

    @Test
    void verificar_ingreso_pieceL_lado_derecho_Random_board_test() {

        Board board = new Board();
        PieceL pLd1 = new PieceL();

        pLd1.seleccionarLadoRandom();
        board.ingresarNuevaPieza(pLd1);

        int[][] formaActual = pLd1.getForma();

        for (int i = 0; i < formaActual.length; i++) {
            for (int j = 0; j < formaActual[i].length; j++) {
                if (formaActual[i][j] == 1) {
                    assertEquals(1, board.getBoard()[i][j]);
                }
            }
        }

    }

    @Test
    void verificar_ingreso_pieceL_lado_izquierdo_Random_board_test() {

        Board board = new Board();
        PieceL pLi1 = new PieceL();

        pLi1.izquierda();
        pLi1.seleccionarLadoRandom();
        board.ingresarNuevaPieza(pLi1);

        int[][] formaActual = pLi1.getForma();

        for (int i = 0; i < formaActual.length; i++) {
            for (int j = 0; j < formaActual[i].length; j++) {
                if (formaActual[i][j] == 1) {
                    assertEquals(1, board.getBoard()[i][j]);
                }
            }
        }

    }

    @Test
    void verificar_ingreso_pieceDog_lado_derecho_Random_board_test() {

        Board board = new Board();
        PieceDog pDogD1 = new PieceDog();

        pDogD1.seleccionarLadoRandom(); // Creo un lado random

        board.ingresarNuevaPieza(pDogD1); // Coloco la pieza en el tablero
        int[][] formaActual = pDogD1.getForma();

        for (int i = 0; i < formaActual.length; i++) {
            for (int j = 0; j < formaActual[i].length; j++) {
                if (formaActual[i][j] == 1) {
                    assertEquals(1, board.getBoard()[i][j]);
                }
            }
        }
    }

    @Test
    void verificar_ingreso_pieceDog_lado_izquierdo_Random_board_test() {

        Board board = new Board();
        PieceDog pDogI1 = new PieceDog();
        pDogI1.izquierda();

        pDogI1.seleccionarLadoRandom();

        board.ingresarNuevaPieza(pDogI1); // Coloco la pieza en el tablero
        int[][] formaActual = pDogI1.getForma();

        for (int i = 0; i < formaActual.length; i++) {
            for (int j = 0; j < formaActual[i].length; j++) {
                if (formaActual[i][j] == 1) {
                    assertEquals(1, board.getBoard()[i][j]);
                }
            }
        }
    }

    @Test
    void verificar_ingreso_pieceT_Random_board_test() {

        Board board = new Board();
        PieceT pT1 = new PieceT();

        pT1.seleccionarLadoRandom(); // Creo lado random T

        board.ingresarNuevaPieza(pT1); // Coloco la pieza en el tablero
        int[][] formaActual = pT1.getForma();

        for (int i = 0; i < formaActual.length; i++) {
            for (int j = 0; j < formaActual[i].length; j++) {
                if (formaActual[i][j] == 1) {
                    assertEquals(1, board.getBoard()[i][j]);
                }
            }
        }

    }

    @Test
    void verificar_ingreso_pieceStick_Random_board_test() {

        Board board = new Board();
        PieceStick pStick = new PieceStick();

        pStick.seleccionarLadoRandom(); // Creo lado random T

        board.ingresarNuevaPieza(pStick); // Coloco la pieza en el tablero

        int[][] formaActual = pStick.getForma();
        for (int i = 0; i < formaActual.length; i++) {
            for (int j = 0; j < formaActual[i].length; j++) {
                if (formaActual[i][j] == 1) {
                    assertEquals(1, board.getBoard()[i][j]);
                }
            }
        }

    }

    @Test
    void verificar_ingreso_pieceSquare_Random_board_test() {

        Board board = new Board();
        PieceSquare pS = new PieceSquare();

        pS.seleccionarLadoRandom(); // Creo lado random T

        board.ingresarNuevaPieza(pS); // Coloco la pieza en el tablero

        int[][] formaActual = pS.getForma();
        for (int i = 0; i < formaActual.length; i++) {
            for (int j = 0; j < formaActual[i].length; j++) {
                if (formaActual[i][j] == 1) {
                    assertEquals(1, board.getBoard()[i][j]);
                }
            }
        }

    }

    // -------------------------------Ingreso de pieza con lado random en un lugar
    // random del board------------------------------//

    @Test
    void verificar_ingreso_pieceSquare_board_columna_random_test() {

        Board board = new Board();
        PieceSquare pS = new PieceSquare();

        board.ingresarNuevaPieza(pS);

        int columnaAleatoria = board.getColumnaActual();
        assertEquals(1, board.getBoard()[0][columnaAleatoria]);
        assertEquals(1, board.getBoard()[1][columnaAleatoria]);
        assertEquals(1, board.getBoard()[1][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[0][columnaAleatoria + 1]);
    }

    @Test
    void verificar_ingreso_pieceStick_board_columna_random_test() {

        Board board = new Board();
        PieceStick pStick = new PieceStick();

        board.ingresarNuevaPieza(pStick);

        int columnaAleatoria = board.getColumnaActual();

        assertEquals(1, board.getBoard()[0][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[1][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[2][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[3][columnaAleatoria + 1]);

    }

    @Test
    void verificar_ingreso_pieceT_board_columna_random_test() {

        Board board = new Board();
        PieceT pT = new PieceT();

        board.ingresarNuevaPieza(pT);

        int columnaAleatoria = board.getColumnaActual();
        assertEquals(1, board.getBoard()[0][columnaAleatoria]);
        assertEquals(1, board.getBoard()[1][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[1][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[1][columnaAleatoria + 1]);
    }

    @Test
    void verificar_ingreso_pieceL_Derecho_board_columna_random_test() {

        Board board = new Board();
        PieceL pLd = new PieceL();

        board.ingresarNuevaPieza(pLd);

        int columnaAleatoria = board.getColumnaActual();
        assertEquals(1, board.getBoard()[0][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[1][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[2][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[2][columnaAleatoria + 1]);
    }

    @Test
    void verificar_ingreso_pieceL_Izquierdo_board_columna_random_test() {

        Board board = new Board();
        PieceL pLi = new PieceL();
        pLi.izquierda();
        board.ingresarNuevaPieza(pLi);

        int columnaAleatoria = board.getColumnaActual();
        assertEquals(1, board.getBoard()[0][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[1][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[2][columnaAleatoria]);
        assertEquals(1, board.getBoard()[2][columnaAleatoria]);
    }

    @Test
    void verificar_ingreso_pieceDog_Derecho_board_columna_random_test() {

        Board board = new Board();
        PieceL pDogD = new PieceL();
        board.ingresarNuevaPieza(pDogD);

        int columnaAleatoria = board.getColumnaActual();
        assertEquals(1, board.getBoard()[1][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[1][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[2][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[2][columnaAleatoria + 1]);
    }

    @Test
    void verificar_ingreso_pieceDog_Izquierdo_board_columna_random_test() {

        Board board = new Board();
        PieceL pDogI = new PieceL();
        pDogI.izquierda();
        board.ingresarNuevaPieza(pDogI);

        int columnaAleatoria = board.getColumnaActual();
        assertEquals(1, board.getBoard()[1][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[1][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[2][columnaAleatoria]);
        assertEquals(1, board.getBoard()[2][columnaAleatoria]);
    }

    // --------------------------------------------------Comienzo de
    // Descenso-------------------------------------------------//
    @Test
    void verificar_ingreso_pieceSquare_descenso_board_test() {

        Board board = new Board();
        PieceSquare pS = new PieceSquare();

        board.ingresarNuevaPieza(pS); // Coloco la pieza en el tablero

        board.descenderPieza();
        board.descenderPieza();
        board.descenderPieza();

        assertEquals(0, board.getBoard()[0][0]);
        assertEquals(0, board.getBoard()[0][1]);

        assertEquals(1, board.getBoard()[3][0]);
        assertEquals(1, board.getBoard()[3][1]);
        assertEquals(1, board.getBoard()[4][0]);
        assertEquals(1, board.getBoard()[4][1]);

    }

    @Test
    void verificar_ingreso_pieceT_descenso_board_test() {

        Board board = new Board();
        PieceT pT1 = new PieceT();

        board.ingresarNuevaPieza(pT1); // Coloco la pieza en el tablero
        board.descenderPieza();
        board.descenderPieza();
        // board.descenderPieza();
        assertEquals(0, board.getBoard()[0][0]);
        assertEquals(0, board.getBoard()[0][1]);

        assertEquals(1, board.getBoard()[2][0]);
        assertEquals(1, board.getBoard()[2][1]);
        assertEquals(1, board.getBoard()[2][2]);
        assertEquals(1, board.getBoard()[3][1]);

    }

    @Test
    void verificar_ingreso_pieceStick_Descenso_board_test() {

        Board board = new Board();
        PieceStick pStick = new PieceStick();

        board.ingresarNuevaPieza(pStick); // Coloco la pieza en el tablero
        board.descenderPieza();
        board.descenderPieza();
        // board.descenderPieza();
        assertEquals(0, board.getBoard()[0][1]);
        assertEquals(0, board.getBoard()[0][1]);

        assertEquals(1, board.getBoard()[2][1]);
        assertEquals(1, board.getBoard()[3][1]);
        assertEquals(1, board.getBoard()[4][1]);
        assertEquals(1, board.getBoard()[5][1]);

    }

    @Test
    void verificar_ingreso_pieceDog_Derecho_descenso_board_test() {

        Board board = new Board();
        PieceDog pDogD1 = new PieceDog();

        board.ingresarNuevaPieza(pDogD1); // Coloco la pieza en el tablero
        board.descenderPieza();

        // board.descenderPieza();
        // board.descenderPieza();

        assertEquals(0, board.getBoard()[1][1]);
        assertEquals(0, board.getBoard()[1][0]);

        assertEquals(1, board.getBoard()[2][0]);
        assertEquals(1, board.getBoard()[2][1]);
        assertEquals(1, board.getBoard()[3][1]);
        assertEquals(1, board.getBoard()[3][2]);

    }

    @Test
    void verificar_ingreso_pieceDog_Izquierdo_Descenso_board_test() {

        Board board = new Board();
        PieceDog pDogI1 = new PieceDog();
        pDogI1.izquierda();

        board.ingresarNuevaPieza(pDogI1); // Coloco la pieza en el tablero

        board.descenderPieza();
        // board.descenderPieza();

        assertEquals(0, board.getBoard()[1][1]);
        assertEquals(0, board.getBoard()[1][2]);

        assertEquals(1, board.getBoard()[2][1]);
        assertEquals(1, board.getBoard()[2][2]);
        assertEquals(1, board.getBoard()[3][1]);
        assertEquals(1, board.getBoard()[3][0]);

    }

    @Test
    void verificar_ingreso_pieceL_lado_derecho_descender_board_test() {

        Board board = new Board();
        PieceL pLd1 = new PieceL();

        board.ingresarNuevaPieza(pLd1);
        board.descenderPieza();

        assertEquals(0, board.getBoard()[0][1]);

        assertEquals(1, board.getBoard()[1][1]);
        assertEquals(1, board.getBoard()[2][1]);
        assertEquals(1, board.getBoard()[3][1]);
        assertEquals(1, board.getBoard()[3][2]);

    }

    @Test
    void verificar_ingreso_pieceL_lado_izquierdo_descender_board_test() {

        Board board = new Board();
        PieceL pLi1 = new PieceL();

        pLi1.izquierda();
        board.ingresarNuevaPieza(pLi1);
        board.descenderPieza();

        assertEquals(0, board.getBoard()[0][1]);

        assertEquals(1, board.getBoard()[1][1]);
        assertEquals(1, board.getBoard()[2][1]);
        assertEquals(1, board.getBoard()[3][1]);
        assertEquals(1, board.getBoard()[3][0]);

    }

    // ---------------------------------------Ingreso de la pieza de lado random con
    // descenso------------------------------------//
    @Test
    void verificar_ingreso_pieceSquare_Random_descenso_board_test() {

        Board board = new Board();
        PieceSquare pS = new PieceSquare();

        pS.seleccionarLadoRandom(); // Creo lado random T

        board.ingresarNuevaPieza(pS); // Coloco la pieza en el tablero
        board.descenderPieza();

        int[][] formaActual = pS.getForma();
        for (int i = 1; i < formaActual.length; i++) {
            for (int j = 0; j < formaActual[i].length; j++) {
                if (formaActual[i][j] == 1) {
                    assertEquals(1, board.getBoard()[i][j]);
                }
            }
        }

    }

    @Test
    void verificar_ingreso_pieceStick_Random_Descenso_board_test() {

        Board board = new Board();
        PieceStick pStick = new PieceStick();

        pStick.seleccionarLadoRandom(); // Creo lado random T

        // Ingresa la pieza al tablero
        board.ingresarNuevaPieza(pStick);

        // Verifica que la pieza esté en la posición inicial en el tablero
        int[][] formaInicial = pStick.getForma();
        for (int i = 0; i < formaInicial.length; i++) {
            for (int j = 0; j < formaInicial[i].length; j++) {
                if (formaInicial[i][j] != 0) {
                    assertEquals(formaInicial[i][j], board.getBoard()[i][j]);
                }
            }
        }

        // Realiza el descenso de la pieza
        board.descenderPieza();

        // Verifica que la pieza haya descendido una fila
        for (int i = 0; i < formaInicial.length; i++) {
            for (int j = 0; j < formaInicial[i].length; j++) {
                if (formaInicial[i][j] != 0) {
                    assertEquals(formaInicial[i][j], board.getBoard()[i + 1][j]);
                }
            }
        }
    }

    @Test
    void verificar_ingreso_pieceT_Random_Descenso_board_test() {

        Board board = new Board();
        PieceT pT1 = new PieceT();

        pT1.seleccionarLadoRandom(); // Creo lado random T

        board.ingresarNuevaPieza(pT1);

        int[][] formaInicial = pT1.getForma();
        for (int i = 0; i < formaInicial.length; i++) {
            for (int j = 0; j < formaInicial[i].length; j++) {
                if (formaInicial[i][j] != 0) {
                    assertEquals(formaInicial[i][j], board.getBoard()[i][j]);
                }
            }
        }

        board.descenderPieza();

        for (int i = 0; i < formaInicial.length; i++) {
            for (int j = 0; j < formaInicial[i].length; j++) {
                if (formaInicial[i][j] != 0) {
                    assertEquals(formaInicial[i][j], board.getBoard()[i + 1][j]);
                }
            }
        }
    }

    @Test
    void verificar_ingreso_pieceDog_lado_derecho_Random_descender_board_test() {

        Board board = new Board();
        PieceDog pDogD1 = new PieceDog();

        pDogD1.seleccionarLadoRandom(); // Creo un lado random
        board.ingresarNuevaPieza(pDogD1); // Coloco la pieza en el tablero

        int[][] formaInicial = pDogD1.getForma();
        for (int i = 0; i < formaInicial.length; i++) {
            for (int j = 0; j < formaInicial[i].length; j++) {

                if (formaInicial[i][j] != 0) {
                    assertEquals(formaInicial[i][j], board.getBoard()[i][j]);
                }
            }
        }

        board.descenderPieza();

        for (int i = 0; i < formaInicial.length; i++) {
            for (int j = 0; j < formaInicial[i].length; j++) {
                if (formaInicial[i][j] != 0) {
                    assertEquals(formaInicial[i][j], board.getBoard()[i + 1][j]);
                }
            }
        }
    }

    @Test
    void verificar_ingreso_pieceDog_lado_izquierdo_Random_Descender_board_test() {

        Board board = new Board();
        PieceDog pDogI1 = new PieceDog();
        pDogI1.izquierda();

        pDogI1.seleccionarLadoRandom();

        board.ingresarNuevaPieza(pDogI1); // Coloco la pieza en el tablero
        int[][] formaInicial = pDogI1.getForma();
        for (int i = 0; i < formaInicial.length; i++) {
            for (int j = 0; j < formaInicial[i].length; j++) {
                if (formaInicial[i][j] != 0) {
                    assertEquals(formaInicial[i][j], board.getBoard()[i][j]);
                }
            }
        }

        board.descenderPieza();

        for (int i = 0; i < formaInicial.length; i++) {
            for (int j = 0; j < formaInicial[i].length; j++) {
                if (formaInicial[i][j] != 0) {
                    assertEquals(formaInicial[i][j], board.getBoard()[i + 1][j]);
                }
            }
        }
    }

    @Test
    void verificar_ingreso_pieceL_lado_derecho_Random_descenso_board_test() {

        Board board = new Board();
        PieceL pLd1 = new PieceL();

        pLd1.izquierda();

        pLd1.seleccionarLadoRandom();

        board.ingresarNuevaPieza(pLd1);

        int[][] formaInicial = pLd1.getForma();
        for (int i = 0; i < formaInicial.length; i++) {
            for (int j = 0; j < formaInicial[i].length; j++) {
                if (formaInicial[i][j] != 0) {
                    assertEquals(formaInicial[i][j], board.getBoard()[i][j]);
                }
            }
        }

        board.descenderPieza();

        for (int i = 0; i < formaInicial.length; i++) {
            for (int j = 0; j < formaInicial[i].length; j++) {
                if (formaInicial[i][j] != 0) {
                    assertEquals(formaInicial[i][j], board.getBoard()[i + 1][j]);
                }
            }
        }
    }

    @Test
    void verificar_ingreso_pieceL_lado_izquierdo_Random_descenso_board_test() {
        Board board = new Board();
        PieceL pLi1 = new PieceL();

        pLi1.izquierda();

        pLi1.seleccionarLadoRandom();

        board.ingresarNuevaPieza(pLi1);

        int[][] formaInicial = pLi1.getForma();
        for (int i = 0; i < formaInicial.length; i++) {
            for (int j = 0; j < formaInicial[i].length; j++) {
                if (formaInicial[i][j] != 0) {
                    assertEquals(formaInicial[i][j], board.getBoard()[i][j]);
                }
            }
        }

        board.descenderPieza();

        for (int i = 0; i < formaInicial.length; i++) {
            for (int j = 0; j < formaInicial[i].length; j++) {
                if (formaInicial[i][j] != 0) {
                    assertEquals(formaInicial[i][j], board.getBoard()[i + 1][j]);
                }
            }
        }
    }

    // --------------------------------------Descenso en una columna
    // random-----------------------------------------//
    @Test
    void verificar_Descenso_pieceSquare_board_columna_random_test() {

        Board board = new Board();
        PieceSquare pS = new PieceSquare();

        int[][] formaInicial = pS.getForma();

        board.ingresarNuevaPieza(pS);

        int columnaAleatoria = board.getColumnaActual();
        assertEquals(1, board.getBoard()[0][columnaAleatoria]);
        assertEquals(1, board.getBoard()[1][columnaAleatoria]);
        assertEquals(1, board.getBoard()[1][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[0][columnaAleatoria + 1]);
        board.descenderPieza();

        for (int i = 0; i < formaInicial.length; i++) {
            for (int j = 0; j < formaInicial[i].length; j++) {
                if (formaInicial[i][j] != 0) {
                    assertEquals(formaInicial[i][j], board.getBoard()[i + 1][j]);
                }
            }
        }
    }

    @Test
    void verificar_Descenso_pieceStick_board_columna_random_test() {

        Board board = new Board();
        PieceStick pStick = new PieceStick();

        int[][] formaInicial = pStick.getForma();

        board.ingresarNuevaPieza(pStick);

        int columnaAleatoria = board.getColumnaActual();
        assertEquals(1, board.getBoard()[0][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[1][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[2][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[3][columnaAleatoria + 1]);
        board.descenderPieza();

        for (int i = 0; i < formaInicial.length; i++) {
            for (int j = 0; j < formaInicial[i].length; j++) {
                if (formaInicial[i][j] != 0) {
                    assertEquals(formaInicial[i][j], board.getBoard()[i + 1][j]);
                }
            }
        }
    }

    @Test
    void verificar_Descenso_pieceT_board_columna_random_test() {

        Board board = new Board();
        PieceT pT1 = new PieceT();
        int[][] formaInicial = pT1.getForma();
        board.ingresarNuevaPieza(pT1);

        int columnaAleatoria = board.getColumnaActual();
        assertEquals(1, board.getBoard()[0][columnaAleatoria]);
        assertEquals(1, board.getBoard()[1][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[1][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[1][columnaAleatoria + 1]);

        board.descenderPieza();
        for (int i = 0; i < formaInicial.length; i++) {
            for (int j = 0; j < formaInicial[i].length; j++) {
                if (formaInicial[i][j] != 0) {
                    assertEquals(formaInicial[i][j], board.getBoard()[i + 1][j]);
                }
            }
        }

    }

    @Test
    void verificar_Descenso_pieceL_Derecho_board_columna_random_test() {

        Board board = new Board();
        PieceL pLd = new PieceL();
        int[][] formaInicial = pLd.getForma();

        board.ingresarNuevaPieza(pLd);

        int columnaAleatoria = board.getColumnaActual();
        assertEquals(1, board.getBoard()[0][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[1][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[2][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[2][columnaAleatoria + 1]);

        board.descenderPieza();
        for (int i = 0; i < formaInicial.length; i++) {
            for (int j = 0; j < formaInicial[i].length; j++) {
                if (formaInicial[i][j] != 0) {
                    assertEquals(formaInicial[i][j], board.getBoard()[i + 1][j]);
                }
            }
        }
    }

    @Test
    void verificar_Descenso_pieceL_Izquierdo_board_columna_random_test() {

        Board board = new Board();
        PieceL pLi = new PieceL();

        pLi.izquierda();
        int[][] formaInicial = pLi.getForma();

        board.ingresarNuevaPieza(pLi);

        int columnaAleatoria = board.getColumnaActual();
        assertEquals(1, board.getBoard()[0][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[1][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[2][columnaAleatoria]);
        assertEquals(1, board.getBoard()[2][columnaAleatoria]);
        board.descenderPieza();
        for (int i = 0; i < formaInicial.length; i++) {
            for (int j = 0; j < formaInicial[i].length; j++) {
                if (formaInicial[i][j] != 0) {
                    assertEquals(formaInicial[i][j], board.getBoard()[i + 1][j]);
                }
            }
        }

    }
    @Test
    void verificar_Descenso_pieceDog_Derecho_board_columna_random_test() {

        Board board = new Board();
        PieceL pDogD = new PieceL();
        int[][] formaInicial = pDogD.getForma();

        board.ingresarNuevaPieza(pDogD);

        int columnaAleatoria = board.getColumnaActual();
        assertEquals(1, board.getBoard()[1][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[1][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[2][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[2][columnaAleatoria + 1]);

        board.descenderPieza();
        for (int i = 0; i < formaInicial.length; i++) {
            for (int j = 0; j < formaInicial[i].length; j++) {
                if (formaInicial[i][j] != 0) {
                    assertEquals(formaInicial[i][j], board.getBoard()[i + 1][j]);
                }
            }
        }
    }

    @Test
    void verificar_Descenso_pieceDog_Izquierdo_board_columna_random_test() {

        Board board = new Board();
        PieceL pDogI = new PieceL();
        pDogI.izquierda();
        int[][] formaInicial = pDogI.getForma();

        board.ingresarNuevaPieza(pDogI);

        int columnaAleatoria = board.getColumnaActual();
        assertEquals(1, board.getBoard()[1][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[1][columnaAleatoria + 1]);
        assertEquals(1, board.getBoard()[2][columnaAleatoria]);
        assertEquals(1, board.getBoard()[2][columnaAleatoria]);
        board.descenderPieza();
        for (int i = 0; i < formaInicial.length; i++) {
            for (int j = 0; j < formaInicial[i].length; j++) {
                if (formaInicial[i][j] != 0) {
                    assertEquals(formaInicial[i][j], board.getBoard()[i + 1][j]);
                }
            }
        }
    }


    // -------------------------------------------Tic para contar la cantidad de
    // descenso-----------------------------------------//
    @Test
    void comprobar_el_setTic_en_clock_test() {

        Clock c1 = new Clock();

        c1.setTic(1);

        assert c1.getTic() == 1; // Se aplico la misma comparacion para verificar en el jacobo
        assertEquals(1, c1.getTic());
    }

    @Test
    void crear_clock_comprobar_tic_test() {

        Clock c1 = new Clock();
        c1.tic();

        assertEquals(1, c1.getTic());
    }

    @Test
    void verificar_descenso_pieceSquare_con_clock_test() {

        Board board = new Board();
        PieceSquare pS = new PieceSquare();
        Clock c1 = new Clock();

        pS.seleccionarLadoRandom(); // Creo lado random 

        board.ingresarNuevaPieza(pS); // Coloco la pieza en el tablero

        c1.tic();
        c1.tic();
        board.descenderPieza();

        
        int[][] formaActual = pS.getForma();
        for (int i = 1; i < formaActual.length; i++) {
            for (int j = 0; j < formaActual[i].length; j++) {
                if (formaActual[i][j] == 1) {
                    assertEquals(1, board.getBoard()[i][j]);
                }
            }
        }
        assertEquals(2, c1.getTic());
    }

}
