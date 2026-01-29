package tema6.seriesYVideoJuegos;

public class Series implements Entregable {

    private String titulo = "";
    private Integer numTemporadas = 3;
    private Genero genero;
    private String creador = "";
    private Boolean prestado = false;

    public Series(String titulo, Integer numTemporadas, Genero genero, String creador, Boolean prestado) {
        this.titulo = " ";
        this.numTemporadas = 3;
        this.genero = genero;
        this.creador = " ";
        this.prestado = false;
    }

    public Series(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.numTemporadas = 3;
        this.genero = genero;
        this.prestado = false;
    }

    public Series(String titulo, Integer numTemporadas, Genero genero, String creador) {
        this.titulo = titulo;
        this.numTemporadas = numTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(Integer numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Series{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", numTemporadas=").append(numTemporadas);
        sb.append(", genero=").append(genero);
        sb.append(", creador='").append(creador).append('\'');
        sb.append(", prestado=").append(prestado);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public Boolean entregar() {
        IO.println("¿Esta prestado?");
        return prestado = true;
    }

    @Override
    public Boolean devolver() {
        IO.println("¿Esta prestado?");
        return prestado = false;
    }

    @Override
    public Boolean esPrestado() {
        return prestado;
    }
}
