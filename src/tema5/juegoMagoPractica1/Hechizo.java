package tema5.juegoMagoPractica1;

public class Hechizo {

    private String nombre;
    private Integer energiaNecesaria;
    private Integer potencia;

    public Hechizo(String nombre, Integer energiaNecesaria, Integer potencia) {
        this.nombre = nombre;
        this.energiaNecesaria = energiaNecesaria;
        this.potencia = potencia;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEnergiaNecesaria() {
        return energiaNecesaria;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEnergiaNecesaria(Integer energiaNecesaria) {
        this.energiaNecesaria = energiaNecesaria;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hechizo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", energiaNecesaria=").append(energiaNecesaria);
        sb.append(", potencia=").append(potencia);
        sb.append('}');
        return sb.toString();
    }

    public boolean esEfectivo(Prueba prueba){
         return this.potencia >= prueba.getNivelDificultad();
    }

}
