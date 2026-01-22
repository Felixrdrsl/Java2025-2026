package tema5.ejercicioClase.modelos;

import java.time.LocalDate;

/**
 * Clase abstracta( no se pueden crear objetos de esta clase)
 * va a ser el padre de una herencia
 */

public abstract class TareaBase implements Tarea {

    //Contador de tareas, comun a todas las instancias
    private static Integer contadorId = 0;

    protected Integer id;
    protected String titulo;
    protected String descripcion;
    protected PrioridadTarea prioridad;
    protected EstadoTarea estado;
    protected LocalDate fechaCreacion;
    protected LocalDate fechaCompletada;

    public TareaBase(String titulo, String descripcion, PrioridadTarea prioridad) {
        this.id = TareaBase.contadorId++;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = EstadoTarea.PENDIENTE;
        this.fechaCreacion = LocalDate.now();//Fecha en el momento de la ejecucion
        this.fechaCompletada = null;
    }



    //----------- Metodos-------------------------------------------------------------

    /**
     * cambia el estado de la tarea a completada
     * y pone la fecha del momento del que se creo
     */
    public void ejecutar(){
        this.estado = EstadoTarea.COMPLETADA;
        this.fechaCompletada = LocalDate.now();
    }


    //getters y setters---------------------------------------------------------------


    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public PrioridadTarea getPrioridad() {
        return prioridad;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public EstadoTarea getEstado() {
        return estado;
    }

    public LocalDate getFechaCompletada() {
        return fechaCompletada;
    }



    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrioridad(PrioridadTarea prioridad) {
        this.prioridad = prioridad;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TareaBase{");
        sb.append("id=").append(id);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", prioridad=").append(prioridad);
        sb.append(", estado=").append(estado);
        sb.append(", fechaCreacion=").append(fechaCreacion);
        sb.append(", fechaCompletada=").append(fechaCompletada);
        sb.append('}');
        return sb.toString();
    }

    /**
     * modifica el estado de la tarea
     */
    public void cambiarEstado(EstadoTarea estado) {
        this.estado = estado;
    }


    @Override
    public abstract String getTipo();

    @Override
    public void mostrarDetalle() {
        //coge el objeto y lo convierte automaticamente a String
        //llamando a toString, luego pinta ese String
        IO.println(this);
    }






}
