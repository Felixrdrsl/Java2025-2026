package tema4.ejemplos.ejercicio1;

public class Medico {

    /**
     * Crear clase Medico
     * Propiedades:
     * - nombre
     * - especialidad (enum Especialidad ->
     *     GENERAL, DIGESTIVO, OTORRINO, CARDIOLOGIA, NEUROLOGIA, TRAUMATOLOGIA)
     * - edad
     * - email
     * - telefono
     * - estado (enum Estado -> ACTIVO, INACTIVO)
     *
     * Constructor con todo menos 'estado'. El estado por defecto es ACTIVO.
     * Getters de todo
     * Setters de todo menos 'estado'
     * ToString
     * Metodos propios:
     * - baja() -> pone el estado en INACTIVO
     * - alta() -> pone el estado en ACTIVO
     *
     * En un main crea dos médicos, pon uno de baja y pinta los dos
     */


    private String nombre;
    private Especialidad especialidad;
    private int edad;
    private String gmail;
    private int telefono;
    private Estado estado;


    // Constructor
    public Medico(String nombre, Especialidad especialidad, int edad, String gmail, int telefono) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.edad = edad;
        this.gmail = gmail;
        this.telefono = telefono;
        this.estado = Estado.Activo;
    }


    //Getters
    public String getNombre() {
        return nombre;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public int getEdad() {
        return edad;
    }

    public String getGmail() {
        return gmail;
    }

    public int getTelefono() {
        return telefono;
    }

    public Estado getEstado() {
        return estado;
    }


    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    //String Buffer
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Medico{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", especialidad=").append(especialidad);
        sb.append(", edad=").append(edad);
        sb.append(", gmail='").append(gmail).append('\'');
        sb.append(", telefono=").append(telefono);
        sb.append(", estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }

    public void alta(){
        this.estado = Estado.Activo;

    }
    public void baja(){
        this.estado = Estado.Inactivo;

    }

}
