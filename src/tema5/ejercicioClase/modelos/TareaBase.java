package tema5.ejercicioClase.modelos;

import java.time.LocalDate;

/**
 * Clase abstracta( no se pueden crear objetos de esta clase)
 * va a ser el padre de una herencia
 */

public abstract class TareaBase {

    //Contador de tareas, comun a todas las instancias
    private static Integer contadorId = 0;

    private Integer id;
    private String titulo;
    private String descripcion;
    private PrioridadTarea prioridad;
    private EstadoTarea estado;
    private LocalDate fechaCreacion;
    private LocalDate fechaCompletada;

    public TareaBase(String titulo, String descripcion, PrioridadTarea prioridad) {
        this.id = TareaBase.contadorId++;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = EstadoTarea.PENDIENTE;
        this.fechaCreacion = LocalDate.now();//Fecha en el momento de la ejecucion
        this.fechaCompletada = null;
    }




}
