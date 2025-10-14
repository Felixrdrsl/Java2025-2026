package tema2;

import java.util.Scanner;

public class EjercicioClaseFechas {
    public static void main(String[] args) {

        //Me dan como datos de entrada dia, mes y año
        //Tengo que determinar si es una fecha correcta
        //No vamos a tener en cuenta los años bisiestos

        //Diseño
        //Año: 1900-2100 --> Fuera de ahi, año fueraq de rango
        //Meses: 1-12 o de Enero a Diciembre
        //Dia: 1-28 si es febrero, 1-30 si es abril, junio, septiembre, noviembre
        // 1-31 Enero, Marzo, Mayo, Julio, Agosto, Ocutubre, Diciembre


        int day, month, year;
        boolean correcto = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el dia (1-31) ");
        day = sc.nextInt();
        System.out.println("Dime el mes (1-12) ");
        month = sc.nextInt();
        System.out.println("Dime el año (1900-2100) ");
        year = sc.nextInt();

        if (year < 1900 || year > 2100){
            System.out.println("Año fuera de rango");
        } else if (month < 1 || month > 12) {
            System.out.println("Mes fuera de rango");
        } else {
            switch (month) {
                case 2:
                    if (day < 1 || day > 28) {
                        correcto = false;
                    }
                    break;
                case 4, 6, 9, 11:
                    if (day < 1 || day > 30) {
                        correcto = false;
                    }
                    break;
                case 1, 3, 5, 7, 8, 10, 12:
                    if (day < 1 || day > 31) {
                        correcto = false;
                    }
                    break;
                default:
            }

        if (!correcto){
            System.out.println("Dia del mes incorrecto");
        } else {
            System.out.println("Fecha correcta");
            correcto = true;
        }
        }



    }
}
