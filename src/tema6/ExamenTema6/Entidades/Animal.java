package tema6.ExamenTema6.Entidades;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public abstract class Animal {

    private static Long contadorId= 1L;

    protected Long id;
    protected String nombre;
    protected TipoAnimal tipo;
    protected String raza;
    protected LocalDate fechaNacimiento;
    protected Double peso;
    protected EstadoAnimal estado;
    protected Propietario propietario;

    public Animal(String nombre, TipoAnimal tipo, String raza,
                  LocalDate fechaNacimiento, Double peso, Propietario propietario) {
        this.id = contadorId++;
        this.estado = EstadoAnimal.ALTA;
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.propietario = propietario;
    }

    public EstadoAnimal getEstado() {
        return estado;
    }

    public void setEstado(EstadoAnimal estado) {
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public void setTipo(TipoAnimal tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Animal{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", tipo=").append(tipo);
        sb.append(", raza='").append(raza).append('\'');
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", peso=").append(peso);
        sb.append(", estado=").append(estado);
        sb.append(", propietario=").append(propietario);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(id, animal.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    /**
     * calcula y devuelve la edad del animal en años a partir de
     * fechaNacimiento
     * @return
     */
    public Integer getEdadAnios(){
        Period periodo = Period.between(fechaNacimiento,LocalDate.now());
        return periodo.getYears();
    }
    public abstract Double calcularCosteConsulta(TipoConsulta tipo);



}
