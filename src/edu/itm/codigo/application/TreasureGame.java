package edu.itm.codigo.application;

import java.util.Random;

public class TreasureGame {

    private int filas;
    private int columnas;
    private int tesoroFila;
    private int tesoroColumna;

    public TreasureGame(int filas, int columnas) {
        if (filas <= 0 || columnas <= 0) {
            throw new IllegalArgumentException("Filas y columnas deben ser mayores que cero.");
        }
        this.filas = filas;
        this.columnas = columnas;
        colocarTesoro();
    }

    private void colocarTesoro() {
        Random random = new Random();
        tesoroFila = random.nextInt(filas);
        tesoroColumna = random.nextInt(columnas);
    }

    /**
     * Valida si las coordenadas están dentro del tablero.
     *
     * @param fila
     * @param columna
     * @return
     */
    public boolean validarCoordenada(int fila, int columna) {
        return fila >= 0 && fila < filas && columna >= 0 && columna < columnas;
    }

    /**
     * Procesa un intento. Devuelve: -1 si coordenada inválida, 1 si encontró
     * tesoro, 0 si falló.
     *
     * @param fila
     * @param columna
     * @return
     */
    public int intentar(int fila, int columna) {
        if (!validarCoordenada(fila, columna)) {
            return -1;
        }
        return (fila == tesoroFila && columna == tesoroColumna) ? 1 : 0;
    }

    public int getTesoroFila() {
        return tesoroFila;
    }

    public int getTesoroColumna() {
        return tesoroColumna;
    }
}
