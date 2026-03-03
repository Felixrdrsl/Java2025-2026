package tema6.repaso2.entidades;

import java.util.ArrayList;

public class Participante extends Persona{

    private String alias;
    private ArrayList<Voto> votosemitidos;


    public Participante(String nombre, String apellidos, String email, String alias) {
        super(nombre, apellidos, email);
        this.alias = alias;
        this.votosemitidos = new ArrayList<>();
    }

    public Participante(Participante otro){
        super(otro.nombre, otro.apellidos, otro.email);
        this.alias = otro.alias;
        this.votosemitidos = new ArrayList<>();
    }


    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public ArrayList<Voto> getVotosemitidos() {
        return votosemitidos;
    }

    public void setVotosemitidos(ArrayList<Voto> votosemitidos) {
        this.votosemitidos = votosemitidos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Participante{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", alias='").append(alias).append('\'');
        sb.append(", votosemitidos=").append(votosemitidos);
        sb.append('}');
        return sb.toString();
    }


    public void addVoto(Voto v){
        votosemitidos.add(v);
    }
    public int getTotalVotosEmitidos(){
        //Hacer
        return 0;
    }


}
