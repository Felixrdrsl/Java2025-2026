package tema5.EjerciciosPOO.GranjaInteligente;

public class TractorAutonomo extends Maquina{

    private Float potenciaCV;
    private Float consumoPorHora;

    public TractorAutonomo(Integer id, String modelo, Integer estado,
                           Float horasUso, Float potenciaCV, Float consumoPorHora) {
        super(id, modelo, estado, horasUso);
        this.potenciaCV = potenciaCV;
        this.consumoPorHora = consumoPorHora;
    }

    public Float getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Float potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public Float getConsumoPorHora() {
        return consumoPorHora;
    }

    public void setConsumoPorHora(Float consumoPorHora) {
        this.consumoPorHora = consumoPorHora;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TractorAutonomo{");
        sb.append("potenciaCV=").append(potenciaCV);
        sb.append(", consumoPorHora=").append(consumoPorHora);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String imprimirTipo() {
        return "Tractor Autonomo";
    }
}
