package tema1;

public class EjercicioOperadoresLogicos {
    public static void main(String[] args) {

        final int numClasesAnio = 120;
        int numClasesAsiste = 101;
        int practicasEntregadas = 4;
        boolean autorizacionEspecial = false;

        //condicion para presentarse a examen final
        //ha asistido al menos el 80% de las clases y ha entregado mas de 3 practicas
        // o tiene una autorizacion especial para presentrarse

        //escribe la expresion logica, piensa el resultado, e imprimelo

        //Para saber cuantas clases son por lo menos el 80% -> 80 * 120 / 100 = 96 clases

        boolean resultado;

        resultado = ((numClasesAsiste >= 96) && (practicasEntregadas > 3)) || autorizacionEspecial;
        System.out.println("¿Puede presentarse al examen?: " + resultado);




    }
}
