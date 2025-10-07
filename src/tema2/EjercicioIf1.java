package tema2;

public class EjercicioIf1 {

    public static void main(String[] args) {

        int edad;
        char sexo = 'h'; // 'h', 'm'
        boolean amigoJefe = false;


        //Puedes entrar a la discoteca si tienes 18 años o mas
        //Puedes entrar si tienes mas de dieciseis y eres mujer (no deberia)
        //Puedes entrar si tienes mas de dieciseis y hombre y amigo del jefe
        //No puedes entrar en otro caso

        edad = 16;

        if (amigoJefe) {
            System.out.println("Puedes entrar");
        } else if (edad >= 18) {
            System.out.println("Puedes entrar");
        } else if ((edad >= 16) && (sexo == 'm')) {
            System.out.println("Puedes entrar");
        } else if ((edad > 16) && (sexo == 'h') && (amigoJefe)) {
            System.out.println("Puedes entrar");
        } else {
            System.out.println("No puedes entrar");


        }
    }
}