package tema1;

public class EjemploOperadoresLogicos2 {
    public static void main(String[] args) {

        double precio1 = 9.99, precio2 = 8.99, descuento = 1.0;
        boolean resultado;


        //1. El precio 1 sea >= 9 && descuento >= 1
        resultado = (precio1 >= 9 && descuento >= 1);
        System.out.println(resultado);

        //2. precio1 >= 10 o precio2 <= 10
        resultado = (precio1 >= 10 || precio2 <= 10);
        System.out.println(resultado);

        //3. (precio1 >= 9 Y precio2 >= 5 Y descuento <0.5)
        resultado = ! (precio1 >= 9 && precio2 >= 5 && descuento > 0.5);
        System.out.println(resultado);

        //4. (!(precio1 >= precio2)) o (precio2 < 9)
        resultado = (!(precio1 >= precio2) || (precio2 < 9));
        System.out.println(resultado);

        //5. (precio1 <= precio2) || (descuento > 1) && (precio2 < 10)
        resultado = ((precio1 <= precio2) || (descuento > 1)) && (precio2 < 10);
        System.out.println(resultado);




    }
}
