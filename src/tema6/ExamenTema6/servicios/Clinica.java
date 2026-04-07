package tema6.ExamenTema6.servicios;

import tema6.ExamenTema6.Entidades.Animal;
import tema6.ExamenTema6.Entidades.Consulta;
import tema6.ExamenTema6.Entidades.Propietario;
import tema6.ExamenTema6.Entidades.TipoConsulta;

import java.net.IDN;
import java.time.LocalDate;
import java.util.ArrayList;

public class Clinica {

    private String nombre;
    private ArrayList<Propietario> propietarios;
    private ArrayList<Animal> animales;
    private ArrayList<Consulta> consultas;

    public Clinica(String nombre) {
        this.nombre = nombre;
        this.propietarios = new ArrayList<>();
        this.animales = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }


    public void addPropietario(Propietario p){
        propietarios.add(p);
    }
    public void addAnimal(Animal a){
        animales.add(a);
    }
    public void listarAnimales(){
        IO.println("Animales Registrados");
        for (Animal animal: animales){
            IO.println(animal);
        }
    }

    /**
     * Lista las consultas hechas hoy
     */

    public void listarConsultasDeHoy(){
        for (Consulta c: consultas){
            IO.println(c);
        }
    }

    /**
     * con un for busca los propietarios por id y lo devuelve
     * @param dni
     * @return
     * @throws PropietarioNoEncontradoException
     */

    public Propietario buscarPropietarioPorDni(String dni) throws PropietarioNoEncontradoException {
        for (Propietario p: propietarios){
            if (p.getDni().equals(dni)) {
                IO.println(p);
                return p;
            }else throw new PropietarioNoEncontradoException(dni);
        }
        return null;
    }

    /**
     * hace lo mismo que el metodo Propietario pero con los animales
     * @param id
     * @return
     * @throws AnimalNoEncontradoException
     */
    public Animal buscarAnimalPorId(Long id) throws AnimalNoEncontradoException {
        for (Animal a: this.animales){
            if (a.getId().equals(id)){
                return a;
            }else throw new AnimalNoEncontradoException(id);
        }
        return null;
    }

    /**
     * Registra al animal en el ArrayList de consultas
     * @param idAnimal
     * @param veterinario
     * @param fecha
     * @param tipo
     * @param diagnostico
     * @param tratamiento
     * @return
     * @throws AnimalNoEncontradoException
     */

    public Boolean registrarConsulta(Long idAnimal, String veterinario, LocalDate fecha,
                                     TipoConsulta tipo, String diagnostico, String tratamiento) throws AnimalNoEncontradoException {
        boolean seAñade = false;
        //buscarAnimalPorId(idAnimal);
       // Consulta con1 = new Consulta(id,  veterinario,  fecha,
                // tipo,  diagnostico,  tratamiento);
        //consultas.add(con1);

        //no se hacerlo porque me estoy liando

        return seAñade;
    }


    /**
     * BUsca las consultas del animal y las pinta
     * @param idAnimal
     * @return
     */

    public ArrayList<Consulta> buscarConsultasPorAnimal(Long idAnimal){
        IO.println("Consultas de un animal");
        for (Consulta c : this.consultas){
            IO.println(idAnimal);
            IO.println(c);
        }
        return consultas;
    }


    /**
     * BUsca la consulta dependiendo del tipo que sea
     * @param tipo
     * @return
     */
    public ArrayList<Consulta> buscarConsultasPorTipo(TipoConsulta tipo){
        IO.println("Tipo de consulta " + tipo);
        for (Consulta c : this.consultas){
            IO.println(c.getTipo());
        }
        return consultas;
    }

    /**
     * calcula los ingresos totales
     * @return
     */


    public double calcularIngresosTotales(){
        IO.println("Ingresos totales");
        double precioTotal = 0.0;
        for (Consulta c: this.consultas){
            precioTotal += c.getPrecioTotal();
        }
        return precioTotal;
    }







}
