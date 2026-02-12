package tema6.fechas.ejercicioFechas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Examen {
    private String nombreExamen;
    private LocalDateTime fechaExamen;
    private LocalDateTime horaExamen;

    public Examen(String nombreExamen, LocalDateTime fechaExamen, LocalDateTime horaExamen) {
        this.nombreExamen = nombreExamen;
        this.fechaExamen = fechaExamen;
        this.horaExamen = horaExamen;
    }

    public String getNombreExamen() {
        return nombreExamen;
    }

    public void setNombreExamen(String nombreExamen) {
        this.nombreExamen = nombreExamen;
    }

    public LocalDateTime getFechaExamen() {
        return fechaExamen;
    }

    public void setFechaExamen(LocalDateTime fechaExamen) {
        this.fechaExamen = fechaExamen;
    }

    public LocalDateTime getHoraExamen() {
        return horaExamen;
    }

    public void setHoraExamen(LocalDateTime horaExamen) {
        this.horaExamen = horaExamen;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Examen{");
        sb.append("nombreExamen='").append(nombreExamen).append('\'');
        sb.append(", fechaExamen=").append(fechaExamen);
        sb.append(", horaExamen=").append(horaExamen);
        sb.append('}');
        return sb.toString();
    }

    public Duration tiempoRelativo(){
        return Duration.between(horaExamen,LocalDateTime.now());
    }





}
