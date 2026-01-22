package tema5.ejercicioClase.aplicacion;

import tema5.ejercicioClase.modelos.EstadoTarea;
import tema5.ejercicioClase.modelos.PrioridadTarea;
import tema5.ejercicioClase.modelos.TareaProgramada;
import tema5.ejercicioClase.modelos.TareaUrgente;
import tema5.ejercicioClase.servicios.GestorTareas;

import java.time.LocalDate;
import java.time.LocalTime;

public class Aplicacion {
    static void main() {

        TareaUrgente tu1 = new TareaUrgente("Programar Java este finde",
                "Ponerme a hacer ejercicios del tema4 y 5 como loco",
                48);

        tu1.ejecutar();
        IO.println(tu1.getTipo());
        tu1.mostrarDetalle();
        IO.println(tu1.estaVencida());

        TareaProgramada tp1 = new TareaProgramada("Examen Ana",
                "Examen dificil de SSI",
                PrioridadTarea.ALTA, LocalDate.of(2026,1,23),
                LocalTime.of(18,0));
        tp1.mostrarDetalle();
        IO.println(tp1.obtenerDiasSemana());

        GestorTareas gt = new GestorTareas("Manolo dias");
        gt.agregarTarea(tu1);
        gt.agregarTarea(tp1);
        gt.listarTareasPendientes();
        System.out.println("Tareas Completadas");
        IO.println(gt.getTareasPorEstado(EstadoTarea.COMPLETADA));





    }
}
