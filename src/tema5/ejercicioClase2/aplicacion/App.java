package tema5.ejercicioClase2.aplicacion;

import tema5.ejercicioClase2.modelos.AudioLibro;
import tema5.ejercicioClase2.modelos.ContenidoDigital;
import tema5.ejercicioClase2.modelos.Ebook;
import tema5.ejercicioClase2.modelos.Libro;
import tema5.ejercicioClase2.servicio.Biblioteca;

import java.awt.datatransfer.ClipboardOwner;

public class App {
    static void main() {
        Biblioteca biblioteca = new Biblioteca("Bliblioteca del Jaroso");

        AudioLibro cd1 = new AudioLibro("El nombre del viento", "Patrick Romero ", 2010,8
                ,180,"Manolo lama");
        Ebook cd2 = new Ebook("La peninsula de las casas vacias", "David uclé",2025
                ,100,700,"epub");
        Libro lb1 = new Libro("Java for dummies", "Yo", 2026);


        //Añadir contenido digital a la biblioteca
        biblioteca.addContenido(cd1);
        biblioteca.addContenido(cd2);
        biblioteca.addContenido(lb1);

        for (Libro cd: biblioteca.getContenidos()){
            IO.println(cd);
            IO.println(cd.getTipo());
            //cd.reproducir();
        }

        IO.println(cd1);
        IO.println(cd1.getTipo());
        cd1.reproducir();

        IO.println(cd2);
        IO.println(cd2.getTipo());
        cd2.reproducir();

    }
}
