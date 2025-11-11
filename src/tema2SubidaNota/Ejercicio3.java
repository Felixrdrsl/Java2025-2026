package tema2SubidaNota;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        int contadorC = 0, contadorH = 0;
        int tiradaC, tiradaH;
        int rondas = 0;
        int sumaC = 0, sumaH = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos turnos va a tener tu partida");
        rondas = sc.nextInt();

        for (int i = 1; i<=rondas; i++) {
            tiradaC = (int) (Math.random() * 6) + 1;
            tiradaH = (int) (Math.random() * 6) + 1;

            if ((tiradaC==tiradaH) || ((tiradaC % 2 == 1) && (tiradaH % 2 == 1)) ||
                    (tiradaC % 2 == 0) && (tiradaH % 2 == 0)){
                sumaC += tiradaC + tiradaH;
                contadorC++;
                System.out.println("Esta ronda la gana Cubitus");
                System.out.println("Los puntos obtenidos para cubitus son: " + sumaC);
                sumaC = 0;
            } else {
                sumaH += tiradaH + tiradaC;
                contadorH++;
                System.out.println("Esta ronda la gana Humerus");
                System.out.println("Los puntos obtenidos para Humerus son: " + sumaH);
                sumaH = 0;
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
