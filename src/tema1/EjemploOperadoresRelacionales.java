package tema1;

public class EjemploOperadoresRelacionales {
    public static void main(String[] args) {

        //Los operadores relacionales sirven para comparar (numericamente)
        //Los operadores relacionales devuelven True o false (boolean)
        int numero1 = 100;
        int numero2 = 66;
        int numero3 = 100;
        System.out.println("Resultado = " + (numero1 > numero2)); //Mayor
        System.out.println("Resultado = " + (numero1 == numero2)); //Igual
        System.out.println("Resultado = " + (numero1 == numero3)); //Igual
        System.out.println("Resultado = " + (numero1 != numero2)); //Distinto
        System.out.println("Resultado = " + (numero1 >= numero2)); //Mayor o igual
        System.out.println("Resultado = " + (numero1 <= numero2)); //Menor o igual

        

    }
}
