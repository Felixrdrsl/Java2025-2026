package tema5.ejercicioClase.servicios;

import tema5.ejercicioClase.modelos.EstadoTarea;
import tema5.ejercicioClase.modelos.PrioridadTarea;
import tema5.ejercicioClase.modelos.Tarea;
import tema5.ejercicioClase.modelos.TareaBase;

import java.util.ArrayList;

public class GestorTareas {

    private String nombreUsuario;
    private ArrayList<Tarea> tareas;

    public GestorTareas(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.tareas = new ArrayList<>();
    }


    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void agregarTarea(Tarea nuevaTarea){
        tareas.add(nuevaTarea);
    }
    public void eliminarTarea(Tarea tarea){
        tareas.remove(tarea);
    }
    public Tarea buscarTarea(int id){
        for (Tarea tarea: tareas){
            //casting para pasar de tarea (Interfaz Tarea) a TareaBase y poder llamar getId
            if (((TareaBase)tarea).getId().equals(id) ) {
                return tarea;
            }
        }
        return null;
    }

    /**
     * Devolver una lsita con todas las tareas con un estado determinado
     * @param estado
     * @return ArrayList<Tarea>
     */
    //Metodos de filtrado------------------------------------------------------------------
    public ArrayList<Tarea> getTareasPorEstado(EstadoTarea estado){
        ArrayList<Tarea> lista = new ArrayList<>();
        for (Tarea tarea: tareas){
            if (tarea.getEstado().equals(estado) ) {
                //Añadir a la nueva lista si la tarea tiene el estado deseado
                lista.add(tarea);
            }
        }
        return lista;
    }

    /**
     * Devolver una lista con todas las tareas
     * @param prioridadTarea
     * @return
     */
    public ArrayList<Tarea> getTareasPorPrioridad(PrioridadTarea prioridadTarea){
        ArrayList<Tarea> lista = new ArrayList<>();
        for (Tarea tarea: tareas){
            if (tarea.getPrioridad().equals(prioridadTarea) ) {
                //Añadir a la nueva lista si la tarea tiene la misma prioridad
                lista.add(tarea);
            }
        }
        return lista;
    }

    public ArrayList<Tarea> getTareasUrgentes(){
        ArrayList<Tarea> lista = new ArrayList<>();
        for (Tarea tarea: tareas){
            if (tarea.getTipo().equals("Urgente") ) {
                //Añadir a la nueva lista si la tarea tiene el estado urgente
                lista.add(tarea);
            }
        }
        return lista;
    }

    public ArrayList<Tarea> getTareasPendientes(){
            return getTareasPorEstado(EstadoTarea.PENDIENTE);
    }
    public void listarTareas(){
        IO.println("Tareas del usuario " + nombreUsuario);
        for (Tarea tarea: tareas){
            IO.println(tarea);
        }
    }


    public void listarTareasPendientes(){

    }



}
