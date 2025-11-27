package tema3.arrays.matrices;

public class ejemplo5 {


    public static void pintarMatriz(int [][] m){
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j<m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        //Dada una matriz 5x5 de enteros generados aleatoriamente
        //muestra los elementos de la diagonal principal y calcula su suma

        int acumulador = 0;
        int [][] matriz = new int[5][5];
        for (int i = 0; i <matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int) (Math.random() * 10);
                if (i==j){
                    System.out.print(matriz[i][j] + " ");
                    acumulador += matriz[i][j];

                }

            }
        }
        System.out.println();
        System.out.println("Su suma es: " + acumulador);
        System.out.println();
        pintarMatriz(matriz);






    }



}
