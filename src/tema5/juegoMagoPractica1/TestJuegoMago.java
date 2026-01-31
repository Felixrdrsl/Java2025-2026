package tema5.juegoMagoPractica1;

import java.util.SortedMap;

public class TestJuegoMago {

    static void main() {

        //Creamos al mago
        Mago mago1 = new Mago("juan",100);

        //creamos hechizos
        Hechizo hechizo1 = new Hechizo("Bola de fuego", 20, 7);
        Hechizo hechizo2 = new Hechizo("Escudo Magico", 15, 5);
        Hechizo hechizo3 = new Hechizo("Rayo electrico", 25, 9);

        mago1.aprenderHechizo(hechizo1);

        Prueba romperMuro = new Prueba("Muro de dificultad 5",5, 10);
        Prueba derrotarOrco = new Prueba("Derrotar a un orco",8, 15);
        Prueba derrotarElfo = new Prueba("derrotar al elfo de nivel 15",10, 20);

        mago1.lanzarHechizo("Bola de fuego",romperMuro);

        mago1.aprenderHechizo(hechizo2);
        System.out.println("Energia del mago " + mago1.getEnergia());
        System.out.println("--------------------------------------------");

        mago1.lanzarHechizo("Escudo magico",derrotarOrco);
        System.out.println("Energia del mago " + mago1.getEnergia());
        System.out.println("----------------------------------------------------");

        mago1.recargarEnergia(10);

        System.out.println("Energia del mago " + mago1.getEnergia());
        mago1.lanzarHechizo("Escudo magico",derrotarOrco);
        System.out.println("Energia del mago " + mago1.getEnergia());

        System.out.println("------------------------------------------------");

        mago1.recargarEnergia(20);
        System.out.println("Energia del mago " + mago1.getEnergia());
        mago1.aprenderHechizo(hechizo3);
        mago1.lanzarHechizo("Rayo electrico",derrotarOrco);

        System.out.println("----------------------------------------------");

        System.out.println("Energia actual: " + mago1.getEnergia());
        mago1.aprenderHechizo(hechizo2);
        mago1.lanzarHechizo("Escudo magico",derrotarElfo);
        System.out.println("Energia actual: " + mago1.getEnergia());

        System.out.println("-----------------+1-----------------------------");

        mago1.lanzarHechizo("Escudo magico",derrotarElfo);
        System.out.println("Energia actual: " + mago1.getEnergia());


        mago1.lanzarHechizo("Escudo magico",derrotarElfo);
        System.out.println("Energia actual: " + mago1.getEnergia());














    }


}
