package tema6.ExamenTema6.servicios;


public class AnimalNoEncontradoException extends Throwable {
    public AnimalNoEncontradoException(Long id) {
        super("NO se ha encontrado el animal con id =  " + id);
    }
}
