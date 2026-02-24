package tema5.EjerciciosPOO.GranjaInteligente;

import java.util.ArrayList;

public class Granja {

    private String nombre;
    private String ubicacion;
    private Double totalHorasOperacion;
    private ArrayList<Maquina> maquinas;

    public Granja(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.totalHorasOperacion = 0.0;
        this.maquinas = new ArrayList<>();
    }

    public void addMaquina(Maquina m){
        maquinas.add(m);
    }
    public void calcularToralHoras(){
        totalHorasOperacion = 0.0;
        for (Maquina m : maquinas){
            totalHorasOperacion += m.getHorasUso();
        }
    }
    public void imprimirDatosGranja(){
        IO.println("Granja: " + nombre);
        IO.println("Ubicación: " + ubicacion);
        IO.println("Total horas: " + totalHorasOperacion);

        calcularToralHoras();
    }

    public void listarMaquinas(){
        for (Maquina m : maquinas) {
            IO.println(m);
        }
    }
    public Maquina buscarMaquinaPorId(Integer id) {
        for (Maquina m : maquinas) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }



}
