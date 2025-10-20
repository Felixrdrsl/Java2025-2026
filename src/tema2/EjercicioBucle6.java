package tema2;

public class EjercicioBucle6 {
    public static void main(String[] args) {

        //Lanza dos dados de 12 caras 100 veces
        //cuantas veces salen igaul

        int contadorDado = 0;

        for (int i = 1; i<=100; i++){
            int dado1 = (int) (Math.random() * 12 ) + 1;
            int dado2 = (int) (Math.random() * 12 ) + 1;

            if (dado1 == dado2 ){
                contadorDado++;
            }

        }
        System.out.println("Han salido igual " + contadorDado + " veces");


    }
}
