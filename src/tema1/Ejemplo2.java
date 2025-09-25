package tema1;

public class Ejemplo2 {
    public static void main(String[] args) {
        //Declara una variable de tipo double llamada precio
        //Asignale el valor 99.99
        //Pinta por pantalla el precio
        //Pinta por pantalla el precio con el IVA (21%)


        double Precio;
        Precio = 99.99;


        System.out.println(Precio);

        double Iva;
        Iva = Precio * 21 / 100;


        System.out.println(Iva);


        System.out.println(Precio - Iva);


    }
}
