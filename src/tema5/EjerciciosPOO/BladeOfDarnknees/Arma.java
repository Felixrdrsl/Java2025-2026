package tema5.EjerciciosPOO.BladeOfDarnknees;

public class Arma {

    private String nombre;
    private Double puntosD;
    private Boolean dosManos;
    private TipoArma tipo;

    public Arma(String nombre, Double puntosD, Boolean dosManos, TipoArma tipo) {
        this.nombre = nombre;
        this.puntosD = puntosD;
        this.dosManos = dosManos;
        this.tipo = tipo;
    }

    public TipoArma getTipo() {
        return tipo;
    }

    public void setTipo(TipoArma tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(Double puntosD) {
        this.puntosD = puntosD;
    }

    public Boolean getDosManos() {
        return dosManos;
    }

    public void setDosManos(Boolean dosManos) {
        this.dosManos = dosManos;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Arma{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", puntosD=").append(puntosD);
        sb.append(", dosManos=").append(dosManos);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }







}
