package tema6.Practica3.Clases;

import tema6.Practica3.Enums.TipoCoche;
import tema6.Practica3.Enums.TipoCombustible;

public class CocheEstandar extends Coche{

    private Boolean aireAcondicionado;


    public CocheEstandar(String marca, String modelo, String matricula, Integer anio
            , TipoCombustible combustible, TipoCoche tipo, Double precioBase, Boolean aireAcondicionado) {
        super(marca, modelo, matricula, anio, combustible, tipo, precioBase);
        do {
            if (tipo == TipoCoche.SEDAN || tipo == TipoCoche.SUV) {
                break;
            } else {
                // Si no es válido le ponemos este por defecto
                tipo = TipoCoche.SEDAN;
                setTipo(tipo);
            }
        } while (tipo != TipoCoche.SEDAN && tipo != TipoCoche.SUV);
        this.aireAcondicionado = aireAcondicionado;
    }


    public Boolean getAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(Boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CocheEstandar{");
        sb.append("id=").append(id);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", matricula='").append(matricula).append('\'');
        sb.append(", anio=").append(anio);
        sb.append(", combustible=").append(combustible);
        sb.append(", tipo=").append(tipo);
        sb.append(", precioBase=").append(precioBase);
        sb.append(", disponible=").append(disponible);
        sb.append(", aireAcondicionado=").append(aireAcondicionado);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Double calcularPrecioAlquiler(Integer dias) {
        double precio = getPrecioBase() * dias;
        if (aireAcondicionado){
            precio+= 5 * dias;
        }

        return precio;
    }
}
