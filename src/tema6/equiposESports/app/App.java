package tema6.equiposESports.app;

import tema5.juegoPractica1.Monstruo;
import tema6.equiposESports.entidades.Apoyo;
import tema6.equiposESports.entidades.Asesino;
import tema6.equiposESports.entidades.Jugador;
import tema6.equiposESports.entidades.Tanque;
import tema6.equiposESports.servicios.Equipo;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void pintarMenu() {

        System.out.println("1. Imprimir datos del equipo");
        System.out.println("2. Añadir un jugador (se piden sus datos");
        System.out.println("3. Añadir puntos a un jugador tras una partida (id, puntos)");
        System.out.println("4. Calcular el total de puntos del equipo");
        System.out.println("5. Listar todos los jugadores");
        System.out.println("6. Buscar un jugador (por identificador)");
        System.out.println("7. salir");
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        ArrayList<Equipo> equipo1 = new ArrayList<>();
        Equipo equipo = new Equipo("Paquetes", "Portugal");

        Jugador jd1 = new Tanque(1, "Juan", 20,200.0, 125.3);
        Jugador jd2 = new Apoyo(2, "Pepe", 10,3, 35F);
        Jugador jd3 = new Asesino(3, "Dora", 15, 64F, 12);

        do {
            try {
                pintarMenu();
                IO.println("Dime una opcion");
                opcion = sc.nextInt();

                switch (opcion){
                    case 1 -> equipo.imprimirDatosEquipo();
                    case 2 -> {
                        int numero = -1;
                        boolean n1 = true;
                        jd1.imprimirRol();
                        jd2.imprimirRol();
                        jd3.imprimirRol();
                        IO.println("Que jugador quieres añadir");
                        numero = sc.nextInt();
                        try {
                            do {

                                switch (numero){
                                    case 1 -> {
                                        equipo.nuevoJugador(jd1);
                                        IO.println("Has añadido a un Tanque");
                                        n1 = false;
                                    }
                                    case 2 ->{
                                        equipo.nuevoJugador(jd2);
                                        IO.println("Has añadido a un Apoyo");
                                        n1 = false;
                                    }
                                    case 3 -> {
                                        equipo.nuevoJugador(jd3);
                                        IO.println("Has añadido a un Asesino");
                                        n1 = false;

                                    }
                                }
                            }while (n1 == true);
                        }catch (Exception ex){
                            System.out.println(ex.toString());
                            opcion = -1;
                            sc = new Scanner(System.in);
                        }

                    }
                    case 3 -> {

                    }
                    case 4 -> {
                        //equipo.
                        //equipo.getTotalPuntos();
                    }
                }

            }catch (Exception ex){
                System.out.println(ex.toString());
                opcion = -1;
                sc = new Scanner(System.in);
            }

        }while (opcion != 7);



    }
}
