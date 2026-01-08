package tema3.arrays.Examen;

import java.util.Scanner;

public class ejercicio3 {

    /**
     * Desarrolla el siguiente juego por consola usando una matriz 7x7:
     * La matriz contiene 5 minas ocultas (valor 'M') y el resto es vacío ('_').
     * El usuario tiene 15 intentos para descubrir todas las casillas libres.
     * En cada intento, introduce fila y columna:
     * Si acierta una mina: pierde la partida y se muestran todas las minas.
     * Si acierta vacío: marca la casilla mostrando un número del 0 al 8 que indica cuántas
     * minas hay en las casillas adyacentes (horizontal, vertical y diagonal).
     * Si el número es 0 (sin minas alrededor), se muestra '0'.
     * Si intenta descubrir una casilla ya descubierta: no consume intento.
     * El juego termina cuando el usuario descubre todas las casillas seguras o pisa una mina.
     * Muestra el tablero después de cada intento (sin mostrar las minas no reveladas).
     * Requisitos:
     * void inicializarTablero(char[][] tablero) para colocar minas aleatorias (sin que
     * coincidan).
     * int contarMinasAdyacentes(char[][] tablero, int fila, int columna) que devuelve el
     * número de minas alrededor de una posición (máximo 8).
     * void mostrarTablero(char[][] tablero, boolean mostrarMinas) para mostrar el tablero.
     * boolean haGanado(char[][] tablero) para comprobar victoria.
     * Validar que las coordenadas introducidas sean correctas (rango 0-6).
     * Controlar excepciones al leer datos de entrada.
     * Al descubrir una casilla, debe mostrar el número de minas adyacentes en lugar de 'D'.
     *
     *
     */


    //pinta el tablero
    public static void pintarTablero(char [][] m){
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j<m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    //Muestra las minas
    public static void mostrarTablero(char[][] matriz, boolean mostrarMinas) {
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                if (mostrarMinas && matriz[i][j] == 'M') {
                    System.out.printf("%2c", matriz[i][j]);
                } else if (!mostrarMinas && matriz[i][j] == 'M') {
                    System.out.printf("%2c", '-');
                } else {
                    System.out.printf("%2c", matriz[i][j]);
                }
            }
            System.out.println();
        }
    }

    //Funcion que coloca las minas
    public static void colocarMina(char[][] tablero, int tamano) {
        int fila, columna;
        boolean solapado = false;

        do {
            fila = (int)(Math.random()*7);
            columna = (int)(Math.random()*7);

            //Comprobar que no se salga del tablero
            if (columna <= 6) {
                //Comprobar que no se solapen
                solapado = false;
                for (int i = 0; i < tamano; i++) {
                    if (tablero[fila][columna + i] == 'M') {
                        solapado = true;
                    }
                }

                //Si no se solapa, continuar
                if (!solapado) {
                    //Colocar mina
                    for (int i = 0; i < tamano; i++) {
                        tablero[fila][columna + i] = 'M';
                    }
                    break;
                }
            }
            //Comprobar que no se salga del tablero
            if (fila <= 6) { //Vertical
                //Comprobar que no se solapen
                solapado = false;
                for (int i = 0; i < tamano; i++) {
                    if (tablero[fila + i][columna] == 'M') {
                        solapado = true;
                    }
                }

                //Si no se solapa, continuar
                if (!solapado) {
                    for (int i = 0; i < tamano; i++) {
                        tablero[fila + i][columna] = 'M';
                    }
                    break;
                }
            }
        } while( true );

    }

    public static boolean TocaMina(char[][] tablero) {
        boolean tocaMina = false;
        for(int i=0; i < tablero.length; i++) {
            for(int j=0; j < tablero[i].length; j++) {
                if (tablero[i][j] == 'M') {
                    tocaMina = true;
                    break;
                }
            }
        }
        return tocaMina;
    }

    public static void main(String[] args) {

        //Tablero
        char [][] tablero = new char[7][7];
        int dispFila, dispColumna;
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tablero.length; i++){
            for (int j = 0; j < tablero[i].length; j++){
                tablero[i][j] = '-';
            }
        }
        colocarMina(tablero, 1);
        colocarMina(tablero, 1);
        colocarMina(tablero, 1);
        colocarMina(tablero, 1);
        colocarMina(tablero, 1);

        do {
            mostrarTablero(tablero,false);
            try {
                System.out.println("Introduce fila del disparo:");
                dispFila = Integer.parseInt(sc.nextLine());
                System.out.println("Introduce columna del disparo:");
                dispColumna = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Coordenadas incorrectas");
                continue;
            }

            try {
                if (tablero[dispFila][dispColumna] == 'M') {
                    System.out.println("Mina!");
                    tablero[dispFila][dispColumna] = 'M';
                    mostrarTablero(tablero,true);
                    break;
                } else if (tablero[dispFila][dispColumna] == '-') {
                    tablero[dispFila][dispColumna] = 'O';
                } else if (tablero[dispFila][dispColumna] == '0') {
                    System.out.println("ya probaste Ahi");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Coordenadas fuera de rango");
                continue;
            }

            //if (TocaMina(tablero)) {
            //    System.out.println("Perdiste");
            //}
            if (contador > 44){
                System.out.println("Has ganado!");
                return;
            }
            contador++;

        }while (true);

    }

}
