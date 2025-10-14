package tema2;

public class EJemplo2 {
    public static void main(String[] args) {

        //Programa que me diga segun la nota si estas suspenso, aprobado, notable o sobresaliente

        int nota = 5;

        switch (nota) {
            case 1,2,3,4:
                System.out.println("Suspenso");break;
            case 5,6:
                System.out.println("Aprobado");break;
            case 7,8:
                System.out.println("notable");break;
            default: //Cualquier otro valor
                System.out.println("Nota fuera de rango");
        }





    }
}
