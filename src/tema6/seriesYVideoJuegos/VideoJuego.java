package tema6.seriesYVideoJuegos;

public class VideoJuego implements Entregable {
    enum Genero{
        TERROR,
        ACCION,
        SHOOTER,
        RPG,
        MUNDO_ABIERTO,
        MENTAL,
        TACTICO
    }

    private String titulo = "";
    private Double horasEstimadas = 100.0;
    private Genero genero;
    private String desarrollador = "";
    private Boolean prestado = false;

    public VideoJuego(String titulo, Double horasEstimadas, Genero genero, String desarrollador, Double prestado) {
        this.titulo = "";
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.desarrollador = "";
        this.prestado = false;
    }

    public VideoJuego(String titulo, Double horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.desarrollador = "";
        this.prestado = false;
    }
    public VideoJuego(String titulo, Double horasEstimadas, Genero genero, String desarrollador) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.desarrollador = desarrollador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(Double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("VideoJuego{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", horasEstimadas=").append(horasEstimadas);
        sb.append(", genero=").append(genero);
        sb.append(", desarrollador='").append(desarrollador).append('\'');
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
