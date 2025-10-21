package tema2;

public class BucleAcumulador2 {
    public static void main(String[] args) {

        //Numero elevado a otro numero, sin usar Math.pow

        //V.E: base, exponente
        //V.S: resultado

        int base = 2, exponente = 3; // 2 elevado a 3
        int resultado = 1; // 1 porque se multiplica

        for (int i = 1 ; i <= exponente ; i++){

            resultado = base * resultado;

        }
        System.out.println(resultado);


    }
}
