package tema5.EjerciciosPOO.GranjaInteligente;

public class CosechadoraAutonoma extends Maquina{

    private Float anchoCorte;
    private Float rendimientoToneladasHora;

    public CosechadoraAutonoma(Integer id, String modelo, Integer estado,
                               Float horasUso, Float anchoCorte, Float rendimientoToneladasHora) {
        super(id, modelo, estado, horasUso);
        this.anchoCorte = anchoCorte;
        this.rendimientoToneladasHora = rendimientoToneladasHora;
    }

    public Float getAnchoCorte() {
        return anchoCorte;
    }

    public void setAnchoCorte(Float anchoCorte) {
        this.anchoCorte = anchoCorte;
    }

    public Float getRendimientoToneladasHora() {
        return rendimientoToneladasHora;
    }

    public void setRendimientoToneladasHora(Float rendimientoToneladasHora) {
        this.rendimientoToneladasHora = rendimientoToneladasHora;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CosechadoraAutonoma{");
        sb.append("anchoCorte=").append(anchoCorte);
        sb.append(", rendimientoToneladasHora=").append(rendimientoToneladasHora);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String imprimirTipo() {
        return "Cosechadora Autonoma";
    }
}
