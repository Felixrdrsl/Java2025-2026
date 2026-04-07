package tema7Streams.partidasEfootball;

import java.time.LocalDateTime;

public class Partida {

    private int id;
    private String jugador;
    private String rival;
    private String modoJuego;      // "PvP", "IA", "Evento", "Liga"
    private String equipoLocal;
    private int golesLocal;
    private int golesVisitante;
    private String duracion;       // "12min", "20min", "30min"
    private LocalDateTime fecha;
    private int estrellasGanadas;


    public Partida(int id, String jugador, String rival, String modoJuego,
                   String equipoLocal, int golesLocal, int golesVisitante, String duracion,
                   LocalDateTime fecha, int estrellasGanadas) {
        this.id = id;
        this.jugador = jugador;
        this.rival = rival;
        this.modoJuego = modoJuego;
        this.equipoLocal = equipoLocal;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.duracion = duracion;
        this.fecha = fecha;
        this.estrellasGanadas = estrellasGanadas;
    }

    public int getId() {
        return id;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public String getRival() {
        return rival;
    }

    public void setRival(String rival) {
        this.rival = rival;
    }

    public String getModoJuego() {
        return modoJuego;
    }

    public void setModoJuego(String modoJuego) {
        this.modoJuego = modoJuego;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getEstrellasGanadas() {
        return estrellasGanadas;
    }

    public void setEstrellasGanadas(int estrellasGanadas) {
        this.estrellasGanadas = estrellasGanadas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Partida{");
        sb.append("id=").append(id);
        sb.append(", jugador='").append(jugador).append('\'');
        sb.append(", rival='").append(rival).append('\'');
        sb.append(", modoJuego='").append(modoJuego).append('\'');
        sb.append(", equipoLocal='").append(equipoLocal).append('\'');
        sb.append(", golesLocal=").append(golesLocal);
        sb.append(", golesVisitante=").append(golesVisitante);
        sb.append(", duracion='").append(duracion).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", estrellasGanadas=").append(estrellasGanadas);
        sb.append('}');
        return sb.toString();
    }
}
