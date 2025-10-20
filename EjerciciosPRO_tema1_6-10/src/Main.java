import java.sql.SQLOutput;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        /*E6: Escribe un programa que declare dos variables numéricas, realice las operaciones básicas (suma, resta, multiplicación y división) y muestre los resultados por consola.

         */
        int num1 = 50;
        int num2 = 30;

        System.out.println(sumar(num1, num2));
        System.out.println(restar(num1, num2));
        System.out.println(multiplicar(num1, num2));
        System.out.println(dividir(num1, num2));
    /*
    E7: Crea un programa que almacene tu información personal (nombre, apellido, edad y ciudad) en variables y muestre un mensaje de presentación por consola.
     */
        String nombre = "Ezequiel", apellido = "Tamayo", ciudad = "Algeciras";
        byte edad = 38;
        System.out.println("!Hola, me llamo " + nombre + " " + apellido + ".");
        System.out.println("Tengo " + edad + " años y vivo en " + ciudad + ".");
        /*
        E8:Desarrolla un programa que calcule el área de un rectángulo. Declara variables para la base y la altura, y muestra el resultado del cálculo.
         */
        int baseRectangulo = 3;
        int alturaRectangulo = 7;
        System.out.println("El area del rectángulo es " + multiplicar(alturaRectangulo, alturaRectangulo));
                /*
        E9:Escribe un programa que almacene la información de un producto (nombre, precio, código y disponibilidad) y muestre estos datos formateados por consola.
         */

        System.out.println();
        String nombreProducto ="Auriculares bluetooth";
        float precioProducto = 29.99f;
        String codigoProducto = "AUR-2023";
        boolean estaDiponible = true;

        System.out.println("Información del producto".toUpperCase());
        System.out.println("-------------------------");
        System.out.println("Nombre: " + nombreProducto);
        System.out.println("Precio: " + precioProducto);
        System.out.println("Código: " + codigoProducto);
        System.out.println("Disponible: " + estaDiponible);

                        /*
        E10:Crea un programa que convierta una temperatura de grados Celsius a Fahrenheit. Usa una variable para la temperatura en Celsius y muestra el resultado de la conversión.
         */

        int celsiusTemp = 25;
        Function<Integer, Double> convert = x -> {
            return (double)x *9/5 + 32;
        };
        System.out.println(convert.apply(celsiusTemp));
    }

    //FUNCIONES E1
    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static int dividir(int num1, int num2) {
        return num1 / num2;
    }

}
