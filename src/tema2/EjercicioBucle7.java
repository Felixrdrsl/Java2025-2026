package tema2;

import com.sun.source.doctree.SummaryTree;

public class EjercicioBucle7 {
    public static void main(String[] args) {


        //Hay dos romanos Cubitus y Humerus en la frontera germana aburridos
        //Juegan a los dados y se determina quien gana.
        //Cada jugador tiene 2 dados de seis caras
        //Gana el jugador que sume más sus dos dados
        //Juegan 10 rondas
        //Quién gana más rondas?

        //V.E.: tiradaC1, tiradaC2, tiradaH1, tiradaH2
        //      sumaC, sumaH
        //      contRondasGC, contRondasGH



        int tiradaC1, tiradaC2, tiradaH1, tiradaH2;
        int contadorC= 0;
        int contadorH = 0;


        for (int i = 1; i<=10; i++){
            tiradaC1 = (int) (Math.random() * 6 ) + 1;
            tiradaC2 = (int) (Math.random() * 6 ) + 1;
            int sumaC = tiradaC1 + tiradaC2;

            tiradaH1 = (int) (Math.random() * 6 ) + 1;
            tiradaH2 = (int) (Math.random() * 6 ) + 1;
            int sumaH = tiradaH1 + tiradaH2;

            if (sumaC>sumaH){
                contadorC++;
                System.out.println("Esta ronda la gan Cubitus");
            }else {
                contadorH++;
                System.out.println("Esta ronda la gana Humerus");
            }

        }
        if (contadorC>contadorH){
            System.out.println("Gana Cubitus");
        }else if (contadorC==contadorH){
            System.out.println("Empate");
        } else {
            System.out.println("Gana Humerus");
        }

    }
}
