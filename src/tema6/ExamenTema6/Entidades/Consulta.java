package tema6.ExamenTema6.Entidades;

import java.time.LocalDate;

public class Consulta implements Facturable {

    private static Long contadorId= 1L;

    private Long id;
    private Animal animal;
    private String veterinario;
    private LocalDate fecha ;
    private TipoConsulta tipo;
    private String diagnostico;
    private String tratamiento;
    private Double precioTotal;

    public Consulta(Animal animal, String veterinario, LocalDate fecha,
                    TipoConsulta tipo, String diagnostico, String tratamiento) {
        this.id = contadorId++;
        this.animal = animal;
        this.veterinario = veterinario;
        this.fecha = fecha;
        this.tipo = tipo;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        if (!fecha.isAfter(LocalDate.now()))
             precioTotal = animal.calcularCosteConsulta(tipo);
        else throw new IllegalArgumentException();

    }

    public Long getId() {
        return id;
    }


    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public TipoConsulta getTipo() {
        return tipo;
    }

    public void setTipo(TipoConsulta tipo) {
        this.tipo = tipo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }


    public String generarFactura(){
        final StringBuffer sb = new StringBuffer("Consulta{");
        sb.append("animal=").append(animal);
        sb.append("Propietario=").append(animal.propietario);
        sb.append(", veterinario='").append(veterinario).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", tipo=").append(tipo);
        sb.append(", diagnostico='").append(diagnostico).append('\'');
        sb.append(", tratamiento='").append(tratamiento).append('\'');
        sb.append(", precioTotal=").append(precioTotal);
        sb.append('}');
        return sb.toString();
    }


}
