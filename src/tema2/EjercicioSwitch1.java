package tema2;

import java.util.Scanner;

public class EjercicioSwitch1 {
    public static void main(String[] args) {

        //Si son mas de 100 alm, cada uno paga 65€
        //De 50 a 99, 70€ por persona
        //De 30 a 49, 95€
        //Menos de 30, 4000€ cuesta el bus

        int alumnos;
        double costeTotal;
        long costeAlm;

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos alumnos sois");
        alumnos = sc.nextInt();


        if (alumnos > 100){
            costeAlm = 65;
            costeTotal = costeAlm * alumnos;
        } else if (alumnos > 50 && alumnos < 100 ) {
           costeAlm = 70;
           costeTotal = costeAlm * alumnos;
        } else if (alumnos > 30 && alumnos < 50){
            costeAlm = 95;
            costeTotal = costeAlm * alumnos;
        } else if (alumnos < 30) {
            costeAlm = 4000;
            costeTotal = costeAlm / alumnos;
        }else {
            System.out.println("No hay viaje");
        }
        System.out.println("El coste del alumno es " + costeAlm);
        System.out.println("El coste del viaje es " + costeTotal);

    }
}
