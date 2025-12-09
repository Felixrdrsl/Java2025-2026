package tema3.arrays.cadenas.ejercicios;

public class ejercicio12 {
    public static void main(String[] args) {

        //Encontrar la palabra de mayor longitud de este texto:
        // "No se me ocurre ninguna frase larga".

        String cadena = new String("No se me ocurre ninguna frase larga");
        String[] trocitos = cadena.split("\\ ");
        int longitudM = trocitos[0].length();
        int posicion = 0;
        for(int i=0; i < trocitos.length; i++) {
            System.out.println(trocitos[i]);
            if (trocitos[i].length() > longitudM){
                longitudM= trocitos[i].length();
                posicion = i;
            }
        }
        System.out.println(trocitos[posicion]);
        System.out.println(longitudM);




    }
}
