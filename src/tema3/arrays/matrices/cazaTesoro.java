package tema3.arrays.matrices;

import java.util.Scanner;

public class cazaTesoro {


    public static void pintarTablero(char [][] m){
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j<m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        /**
         * Escribe un programa en Java que simule un juego de la caza del tesoro. En
         * este juego, el tablero estará representado por una matriz 10x10 y el objetivo es
         * encontrar el tesoro escondido en una de las celdas del tablero. El jugador debe
         * ingresar coordenadas para intentar encontrar el tesoro.
         * Reglas del juego:
         * 1. El tablero tiene dimensiones de 10x10, inicialmente vacías ‘-’.
         * 2. Se coloca un tesoro en una casilla aleatoria del tablero.
         * 3. El jugador hará intentos para localizar el tesoro, dando la coordenada x y la
         * coordenada y donde cree que está el tesoro.
         * 4. El jugador tiene 15 intentos para encontrar el tesoro.
         * 5. Después de cada intento, el juego dará pistas:
         * • Si el jugador dispara a una casilla más cerca del tesoro (en términos
         * de distancia), se le da la pista "Estás más cerca del tesoro".
         * • Si el jugador dispara a una casilla más alejada, se le da la pista "Estás
         * más lejos del tesoro".
         * • Si la distancia es menor que la anterior, el jugador está más cerca. Si
         * es mayor, está más lejos.
         * • La distancia puede calcularse usando la distancia de Manhattan
         * que se calcula como la suma del valor absoluto de la resta de las
         * coordenadas x, más el valor absoluto de la resta de las coordenadas
         * y. Donde (x1,y1) es el punto donde está el tesoro, y (x2,y2) es el
         * punto donde tú pruebas.
         * Distancia = |x1-x2| + |y1-y2∣
         * 6. El jugador debe seguir intentando hasta encontrar el tesoro o agotar sus
         * intentos.
         * 7. Si el jugador encuentra el tesoro, el juego termina y se muestra un mensaje
         * de victoria. Si se quedan sin intentos, se muestra un mensaje de derrota.
         */

        //Tablero
        char [][] tablero = new char[10][10];
        int coordenadaX = (int) (Math.random() * 10), coordenadaY = (int) (Math.random() * 10);
        for (int i = 0; i < tablero.length; i++){
            for (int j = 0; j < tablero[i].length; j++){
                tablero[i][j] = '*';
            }
        }


        tablero[coordenadaX][coordenadaY] = 'T';
        pintarTablero(tablero);



        //Escribir por pantalla
        Scanner sc = new Scanner(System.in);
        int coordenadaX2 = 0, coordenadaY2 = 0;
        System.out.println("Tienes que decirme las coordenada 'X' 'Y': ");
        System.out.println("Tienes 15 intentos");
        int diferencia = 0;
        int distanciaAnterior = 20;
        int distancia = 0;
        int contador = 0;
        for (int i = 14; i >= 0; i--) {
            System.out.println("Dime la coordenada X: ");
            coordenadaX2 = Integer.parseInt(sc.nextLine());
            System.out.println("Dime la coordenada Y: ");
            coordenadaY2 = Integer.parseInt(sc.nextLine());
            tablero[coordenadaX2][coordenadaY2] = '-';

            if ((coordenadaX2 > 9) || (coordenadaY2 > 9)  || (coordenadaX2 < 0) || (coordenadaY2 < 0)){
                System.out.println("Coordenada incorrecta, vuelve a intentarlo");
                return;
            }
            if (tablero[coordenadaX2][coordenadaY2] > tablero[coordenadaX][coordenadaY] ) {
                System.out.println("La coordenada es mayor a la indicada " + i + " intentos restantes");
            } else if (tablero[coordenadaX2][coordenadaY2] < tablero[coordenadaX][coordenadaY]) {
                System.out.println("La coordenada es menor a la indicada " + i + " intentos restantes");
            } else if (tablero[coordenadaX2][coordenadaY2] == tablero[coordenadaX][coordenadaY]) {
                System.out.println("Has acertado el numero");
                System.out.println("Numero de intentos utilizados " + contador);
                return;
            }
            if (i == 0) {
                System.out.println("Has perdido lo siento");
                return;
            }
            distancia = (coordenadaX2-coordenadaX) + (coordenadaY2-coordenadaY);


            System.out.println(distancia);



            contador++;
            pintarTablero(tablero);

        }
        tablero[coordenadaX][coordenadaY] = 'T';
        pintarTablero(tablero);



    }
}
