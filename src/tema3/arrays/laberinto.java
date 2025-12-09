package tema3.arrays;

import java.util.Scanner;

public class laberinto {

    /**
     * 1. LABERINTO. En este ejercicio vamos a implementar un juego de un laberinto. Para ello nos
     * crearemos una matriz de 20 x 20 caracteres.
     * La matriz será un eje de coordenadas donde la esquina superior izquierda será el inicio del
     * laberinto y deberás llegar a la salida. Las casillas válidas irán de (0,0) a (19,19).
     * Antes de jugar debes hacer lo siguiente:
     * - Deberás rellenar la matriz inicialmente con el carácter “.”.
     * - Los bordes superior e inferior los vas a rellenar con el carácter “-“.
     * - Los bordes derecho e izquierdo los vas a rellenar con el carácter “|”.
     * - Generar la salida del laberinto aleatoriamente. La salida debe estar en un borde y no
     * debe coincidir con el inicio (0,0). Debes generar aleatoriamente esa casilla y marcarla
     * con el carácter “#”.
     * - Genera una bomba, será una casilla aleatoria del tablero interior, no de los bordes. Ahí
     * habrá una bomba oculta, solo se sabrá por sus coordenadas, si pasas por esa
     * coordenada sin saberlo explotará y perderás.
     * Jugar:
     * - El jugador aparece pintado con una “@” en la casilla (0,0).
     * - Implementa una función pintar que pinte el tablero tras cada movimiento.
     * - Te aparecerá un menú con cuatro opciones: 1 (derecha), 2 (izquierda), 3 (abajo), 4
     * (derecha).
     * - Deberás mover la “@” una posición según la tecla pulsada.
     * - Si te sales de la matriz moviéndote habrás perdido el juego y este finalizará. Esto es lo
     * más complicado del juego, pues dependiendo de dónde te encuentres un movimiento
     * concreto podrá hacerte salir del tablero y debes comprobar todas las opciones
     * posibles. Truco: si usas control de excepciones (IndexOutOfBoundException) no
     * tendrías que comprobar con un if, sino que si sale esa excepción es que he intentado
     * salir del tablero y el juego termina.
     * - Si consigues llegar al carácter marcado con “#” habrás ganado. Muestra un mensaje
     * indicándolo y también indica el número de pasos que has dado desde el inicio hasta
     * encontrar la salida.
     */



    public static void pintarTablero(char [][] m, int i, int j){
        i = 0;
        j = 0;

        for (i = 0; i < m.length; i++){
            for (j = 0; j<m[i].length; j++){
                if ((j == 0) || (j == 19)){
                    System.out.print("|" + " ");
                }else if (i == 0 || i == 19){
                    System.out.print("-" + " ");
                }else {
                    System.out.print("·" + " ");
                }

            }

            System.out.println();
        }


    }


    public static void pintarMenu() {
        System.out.println("Introduce opcion");
        System.out.println("1. Arriba");
        System.out.println("2. Abajo");
        System.out.println("3. Izquierda");
        System.out.println("4. Derecha");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Tablero
        char [][] tablero = new char[20][20];
        int nun = 0;
        int opcion = -1;
        int i=0;
        int j= 0;

        nun = (int) (Math.random() * 3) + 1;
        System.out.println(nun);
        switch (nun) {
            case 1:
                i = 0;
                j = (int) (Math.random() * 19) + 1;
                break;
            case 2:
                i = 19;
                j = (int) (Math.random() * 19) + 1;
                break;
            case 3:
                i = (int) (Math.random() * 19) + 1;
                j = 0;
                break;
            case 4:
                i = (int) (Math.random() * 19) + 1;
                j = 19;
                break;
        }

        tablero[i][j] = '@';



        pintarTablero(tablero,i,j);
        pintarMenu();





    }


}
