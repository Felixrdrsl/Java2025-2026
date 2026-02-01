package tema5.juegoPractica1;

import tema5.juegoMagoPractica1.Mago;

import javax.swing.*;

public class Jugador {

    //nombre
    //● clase (enum de MAGO, BRUJO, BARBARO, CABALLERO)
    //● nivel
    //● experiencia
    //● salud (inicialmente a 200)
    //● Arma armaDerecha
    //● Arma armaIzquierda

    private String nombre;
    private TipoPersonaje tipo;
    private Integer nivel;
    private Integer experiencia;
    private Double salud;
    private Arma arma_Derecha;
    private Arma arma_Izquierda;

    public Jugador(String nombre, TipoPersonaje tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = 1;
        this.salud = 200.0;
        this.experiencia = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoPersonaje getTipo() {
        return tipo;
    }

    public void setTipo(TipoPersonaje tipo) {
        this.tipo = tipo;
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

    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public Arma getArma_Derecha() {
        return arma_Derecha;
    }

    public void setArma_Derecha(Arma arma_Derecha) {
        arma_Derecha = arma_Derecha;
    }

    public Arma getArma_Izquierda() {
        return arma_Izquierda;
    }

    public void setArma_Izquierda(Arma arma_Izquierda) {
        arma_Izquierda = arma_Izquierda;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", tipo=").append(tipo);
        sb.append(", nivel=").append(nivel);
        sb.append(", experiencia=").append(experiencia);
        sb.append(", salud=").append(salud);
        sb.append(", Arma_Derecha=").append(arma_Derecha);
        sb.append(", Arma_Izquierda=").append(arma_Izquierda);
        sb.append('}');
        return sb.toString();
    }

    public void subirNivel(){
        if (nivel < 10 ){
            nivel++;
            salud += Math.pow(2.5, nivel);
        }
    }
    public boolean equiparArma(Arma arma){
        if (arma.getDosManos()){
            if (arma_Derecha == null && arma_Izquierda == null){
                arma_Derecha = arma;
                arma_Izquierda = arma;
                return true;
            }
        }
        if (arma_Derecha == null){
            arma_Derecha = arma;
            return true;
        }
        if (arma_Izquierda == null){
            arma_Izquierda = arma;
            return true;
        }
        return false;
    }
    public void tomarPocion(int puntosS){
        salud += puntosS;
        if (salud > 10000.0){
            salud = 10000.0;
        }
    }
    public boolean reducirVida(int puntosD){
        salud -= puntosD;
        if (salud < 0.0){
            salud = 0.0;
            return true; //Si devuelve true es que está muerto
        }
        return false;
    }
    public void golpearMonstruo(Monstruo monstruo){
        if (this.getArma_Derecha() != null) {
            monstruo.reducirVida(this.getArma_Derecha().getPuntosD());
            if (!this.getArma_Derecha().getDosManos()) {
                if (this.getArma_Izquierda() != null) {
                    monstruo.reducirVida(this.getArma_Izquierda().getPuntosD());
                }
            }
        }
        //Comprobar si has mata al monstruo

        if (monstruo.getSalud() <= 0){
            experiencia += 10 * monstruo.getNivel();

            if (experiencia > 1000){
                experiencia = 1000;
            }
        }

    }




}
