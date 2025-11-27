package tema3.arrays.matrices;

public class ejemplo1Matrices {

    //Pintar matriz en pantalla

    public static void pintarMatriz(int [][] m){
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j<m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {

        int [][] matriz = new int[3][5]; // 3 filas y 5 columnas

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        pintarMatriz(matriz);


    }
}
