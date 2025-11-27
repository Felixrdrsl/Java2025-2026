package tema3.arrays.matrices;

public class ejemplo2 {


    public static void pintarMatriz(int [][] m){
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j<m[i].length; j++){
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        //Crea una matriz 5x5 de enteros y rellenala con numeros aletorios entre 1 y 100
        //Luego , calcula la suma de cada fila y cada colunma, y muestra los resultados.


        int [][] matriz = new int[5][5];
        for (int i = 0; i <matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int) (Math.random());

            }
        }


    }


}
