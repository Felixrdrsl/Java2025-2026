package tema6.fechas.ejercicioFechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class App {
    static void main() {

        Curso curso1 = new Curso("Curso1", LocalDate.of(2025,9,1)
                        ,LocalDate.of(2026,6,30));

        Sesion ses1 = new Sesion(LocalTime.of(9,0),LocalTime.of(11,0));
        Sesion ses2 = new Sesion(LocalTime.of(11,30),LocalTime.of(13,30));
        Sesion ses3 = new Sesion(LocalTime.of(15,0),LocalTime.of(17,0));

        Examen ex1 = new Examen("Matematicas",
                LocalDate.of(2025,12,15),LocalTime.of(10,0));
        Examen ex2 = new Examen();


    }
}
