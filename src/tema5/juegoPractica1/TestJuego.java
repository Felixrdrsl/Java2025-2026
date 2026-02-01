package tema5.juegoPractica1;

import java.util.ArrayList;

public class TestJuego {
    static void main() {


        Jugador jugador = new Jugador("Jesus",TipoPersonaje.CABALLERO);

        Arma espada = new Arma("Espada",30,false,TipoArma.ESPADA);
        Arma hacha = new Arma("Hacha",60,true,TipoArma.HACHA);

        jugador.equiparArma(espada);

        ArrayList<Monstruo> monstruos = new ArrayList<>();

        Monstruo m1 = new Monstruo("Globin debil",ClaseMonstruo.GLOBIN,15);
        Monstruo m2 = new Monstruo("Troll",ClaseMonstruo.TROLL,30);
        Monstruo m3 = new Monstruo("Skrall",ClaseMonstruo.SKRALL,50);
        Monstruo m4 = new Monstruo("Demonio",ClaseMonstruo.DEMONIO,75);

        monstruos.add(m1);
        monstruos.add(m2);
        monstruos.add(m3);
        monstruos.add(m4);
        for (Monstruo m: monstruos){
            int ronda = 1;
            IO.println("Combate contra " + m.getNombre());
            while (m.getSalud() > 0 && jugador.getSalud() > 0){
                jugador.golpearMonstruo(m);
                if (m.getSalud() > 0){
                    m.golpear(jugador);
                }
                IO.println("Ronda " + ronda);
                IO.println("Vida del jugador " + jugador.getSalud());
                IO.println("Vida del monstruo " + m.getSalud());

                ronda++;
            }

            IO.println("Resultado");
            IO.println(jugador);
            IO.println(m);
            if (jugador.getSalud() > 0 && m.getSalud() <= 0){
                jugador.subirNivel();
                jugador.tomarPocion(80);
            }else {
                IO.println("Te ha derrotado el monstruo, has perdido");
                return;
            }
            IO.println("-------------------------------------------------------------------------------------------");
        }

    }
}



