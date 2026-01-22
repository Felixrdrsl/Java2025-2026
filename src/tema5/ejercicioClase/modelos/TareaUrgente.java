package tema5.ejercicioClase.modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TareaUrgente extends TareaBase {

    private Integer plazoHoras;

    public TareaUrgente(String titulo, String descripcion, Integer plazoHoras) {
        super(titulo, descripcion, PrioridadTarea.URGENTE);
        this.plazoHoras = plazoHoras;

    }

    public Integer getPlazoHoras() {
        return plazoHoras;
    }

    public void setPlazoHoras(Integer plazoHoras) {
        this.plazoHoras = plazoHoras;
    }

    @Override
    public String getTipo() {
        return "URGENTE";
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TareaUrgente{");
        sb.append("plazoHoras=").append(plazoHoras);
        sb.append(", id=").append(id);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", prioridad=").append(prioridad);
        sb.append(", estado=").append(estado);
        sb.append(", fechaCreacion=").append(fechaCreacion);
        sb.append(", fechaCompletada=").append(fechaCompletada);
        sb.append('}');
        return sb.toString();
    }


    public boolean estaVencida(){
        /*
        if (this.estado != EstadoTarea.COMPLETADA && this.plazoHoras < 24){
            return false;
        }else {
            return true
        }
         */
        //Si la fecha de creacion + plazoHoras < fechaHoraActual

        //sacamos la fecha y hora actual
        LocalDateTime fechaActual = LocalDateTime.now();

        //convertimos la fecha de creacion a LocalDateTime
        LocalDateTime fechaCreacionLDT = fechaCreacion.atTime(0,0);
        fechaCreacionLDT = fechaCreacionLDT.plusHours(plazoHoras);

        //comparamos las dos fechas
        return fechaActual.isAfter(fechaCreacionLDT);

    }

}
