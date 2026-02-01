package tema5.juegoPractica1;

import java.security.PublicKey;

public class Monstruo {

    private String nombre;
    private ClaseMonstruo tipoMonstruo;
    private Integer nivel = 1;
    private Double salud = 100.0;
    private Integer puntosD;


    public Monstruo(String nombre, ClaseMonstruo tipoMonstruo, Integer puntosD) {
        this.nombre = nombre;
        this.tipoMonstruo = tipoMonstruo;
        this.puntosD = puntosD;
        this.nivel = 1;
        this.salud = 100.0;
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
        return salud;
    }

    public void setSalud(Double salud) {
        this.salud = salud;
    }

    public Integer getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(Integer puntosD) {
        this.puntosD = puntosD;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Monstruo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", tipoMonstruo=").append(tipoMonstruo);
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append(", puntosD=").append(puntosD);
        sb.append('}');
        return sb.toString();
    }

    public void subirNivel(){
        if (nivel < 10){
            nivel++;
            salud += Math.pow(2.0,nivel);
        }
    }
    public boolean reducirVida(double puntosD){
        salud -= puntosD;
        if (salud <= 0){
            salud = 0.0;
            return true;
        }
        return false;
    }
    public boolean golpear(Jugador jugador){
        return jugador.reducirVida(puntosD);
    }


}
