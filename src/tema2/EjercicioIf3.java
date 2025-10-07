package tema2;

public class EjercicioIf3 {
    public static void main(String[] args) {

        //EJERCICIO PARA DETERMINAR SI TE DAN UNA BECA Y DE QUÉ TIPO
        //Requisitos generales (deben cumplirse los dos):
        //1. No tener más de dos asignaturas suspensas
        //2. Ingresos familiares inferiores a 2000€/mes
        //Si se cumplen te van a dar un tipo de beca
        //BECA COMPLETA: si se cumple alguna de estas condiciones
        //1. Ingresos inferiores a 800€/mes
        //2. Vives en zona vulnerable
        //3. Discapacidad superior al 60%
        //BECA PARCIAL: si se cumple alguna de estas condiciones
        //1. Ingresos inferiores a 1000€/mes y Familia numerosa
        //2. Ingresos inferiores a 1200€/mes
        //3. Ingresos inferiores a 1100€/mes y vives en zona vulnerable
        //4. Discapacidad entre el 40 y 60%
        //BECA SIMPLE: si se cumple alguna de estas condiciones
        //1. Ingresos familiares entre 1400€/mes y 1800€/mes
        //2. Discapacidad entre el 20 y 40%

        //V.E.: ingresosMensualesFamilia, asignaturasSuspensas, zonaVulnerable,
        //      discapacidad(0-100), familiaNumerosa
        //V.S.: si te dan beca o no, y en caso afirmativo qué tipo de beca


        int ingresosMensualesFamilia = 2000;
        int asginaturasSuspensas = 3;
        int discapacidad = 30;
        boolean zonaVulnerable = false;
        boolean familiaNumerosa = false;

        if (asginaturasSuspensas > 2 || ingresosMensualesFamilia > 2000){
            System.out.println("No se te concede ninguna beca");
        } else if (ingresosMensualesFamilia <= 800 || zonaVulnerable == true || discapacidad >= 60){
            System.out.println("Se te concedde la beca completa");
        } else if ( (ingresosMensualesFamilia <= 1000 && familiaNumerosa == true) || (ingresosMensualesFamilia <= 1200)
                || (ingresosMensualesFamilia < 1100 && zonaVulnerable == true) || (discapacidad > 60) ){
            System.out.println("Se te concede la beca parcial");
        } else if ( (ingresosMensualesFamilia >= 1400 && ingresosMensualesFamilia <= 1800) ||
                (discapacidad >= 20 && discapacidad <=40) ){
            System.out.println("Se te concede la beca simple");
        } else{
            System.out.println("No se te concede ninguna beca");

        }



    }
}
