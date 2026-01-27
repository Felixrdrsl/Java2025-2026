package tema5.juegoMagoPractica1;

public class Prueba {

    private String descripcion;
    private Integer nivelDificultad;
    private Integer recompensa;

    public Prueba(String descripcion, Integer nivelDificultad, Integer recompensa) {
        this.descripcion = descripcion;
        this.nivelDificultad = nivelDificultad;
        this.recompensa = recompensa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(Integer nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public Integer getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(Integer recompensa) {
        this.recompensa = recompensa;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Prueba{");
        sb.append("descripcion='").append(descripcion).append('\'');
        sb.append(", nivelDificultad=").append(nivelDificultad);
        sb.append(", recompensa=").append(recompensa);
        sb.append('}');
        return sb.toString();
    }

    public void resolver(Hechizo hechizo){
        //if (hechizo.getPotencia() > nivelDificultad){}


    }

}
