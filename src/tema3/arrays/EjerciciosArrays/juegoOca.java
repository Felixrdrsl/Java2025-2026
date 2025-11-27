package tema3.arrays.EjerciciosArrays;

import java.util.Scanner;

public class juegoOca {

    public static int tirada(int max){
        return (int) (Math.random() * max ) + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // juego de la oca
        String[] casillas =  new String[63]; // pos 0 - pos 62, casillas 1 - 63
        int[] ocas = {1, 5, 9, 14, 18, 23, 27, 32, 36, 41, 45, 50, 54, 59, 63};
        int[] puente = {6, 12};
        int[] dados = {26, 53};
        int muerte = 58;

        // int pozo = 31; --> hasta que pase otro
        // int carcel = 52; --> caiga otro
        // int laberinto = 42; --> cuatro turnos


        // Fichas jugadores, la posicion en la que esta cada jugador

        int [] jugadores = {-1,-1,-1,-1};


        int tirada=0;
        while (true){

            //PARA CADA JUGADOR

            for (int i=0; i<jugadores.length; i++){
                System.out.println("Jugador " + (i+1) + ": " + (jugadores[i]+1));
                tirada = tirada(6);
                System.out.println("Tirada: " + tirada);
            }


            //Mover jugador
            jugadores[0] = jugadores[0] +tirada;

            //Comprobar donde está
            //MUERTE
            if (jugadores[0]+1 == muerte){
                System.out.println("Has muerto");
                jugadores[0] = -10;
            }
            //DADOS
            if (jugadores[0]+1 == dados[0]){
                jugadores[0] = dados[1]-1;
                //Tira otra vez
            }
            if (jugadores[0]+1 == dados[1]){
                jugadores[0] = dados[0]-1;
                //Tira otra vez
            }
            //PUENTES
            if (jugadores[0]+1 == puente[0]){
                jugadores[0] = puente[1]-1;
                //Tira otra vez
            }
            if (jugadores[0]+1 == puente[1]){
                jugadores[0] = puente[0]-1;
                //Tira otra vez
            }
            //OCA
            for (int i = 0; i<ocas.length; i++){
                if (jugadores[0]+1 == ocas[i]){
                    jugadores[0] = ocas[i+1]-1;
                    break;
                    //Tira otra vez
                }
            }



        }





    }
}
