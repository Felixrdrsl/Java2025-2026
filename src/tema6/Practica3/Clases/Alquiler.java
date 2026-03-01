package tema6.Practica3.Clases;

import tema6.Practica3.Interfaz.Enviable;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler implements Enviable {

    private static Long contadorId = 0L;

    private Long id;
    private Cliente cliente;
    private Coche coche;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double precioTotal;


    public Alquiler(Cliente cliente, Coche coche, LocalDate fechaInicio,
                    LocalDate fechaFin, Double precioTotal) {
        this.id = contadorId++;
        this.cliente = cliente;
        this.coche = coche;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioTotal = precioTotal;
        if (coche.disponible) {
            long dias = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
            if (dias <= 0) dias = 1;  // mínimo 1 día para evitar 0 o negativo

            // Calcular precio total
            this.precioTotal = coche.calcularPrecioAlquiler((int) dias);

            // Marcar coche no disponible
            this.coche.setDisponible(false);
        } else {
            // Si el coche no está disponible, precio =  0
            this.precioTotal = 0.0;
        }
    }


    public static Long getContadorId() {
        return contadorId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }



    public void cancelarAlquiler(){
        if (coche != null){
            this.coche.setDisponible(true);
        }

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Alquiler{");
        sb.append("id=").append(id);
        sb.append(", cliente=").append(cliente);
        sb.append(", coche=").append(coche);
        sb.append(", fechaInicio=").append(fechaInicio);
        sb.append(", fechaFin=").append(fechaFin);
        sb.append(", precioTotal=").append(precioTotal);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public String crearEmail() {
        return  cliente.getNombre() + " " + cliente.getApellidos() +
                " ha alquilado el coche " + coche.getMarca() + " " + coche.getModelo() +
                " (" + coche.getMatricula() + ") del " + fechaInicio +
                " al " + fechaFin + ". Precio total: " + precioTotal + "€";
    }
}
