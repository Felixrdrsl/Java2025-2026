package tema7Streams.partidasEfootball;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class AnalizadorPartidas {
    static void main() {
        List<Partida> partidas = new ArrayList<>();

        partidas.add(new Partida(1,"Juan_Lopez","CPU_Madrid","PvP","FC_Barcelona",
                3,1,"12min",
                LocalDateTime.of(2026,04,02,19,30),120 ));
        partidas.add(new Partida(2, "Ana_Gomez", "CPU_London", "PvP", "Real_Madrid",
                2, 2, "30min",
                LocalDateTime.of(2026, 04, 03, 10, 15), 80));

        partidas.add(new Partida(3, "Carlos_Ruiz", "CPU_Paris", "PvP", "PSG",
                0, 1, "12min",
                LocalDateTime.of(2026, 04, 03, 14, 00), 50));

        partidas.add(new Partida(4, "Marta_88", "CPU_Milan", "Liga", "Inter_Milan",
                4, 1, "15min",
                LocalDateTime.of(2026, 04, 04, 21, 45), 200));

        partidas.add(new Partida(5, "Pedro_Pro", "CPU_Munich", "IA", "Bayern_Munich",
                1, 0, "30min",
                LocalDateTime.of(2026, 04, 04, 22, 30), 110));

        partidas.add(new Partida(6, "Elena_Star", "CPU_Lisboa", "PvP", "Benfica",
                2, 3, "12min",
                LocalDateTime.of(2026, 04, 05, 11, 00), 75));

        partidas.add(new Partida(7, "Javi_Killer", "CPU_Manchester", "IA", "Manchester_City",
                5, 0, "12min", LocalDateTime.of(2026, 04, 05, 18, 20), 250));

        partidas.add(new Partida(8, "Sofia_V", "CPU_Turin", "Liga", "Juventus",
                1, 1, "20min",
                LocalDateTime.of(2026, 04, 06, 9, 10), 90));

        partidas.add(new Partida(9, "Iker_G", "CPU_Dortmund", "Evento", "Borussia_Dortmund",
                3, 2, "15min",
                LocalDateTime.of(2026, 04, 06, 20, 00), 150));

        partidas.add(new Partida(10, "Lucia_Z", "CPU_Amsterdam", "Evento", "Ajax",
                0, 0, "20min",
                LocalDateTime.of(2026, 04, 07, 16, 45), 40));


        for (Partida partida: partidas){
            IO.println(partida);
        }
        IO.println("------------------------------------------------------------");
        //Consulta 1: Victorias del jugador
        //Mostrar todas las partidas ganadas (golesLocal > golesVisitante).
        partidas.stream()
                .filter(p -> p.getGolesLocal() > p.getGolesVisitante())
                .forEach(IO::println);


        IO.println("------------------------------------------------------------");
        //Consulta 2: Partidas por modo de juego
        //Contar cuántas partidas hay de cada modo (groupingBy).
        partidas.stream()
                .collect(Collectors.groupingBy(Partida::getModoJuego,Collectors.counting()))
                .forEach((p,n) -> IO.println(p + ": " + n + " partidas jugadas" ));




        IO.println("------------------------------------------------------------");
        //Consulta 3: Goles totales marcados
        //Suma de todos los golesLocal.
        int total = partidas.stream()
                .mapToInt(Partida::getGolesLocal)
                .sum();
        total += partidas.stream()
                .mapToInt(Partida::getGolesVisitante)
                .sum();
        IO.println(total);




        IO.println("------------------------------------------------------------");
        //Consulta 4: Mejor rival derrotado
        //Encontrar la partida ganada con mas estrellas.
        Optional<Partida> mejorPartida = partidas.stream()
                .filter(p -> p.getGolesLocal() > p.getGolesVisitante() )
                .max(Comparator.comparing(Partida::getEstrellasGanadas));
        IO.println(mejorPartida);



        IO.println("------------------------------------------------------------");
        //Consulta 5: Media de estrellas por modo
        //Calcular averagingInt(estrellasGanadas) por modoJuego.
        //text Estrellas medias por modo: PvP: 112★ Liga: 98★ Evento: 85★
        Map<String, Double> mediaPartida = partidas.stream()
                        .collect(Collectors.groupingBy(Partida::getModoJuego,
                                Collectors.averagingInt(Partida::getEstrellasGanadas)));
        IO.println(mediaPartida);



        IO.println("------------------------------------------------------------");
        //Consulta 6: Partidas de más de 20 minutos
        //Filtrar duracion que contenga "20min" o "30min".
        List<Partida> duracionPartida = partidas.stream()
                        .filter(p -> p.getDuracion().contains("20min")
                                || p.getDuracion().contains("30min"))
                        .toList();

        for (Partida partida: duracionPartida){
            IO.println(partida);
        }



        IO.println("------------------------------------------------------------");
        //Consulta 7: Equipos más usados
        //Los 5 equiposLocal con más apariciones.
        //text Equipos más jugados: FC_Barcelona → 12 veces Real_Madrid → 9 veces Manchester → 7 veces



        IO.println("------------------------------------------------------------");
        //Consulta 8: Peor racha (3+ derrotas seguidas)
        //Partidas perdidas ordenadas por fecha (golesLocal < golesVisitante).
        List<Partida> derrotas = partidas.stream()
                .filter(p-> p.getGolesLocal() < p.getGolesVisitante())
                .toList();
        for (Partida partida: derrotas){
            IO.println(partida);
        }



        IO.println("------------------------------------------------------------");
        //Consulta 9: Evolución mensual
        //Agrupar por mes de fecha y contar victorias.
        //text Victorias por mes: Marzo 2026 → 8 victorias Abril 2026 → 12 victorias













    }






}
