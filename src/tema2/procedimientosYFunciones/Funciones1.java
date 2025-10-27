package tema2.procedimientosYFunciones;

public class Funciones1 {
    public static double areaTriangulo(double a, double b){
        double resultado;
        resultado = (a * b) / 2;
        return resultado;
    }




    public static void main(String[] args) {

        //Crea una funcion que el area de un triangulo
        // Recibe dos parametros: el valor de la base y el de la altura
        //El programa debe funcionar con este main

        double area1, area2;

        area1 = areaTriangulo(3.0,8.1);
        area2 = areaTriangulo(8.5,5.4);

        System.out.println("El area es: " + area1);
        System.out.println("El area es: " + area2);
    }



}
