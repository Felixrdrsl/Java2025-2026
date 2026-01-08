package tema4;

public class Personaje {

    //Propiedades
    private String nombre;
    private String clase;
    private Integer salud;
    private Integer mana;

    //Constructor
    public Personaje(String nombre, String clase, int salud, int mana) {
        this.nombre = nombre;
        this.clase = clase;
        this.salud = salud;
        this.mana = mana;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public Integer getSalud() {
        return salud;
    }

    public void setSalud(Integer salud) {
        this.salud = salud;
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personaje{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase='").append(clase).append('\'');
        sb.append(", salud=").append(salud);
        sb.append(", mana=").append(mana);
        sb.append('}');
        return sb.toString();
    }

    public void quitarSalud(int vida){
        this.salud -= vida;
        if (this.salud < 0){
            this.salud = 0;
        }

    }

    public void revivir(){
        if (this.salud == 0){
            this.salud = 100;
        }
    }
}
