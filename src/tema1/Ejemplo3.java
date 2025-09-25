package tema1;

import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {
        //Leer el radio de un círculo y calcular e imprimir su area y longitud
        //Analisis
        //Datos de entrada: radio de la cincuferencia
        //Datos de salida: area y longitud de la cincunferencia
        //Diseño
        // area = PI * radio * radio
        //longitud = PI * 2 radio

        //1. Declaracion de variables
        double radio;
        double area, longitud;

        //2. leer los datos de entrada
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio: ");
        radio = sc.nextDouble(); //leer de teclado un decimal
        System.out.println("El radio es " + radio);

        //3.Hcer calculos
        area = 3.1415 * radio * radio; //PI * r2
        longitud = 2 * 3.1415 * radio; //2 * PI * r

        //4. mostrar resultados
        System.out.println("El area es: " + area);
        System.out.println("La longitud es: " + longitud);



    }
}
