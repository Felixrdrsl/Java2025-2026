package tema6.Practica3.Clases;

import tema6.Practica3.Enums.TipoCoche;
import tema6.Practica3.Enums.TipoCombustible;

public class CochePremium extends Coche{

    private Boolean gps;
    private Boolean seguroExtra;


    public CochePremium(String marca, String modelo, String matricula,
                        Integer anio, TipoCombustible combustible, TipoCoche tipo,
                        Double precioBase, Boolean gps, Boolean seguroExtra) {

        super(marca, modelo, matricula, anio, combustible, tipo, precioBase);
        if (tipo != TipoCoche.DEPORTIVO && tipo != TipoCoche.FURGONETA){
            tipo = TipoCoche.DEPORTIVO;
            setTipo(tipo);
        }
        this.gps = gps;
        this.seguroExtra = seguroExtra;
    }

    public Boolean getGps() {
        return gps;
    }

    public void setGps(Boolean gps) {
        this.gps = gps;
    }

    public Boolean getSeguroExtra() {
        return seguroExtra;
    }

    public void setSeguroExtra(Boolean seguroExtra) {
        this.seguroExtra = seguroExtra;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CochePremium{");
        sb.append("id=").append(id);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", matricula='").append(matricula).append('\'');
        sb.append(", anio=").append(anio);
        sb.append(", combustible=").append(combustible);
        sb.append(", tipo=").append(tipo);
        sb.append(", precioBase=").append(precioBase);
        sb.append(", disponible=").append(disponible);
        sb.append(", gps=").append(gps);
        sb.append(", seguroExtra=").append(seguroExtra);
        sb.append('}');
        return sb.toString();
    }




    @Override
    public Double calcularPrecioAlquiler(Integer dias) {
        double precioDiario = getPrecioBase() * 1.20;
        double total = precioDiario * dias;

        if (gps) {
            total += 10 * dias;
        }

        if (seguroExtra) {
            total += 15 * dias;
        }

        return total;
    }
}
