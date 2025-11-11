package tema2SubidaNota;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {


        int contadorC = 0, contadorH = 0;
        int tiradaC, tiradaH;
        int rondas = 0;
        int sumaC = 0, sumaH = 0, puntosAcumulados = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas rondas se van a jugar: ");
        rondas = sc.nextInt();

        for (int i = 1; i<=rondas; i++){
            tiradaC = (int) (Math.random() * 6 ) + 1;
            tiradaH = (int) (Math.random() * 6 ) + 1;

            if (tiradaC>tiradaH){
                sumaC += tiradaC + tiradaH + puntosAcumulados;
                contadorC++;
                System.out.println("Esta ronda la gan Cubitus");
                System.out.println( "Su suma de puntos es: " +  sumaC);
                sumaC = 0;
                puntosAcumulados = 0;
            }else if(tiradaH>tiradaC) {
                sumaH += tiradaH + tiradaC +puntosAcumulados;
                contadorH++;
                System.out.println("Esta ronda la gana Humerus");
                System.out.println("Su suma de puntos es: " + sumaH);
                sumaH = 0;
                puntosAcumulados = 0;
            } else if ((tiradaC==tiradaH) && (i==rondas)){
                System.out.println("Por ser ultima ronda no se suman puntos");
                break;

            }
            if (tiradaC==tiradaH) {
                puntosAcumulados += tiradaC + tiradaH;
                System.out.println("Se acumulan a la siguiente ronda");
            }

        }
        if (contadorC>contadorH){
            System.out.println("Gana Cubitus " + contadorC + " rondas");
        }else if (contadorC==contadorH){
            System.out.println("Empate");
        } else {
            System.out.println("Gana Humerus " + contadorH + " rondas");
        }


    }
}
