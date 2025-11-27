package tema3.arrays.matrices;

public class ejemplo1 {
    /**
     * Maximo de una matriz
     *
     *
     *
     */


    public static double maximoDeUnaMatriz(double[][] m) {
        double maximo = m[0][0];
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j<m[i].length; j++){
                if (m[i][j] > maximo){
                    maximo = m[i][j];
                }
            }
        }
        return maximo;
    }
    public static double minimoDeUnaMatriz(double[][] m) {
        double minimo = m[0][0];
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j<m[i].length; j++){
                if (m[i][j] < minimo){
                    minimo = m[i][j];
                }
            }
        }
        return minimo;
    }

    public static void pintarMatriz(double [][] m){
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j<m[i].length; j++){
                System.out.printf("%5.2f| ", m[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        //rellenar matriz 4x4 con numeros aleatorios entre 1 y 100

        double [][] matriz = new double[10][10]; // 3 filas y 5 columnas

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                matriz[i][j] = Math.random();
            }
        }
        pintarMatriz(matriz);

        System.out.println("El mayor es: " + maximoDeUnaMatriz(matriz));
        System.out.println("El menor es: " + minimoDeUnaMatriz(matriz));
    }


}
