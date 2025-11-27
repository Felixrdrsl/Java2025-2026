package tema3.arrays.matrices;

public class ejemplo7 {
    public static void pintarMatriz(char [][] m){
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j<m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {


        //Crea una matriz 10x10 y rellénala con símbolos '-'.
        //Luego, dibuja una 'X' en la matriz utilizando el símbolo 'X' desde las esquinas hasta el centro.


        char [][] matriz = new char[9][9];
        for (int i = 0; i <matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if ((i==j) || (i+j==matriz.length-1) ){
                    matriz[i][j] = 'X';
                }else {
                    matriz[i][j] = '-';
                }
            }

        }
        pintarMatriz(matriz);
    }


}
