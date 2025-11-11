package tema3.arrays.EjerciciosArrays;

public class ejercicio2 {

    public static double generarNumero(double max, double min) {
        //Tambien se puede hacer (int) (Math.random() * (max - min + 1) + min);
        int num = 0;
        num = (int) (Math.random() * 2 + 1);
        max = (int) (Math.random() * max + 1);
        min = (int) (Math.random() * min + 1);
        if (num == 1){
            return max;
        }else {
            return min;
        }
    }
    public static double generarNumeroH(double max) {
        return (int) (Math.random() * max + 1);
    }

    /**
     * Función que imprime un array de double
     * @param array
     */
    public static void imprimirArray(double[] array) {
        for(int i=0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void imprimirArray2(double[] array) {
        for(int i=0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }




    public static void main(String[] args) {

        //Rellenar un array de 100 elementos de tipo double con valores
        //aleatorios de temperatura entre -20 y 40

        //Rellenar un array de 100 elementos de tipo double con valores
        //aleatorios de humedad entre 0 y 100

        //Haz un programa que muestre por pantalla la temperatura y la humedad
        //media conforme vas generando valores aleatorios

        //Si la temperatura media es superior a 30 grados en algún momento debe
        //parar el bucle y mostrar un mensaje indicando que ha superado la temperatura
        //media permitida.


        double[] temperatura = new double[100];
        double[] humedad = new double[100];
        double acumuladorTemp = 0, acumuladorHum = 0;

        //Rellenar con valores aleatorios
        for (int i = 0; i < temperatura.length; i++) {
            temperatura[i] = generarNumero(40,-20);
            humedad[i] = generarNumeroH(100);

            acumuladorTemp += temperatura[i];
            acumuladorHum += humedad[i];

            System.out.println("Temperatura media actual: " + (acumuladorTemp / (i+1)));
            System.out.println("Temperatura media actual: " + (acumuladorHum / (i+1)));

            if ((acumuladorTemp / (i + 1) >25) && (i > 1) ){
                System.out.println("Has superado la media max permitida");
                break;
            }
        }
        imprimirArray(temperatura);
        System.out.println();
        imprimirArray2(humedad);


    }


}
