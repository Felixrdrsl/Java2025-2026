package tema5.juegoPractica1;

public class Arma {

    private String nombre;
    private Integer puntosD;
    private Boolean dosManos;
    private TipoArma tipo;

    public Arma(String nombre, Integer puntosD, Boolean dosManos, TipoArma tipo) {
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

    public Integer getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(Integer puntosD) {
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
