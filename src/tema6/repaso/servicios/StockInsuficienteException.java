package tema6.repaso.servicios;

public class StockInsuficienteException extends RuntimeException {
    public StockInsuficienteException(String codigo) {
        super("Stock insuficiente para el producto " + codigo);
    }
}
