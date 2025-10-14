package tema1;

public class TareaMoodle {
    public static void main() {

        //1. Si A = 6, B = 2, C = 3, indicar el resultado final de las siguientes expresiones aritméticas:
        //a. (A * C) % C
        //b. A * B / C
        //c. C % B + C * B
        //d. A % ( A * B * C / (B + C) )
        //e. B * B + C – B * (A % B )

        int a = 6, b = 2, c = 3;
        double resultado;

        resultado = (a * c) % c;
        System.out.println(resultado);
        resultado = a * b / c;
        System.out.println(resultado);
        resultado = c % b + c * b;
        System.out.println(resultado);
        resultado = a % (a * b * c / (b + c));
        System.out.println(resultado);
        resultado = b * b + c - b * (a % b);
        System.out.println(resultado);


        //2. ¿Cuáles son los valores de a y b después de ejecutar las siguientes instrucciones?
        //a = 3;
        //b = 4;
        //c = 2 * a * b;
        //a = a + 2;
        //b = c – a;

        double A = 3, B = 4;
        double C;

        C = 2 * A * B;
        System.out.println(C);
        A = A + 2;
        System.out.println(A);
        B = C - A;
        System.out.println(B);

        //Expresar las siguientes expresiones como condiciones lógicas.
        //a. a es mayor que 2
        //b. b es menor o igual que 25 pero mayor que 5
        //c. c es mayor que 6 o igual a d
        //d. e es par menor que 50
        //e. f es mayor que a, b y c
        //f. g es igual a 3, 4 ó 5

        int A1 = 1, B1 = 2, C1 = 3, E1 = 4, F1 = 5, D1 = 6, G1= 7;
        boolean resultadof = true;

        resultadof = (A1 > 2);
        System.out.println(resultadof);
        resultadof = B1 <= 25 && B1 > 5;
        System.out.println(resultadof);
        resultadof = ((C1 > 6) || (C1 == D1));
        System.out.println(resultadof);
        resultadof = E1 < 50 && E1 % 2 == 0 ;
        System.out.println(resultadof);
        resultadof = F1 > A1 && F1 > B1 && F1 > C1;
        System.out.println(resultadof);
        resultadof = G1 == 3 || G1 == 4 ||  G1 == 5;
        System.out.println(resultadof);



        //Decir si son verdaderas o falsas las siguientes expresiones:
        //a. (3<=7) && (7<=7) --> verdadero
        //b. !((–8>1) && (3<=4)) --> Falso
        //c. “Hola” == “Hola ” --> verdadero
        //d. ((2<=5) && (3>=6)) || (2>–1) --> verdadero
        //e. ((2<=5) || (3>=6)) && (2>–1) --> verdadero


        //Cumplimenta la siguiente tabla:
        //¿Compilará y funcionará el siguiente código? En caso afirmativo, explica qué mostrará por pantalla.
        //En caso negativo, explica por qué no funciona.
        //int a=’a’;
        //System.out.println(a);
        // Funciona
        //int PI=3.14;
        //System.out.println(PI);
        // No funciona
        //double PI=3,14;
        //System.out.println(PI);
        // No funciona
        //boolean adivina=(1==4);
        //System.out.println(adivina);
        // Funciona
        //boolean adivina=(97==’a’==97);
        //System.out.println(adivina);
        // No funciona
        //boolean adivina=(97==’a’==true);
        //System.out.println(adivina);
        // No funciona


        //¿Qué muestra por pantalla el siguiente programa?

        System.out.println("Hola usuario."+" Bienvenido.");
        String dia = "Lunes";
        System.out.println("Hoy es " + dia);
        int hora = 12;
        System.out.println("Son las " + hora + " en punto.");
        System.out.println("Dentro de 2 horas serán las " + hora + 2 + " en punto");
        System.out.println("Dentro de 2 horas serán las " + (hora + 2) + " en punto");


        int n1 =50,n2 = 30;
        int suma;
        suma = n1 + n2;
        System.out.println("LA SUMA ES: " + suma);


        int N2=30, Suma, n3 = 0;
        Suma = n3+N2;
        System.out.println("LA SUMA ES: " + Suma);
        Suma = Suma +n3;
        System.out.println(Suma);


        int numero =2, cuad;
        cuad = numero * numero;
        System.out.println("EL CUADRADO DE "+numero+" ES: " + cuad);



        int num=5;
        num += num - 1 * 4 + 1;
        System.out.println(num);
        num=4;
        num %= 7 * num % 3 * 5;
        System.out.println(num);


        //Realiza un programa que calcule el área y el perímetro de un círculo de radio 3,6 metros.

        double radio = 3.6;
        double area = 3.14 * Math.pow(radio, 2);
        double perimetro = 2 * 3.14 * radio;

        System.out.println("Radio del círculo: " + radio + " metros");
        System.out.println("Área del círculo: " + area + " metros cuadrados");
        System.out.println("Perímetro del círculo: " + perimetro + " metros");

        //12. Realiza un programa en Java que, dadas dos variables a y b, intercambie los valores de a y b

        int A2 = 1, B2 = 2, C2 = A2;
        A2 = B2;
        B2 = C2;
        System.out.println("A es = " + A2);
        System.out.println("B es = " + B2);


        //13. Realiza un programa en Java con una variable entera t la cual contiene un tiempo en segundos y
        //queremos conocer este tiempo, pero expresado en horas, minutos y segundos.


        int t = 10000;

        int horas = t / 3600;
        int minutos = (t % 3600) / 60;
        int segundos = t % 60;

        System.out.println("Tiempo total: " + t + " segundos");
        System.out.println("Equivale a: " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos");


        // 14. Realiza un programa en Java que genere números de forma aleatoria simulando la tirada de un dado

        int NUmero = (int)(Math.random() * 5) + 1;
        System.out.println("Número aleatorio: " + NUmero);

        //15. Escriba un programa que escriba en la pantalla cuánto le dará su banco después de seis meses si pone
        //2000€ en una cuenta a plazo fijo al 2, 75% anual. Recuerde que al pagarle los intereses el banco le
        //retendrá el 18% para hacienda.

        double capital = 2000;
        double tasaAnual = 2.75 / 100;  // 2.75%
        double meses = 6;
        double tiempoEnAnios = meses / 12;

        // Cálculos
        double interesesBrutos = capital * tasaAnual * tiempoEnAnios;
        double retencion = interesesBrutos * 0.18;
        double interesesNetos = interesesBrutos - retencion;
        double totalFinal = capital + interesesNetos;

        // Mostrar resultados
        System.out.println("Capital inicial: " + capital + " euros");
        System.out.println("Intereses brutos: " + interesesBrutos + " euros");
        System.out.println("Retención Hacienda: " + retencion + " euros");
        System.out.println("Intereses netos: " + interesesNetos + " euros");
        System.out.println("Total después de 6 meses: " + totalFinal + " euros");


        //16. Escriba un programa para calcular el área y el volumen de un cilindro. Para ello declare una constante
        //que guarde el valor de Pi. Declare, también, variables para el diámetro y la altura del cilindro. Suponga
        //para el ejemplo que el cilindro tiene un diámetro de 15,5cm y una altura de 42,4cm

        final double PI = 3.1416;
        double diametro = 15.5;
        double altura = 42.4;

        double RAdio = diametro / 2;

        double Area = (2 * PI * RAdio * altura) + (2 * PI * RAdio * RAdio);
        double volumen = PI * RAdio * RAdio * altura;

        System.out.println("Área del cilindro: " + Area + " cm cuadrados");
        System.out.println("Volumen del cilindro: " + volumen + " cm cubicos");


        //17. Escriba expresiones que almacenen en variables lo siguiente:
        //a. Crear un número entero positivo aleatorio entre 1 y 49.
        //b. Generar un número aleatorio positivo par.
        //c. Generar un número real aleatorio entre 1 y 10.
        //d. Crear un número entero negativo entre -50 y -150.
        //e. Crear un número entero entre -100 y 100.
        //f. Generar un número aleatorio que sea uno de los siguientes: 5, 7, 33, 125 o 77
        //g. Crea un generador aleatorio de uno de los meses del año
        //Puedes usar la siguiente fórmula:
        //int n = (int) (Math.random() * (<número_máximo + 1> - <número_mínimo>)) + <numero_mínimo>;

        int a3 = (int)(Math.random() * (49 - 1 + 1)) + 1;
        System.out.println(a3);

        int b3 = ((int)(Math.random() * 25) + 1) * 2;
        System.out.println(b3);

        double c3 = (Math.random() * 10) + 1;
        System.out.println(c3);

        int d3 = (int)(Math.random() * (-50 - (-150) + 1)) + (-150);
        System.out.println(d3);

        int e3 = (int)(Math.random() * (100 - (-100) + 1)) + (-100);
        System.out.println(e3);

        int nn;
        nn = (int) (Math.random() * 5) + 1;
        System.out.println(n3);
        if (nn==1)
            System.out.println(5);
        if (nn==2)
            System.out.println(7);
        if (nn==3)
            System.out.println(33);
        if (nn==4)
            System.out.println(77);
        if (nn==5)
            System.out.println(125);
        System.out.println(nn);


        int g3 = (int)(Math.random() * 12) + 1;
        System.out.println(g3);



        //18. ¿Qué resultados se obtienen al realizar las operaciones siguientes? Si hay errores en la compilación,
        //corríjalos y dé una explicación de por qué suceden.
        //int a = 10, b = 3 , e = 1, d, e;
        //float x, y;
        //x= a / b;
        //c = a < b && c;
        //d = a + b++;
        //e = ++a – b;
        //y = (float)a / b;

        int a4 = 10, b4 = 3, e4 = 1, d4;
        boolean c4 = true;
        float x, y;

        x = a4 / b4;       // x = 3.0 (división entera)
        c4 = (a4 < b4) && c4; // c = false && true = false
        d4 = a4 + b4++;     // d = 10 + 3 = 13, b pasa a 4
        e4 = ++a4 - b4;     // a pasa a 11, e = 11 - 4 = 7
        y = (float)a4 / b4; // y = 11.0 / 4 = 2.75


        //19. Escriba el valor ASCII de la 'J' y de la 'j' sin consultar la tabla.

        System.out.println((int) 'J');
        System.out.println((int) 'j');

        //20. Escriba usando variables las siguientes expresiones:
        // 1.  5 * a * a * b * b * b + sqrt(a * a + b * b)
        // 2.  sqrt(4 * a * b * b) + (a + b) * (a + b)
        // 3.  (a * a * a * b) / (2 * a * b * b) - sqrt(12 * d * d * d *

        double a5 = 2.0;
        double b5 = 3.0;
        double d5 = 4.0;


        // 1.
        double expr1 = 5 * a5 * a5 * b5 * b5 * b5 + Math.sqrt(a * a5 + b5 * b5);

        // 2.
        double expr2 = Math.sqrt(4 * a5 * b5 * b5) + (a5 + b5) * (a5 + b5);

        // 3.
        double expr3 = (a5 * a5 * a5 * b5) / (2 * a5 * b5 * b5) - Math.sqrt(12 * d5 * d5 * d5 * d5);

        System.out.println("Expresión 1: " + expr1);
        System.out.println("Expresión 2: " + expr2);
        System.out.println("Expresión 3: " + expr3);




    }



}



