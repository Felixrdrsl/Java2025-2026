package tema6.fechas.ejercicioFechas;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Curso {

    private String nombre;
    private LocalDate FechaInicio;
    private LocalDate FechaFin;


    public Curso(String nombre, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombre = nombre;
        FechaInicio = fechaInicio;
        FechaFin = fechaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        FechaFin = fechaFin;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Curso{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", FechaInicio=").append(FechaInicio);
        sb.append(", FechaFin=").append(FechaFin);
        sb.append('}');
        return sb.toString();
    }

    public void calcularDuracion(){
        Period period = Period.between(FechaInicio,FechaFin);
        IO.println("EL curso dura: " + period.getYears() + " años " +
                period.getMonths() + " meses y " + period.getDays() + " dias ");

    }
    public boolean estaActivo(){
       LocalDate ahora = LocalDate.now();
       return ahora.isAfter(this.FechaInicio) && ahora.isBefore(this.FechaFin);
    }
    public long estadoRespectoAInicio(){
        LocalDate hoy = LocalDate.now();
        return ChronoUnit.DAYS.between(hoy, this.FechaInicio);
    }




}
