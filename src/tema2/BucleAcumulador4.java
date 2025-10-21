package tema2;

public class BucleAcumulador4 {
    public static void main(String[] args) {

        //Humerus y Cubitus se aburren el finde y van a jugar a los dados
        //Humerus tiras tres dados y su puntuacion es la suma de los pares
        //Cubitus tira tres dados y su puntuacion es la suma de los impares
        //Si juegan 10 rondas, dime el ganador

        int tiradaC1, tiradaC2, tiradaC3, tiradaH1, tiradaH2, tiradaH3;
        int contadorC= 0;
        int contadorH = 0;
        int sumaDH = 0, sumaDC = 0;



        for (int i = 1; i<=10; i++) {
            tiradaC1 = (int) (Math.random() * 12) + 1;
            tiradaC2 = (int) (Math.random() * 12) + 1;
            tiradaC3 = (int) (Math.random() * 12) + 1;
            if (tiradaC1 % 2 == 1 ){
                sumaDC += tiradaC1 ;
            }
            if (tiradaC2 % 2 == 1 ){
                sumaDC += tiradaC2 ;
            }
            if (tiradaC3 % 2 == 1 ){
                sumaDC += tiradaC3 ;
            }

            tiradaH1 = (int) (Math.random() * 12) + 1;
            tiradaH2 = (int) (Math.random() * 12) + 1;
            tiradaH3 = (int) (Math.random() * 12) + 1;
            if (tiradaH1 % 2 == 0 ){
                sumaDH += tiradaH1;
            }
            if (tiradaH2 % 2 == 0 ){
                sumaDH += tiradaH2;
            }
            if (tiradaH3 % 2 == 0 ){
                sumaDH += tiradaH3;
            }


            if (sumaDC>sumaDH){
                contadorC++;
                System.out.println("Esta ronda la gana Cubitus");
            }else {
                contadorH++;
                System.out.println("Esta ronda la gana Humerus");
            }

            sumaDH = 0;
            sumaDC = 0;
        }
;        if (contadorC>contadorH){
            System.out.println("Gana Cubitus");
        }else if (contadorC==contadorH){
            System.out.println("Empate");
        } else {
            System.out.println("Gana Humerus");
        }
    }

}
