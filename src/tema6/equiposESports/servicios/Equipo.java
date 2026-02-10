package tema6.equiposESports.servicios;

import tema6.equiposESports.entidades.Jugador;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String pais;
    private Integer totalPuntos;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.jugadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getTotalPuntos() {
        return totalPuntos;
    }

    public void setTotalPuntos(Integer totalPuntos) {
        this.totalPuntos = totalPuntos;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    public void imprimirDatosEquipo(){
        IO.println("Equipo{" + "nombre='" + getNombre() + ", pais='" + getPais() + ", totalPuntos="
                + getTotalPuntos()  + '}');
    }

    public void nuevoJugador(Jugador jugador){
        jugadores.add(jugador);
    }
    public Integer calcularPuntos(){
        Integer total = 0;
        for (Jugador jugador: jugadores){
            total += jugador.getPuntos();
        }
        return total;
    }
    public void listaJugadores() {
        IO.println("Lista de jugadores" + getJugadores());
        for (Jugador jugador : getJugadores()) {
            IO.println("nombre: " + jugador + " puntos del jugador " + jugador.getPuntos());
        }
    }

    public Jugador buscarJugadorPorId(Integer id){
        for(Jugador j : this.jugadores) {
            if (j.getId().equals(id)){
                return j;
            }
        }
        IO.println("Jugador no encontrado");
        return null;
    }

}
