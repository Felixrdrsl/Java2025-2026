package tema1;

import java.util.Scanner;

public class EjercicioFinalTema2 {
    public static void main(String[] args) {

        //Un alumno del modulo de programacion quiere saber su nota final. Esta consta de:
        //55% de tres notas parciales (media aritmetica de las tres)
        //30% calificacion del examen final
        //15% calificacion trabajo final
        //Pide los valores de entrada y muestra la nota final

        double Nota1, Nota2, Nota3, NotaExamenFinal, NotaTrabajo;
        double MediaNotaFinal;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la primera nota de examen:");
        Nota1 = sc.nextDouble();
        System.out.println("Dime la segunda nota de examen:");
        Nota2 = sc.nextDouble();
        System.out.println("Dime la tercera nota de examen:");
        Nota3 = sc.nextDouble();
        System.out.println("Dime la nota del examen final:");
        NotaExamenFinal = sc.nextDouble();
        System.out.println("Dime la nota del trabajo:");
        NotaTrabajo = sc.nextDouble();

        MediaNotaFinal = ((Nota1 + Nota2 + Nota3) / 3) *0.55 + (NotaExamenFinal * 0.3) + (NotaTrabajo * 0.15);
        System.out.println("Tu nota final es: " + MediaNotaFinal);


    }
}
