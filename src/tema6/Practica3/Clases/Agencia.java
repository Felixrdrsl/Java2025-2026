package tema6.Practica3.Clases;

import tema6.Practica3.Enums.TipoCoche;

import java.time.LocalDate;
import java.util.ArrayList;

public class Agencia {

    private ArrayList<Coche> coches;
    private ArrayList<Alquiler> alquileres;

    public Agencia() {
        this.coches = new ArrayList<>();
        this.alquileres = new ArrayList<>();
    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public void setCoches(ArrayList<Coche> coches) {
        this.coches = coches;
    }

    public ArrayList<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(ArrayList<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }

    public void addCoche(Coche c) {
        coches.add(c);
    }
    public void removeCoche(Coche c) {
        coches.remove(c);
    }



    public void listarCochesDisponibles() {
        System.out.println("Coches disponibles:");
        for (Coche c : coches) {
            if (c.disponible) {
                System.out.println(c);
            }
        }
    }



    public void listarAlquileresActivos() {
        LocalDate hoy = LocalDate.now();
        System.out.println("Alquileres activos:");
        for (Alquiler a : alquileres) {
            if (a.getFechaFin().isAfter(hoy)) {
                System.out.println(a);
            }
        }
    }



    public Coche buscarCocheDisponible(TipoCoche tipo) throws NoHayCochesDisponiblesException {
        for (Coche c : coches) {
            if (c.disponible && c.getTipo() == tipo) {
                return c;
            }
        }
        throw new NoHayCochesDisponiblesException();
    }

    public boolean realizarAlquiler(Cliente cliente, TipoCoche tipo,
                                    LocalDate fechaInicio, LocalDate fechaFin) {
        try {

            Coche coche = buscarCocheDisponible(tipo);
            Alquiler nuevoAlquiler = new Alquiler(cliente, coche, fechaInicio, fechaFin, coche.precioBase);
            coche.setDisponible(false);
            alquileres.add(nuevoAlquiler);

            return true;
        } catch (NoHayCochesDisponiblesException e) {
            // No hay coches disponibles → devolver false
            return false;
        }
    }



}
