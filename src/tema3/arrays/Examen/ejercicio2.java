package tema3.arrays.Examen;

public class ejercicio2 {
    /**
     * Programa un simulador que lance un dado de 8 caras 200 veces y guarde los resultados en un
     * array. Después debe:
     * Mostrar la cantidad de veces que sale cada cara.
     * Indicar cuál(es) es la cara que más veces ha salido.
     * Calcular y mostrar la media aritmética de los resultados.
     * Implementar una función double porcentajeParejasConsecutivas(int[] array) que calcule
     * el porcentaje de veces que salen dos tiradas consecutivas iguales en el array.
     * Implementar una función int[] carasNoSalidas(int[] array) que devuelva un array con
     * las caras del dado que no han salido ninguna vez en las 200 tiradas.
     */


    public static int generarNumero(int max ) {
        return (int) (Math.random() * 8) + 1;
    }

    //En este metodo cuenta cuantas veces sale cada cada y cual salio mas veces
    public static double[] contarcaras(double n ){
        double [] contarCaras = new double[8];
        int numeros = 0;
        int contar=0;
        int caraMax = 0;
        do {
            numeros = generarNumero(8);
            if (numeros == 1) {
                contarCaras[0]++;
            } else if (numeros == 2) {
                contarCaras[1]++;
            }else if (numeros == 3) {
                contarCaras[2]++;
            }else if (numeros == 4) {
                contarCaras[3]++;
            }else if (numeros == 5) {
                contarCaras[4]++;
            }else if (numeros == 6) {
                contarCaras[5]++;
            }else if (numeros == 7) {
                contarCaras[6]++;
            }else{
                contarCaras[7]++;
            }

            contar++;

        }while (n != contar);

        return contarCaras;
    }

    //No me sale bien la funcion porque me coge el toltal de numeros no uno por uno
    /**public static double numerosConsec(double[] resul) {
        resul = contarcaras(200);
        int contador=0;
        double numero = 0;


        for (int i = 0; i < resul.length - 1; i++) {
            numero= generarNumero(8);
            if (numero[i] == numero[i + 1]) {
                contador++;
            }
        }

        return contador;
    }
     */

    //Metodo que guarda la cara que mas veces salio
    public static double caraMax(double[] m) {
        double maximo = m[0];
        for (int i = 0; i < m.length; i++){
            if (m[i] > maximo){
                maximo = m[i];
            }
        }
        return maximo;
    }

    //Media de la suma de las caras
    public static double media(double[] media) {
        double acumulador = 0;
        for(int i=0; i < media.length; i++) {
            acumulador += media[i] * (i + 1);
        }
        return acumulador / 200;
    }




    public static void main(String[] args) {
        double[] resul = contarcaras(200);
        double resultado = 0;
        double caraMax = 0;
        double numerosConsec;
        // Resultado de cuantas veces sale cada cara
        System.out.println("Salio 1: " + resul[0] + " Veces");
        System.out.println("Salio 2: " + resul[1] + " Veces");
        System.out.println("Salio 3: " + resul[2] + " Veces");
        System.out.println("Salio 4: " + resul[3] + " Veces");
        System.out.println("Salio 5: " + resul[4] + " Veces");
        System.out.println("Salio 6: " + resul[5] + " Veces");
        System.out.println("Salio 7: " + resul[6] + " Veces");
        System.out.println("Salio 8: " + resul[7] + " Veces");

        //Aqui llama a la funcion de media y la pinta por pantalla
        resultado = media(resul);
        System.out.println(resultado);
        // Pinta las veces que mas salio una cara
        caraMax = caraMax(resul);
        System.out.println("La cara que mas veces salió fue unas  " + caraMax + " veces");
        //
        //numerosConsec = numerosConsec(resul);
        //System.out.println(numerosConsec);








    }


}



