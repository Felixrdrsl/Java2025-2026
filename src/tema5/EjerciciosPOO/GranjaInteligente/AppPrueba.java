package tema5.EjerciciosPOO.GranjaInteligente;

import java.util.Scanner;

public class AppPrueba {
    static void main() {

        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        Granja granja1 = new Granja("Villa Paco", "Albacete");

        try {
            do {
                IO.println("1. Imprimir datos");
                IO.println("2. Añadir tractor");
                IO.println("3. Añadir horas a máquina");
                IO.println("4. Listar máquinas");
                IO.println("5. Salir");

                opcion = sc.nextInt();

                switch (opcion){

                    case 1 -> granja1.imprimirDatosGranja();

                    case 2 -> {
                        IO.println("ID: ");
                        Integer id = sc.nextInt();
                        String modelo = sc.nextLine();
                        granja1.addMaquina(new TractorAutonomo(id, modelo, Operable.ENCENDIDA,
                                100.0F,500F,120.4F));
                    }

                    case 3 -> {
                        IO.println("Introduce el ID de la máquina:");
                        Integer idBuscar = sc.nextInt();

                        Maquina m = granja1.buscarMaquinaPorId(idBuscar);

                        if (m != null) {
                            IO.println("Introduce las horas a trabajar:");
                            Float horas = sc.nextFloat();
                            m.encender();
                            m.trabajar(horas);
                            m.apagar();

                            IO.println("Horas añadidas correctamente.");
                        } else {
                            IO.println("Máquina no encontrada.");
                        }
                    }
                    case 4 -> granja1.listarMaquinas();
                    case 5 -> IO.println("Saliendo.....");
                    default -> IO.println("Opcion no valida");

                }


            } while (opcion != 5);


        }catch (Exception ex){
            System.out.println(ex.toString());
            opcion = -1;
            sc = new Scanner(System.in);
        }




    }



}
