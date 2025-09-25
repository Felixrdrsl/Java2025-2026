package tema1;

public class Ejerciciocasa {
    public static void main(String[] args) {

        //Me dicen la distancia a la Tierra de la estrella Próxima Centauri, 4.24 años luz
        //Tengo que mostrar la distancia en km y el tiempo en segundos que tardaría
        //una nave que pudiera viajar a una velocidad cercana a la velocidad de
        //la luz -> 298.000 km/s

        //Pista1 -> distancia en km, es pasar 4.24 años luz a kilómetros
        //Pista2 -> tiempo en segundos, una vez sé los km, y se la velocidad a la que voy
        //pues despejar los segundos
        // Pista3 -> velocidad de la luz 299.900 km/s


        //1. ANALIZAMOS EL EJERCICIO

        //Sabemos que un 1 año luz = 365 * 24 * 3600
        //También sabemos que la luz es 298.000km/s

        //2. Ponemos el dato (variable) de la distancia de la tierra a centauri
        //También calculamos lo que equivalen los años luz

        final double vLuz = 298000;
        double tiempoTC = 0.0;
        tiempoTC = 4.24;
        tiempoTC = (365 * 24 * 3600) * 4.24;// Esto da 1.3371264E8 en segundos
        System.out.println("TiempoTC en segundos es: " + tiempoTC);

        //3. Ahora debemos ver cuato tardaria en llegar si va a la velocidad de la luz
        //Entoces tenemos que crear otra variable del tiempo que tardaria

        double distanciaKM = 0.0;
        distanciaKM =  vLuz * tiempoTC;
        System.out.println("La distancia en km seria: " + distanciaKM);

        System.out.println("He calculado primero el tiempo que hay entre la Tierra y Centauri usando la formula" + " " + "((365 dias * 24h * 3600s) * 4.24). Despues he Multiplicado ese tiempo con la velocidad que va la nave," + " como la velocidad está en km/s la distancia me la da en km.");


    }

}
