package tema2;

public class Ejerciciobucles3 {
    public static void main(String[] args) {

        //Numeros que sean multiplos de 3 pero no de 5 entre 100 y 200

        int contador = 0;
        int contadorMultiplos3 = 0;

        for (int numero = 100;numero <= 200; numero++){

            if ((numero % 3 == 0) && (numero % 5 != 0)){
                System.out.print(numero + " ");
                contadorMultiplos3++;
            }contador++;

        }
        System.out.println();
        System.out.println("Entre 100 y 200 hay " + contadorMultiplos3 + " multiplos de 3");


    }
}
