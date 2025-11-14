import java.util.Scanner;

public class Ejercicio {

    Scanner scanner = new Scanner(System.in);

    public void ejercicio1() {
        //Objetivo: Crear un programa que convierta una calificación numérica (0-10) en su equivalente alfabético usando un switch.
        System.out.println("Ingresa la nota del examen para evaluarla");
        double number;
        number = scanner.nextDouble();

        switch (convertNum(number)) {
            case 0 -> System.out.println("F");
            case 1 -> System.out.println("D");
            case 2 -> System.out.println("C");
            case 3 -> System.out.println("B");
            case 4 -> System.out.println("A");
            default -> System.out.println("Numero fuera de rango");
        }
    }

    public void ejercicio2() {
        //Objetivo: Crear un programa que convierta una cantidad en euros a otras monedas según la opción seleccionada.
        enum moneda {DOLAR, LIBRA, YEN, PESO}
        ;
        double userValue;
        int userOption;

        System.out.println("Programa para intercambiar euro a otra moneda:\n¿Cúantos € quieres convertir?");
        userValue = scanner.nextDouble();
        System.out.printf("Elige a que moneda lo quieres pasar\n0. %s\n1. %s\n2. %s\n3. %s\n", moneda.DOLAR, moneda.LIBRA, moneda.YEN, moneda.PESO);
        userOption = scanner.nextInt();

        switch (userOption) {
            case 0 -> System.out.println((userValue * 1.16) + " dólares");
            case 1 -> System.out.println((userValue * 0.88) + " libras");
            case 2 -> System.out.println((userValue * 179) + " yenes");
            case 3 -> System.out.printf("%.2f pesos", (userValue * 21.26));
        }
    }

    public void ejercicio3() {
        //**Objetivo:** Crear un programa que clasifique la temperatura en categorías usando rangos.
        int userTemp = 23;
        switch (convertTempNumb(userTemp)) {
            case 0 -> System.out.println("Helado");
            case 1 -> System.out.println("Frio");
            case 2 -> System.out.println("Templado");
            case 3 -> System.out.println("Calor");
            case 4 -> System.out.println("Muy caliente");
        }

    }

    public void ejercicio4() {
        //Objetivo: Simular un sistema de pedidos de restaurante con diferentes categorías.
        enum categoriaPlato {Entrada, Principal, postre, bebida}
        ;
        enum platos {jamon, queso, anchoas, macarrones, arroz, fideos, helado, flan, tarta, cerveza, fanta, agua}

        switch (categoriaPlato.Principal) {
            case Entrada -> System.out.printf("%s %s %s", platos.jamon, platos.queso, platos.anchoas);
            case Principal -> System.out.printf("%s %s %s", platos.macarrones, platos.arroz, platos.fideos);
            case postre -> System.out.printf("%s %s %s", platos.helado, platos.flan, platos.tarta);
            case bebida -> System.out.printf("%s %s %s", platos.cerveza, platos.fanta, platos.agua);
        }
    }

    public void ejercicio5() {
        // Objetivo: Crear una calculadora simple que realice operaciones según un operador.
        double num1 = 30, num2 = 20;
        char operador = '*';

        switch (operador) {
            case '+' -> System.out.println(num1 + num2);
            case '-' -> System.out.println(num1 - num2);
            case '*' -> System.out.println(num1 * num2);
            case '/' -> {
                if (num2 != 0) {
                    System.out.println(num1 / num2);
                } else {
                    System.out.println("No se puede dividir entre 0");
                }
            }
        }
    }

    public void ejercicio6() {
        //Objetivo: Crear un programa que genere saludos diferentes según la hora del día.

        switch (getHour()) {
            case 1 -> System.out.println("madrugada");

            case 2 -> System.out.println("mañana");

            case 3 -> System.out.println("tarde");

            case 4 -> System.out.println("noche");

        }
    }

    public void ejercicio7(){
        //Objetivo: Crear un sistema que determine el nivel del jugador según su puntuación.
    }

    private int convertNum(Double number) {
        if (number < 0 || number > 10) return -1;
        else if (number >= 0 && number < 4) return 0;
        else if (number >= 4 && number < 5) return 1;
        else if (number >= 5 && number < 7) return 2;
        else if (number >= 7 && number < 9) return 3;
        else return 4;
    }

    private int convertTempNumb(int celsius) {
        if (celsius < 0) return 0;
        else if (celsius >= 0 && celsius < 16) return 1;
        else if (celsius >= 16 && celsius < 26) return 2;
        else if (celsius >= 26 && celsius < 36) return 3;
        else return 4;

    }

    private int getHour() {
        int randomNum = (int) (Math.random() * 24);

        if (randomNum >= 0 && randomNum < 6) return 1;
        else if (randomNum >= 6 && randomNum < 12) return 2;
        else if (randomNum >= 12 && randomNum < 20) return 3;
        else return 4;
    }

}