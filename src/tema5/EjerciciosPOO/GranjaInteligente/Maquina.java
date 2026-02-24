package tema5.EjerciciosPOO.GranjaInteligente;

import java.util.Objects;

public abstract class Maquina implements Operable{

    private Integer id;
    private String modelo;
    private Integer estado;
    private Float horasUso;

    public Maquina(Integer id, String modelo, Integer estado, Float horasUso) {
        this.id = id;
        this.modelo = modelo;
        this.estado = estado;
        this.horasUso = horasUso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Float getHorasUso() {
        return horasUso;
    }

    public void setHorasUso(Float horasUso) {
        this.horasUso = horasUso;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Maquina maquina = (Maquina) o;
        return id == maquina.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Maquina{");
        sb.append("id=").append(id);
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", estado=").append(estado);
        sb.append(", horasUso=").append(horasUso);
        sb.append('}');
        return sb.toString();
    }


    public void trabajar(Float horas){
        if (this.estado == ENCENDIDA){
            horasUso += horas;
        }
    }


    @Override
    public void encender() {
        estado = ENCENDIDA;

    }

    @Override
    public void apagar() {
        estado = APAGADA;

    }

    @Override
    public void ponerEnMantenimiento() {
        estado = MANTENIMIENTO;

    }
    public abstract String imprimirTipo();
}
