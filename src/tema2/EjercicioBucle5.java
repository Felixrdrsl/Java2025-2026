package tema2;

public class EjercicioBucle5 {
    public static void main(String[] args) {

        //Lanza un dado de 20 caras 50 veces y dime cuantas sale un critico (20)

        //V.E.: tirada del dado
        //V.S.: número de veces que salio 20

        //Diseño
        //a) Lanzar un dado de 20 caras
        //   Generando un número aleatorio entre 1 y 20
        //   int dado = (int) (Math.random() * 20) + 1;
        //b) Lanzarlo 50 veces
        //   Bucle de 1 a 50
        //   for(int i=1; i<=50; i++) {}
        //c) comparar que el dado sea == 20 eso es un crítico
        //   Necesito un contador=0 que sume uno cada vez que dado==20

        int contadorDado = 0;

        for (int i = 1; i<=50; i++){
            int dado = (int) (Math.random() * 20 ) + 1;
            if (dado == 20){
                contadorDado++;
            }

        }
        System.out.println("Ha caido en 20 un total " + contadorDado + " Veces");



    }
}
