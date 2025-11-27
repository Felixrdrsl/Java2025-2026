package tema3.arrays.matrices;

public class ejemplo6 {

    public static void pintarMatriz(char [][] m){
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j<m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //Dibuja una matriz 8x8 con un patron de tablero de ajedrez 'x' blancas y '0' negras

        char [][] matriz = new char[8][8];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = 'X';
                if (i % 2 == 0 && j % 2 != 0){
                    matriz[i][j] = 'O';
                }
                if (i % 2 != 0 && j % 2 == 0){
                    matriz[i][j] = 'O';
                }
            }
        }
        pintarMatriz(matriz);




    }


}
