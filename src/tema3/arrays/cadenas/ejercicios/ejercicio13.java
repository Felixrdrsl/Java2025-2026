package tema3.arrays.cadenas.ejercicios;

public class ejercicio13 {


    public static void main(String[] args) {

        //Crear una cadena de texto formada por tres cadenas "una", "dos" y "tres" usando
        //StringBuilder. Añade separadores entre ellas y muestra la cadena resultante

        StringBuilder sb = new StringBuilder("una");
        sb.append(" / ");
        sb.append("dos");
        sb.append(" / ");
        sb.append("tres");
        System.out.println(sb);


    }

}
