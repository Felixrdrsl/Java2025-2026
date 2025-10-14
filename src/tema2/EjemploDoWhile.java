package tema2;

public class EjemploDoWhile {
    public static void main(String[] args) {

        //DO-While: igual que el WHILE pero se ejecuta al menos una  vez el contador
        //Numeros de 1 al 10

        int contador = 1;
        do {
            System.out.println(contador);
            contador++;
        } while (contador <= 10);

        contador = 1;
        while (contador <=10){
            System.out.print(contador);
            contador++;
        }


    }
}
