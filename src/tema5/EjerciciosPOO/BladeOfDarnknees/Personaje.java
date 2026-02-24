package tema5.EjerciciosPOO.BladeOfDarnknees;

public abstract class Personaje {

    protected String nombre;
    protected Double vida = 0.0;
    protected Integer nivel = 1;
    protected Double ataque = null;

    public Personaje(String nombre, Double vida, Integer nivel, Double ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Double getAtaque() {
        return ataque;
    }

    public void setAtaque(Double ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personaje{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", vida=").append(vida);
        sb.append(", nivel=").append(nivel);
        sb.append(", ataque=").append(ataque);
        sb.append('}');
        return sb.toString();
    }

    public void subirNivel(){
        nivel++;
        ataque += 2;
        vida += 10;
    }
    public boolean reducirVida(Double daño){
        vida -= daño;
        return false;
    }
    public boolean estaVivo(){
        boolean pvivo = true;
        if (vida < 0){
            return false;
        }
        return true;
    }
    public abstract Double golpear();
}
