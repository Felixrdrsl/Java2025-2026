package tema6.ExamenTema6.Entidades;

import java.time.LocalDate;

public class AnimalExotico extends Animal{

    private String paisOrigen;
    private Boolean requierePermisoCITES;


    public AnimalExotico(String nombre, TipoAnimal tipo, String raza, LocalDate fechaNacimiento,
                         Double peso, Propietario propietario, String paisOrigen, Boolean requierePermisoCITES) {
        super(nombre, tipo, raza, fechaNacimiento, peso, propietario);
        this.paisOrigen = paisOrigen;
        this.requierePermisoCITES = requierePermisoCITES;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public Boolean getRequierePermisoCITES() {
        return requierePermisoCITES;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public void setRequierePermisoCITES(Boolean requierePermisoCITES) {
        this.requierePermisoCITES = requierePermisoCITES;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AnimalExotico{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", tipo=").append(tipo);
        sb.append(", raza='").append(raza).append('\'');
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", peso=").append(peso);
        sb.append(", estado=").append(estado);
        sb.append(", propietario=").append(propietario);
        sb.append(", paisOrigen='").append(paisOrigen).append('\'');
        sb.append(", requierePermisoCITES=").append(requierePermisoCITES);
        sb.append('}');
        return sb.toString();
    }

    /**
     *  aplica los mismos precios base
     * que AnimalDomestico , pero con un suplemento del 25% por ser animal exótico. Si además
     * requiere permiso CITES, se añaden 15€ fijos adicionales.
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

        total = total * 1.25;

        if (requierePermisoCITES == true) {
                return total += 15.0;
        }

        return total;
    }


}
