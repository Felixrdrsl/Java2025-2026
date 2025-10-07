package tema2;

public class Ejemplo2 {
    public static void main(String[] args) {


        int edad = 5;

        if (edad < 4) {

            System.out.println("Eres en bebe");

        } else if (edad == 5) {
            System.out.println("Vas a primero de primaria");

        } else if (edad == 6) {
            System.out.println("Vas a segundo de primaria");

        } else if (edad == 7) {
            System.out.println("Vas a tercero de primaria");

        } else if (edad == 8) {
            System.out.println("Vas a cuarto de primaria");

        } else {
            System.out.println("No eres estudiante de primaria");

        }

        //Determinar si estas en infantil, primaria y otra cosa

        if (edad < 5) {
            System.out.println("Estas en infantil o guarderia");

        } else if (edad <= 8){ // Edad entre 5 y 8
            System.out.println("Estas en primaria");

        } else { // Edad mayor de 8 años
            System.out.println("Estas en otra cosa");
        }



    }
}
