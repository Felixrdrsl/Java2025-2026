package tema3.arrays.cadenas.ejercicios;

public class ejercicio14 {


    public static String encriptar(String frase, int clave){
        StringBuffer sb =new StringBuffer();
        for (int i = 0; i < frase.length(); i++){
            char c = frase.charAt(i);
            int codigo =c;         // Convertir a ASCII
            codigo += clave;       // Sumar clave
            sb.append((char) codigo);
        }
        return sb.toString();
    }
    public static String desencriptar(String frase, int clave){
        StringBuffer sb =new StringBuffer();
        for (int i = 0; i < frase.length(); i++){
            char C = frase.charAt(i);
            int codigo =C;         // Convertir a ASCII
            codigo -= clave;       // Sumar clave
            sb.append((char) codigo);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        //Cifrado César. Crea un algoritmo de encriptación que reciba una frase y una clave numérica.
        //Sumará en código ASCII esa clave a cada letra de la frase. Implementa también una función
        //para desencriptar

        //Esto es un secreto, el examen va a ser complicado
        //clave 3

        String contrasena = "Esto es un secreto, el examen va a ser complicado";
        int clave = 3;
        String encriptado= "";

        String cifrar = encriptar(contrasena,clave);
        System.out.println(cifrar);
        String descifrar = desencriptar(cifrar,clave);
        System.out.println(descifrar);



    }
}
