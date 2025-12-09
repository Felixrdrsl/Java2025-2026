package tema3.arrays.pruebaJueves4;

public class ejercicio3 {

    /**
     * Batalla Naval Simplificada
     * Crea un juego de batalla naval para consola en un tablero de 8x8. El programa debe realizar lo
     * siguiente:
     * Inicialización:
     * Crear un tablero de 8x8 (matriz de char ), inicialmente relleno de '~' (agua).
     * Colocar aleatoriamente:
     * 3 barcos pequeños de tamaño 2 (dos casillas consecutivas en horizontal o vertical)
     * Los barcos estarán representados con ' B '
     * No pueden superponerse ni salirse del tablero
     * Juego:
     * El jugador tiene 20 disparos para hundir todos los barcos
     * En cada turno, el jugador introduce dos coordenadas (fila y columna)
     * El programa responde:
     * “¡TOCADO!” si hay barco en la celda (marca con ' X ')
     * “Agua” si no hay barco (marca con ' O ')
     * “Ya disparaste ahí” si esa casilla ya ha sido jugada
     * Mostrar el tablero después de cada disparo (sin revelar los barcos no descubiertos)
     * Finalización:
     * Si se hunden todos los barcos: victoria
     * Si se agotan los 20 disparos: derrota
     * Requerimientos adicionales:
     * Crea un método void colocarBarco (char[][] tablero, int tamano) que coloque un barco
     * aleatorio de tamaño dado en el tablero.
     * Crea un método void mostrarTablero(char[][] tablero, boolean mostrarBarcos) que
     * muestre el tablero. Si mostrarBarcos es true , muestra los barcos con 'B'; si es false ,
     * muestra '~' en su lugar.
     * Crea un método boolean todosBarcosHundidos(char[][] tablero) que compruebe si
     * quedan barcos ('B') en el tablero.
     */


    public static void pintarTablero(char [][] m){
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j<m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        //Tablero
        char [][] tablero = new char[8][8];
        for (int i = 0; i < tablero.length; i++){
            for (int j = 0; j < tablero[i].length; j++){
                tablero[i][j] = '~';
            }
        }

        int barco1X = (int) (Math.random() * 8), barco1Y = (int) (Math.random() * 8);
        int barco2X = (int) (Math.random() * 8), barco2Y = (int) (Math.random() * 8);
        int barco3X = (int) (Math.random() * 8), barco3Y = (int) (Math.random() * 8);
        int direccion = (int) (Math.random() * 1);
        int vidas = 20;
        for (int i = 0; i < vidas; i++){


            try {
                if (direccion == 0) {
                    tablero[barco1X][barco1Y] = 'B';
                } else {
                    tablero[barco1X][barco1Y + 1] = 'B';
                }
            } catch (ArrayIndexOutOfBoundsException exception) {
                continue;

            }
            try {
                if (direccion == 0) {
                    tablero[barco2X][barco2Y] = 'B';
                } else {
                    tablero[barco2X][barco2Y + 1] = 'B';
                }
            } catch (ArrayIndexOutOfBoundsException exception) {
                continue;

            }
            try {
                if (direccion == 0) {
                    tablero[barco3X][barco3Y] = 'B';
                } else {
                    tablero[barco3X][barco3Y + 1] = 'B';
                }
            } catch (ArrayIndexOutOfBoundsException exception) {
                continue;

            }
            pintarTablero(tablero);
            System.out.println();

        };





    }



}
