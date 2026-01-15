package tema5.ejercicioSpotify;

import java.util.ArrayList;

public class ListaSpotify {

    private String nombre;
    private ArrayList<cancion> canciones;

    //Constructor parametrizado
    //Constructor copia
    //Getters y setters
    //ToString
    //Añadir canción
    //Eliminar canción


    public ListaSpotify(String nombre) {
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
    }

    /**
     * copia
     * @param nombre
     * cuando queramos copiar un arraylist hay que crear uno nuevo
     * this.canciones = new arraylist<>(nombre.canciones);
     */
    public ListaSpotify(ListaSpotify nombre) {
        this.nombre = nombre.nombre;
        //this.canciones = nombre.canciones; -> esta mal porque comparten arrraylist
        this.canciones = new ArrayList<>(nombre.canciones);// crea una nueva lista con los valores de la otra
    }


    public String getNombre() {
        return nombre;
    }


    public ArrayList<cancion> getCanciones() {
        return canciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ListaSpotify{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", canciones=").append(canciones);
        sb.append('}');
        return sb.toString();
    }

    public void addCancion(cancion c) {
        this.canciones.add(c);
    }
    public void removeCancion(cancion c) {
        this.canciones.remove(c);
    }





}
