package tema7.PilaNumerica;

public class Pila {
    static void main() {

        PilaNumerica pila1 = new PilaNumerica();
        PilaNumerica pila2 = new PilaNumerica();

        pila1.apilar(1);
        pila1.apilar(2);
        pila1.apilar(3);
        pila1.apilar(4);
        pila1.apilar(5);
        IO.println(pila1);
        IO.println(pila1.suma());

        pila2.apilar(1.0);
        pila2.apilar(2.4);
        pila2.apilar(3.5);
        pila2.apilar(4.3);
        pila2.apilar(5.8);
        IO.println(pila2);
        pila2.desapilar();
        IO.println(pila2);
    }
}
