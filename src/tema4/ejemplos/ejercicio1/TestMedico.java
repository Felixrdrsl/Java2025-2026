package tema4.ejemplos.ejercicio1;

public class TestMedico {
    public static void main(String[] args) {

        Medico medico1 = new Medico("Jesus", Especialidad.OTORRINO, 30,
                "JesusDiez@gmail.com", 666080213);

        Medico medico2 = new Medico("Manuel", Especialidad.DIGESTIVO, 40,
                "ManuGonzalez@gmail.com", 679345093);

        medico1.baja();

        System.out.println(medico1);
        System.out.println(medico2);


    }
}
