package tema6.Practica3.Main;

import tema6.Practica3.Clases.*;
import tema6.Practica3.Enums.TipoCoche;
import tema6.Practica3.Enums.TipoCombustible;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);
        Agencia agencia = new Agencia();
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (int i = 1; i <= 5; i++) {
            boolean aire = i % 2 == 0;
            TipoCoche tipo = (i % 2 == 0) ? TipoCoche.SUV : TipoCoche.SEDAN;
            CocheEstandar ce = new CocheEstandar("MarcaE" + i, "ModeloE" + i, "MAT" + i,
                    2015 + i % 5, TipoCombustible.GASOLINA, tipo, 50.0 + i * 5, aire);
            agencia.    addCoche(ce);
        }

        for (int i = 1; i <= 5; i++) {
            boolean gps = i % 2 == 0;
            boolean seguro = i % 3 == 0;
            TipoCoche tipo = (i % 2 == 0) ? TipoCoche.DEPORTIVO : TipoCoche.FURGONETA;
            CochePremium cp = new CochePremium("MarcaP" + i, "ModeloP" + i,
                    "MATP" + i, 2018 + i % 3, TipoCombustible.HIBRIDO, tipo, 100.0 + i * 10, gps, seguro);
            agencia.addCoche(cp);
        }


        //Menu
        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- Menú Agencia ---");
            System.out.println("1. Listar Coches disponibles");
            System.out.println("2. Listar Alquileres activos");
            System.out.println("3. Realizar alquiler");
            System.out.println("4. Mostrar ingresos totales");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    agencia.listarCochesDisponibles();
                    break;

                case "2":
                    agencia.listarAlquileresActivos();
                    break;

                case "3":
                    System.out.print("Nombre del cliente: ");
                    String nombreCli = sc.nextLine();
                    System.out.print("Apellidos del cliente: ");
                    String apellidosCli = sc.nextLine();

                    // Cliente simplificado con datos mínimos
                    Cliente clienteSimple = new Cliente(nombreCli, apellidosCli, "0000", "email@ejemplo.com",
                            "Dirección", "123456789", "LIC123", LocalDate.now());

                    System.out.print("Tipo de coche (SEDAN, SUV, FURGONETA, DEPORTIVO): ");
                    TipoCoche tipoCocheSimple;
                    try {
                        tipoCocheSimple = TipoCoche.valueOf(sc.nextLine().toUpperCase());
                    } catch (Exception e) {
                        System.out.println("Tipo inválido, se usará SEDAN");
                        tipoCocheSimple = TipoCoche.SEDAN;
                    }

                    // Fechas simplificadas: hoy y mañana
                    LocalDate inicio = LocalDate.now();
                    LocalDate fin = inicio.plusDays(1);

                    boolean alquiler = agencia.realizarAlquiler(clienteSimple, tipoCocheSimple, inicio, fin);
                    if (alquiler) {
                        System.out.println("Alquiler realizado con éxito.");
                    } else {
                        System.out.println("No hay coches disponibles de ese tipo.");
                    }
                    break;

                case "4":
                    double ingresosTotales = 0;
                    LocalDate hoy = LocalDate.now();
                    for (Alquiler a : agencia.getAlquileres()) {
                        if (a.getFechaFin().isBefore(hoy)) {
                            ingresosTotales += a.getPrecioTotal();
                        }
                    }
                    System.out.println("Ingresos totales por alquileres completados: " + ingresosTotales + "€");
                    break;

                case "5":
                    salir = true;
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }


    }



}
