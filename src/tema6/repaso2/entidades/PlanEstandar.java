package tema6.repaso2.entidades;

import tema6.Practica3.Clases.Plan;

import java.time.LocalDate;

public class PlanEstandar extends Plan {


    private Integer numMaxParticipantes;
    private Boolean incluyeAlojamiento;


    public PlanEstandar(String titulo, String descripcion, CategoriaPlan categoriaPlan, LocalDate fechaPropuesta, LocalDate fechaRealizacion,
                        Double presupuestoEstimado, Participante proponente, Integer numMaxParticipantes, Boolean incluyeAlojamiento) {
        super(titulo, descripcion, categoriaPlan, fechaPropuesta, fechaRealizacion, presupuestoEstimado, proponente);
        this.numMaxParticipantes = numMaxParticipantes;
        this.incluyeAlojamiento = incluyeAlojamiento;
    }

    public Integer getNumMaxParticipantes() {
        return numMaxParticipantes;
    }

    public void setNumMaxParticipantes(Integer numMaxParticipantes) {
        this.numMaxParticipantes = numMaxParticipantes;
    }

    public Boolean getIncluyeAlojamiento() {
        return incluyeAlojamiento;
    }

    public void setIncluyeAlojamiento(Boolean incluyeAlojamiento) {
        this.incluyeAlojamiento = incluyeAlojamiento;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PlanEstandar{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", categoriaPlan=").append(categoriaPlan);
        sb.append(", fechaPropuesta=").append(fechaPropuesta);
        sb.append(", fechaRealizacion=").append(fechaRealizacion);
        sb.append(", presupuestoEstimado=").append(presupuestoEstimado);
        sb.append(", estadoPlan=").append(estadoPlan);
        sb.append(", proponente=").append(proponente);
        sb.append(", numMaxParticipantes=").append(numMaxParticipantes);
        sb.append(", incluyeAlojamiento=").append(incluyeAlojamiento);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String getResumenEconomico() {
        final StringBuffer sb = new StringBuffer("Resumen Economico: ");
        sb.append("Presupuesto estimado: ").append(presupuestoEstimado).append(" y ").append(numMaxParticipantes);
        sb.append(" -> Alojamiento: ").append(incluyeAlojamiento);
        return sb.toString();
    }


}
