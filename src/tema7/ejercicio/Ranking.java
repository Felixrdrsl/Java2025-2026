package tema7.ejercicio;

import java.util.HashSet;
import java.util.Set;

public class Ranking {

    private final Set<Jugador> jugadores = new HashSet<>();
    private final Set<Jugador> ranking = new HashSet<>();


    public Set<Jugador> getJugadores() {
        return jugadores;
    }
    public Set<Jugador> getRanking() {
        return ranking;
    }

    public void pintarJugadores(){
        IO.println("Jugadores :");
        for(Jugador jr : jugadores) {
            IO.println(jr);
        }
    }
    public void pintarRanking(){
        IO.println("Ranking :");
        for(Jugador jr : ranking) {
            IO.println(jr);
        }
    }

    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }
    public void eliminarJugador(Jugador jugador){
        jugadores.remove(jugador);
    }
    public void top(int n){
        IO.println("Top : " + n );
        int i = 0;
        for(Jugador jr : ranking) {
            i++;
            if (i >= n)
                break;
            IO.println(jr);
        }
    }

    public void regritrarJugador(Jugador jugador){
        if (jugadores.contains(jugador))
            IO.println("Id del jugador repetido");
    }


}
