package tema5.metodosStatic;

public class TestVideojuego {
    public static void main(String[] args) {


        //Test:
        // 1. Crear 4 juegos
        // 2. Pintar los juegos
        // 3. Alquilar uno 3 veces (hay que devolverlo tras cada alquiler)
        // y pintar su precio de alquiler en cada alquiler
        // 4. Cambiar precio de alquiler a 6€
        // 5. Alquilar un juego 22 veces (hay que devolverlo tras cada alquiler)
        // y pintar su precio de alquiler en cada alquiler

        VideoJuego dota = new VideoJuego("Dota", "PC", VideoJuego.CategoriaVideojuego.MMO);
        VideoJuego lol = new VideoJuego("LoL", "PC", VideoJuego.CategoriaVideojuego.MMO);
        VideoJuego dotaPS5 = new VideoJuego(dota);
        dotaPS5.setPlataforma("PS5");

        System.out.println(dota);
        System.out.println(lol);
        System.out.println(dotaPS5);

        for(int i=0; i < 3; i++){
            dota.alquilar();
            dota.devolver();
        }
        System.out.println(dota.calcularPrecioAlquiler()); //5

        for(int i=0; i < 22; i++){
            dotaPS5.alquilar();
            dotaPS5.devolver();
        }
        System.out.println(dotaPS5.calcularPrecioAlquiler()); //6




    }

}
