package tema7.ejercicio;

import java.util.Objects;

public class Jugador implements Comparable<Jugador> {

    private Integer id;
    private String nombre;
    private String pais;
    private Double puntos;
    private Integer nivel;


    public Jugador(Integer id, String nombre, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.puntos = 0.0;
        this.pais = pais;
        this.nivel = 1;
    }

    public Jugador(Integer id, String nombre, String pais, Double puntos, Integer nivel) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.puntos = 0.0;
        this.nivel = 1;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Double getPuntos() {
        return puntos;
    }

    public void setPuntos(Double puntos) {
        this.puntos = puntos;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", pais='").append(pais).append('\'');
        sb.append(", puntos=").append(puntos);
        sb.append(", nivel=").append(nivel);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return id == jugador.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public int compareTo(Jugador o) {
        return this.puntos.compareTo(o.puntos);
    }
}
