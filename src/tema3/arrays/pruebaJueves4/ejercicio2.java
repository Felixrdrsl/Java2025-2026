package tema3.arrays.pruebaJueves4;

public class ejercicio2 {

    /**
     * Simulador de Ruleta
     * Escriba un programa que simule una ruleta simplificada con números del 0 al 36. El programa
     * debe:
     * 1. Generar tiradas aleatorias de la ruleta hasta que salga el número 0 (la banca gana).
     * 2. Mostrar cada número que sale y clasificarlo como:
     * ROJO: Números impares del 1 al 10 y del 19 al 28, y números pares del 11 al 18 y del
     * 29 al 36
     * NEGRO: El resto de números excepto el 0
     * VERDE: El número 0
     * 3. Contar cuántas tiradas se realizaron hasta que salió el 0.
     * 4. Mostrar la suma total de todos los números que salieron.
     * Después, escribe una función llamada int[] contarColores(int n) que simule n tiradas de
     * ruleta y devuelva un array con tres posiciones: [cantidad_rojos, cantidad_negros,
     * cantidad_verdes] .
     * Prueba el ejercicio con n = 50 y n = 200 .
     */


    public static int generarNumero(int max, int min ) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
    public static int[] ContarColores(int n ){
        int [] contarColores = new int[3];
        int numeros = 0;
        int contar=0;
        do {
            numeros = generarNumero(36, 0);
            if (numeros == 0) {
                contarColores[0]++;
            }
            if (numeros >= 1 && numeros < 10) {
                if (numeros % 2 == 1) {
                    contarColores[1]++;
                } else {
                    contarColores[2]++;
                }
            }
            if (numeros > 18 && numeros < 29) {
                if (numeros % 2 == 1) {
                    contarColores[1]++;
                } else {
                    contarColores[2]++;
                }
            }
            if (numeros >= 10 && numeros < 19) {
                if (numeros % 2 == 0) {
                    contarColores[1]++;
                } else {
                    contarColores[2]++;
                }
            }
            if (numeros >= 28 && numeros < 37) {
                if (numeros % 2 == 0) {
                    contarColores[1]++;
                } else {
                    contarColores[2]++;
                }
            }
            contar++;

        }while (n != contar);

        return contarColores;
    }



    public static void main(String[] args){

        //Crear un array de 10 elementos aleatorios entre 1 y 100
        int numeros = 0;
        int contador = 0;
        int sumaNumeros = 0;
        //Rellenar con valores aleatorios
        do {
            numeros = generarNumero(36, 0);
            sumaNumeros += numeros;


            // No lo he simplificado porque no me salia bien
            // No me mates profe :)
            if (numeros == 0){
                System.out.println("Verde ");
                System.out.println("Las tiradas que pasaron hasta que fue 0 son: " + contador);
                System.out.println("Suma de todos los numeros son: " + sumaNumeros);


            }
            if (numeros >= 1 && numeros < 10){
                if (numeros % 2 == 1){
                    System.out.println("Rojo");
                }else {
                    System.out.println("Negro");
                }
            }
            if (numeros > 18 && numeros < 29) {
                if (numeros % 2 == 1){
                    System.out.println("Rojo");
                }else {
                    System.out.println("Negro");
                }
            }
            if (numeros >= 10 && numeros < 19) {
                if (numeros % 2 == 0){
                    System.out.println("Rojo");
                }else {
                    System.out.println("Negro");
                }
            }
            if (numeros >= 28 && numeros < 37) {
                if (numeros % 2 == 0){
                    System.out.println("Rojo");
                }else {
                    System.out.println("Negro");
                }
            }

            contador++;

        }while (numeros != 0);

        int[] resul = ContarColores(50);
        System.out.println("Salio verde: " + resul[0] + " Veces");
        System.out.println("Salio Rojo: " + resul[1] + " Veces");
        System.out.println("Salio Negro: " + resul[2] + " Veces");

        System.out.println();

        resul = ContarColores(200);
        System.out.println("Salio verde: " + resul[0] + " Veces");
        System.out.println("Salio Rojo: " + resul[1] + " Veces");
        System.out.println("Salio Negro: " + resul[2] + " Veces");

    }



}
