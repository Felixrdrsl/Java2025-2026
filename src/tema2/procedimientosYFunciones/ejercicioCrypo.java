package tema2.procedimientosYFunciones;

import java.util.Scanner;

public class ejercicioCrypo {


    public static void pintarMenu() {
            System.out.println("1. Bitcoin");
            System.out.println("2. Ethereum");
            System.out.println("3. Dogecoin");
            System.out.println("4. XRP");
            System.out.println("5. Salir");
    }
    public static double bitcoin(double bit1) {
        return 115375 * bit1 * 0.86;
    }
    public static double Ethereum(double Ether) {
        return 4206 * Ether * 0.86;
    }
    public static double Dogecoin(double doger) {
        return 0.2044 * doger * 0.86;
    }



    public static void main(String[] args) {
        //Hacer una aplicación que te permita saber cuántos euros son:
        //x monedas de una criptomoneda sabiendo su cambio:
        //1. Bitcoin -> 115375 dólares
        //2. Ethereum -> 4206 dólares
        //3. Dogecoin -> 0.2044 dólares
        //4. XRP -> 2.68 dólares
        //
        // Cambio 1 dólar -> 0.86 euros
        // El programa será un menú que te permita elegir el tipo de criptomoneda
        // luego te preguntará la cantidad de monedas (double) y te mostrará
        // el resultado en euros
        // Se valora el uso de funciones y control de excepciones

        Scanner sc = new Scanner(System.in);
        int opcion=-1;
        double numeroBt, numeroET, numeroDo, numeroXRP;

        do {
            try {
                pintarMenu();
                System.out.println("Dime una opción (1-5)");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Dime cuantos bitcoin quieres: ");
                        numeroBt = sc.nextDouble();
                        System.out.println(numeroBt + " Su precio es: "
                                + bitcoin(numeroBt) );
                        break;
                    case 2:
                        System.out.println("Dime cuantos Ethereum quieres: ");
                        numeroET = sc.nextDouble();
                        System.out.println(numeroET + " Su precio es: "
                                + Ethereum(numeroET) );
                        break;
                    case 3:
                        System.out.println("Dime cuantos Ethereum quieres: ");
                        numeroDo = sc.nextDouble();
                        System.out.println(numeroDo + " Su precio es: "
                                + Dogecoin(numeroDo) );
                        break;

                    case 5:
                        System.out.println("Gracias por usar nuestro programa");
                        break;

                    default:
                        System.out.println("Opción incorrecta");

                }
            } catch (Exception ex) {
                System.out.println(ex.toString());
                opcion = -1;
                sc = new Scanner(System.in);
            }

        } while(opcion != 7);

    }
}
