package tema6.ExamenTema6.servicios;

public class PropietarioNoEncontradoException extends Throwable {
    public PropietarioNoEncontradoException(String dni) {
        super("NO se ha encontrado el Dni =  " + dni);
    }
}
