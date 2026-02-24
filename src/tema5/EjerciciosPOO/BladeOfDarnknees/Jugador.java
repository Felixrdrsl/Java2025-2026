package tema5.EjerciciosPOO.BladeOfDarnknees;


public class Jugador extends Personaje {

    //nombre
    //● clase (enum de MAGO, BRUJO, BARBARO, CABALLERO)
    //● nivel
    //● experiencia
    //● salud (inicialmente a 200)
    //● Arma armaDerecha
    //● Arma armaIzquierda

    private TipoPersonaje tipo;
    private Double experiencia;
    private Arma arma_Derecha;
    private Arma arma_Izquierda;
    private Integer enemigosEliminados = 0;

    public Jugador(String nombre, TipoPersonaje tipo) {
        super(nombre,200.0,1,null);
        this.tipo = tipo;
        this.experiencia = 0.0;
        this.arma_Derecha = null;
        this.arma_Izquierda = null;
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
        return vida;
    }

    public void setSalud(Double salud) {
        this.vida = salud;
    }

    public Double getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Double experiencia) {
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
        sb.append(", salud=").append(vida);
        sb.append(", Arma_Derecha=").append(arma_Derecha);
        sb.append(", Arma_Izquierda=").append(arma_Izquierda);
        sb.append('}');
        return sb.toString();
    }

    public void subirNivel(){
        if (nivel < 10 ){
            nivel++;
            vida += Math.pow(2.5, nivel);
        }
    }

    @Override
    public Double golpear() {
        return ataque;
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
        if (monstruo.getSalud() <= 0){
            experiencia += 10 * monstruo.getNivel();

            if (experiencia > 1000){
                experiencia = 1000.0;
            }
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
        vida += puntosS;
        if (vida > 10000.0){
            vida = 10000.0;
        }
    }


    public void incrementarEnemigos(){
        enemigosEliminados++;
    }
    public int enemigosEliminados(){
        return enemigosEliminados;
    }





}
