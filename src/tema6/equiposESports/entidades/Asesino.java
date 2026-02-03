package tema6.equiposESports.entidades;

public class Asesino extends Jugador{
    private Float precisionPromedio;
    private Integer bajasPorPartida;

    public Asesino(Integer id, String nombre, Integer puntos,
                   Float precisionPromedio, Integer bajasPorPartida) {
        this.precisionPromedio = precisionPromedio;
        this.bajasPorPartida = bajasPorPartida;
        super(id, nombre, puntos);

    }

    public Float getPrecisionPromedio() {
        return precisionPromedio;
    }

    public void setPrecisionPromedio(Float precisionPromedio) {
        this.precisionPromedio = precisionPromedio;
    }

    public Integer getBajasPorPartida() {
        return bajasPorPartida;
    }

    public void setBajasPorPartida(Integer bajasPorPartida) {
        this.bajasPorPartida = bajasPorPartida;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Asesino{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", puntos=").append(puntos);
        sb.append(", precisionPromedio=").append(precisionPromedio);
        sb.append(", bajasPorPartida=").append(bajasPorPartida);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void imprimirRol() {
        IO.println("Asesino");
    }
}
