package tema2;

public class ejercicioBucles2ç {
    public static void main(String[] args) {

        //1. Lanza un dado(1-6) de forma aleatoria hasta que salga un 6
        // Cuenta el numero de veces que hubo que tirar el dado para que saliera 6

        //contador = 0
        // do {
        //      Lanzar el dado --> int n = (int) (math.random() * 6) + 1;
        //      Ver si es 6
        //      contador++ --> veces que se tira el dado
        // } while el dado no es 6

        int contador = 0;
        int tirada = 0;
        do {
            tirada = (int) (Math.random() * 6) + 1;
            System.out.println("Tirada: " + tirada);
            contador++;
        } while (tirada != 6);

        System.out.println("Se tiro el dado " + contador + " veces");

    }
}
