package tema5.juegoMagoPractica1;

import javax.management.NotCompliantMBeanException;
import java.util.ArrayList;
import java.util.List;

public class Mago {

    private String nombre;
    private Integer energia;
    private List<Hechizo> hechizos;

    public Mago(String nombre, Integer energia) {
        this.nombre = nombre;
        this.energia = energia;
        this.hechizos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEnergia() {
        return energia;
    }

    public List<Hechizo> getHechizos() {
        return hechizos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    public void setHechizos(List<Hechizo> hechizos) {
        this.hechizos = hechizos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Mago{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", energia=").append(energia);
        sb.append(", hechizos=").append(hechizos);
        sb.append('}');
        return sb.toString();
    }
    public void aprenderHechizo(Hechizo hechizo){

        this.hechizos.add(hechizo);
        IO.println("Has aprendido el hechizo: " + hechizo.getNombre());
    }
    public void lanzarHechizo(String nombreHechizo,Prueba prueba ){
        Hechizo hechizo = null;
        for (Hechizo hechizo1: hechizos){
            if (hechizo1.getNombre().equalsIgnoreCase(nombreHechizo)){
                hechizo = hechizo1; break;
            }
        }
        if (hechizo == null){
            IO.println("El hechizo " + nombreHechizo + " no lo has aprendido");
            return;
        }
        if (energia < hechizo.getEnergiaNecesaria()){
            IO.println("No tienes la energia necesaria");
            return;
        }

        //Echale un vistazo a esto porque me sale a veces negativo y no se si es por el orden
        //o porque he hecho yo otra cosa mal
        energia -= hechizo.getEnergiaNecesaria();
        IO.println("Lanzar " + nombreHechizo + " Energia restante: " + energia);

        if (hechizo.esEfectivo(prueba)){
            energia += prueba.getRecompensa();
            IO.println("Has superado la prueba " + prueba.getRecompensa() + " de energia ganada");
        } else {
            energia -= prueba.getNivelDificultad();
            IO.println("No has superado la prueba, necesitas un hechizo de mayor potencia: Nivel minimo de potencia = "
                    + prueba.getNivelDificultad());
            IO.println("Niveles de los hechizos aprendidos = " + getHechizos());
        }
        if (energia <= 0) {
            IO.println("Te has quedado sin energía");
        }
    }
    public Hechizo buscar(String nombreHechizo){
        for (Hechizo hechizo: hechizos){
            if (hechizo.getNombre().equalsIgnoreCase(nombreHechizo)){
                return hechizo;
            }
        }
        return null;
    }

    public void recargarEnergia(int cantidad){
        this.energia = Math.min(energia + cantidad, 100);
        IO.println("Energia: " + energia);
    }




}
