package tema5.juegoPractica1;

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
    private Integer salud;
    private Arma Arma_Derecha;
    private Arma Arma_Izquierda;

    public Jugador(String nombre, TipoPersonaje tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = 1;
        this.salud = 200;
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

    public Integer getSalud() {
        return salud;
    }

    public void setSalud(Integer salud) {
        this.salud = salud;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public Arma getArma_Derecha() {
        return Arma_Derecha;
    }

    public void setArma_Derecha(Arma arma_Derecha) {
        Arma_Derecha = arma_Derecha;
    }

    public Arma getArma_Izquierda() {
        return Arma_Izquierda;
    }

    public void setArma_Izquierda(Arma arma_Izquierda) {
        Arma_Izquierda = arma_Izquierda;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", tipo=").append(tipo);
        sb.append(", nivel=").append(nivel);
        sb.append(", experiencia=").append(experiencia);
        sb.append(", salud=").append(salud);
        sb.append(", Arma_Derecha=").append(Arma_Derecha);
        sb.append(", Arma_Izquierda=").append(Arma_Izquierda);
        sb.append('}');
        return sb.toString();
    }
}
