package tema3.arrays.EjerciciosArrays;

public class ejercicio1 {


    public static void imprimirArray(double[] array) {
        for(int i=array.length - 1;i >= 0; i--) {
            System.out.println(array[i]);
        }
    }


    public static void main(String[] args) {

        //Crea un array de 10 números de tipo double y píntalos en orden inverso
        double[] numeros = {3.4, 5.5, 2.9, 5.6, 7.8, 9.1, 3.3, 1.2, 4.5, 6.7};

        imprimirArray(numeros);


    }








}
