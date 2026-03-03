package tema6.Practica3.Clases;

import tema6.repaso2.entidades.CategoriaPlan;
import tema6.repaso2.entidades.EstadoPlan;
import tema6.repaso2.entidades.Participante;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Plan {

    private static Long contadorId= 0L;


    protected Long id;
    protected String titulo;
    protected String descripcion;
    protected CategoriaPlan categoriaPlan;
    protected LocalDate fechaPropuesta;
    protected LocalDate fechaRealizacion;
    protected Double presupuestoEstimado;
    protected EstadoPlan estadoPlan;
    protected Participante proponente;


    public Plan(String titulo, String descripcion, CategoriaPlan categoriaPlan, LocalDate fechaPropuesta,
                LocalDate fechaRealizacion, Double presupuestoEstimado, Participante proponente) {
        this.id = contadorId++;
        this.estadoPlan = EstadoPlan.ABIERTO;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoriaPlan = categoriaPlan;
        this.fechaPropuesta = fechaPropuesta;
        this.fechaRealizacion = fechaRealizacion;
        this.presupuestoEstimado = presupuestoEstimado;
        this.proponente = proponente;
        if (fechaRealizacion.isBefore(fechaPropuesta))
            throw new IllegalArgumentException();
    }


    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CategoriaPlan getCategoriaPlan() {
        return categoriaPlan;
    }

    public void setCategoriaPlan(CategoriaPlan categoriaPlan) {
        this.categoriaPlan = categoriaPlan;
    }

    public LocalDate getFechaPropuesta() {
        return fechaPropuesta;
    }

    public void setFechaPropuesta(LocalDate fechaPropuesta) {
        this.fechaPropuesta = fechaPropuesta;
    }

    public LocalDate getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(LocalDate fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public Double getPresupuestoEstimado() {
        return presupuestoEstimado;
    }

    public void setPresupuestoEstimado(Double presupuestoEstimado) {
        this.presupuestoEstimado = presupuestoEstimado;
    }

    public EstadoPlan getEstadoPlan() {
        return estadoPlan;
    }

    public void setEstadoPlan(EstadoPlan estadoPlan) {
        this.estadoPlan = estadoPlan;
    }

    public Participante getProponente() {
        return proponente;
    }

    public void setProponente(Participante proponente) {
        this.proponente = proponente;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Plan{");
        sb.append("id=").append(id);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", categoriaPlan=").append(categoriaPlan);
        sb.append(", fechaPropuesta=").append(fechaPropuesta);
        sb.append(", fechaRealizacion=").append(fechaRealizacion);
        sb.append(", presupuestoEstimado=").append(presupuestoEstimado);
        sb.append(", estadoPlan=").append(estadoPlan);
        sb.append(", proponente=").append(proponente);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Plan plan = (Plan) o;
        return Objects.equals(id, plan.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    public int getDiasHastaRealizacion(){
        //Hacer
        return 0;
    }

    public abstract String getResumenEconomico();
}
