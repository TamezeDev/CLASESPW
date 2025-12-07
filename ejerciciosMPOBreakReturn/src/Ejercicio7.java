public class Ejercicio7 {
    public void generarFibonacci(int limite) {
        int num1 = 0;
        int num2 = 1;
        int suma;

        System.out.print(num1 + ", " + num2);

        while (true) {

            suma = num1 + num2;
            if (suma > limite) {
                break;
            }
            System.out.print((", ") + suma);
            num1 = num2;
            num2 = suma;

        }
    }
}
