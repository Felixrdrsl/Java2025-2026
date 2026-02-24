package tema5.EjerciciosPOO.BladeOfDarnknees;

public class Monstruo extends Personaje {

    private ClaseMonstruo tipoMonstruo;
    private Double puntosD;


    public Monstruo(String nombre, ClaseMonstruo tipoMonstruo) {
        super(nombre,null,null,null);
        this.tipoMonstruo = tipoMonstruo;
        this.puntosD = puntosD;
        this.nivel = 1;
        this.vida = 100.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ClaseMonstruo getTipoMonstruo() {
        return tipoMonstruo;
    }

    public void setTipoMonstruo(ClaseMonstruo tipoMonstruo) {
        this.tipoMonstruo = tipoMonstruo;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Double getSalud() {
        return vida;
    }

    public void setSalud(Double salud) {
        this.vida = salud;
    }

    public Double getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(Double puntosD) {
        this.puntosD = puntosD;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Monstruo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", tipoMonstruo=").append(tipoMonstruo);
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(vida);
        sb.append(", puntosD=").append(puntosD);
        sb.append('}');
        return sb.toString();
    }

    public void subirNivel(){
        if (nivel < 10){
            nivel++;
            vida += Math.pow(2.0,nivel);
        }
    }

    @Override
    public Double golpear() {
        return puntosD;
    }

    public boolean golpear(Jugador jugador){
        return jugador.reducirVida(puntosD);
    }


}
