package tema6.fechas.ejercicioFechas;

import java.time.Duration;
import java.time.LocalTime;

public class Sesion {
    private LocalTime horaInicio;
    private LocalTime horaFin;

    public Sesion(LocalTime horaInicio, LocalTime horaFin) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Sesion{");
        sb.append("horaInicio=").append(horaInicio);
        sb.append(", horaFin=").append(horaFin);
        sb.append('}');
        return sb.toString();
    }

    public void duracion(){
        Duration duracion = Duration.between(horaInicio,horaFin);
        IO.println("EL curso empezo a las : " + horaInicio.getHour() + " horas y " +
                horaInicio.getMinute() + " minutos y termino a las " + horaFin.getHour() + " horas y "
                + horaFin.getMinute() + " minutos");

    }

    public boolean estaActivo(Sesion otra){
        return !(this.horaInicio.isAfter(otra.horaFin)
                || this.horaFin.isBefore(otra.horaInicio));
    }
    public Duration tiempoDescanso(Sesion otraSesion){
        return Duration.between(this.horaFin,otraSesion.horaInicio);
    }
}

