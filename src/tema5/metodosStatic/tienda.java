package tema5.metodosStatic;

import java.util.ArrayList;

public class tienda {

    private String nombre;
    private ArrayList<VideoJuego> videojuegos;

        public tienda(String nombre) {
        this.nombre = nombre;
        this.videojuegos = new ArrayList<>();
    }

    public void agregarVideojuego(VideoJuego v) {
        videojuegos.add(v);
    }

    public void quitarVideojuego(VideoJuego v) {
        videojuegos.remove(v);
    }

    public Integer getNumeroVideojuegos() {
        return videojuegos.size();
    } //size() -> tamaño del ArrayList

    public void mostrarVideojuegos() {
        System.out.println(nombre);
        for(VideoJuego v: videojuegos) {
            System.out.println(v);
        }
    }

    public boolean alquilarJuego(String titulo, String plataforma) {
        //Buscar el juego en la tienda
        for(VideoJuego v: this.videojuegos) {
            if (v.getTitulo().equals(titulo) && v.getPlataforma().equals(plataforma)) {
                return v.alquilar();
            }
        }

        return false;
    }

    public boolean devolverJuego(String titulo, String plataforma) {

        return false;
    }

    public boolean devolverJuego(String codigo) {

        return false;
    }

    public Double calcularGananciasTotales() {

        return 0.0;
    }




}
