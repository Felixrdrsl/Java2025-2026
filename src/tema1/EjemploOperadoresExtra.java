package tema1;

public class EjemploOperadoresExtra {
    public static void main(String[] args) {

        long numero = 6;

        //num++ --> primero evalua num, y al final de la operacion le suma 1
        //++num --> primero le suma uno, y luego evalua el valor

        System.out.println(numero++);//pinta 6, luego suma 1
        System.out.println(numero); //pinta 7

        System.out.println(++numero); //pinta 8, primero sumo y luego pinto
        System.out.println(numero); // pinta 8

        int turno = 14;

        turno++; // turno = turno + 1 --> turno += 1

        System.out.println(turno);

        //ejemplo de aplicacion

        while (turno > 0) {
            System.out.println(turno);
            turno--;
        }




    }
}
