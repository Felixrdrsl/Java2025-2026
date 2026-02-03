package tema6.equiposESports.entidades;

public class Tanque extends Jugador {

    private Double defensaPromedio;
    private Double danoRecibido;

    public Tanque(Integer id, String nombre, Integer puntos,
                  Double defensaPromedio, Double danoRecibido) {
        this.defensaPromedio = defensaPromedio;
        this.danoRecibido = danoRecibido;
        super(id, nombre, puntos);

    }

    public Double getDefensaPromedio() {
        return defensaPromedio;
    }

    public void setDefensaPromedio(Double defensaPromedio) {
        this.defensaPromedio = defensaPromedio;
    }

    public Double getDanoRecibido() {
        return danoRecibido;
    }

    public void setDanoRecibido(Double danoRecibido) {
        this.danoRecibido = danoRecibido;
    }

    public void imprimirDatos(){
        IO.println("Tanque{" + "id='" + getId() + ", nombre='" + getNombre() + ", puntos="
                + getPuntos() + ", defensaPromedio=" + getDefensaPromedio()
                + ", danoRecibido=" + getDanoRecibido() + '}');
    }

    @Override
    public void imprimirRol() {
        IO.println("Tanque");
    }
}
