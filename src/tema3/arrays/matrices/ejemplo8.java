package tema3.arrays.matrices;

public class ejemplo8 {
    public static void pintarMatriz(char [][] m){
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j<m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        /**
         * Dada una matriz 8x8 que representa un tablero de ajedrez
         * Dadas las coordenadas i , j donde esta el rey en el tablero
         * Dime a que posiciones del tablero se puede mover el rey
         */

        char [][] tablero = new char[8][8];
        for (int i = 0; i < tablero.length; i++){
            for (int j = 0; j < tablero[i].length; j++){
                tablero[i][j] = '-';



            }
        }
        System.out.println();

        int reyX = 3, reyY = 2;
        tablero[reyX][reyY] = 'R';
        pintarMatriz(tablero);
        System.out.println();

        reyX = 2;
        reyY = 2;
        tablero[reyX][reyY] = 'R';
        pintarMatriz(tablero);
        System.out.println();

        reyX = 2;
        reyY =1;
        tablero[reyX][reyY] = 'R';
        pintarMatriz(tablero);
        System.out.println();

        reyX = 2;
        reyY =3;
        tablero[reyX][reyY] = 'R';
        pintarMatriz(tablero);
        System.out.println();

        reyX = 3;
        reyY =3;
        tablero[reyX][reyY] = 'R';
        pintarMatriz(tablero);
        System.out.println();

        reyX = 3;
        reyY =2;
        tablero[reyX][reyY] = 'R';
        pintarMatriz(tablero);
        System.out.println();

        reyX = 3;
        reyY =1;
        tablero[reyX][reyY] = 'R';
        pintarMatriz(tablero);
        System.out.println();

        reyX = 4;
        reyY =1;
        tablero[reyX][reyY] = 'R';
        pintarMatriz(tablero);
        System.out.println();

        reyX = 4;
        reyY =2;
        tablero[reyX][reyY] = 'R';
        pintarMatriz(tablero);
        System.out.println();
        
        reyX = 4;
        reyY =3;
        tablero[reyX][reyY] = 'R';
        pintarMatriz(tablero);
        System.out.println();
    }






}
