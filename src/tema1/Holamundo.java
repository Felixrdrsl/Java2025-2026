package tema1;

public class Holamundo {
    public static void main(String[] args) {

        //String -> tipo de dato cadena
        //miNombre -> nombre de la variable
        //"Felix" -> valor que le doy a la variable
        //= -> operador de la asignacion, el valor que hay en el lado derecho
        //lo graba en la variable del lado izquierdo

        String miNombre = "Felix";
        miNombre = "Jesus";

        System.out.println(miNombre);

        int edad = 18 ;
        System.out.println(edad);

        System.out.println(edad + 5);


        edad = edad + 5;
        System.out.println(edad);
        //ahora hay que imprimir el nombre y la edad
        //"Felix tiene 21 años"
        //miNombre + " tiene " + edad + " años "
        System.out.println(miNombre + " tiene " + edad + " años ");


    }
}

