package tema5.ejercicioClase.modelos;

public interface Tarea {

    void ejecutar();
    PrioridadTarea obtenerPrioridad();
    EstadoTarea obtenerEstado();
    String obtenerDescripcion();
    String obtenerTipo();
    void mostrarDetalle();
}
