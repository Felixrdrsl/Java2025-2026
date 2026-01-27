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
    }
    public void lanzarHechizo(String nombreHechizo,Prueba prueba ){
        //Consume energía y usa el hechizo si está en la lista. Si
        //el hechizo supera la prueba, devuelve un éxito. Si no, pierde energía adicional.

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

    }


}
