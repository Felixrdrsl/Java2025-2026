package tema6.ExamenTema6.Entidades;

import java.time.LocalDate;

public class AnimalDomestico extends Animal{

    private Boolean castrado;
    private Boolean tieneChip;

    public AnimalDomestico(String nombre, TipoAnimal tipo, String raza, LocalDate fechaNacimiento,
                           Double peso, Propietario propietario, Boolean castrado, Boolean tieneChip) {
        super(nombre, tipo, raza, fechaNacimiento, peso, propietario);
        this.castrado = castrado;
        this.tieneChip = tieneChip;
    }

    public Boolean getCastrado() {
        return castrado;
    }

    public void setCastrado(Boolean castrado) {
        this.castrado = castrado;
    }

    public Boolean getTieneChip() {
        return tieneChip;
    }

    public void setTieneChip(Boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AnimalDomestico{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", tipo=").append(tipo);
        sb.append(", raza='").append(raza).append('\'');
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", peso=").append(peso);
        sb.append(", estado=").append(estado);
        sb.append(", propietario=").append(propietario);
        sb.append(", castrado=").append(castrado);
        sb.append(", tieneChip=").append(tieneChip);
        sb.append('}');
        return sb.toString();
    }


    /**
     * aplica los siguientes precios base
     * según el tipo de consulta: REVISION 20€, VACUNA 30€, CIRUGIA 150€, URGENCIA 80€. Si el
     * animal está castrado se aplica un descuento del 10% sobre el precio final (menos
     * complicaciones médicas).
     * @param tipo
     * @return
     */
    @Override
    public Double calcularCosteConsulta(TipoConsulta tipo) {
        double total = 0.0;
        if (tipo == TipoConsulta.REVISION)
            total = 20.0;

        if (tipo == TipoConsulta.VACUNA)
            total = 30.0;

        if (tipo == TipoConsulta.CIRUGIA)
            total = 150.0;
        if (tipo == tipo.URGENCIA)
            total = 80.0;
        if (castrado == true) {
            if (tipo == TipoConsulta.REVISION || tipo == TipoConsulta.VACUNA)
                return total * 0.90;
        }

        return total;
    }


}
