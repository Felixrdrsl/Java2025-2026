package tema4.ejemplos;

public class TestRegalo {
    public static void main(String[] args) {

        Regalo regalo1 = new Regalo("Iphone 17 pro", Categoria.Tecnologia, 1700.0);
        Regalo regalo2 = new Regalo("GTA 6", Categoria.Videojuegos, 120.50);

        System.out.println(regalo1);

        regalo1.setPrecio(1500.0);
        System.out.println(regalo1);

    }
}
