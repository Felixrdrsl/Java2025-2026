package tema5.ejercicioSpotify;

public class Test {
    public static void main(String[] args) {

        //1. Crea una lista de Spotify de 10 canciones
        //2. Píntala
        //3. Recorre la lista con un for y pinta cada canción su título y autor solo
        //4. Pide por teclado un título y un autor
        //5. Elimina la canción de la lista con ese título y ese autor

        ListaSpotify List = new ListaSpotify("Lista de Spotify");
        cancion c = new cancion("si","si",2);

        cancion c1 = new cancion(c);
        cancion c2 = new cancion(c);
        cancion c3 = new cancion(c);
        cancion c4 = new cancion(c);
        cancion c5 = new cancion(c);
        cancion c6 = new cancion(c);
        cancion c7 = new cancion(c);
        cancion c8 = new cancion(c);
        cancion c9 = new cancion(c);


        List.addCancion(c);
        List.addCancion(c1);
        List.addCancion(c2);
        List.addCancion(c3);
        List.addCancion(c4);
        List.addCancion(c5);
        List.addCancion(c6);
        List.addCancion(c7);
        List.addCancion(c8);
        List.addCancion(c9);

        System.out.println(List);







    }
}
