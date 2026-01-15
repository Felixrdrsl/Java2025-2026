package tema5.ejercicioSpotify;

import java.util.Objects;

public class cancion {

    private String titulo;
    private String artista;
    private Integer duracion;

    //Constructor parametrizado
    //Constructor copia
    //Getters y setters
    //ToString
    //Equals con titulo y artista


    public cancion(String titulo, String artista, Integer duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    public cancion(cancion cancion) {
        this.titulo = cancion.titulo;
        this.artista = cancion.artista;
        this.duracion = cancion.duracion;
    }

    //Getters && setters


    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public Integer getDuracion() {
        return duracion;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("cancion{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", artista='").append(artista).append('\'');
        sb.append(", duracion=").append(duracion);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        cancion cancion = (cancion) o;
        return Objects.equals(titulo, cancion.titulo) && Objects.equals(artista, cancion.artista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, artista);
    }



}
