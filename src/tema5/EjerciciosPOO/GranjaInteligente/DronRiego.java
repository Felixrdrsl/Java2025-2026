package tema5.EjerciciosPOO.GranjaInteligente;

public class DronRiego extends Maquina{

    private Integer capacidadLitros;
    private Float alcanceMetros;

    public DronRiego(Integer id, String modelo, Integer estado, Float horasUso, Integer capacidadLitros, Float alcanceMetros) {
        super(id, modelo, estado, horasUso);
        this.capacidadLitros = capacidadLitros;
        this.alcanceMetros = alcanceMetros;
    }

    public Integer getCapacidadLitros() {
        return capacidadLitros;
    }

    public void setCapacidadLitros(Integer capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
    }

    public Float getAlcanceMetros() {
        return alcanceMetros;
    }

    public void setAlcanceMetros(Float alcanceMetros) {
        this.alcanceMetros = alcanceMetros;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DronRiego{");
        sb.append("capacidadLitros=").append(capacidadLitros);
        sb.append(", alcanceMetros=").append(alcanceMetros);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String imprimirTipo() {
        return "Dron de Riego";
    }
}
