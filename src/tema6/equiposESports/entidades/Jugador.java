package tema6.equiposESports.entidades;

import java.util.Objects;
import java.util.UUID;

public abstract class Jugador {

    protected String id;
    protected String nombre;
    protected Integer puntos;

    public Jugador(Integer id, String nombre, Integer puntos) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.puntos = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return Objects.equals(id, jugador.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", puntos=").append(puntos);
        sb.append('}');
        return sb.toString();
    }

    public void addPuntos(Integer puntos){
        this.puntos += puntos;

    }
    public abstract void imprimirRol();



}
