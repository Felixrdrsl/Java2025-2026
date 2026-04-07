package tema6.ExamenTema6.app;

import tema6.ExamenTema6.Entidades.*;
import tema6.ExamenTema6.servicios.Clinica;
import tema6.ExamenTema6.servicios.PropietarioNoEncontradoException;

import java.time.LocalDate;
import java.util.Scanner;

public class app {




    static void main(){

        Clinica clinica = new Clinica("Clinica Veterinaria Dominguez");


        Propietario pr1 = new Propietario("Paco","Martinez","12345678Q",
                "PacoMA@gmail.com","123123123","Almeria");
        Propietario pr2 = new Propietario("Maria","Gomez","23445678Q",
                "MariaGOZ@gmail.com","422133213","Pulpi");
        Propietario pr3 = new Propietario("Fernando","Torres","83925330A",
                "FernandoTrr@gmail.com","999000999","Vera");
        Propietario pr4 = new Propietario("Eustaquio","Rodriguez","34532632F",
                "RodriguezEUS@gmail.com","945837465","Carboneras");

        clinica.addPropietario(pr1);
        clinica.addPropietario(pr2);
        clinica.addPropietario(pr3);
        clinica.addPropietario(pr4);

        Animal a1 = new AnimalDomestico("Martin", TipoAnimal.AVE,"Loro",
                LocalDate.of(2024,5,12),125.2,pr1,false,true);
        Animal a2 = new AnimalDomestico("Perico", TipoAnimal.PERRO,"Caniche",
                LocalDate.of(2020,2,17),200.0,pr4,false,true);
        Animal a3 = new AnimalDomestico("pinocho", TipoAnimal.GATO,"Siames",
                LocalDate.of(2018,12,23),400.0,pr2,true,true);
        Animal a4 = new AnimalExotico("Picapica", TipoAnimal.REPTIL,"Piton",
                LocalDate.of(2019,1,2),1500.0,pr1,"Tailandia",true);

        pr1.addAnimal(a1);
        pr1.addAnimal(a4);
        pr4.addAnimal(a2);
        pr2.addAnimal(a2);

        Animal a5 = new AnimalDomestico("paquito", TipoAnimal.PERRO,"Podenco",
                LocalDate.of(2020,4,28),1200.0,pr4,false,true);
        Animal a6 = new AnimalExotico("Pochita", TipoAnimal.REPTIL,"camaleon",
                LocalDate.of(2021,8,10),200.0,pr3,"Tailandia",true);
        Animal a7 = new AnimalExotico("Jesus", TipoAnimal.EXOTICO,"Mono",
                LocalDate.of(2021,4,20),500.0,pr3,"America del sur",true);
        Animal a8 = new AnimalExotico("Marcelo", TipoAnimal.EXOTICO,"Burro",
                LocalDate.of(2016,8,23),250000.0,pr2,"España",true);

        pr4.addAnimal(a5);
        pr3.addAnimal(a6);
        pr3.addAnimal(a7);
        pr2.addAnimal(a8);



        clinica.addAnimal(a1);
        clinica.addAnimal(a2);
        clinica.addAnimal(a3);
        clinica.addAnimal(a4);
        clinica.addAnimal(a5);
        clinica.addAnimal(a6);
        clinica.addAnimal(a7);
        clinica.addAnimal(a8);



        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        try {


            do {
                IO.println("Elige una opcion");
                IO.println("1. Listar animales registrados");
                IO.println("2. Buscar propietario por DNI");
                IO.println("3. Registrar consulta");
                IO.println("4. Ver consultas de un animal");
                IO.println("5. Ver consultas de hoy");
                IO.println("6. Calcular ingresos totales");
                IO.println("7. Salir");

                opcion = sc.nextInt();



                switch (opcion){

                    case 1 -> clinica.listarAnimales();

                    case 2 -> {
                        try {
                            clinica.buscarPropietarioPorDni("999000999");
                        } catch (PropietarioNoEncontradoException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    case 3 ->{
                        Long id1L;
                        int id2,id3,id4;
                        String dato1,dato2,dato3,dato4;

                        IO.println("Dime su id");
                        id1L = sc.nextLong();
                        IO.println("Dime su veterinario");
                        dato1 = sc.nextLine();
                        IO.println("Dime su Año de nacimiento");
                        id2 = sc.nextInt();
                        IO.println("Dime su mes de nacimiento");
                        id3 = sc.nextInt();
                        IO.println("Dime su dia de nacimiento");
                        id4 = sc.nextInt();
                        IO.println("Dime su Tipo de consulta ");
                        dato2 = sc.nextLine().toUpperCase();
                        IO.println("Dime su diagnostico");
                        dato3 = sc.nextLine();
                        IO.println("Dime su Tratamiento");
                        dato4 = sc.nextLine();

                       // clinica.registrarConsulta(id1L, dato1,LocalDate.of(id2,id3,id4)
                            //,TipoConsulta.URGENCIA,dato3,dato4);
                    }


                    case 4 -> clinica.buscarConsultasPorAnimal(1L);

                    case 5 -> clinica.listarConsultasDeHoy();

                    case 6 -> clinica.calcularIngresosTotales();

                    case 7 ->
                        IO.println("Saliendo...");

                    default -> System.out.println("Opción no válida.");


                }






            } while (opcion != 7);
        }catch (Exception ex){
            System.out.println(ex.toString());
            opcion = -1;
            sc = new Scanner(System.in);
        }


    }



}
