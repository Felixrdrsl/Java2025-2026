package tema4.ejemplos;

public class Regalo {

    // Propiedades o atributos
    private String nombre;
    private Categoria Categoria;
    private double precio;

    // Constructor

    public Regalo(String nombre, Categoria categoria, Double precio) {
        this.nombre = nombre;
        this.Categoria = categoria;
        this.precio = precio;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return Categoria;
    }

    public double getPrecio() {
        return precio;
    }

    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCategoria(Categoria categoria) {
        Categoria = categoria;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Regalo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", Categoria=").append(Categoria);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }





}
