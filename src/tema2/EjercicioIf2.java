package tema2;

public class EjercicioIf2 {
    public static void main(String[] args) {

        // Determinar si eres elegible para que te den un credito
        //1. Tienes mas de 5 años de antiguedad en el banco e ingresos mensuales de mas de 2500€
        //2. Tienes una antiguedad entre 2 y 5 años, ingresos de mas de 2000€ mensuales
        // y no tienes deudas pendientes
        //3. Tienes menos de 2 años de antiguedad, un ingreso de mas de 3000€ mensuales
        // y no tienes deudas pendientes

        //V.E.: antiguedad, ingresosMensuales, deudasPendientes
        //V.S.: decir si eres elegible para que te den un credito o no

        int antiguedad = 6;
        int ingresosMensuales = 2500;
        boolean deudasPendientes = true;

        if (antiguedad > 5 && ingresosMensuales >= 2500){
            System.out.println("Eres elegible para el credito");
        } else if ((antiguedad >=2 && antiguedad <=5) && (ingresosMensuales >= 2000) && (deudasPendientes == false)){
            System.out.println("Eres elegible para el credito");
        } else if (antiguedad < 2 && ingresosMensuales >= 3000 && deudasPendientes == false ){
            System.out.println("Eres elegible para el credito");
        } else {
            System.out.println("No se te concede el credito");
        }





    }
}
