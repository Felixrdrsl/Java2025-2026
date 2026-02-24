package tema5.juegoPractica1;

import tema5.EjerciciosPOO.BladeOfDarnknees.ClaseMonstruo;
import tema5.EjerciciosPOO.BladeOfDarnknees.Jugador;
import tema5.EjerciciosPOO.BladeOfDarnknees.Monstruo;
import tema5.EjerciciosPOO.BladeOfDarnknees.MonstruoFinalNivel;

import java.util.ArrayList;

public class Partida {

    private Jugador jugador;
    private ArrayList<Monstruo> monstruos;

    public Partida(Jugador jugador, ArrayList<Monstruo> monstruos) {
        this.jugador = jugador;
        this.monstruos = new ArrayList<>();
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public ArrayList<Monstruo> getMonstruos() {
        return monstruos;
    }

    public void setMonstruos(ArrayList<Monstruo> monstruos) {
        this.monstruos = monstruos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Partida{");
        sb.append("jugador=").append(jugador);
        sb.append(", monstruos=").append(monstruos);
        sb.append('}');
        return sb.toString();
    }
    public void iniciarPartida(){
        monstruos.add(new Monstruo("Monstruo 1", ClaseMonstruo.DEMONIO ));
        monstruos.add(new Monstruo("Monstruo 2", ClaseMonstruo.GLOBIN ));
        monstruos.add(new Monstruo("Monstruo 3", ClaseMonstruo.FANTASMA ));
        monstruos.add(new Monstruo("Monstruo 4", ClaseMonstruo.TROLL ));
        monstruos.add(new Monstruo("Monstruo 5", ClaseMonstruo.GLOBIN ));
        monstruos.add(new Monstruo("Monstruo 6", ClaseMonstruo.DEMONIO ));
        monstruos.add(new Monstruo("Monstruo 7", ClaseMonstruo.DEMONIO ));
        monstruos.add(new Monstruo("Monstruo 8", ClaseMonstruo.SKRALL ));

        monstruos.add(new MonstruoFinalNivel("Jefe 1", ClaseMonstruo.FANTASMA));
        monstruos.add(new MonstruoFinalNivel("Jefe 2", ClaseMonstruo.SKRALL));

    }

    public boolean turnoJugador(){
        for (Monstruo enemigo : monstruos) {

            if (enemigo.estaVivo()) {

                Double daño = enemigo.golpear();
                jugador.reducirVida(daño);

                break; // solo ataca el primero vivo
            }
        }
        if (!jugador.estaVivo()) {
            return true; // pierde el jugador
        }
        return false;
    }
    public boolean jugadorVivo(){
        return jugador.estaVivo();
    }
    public Integer enemigosRestantes(){
        return monstruos.size();
    }
    public Integer enemigosEliminador(){
        return jugador.enemigosEliminados();
    }

}
