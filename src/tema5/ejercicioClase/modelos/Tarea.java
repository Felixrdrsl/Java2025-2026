package tema5.ejercicioClase.modelos;

public interface Tarea {

    void ejecutar();
    PrioridadTarea getPrioridad();
    EstadoTarea getEstado();
    String getDescripcion();
    String getTipo();
    void mostrarDetalle();

}
