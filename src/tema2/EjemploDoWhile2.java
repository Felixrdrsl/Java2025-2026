package tema2;

public class EjemploDoWhile2 {
    public static void main(String[] args) {


        int contador = 1;
        do {
            System.out.println(contador++);
        }while (contador <=10);

        contador = 10;
        do {
            System.out.print(contador-- + ", "); // primero pinta luego resta
        }while (contador>=1);

        contador = 10;
        do {
            System.out.println(--contador + ", "); // primero resta luego pinta
        } while (contador >= 1);

    }
}
