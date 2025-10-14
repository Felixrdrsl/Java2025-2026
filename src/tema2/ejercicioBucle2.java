package tema2;

public class ejercicioBucle2 {
    public static void main(String[] args) {

        //Lanza dos dados (1-6) mientras sean diferentes
        //cuentas las veces que has tenido que tirar los dados

        int contador = 0;
        int dado1 = 0;
        int dado2 = 0;
        int tiradas = 0;

        do {
            dado1 = (int) (Math.random() * 20) + 1;
            System.out.println("dado 1: " + dado1);
            contador++;

            dado2 = (int) (Math.random() * 20) + 1;
            System.out.println("dado 2: " + dado2);
            contador++;

        } while ( dado1 != dado2);
        System.out.println("Se tiraron los dados " + contador + " veces");





    }
}
