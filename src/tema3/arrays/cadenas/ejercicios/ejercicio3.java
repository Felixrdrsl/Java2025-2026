package tema3.arrays.cadenas.ejercicios;

public class ejercicio3 {

    public static String mitadCadena(String cad){
        return cad.substring(0, cad.length()/2);
    }
    public static String mitadFinalCadena(String cad){
        return cad.substring(cad.length()/2);
    }

    /**
     * Escribe una cadena que te devuelva la primera mitad de ella usando un metodo
     * luego haz lo mismo con la otra mitad
     * @param args
     */


    public static void main(String[] args) {


        String cadena = "Esto es una cadena muy larga, te quedas con la mitad";
        System.out.println(mitadCadena(cadena));
        System.out.println(mitadFinalCadena(cadena));


    }
}
