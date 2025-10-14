package tema2;

public class EjemploBucles {
    public static void main(String[] args) {

        int contador = 0;
        while ( contador <= 10){
            System.out.println(contador);
            contador++;
        }



        //saca un bluce los numemeros del -10 al 10

        int COntador = -10;
        while (COntador <= 10){
            System.out.println(COntador);
            COntador++;
        }


        int CONtador = 10;
        while (CONtador >=1){
            System.out.println(CONtador);
            CONtador--;
        }



        //Numeros impares del 1 al 100, pintalos seguidos separados por comas

        int NumerosImp = 1;
        while (NumerosImp <= 100){

            System.out.print(NumerosImp + ", ");
            NumerosImp+=2;
        }

        System.out.println("Final del programa");








    }
}
