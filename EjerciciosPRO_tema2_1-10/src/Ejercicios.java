import java.util.Scanner;

public class Ejercicios {
    Funciones operaciones = new Funciones();
    Scanner teclado;

    public void ejercicio1() {
        //E1:Crea un programa que pida al usuario dos números enteros por consola y muestre el resultado de las cinco operaciones aritméticas básicas: suma, resta, multiplicación, división y módulo (resto).
        int numeroPedido1, numeroPedido2;
        teclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        numeroPedido1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero");
        numeroPedido2 = teclado.nextInt();

        System.out.println("la suma los dos numeros elegidos es " + operaciones.sumar(numeroPedido1, numeroPedido2));
        System.out.println("la resta los dos numeros elegidos es " + operaciones.restar(numeroPedido1, numeroPedido2));
        System.out.println("la multiplicacion los dos numeros elegidos es " + operaciones.multiplicar(numeroPedido1, numeroPedido2));
        System.out.println("la division los dos numeros elegidos es " + operaciones.dividir((double) numeroPedido1, numeroPedido2));
        System.out.println("el modulo los dos numeros elegidos es " + operaciones.modulo(numeroPedido1, numeroPedido2));
        teclado.close();
        ;
        teclado = null;
    }

    public void ejercicio2() {
        //E2:Escribe un programa que pida dos números al usuario y muestre el resultado de todas las comparaciones relacionales entre ellos (mayor que, menor que, igual, diferente, mayor o igual, menor o igual).

        int number1, number2;
        teclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        number1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero");
        number2 = teclado.nextInt();
        System.out.println("el  primer numero es mayor que el segundo?: " + (number1 > number2));
        System.out.println("el  primer numero es menor que el segundo?: " + (number1 < number2));
        System.out.println("el  primer numero es igual que el segundo?: " + (number1 == number2));
        System.out.println("el  primer numero es diferente a el segundo?: " + (number1 != number2));
        System.out.println("el  primer numero es mayor o igual que el segundo?: " + (number1 >= number2));
        System.out.println("el  primer numero es menor o igual que el segundo?: " + (number1 <= number2));


        teclado.close();
        teclado = null;
    }

    public void ejercicio3() {

        //E3: Crea un programa que declare una variable con valor inicial 100 y aplique diferentes operadores de asignación compuesta (+=, -=, *=, /=). Muestra el valor de la variable después de cada operación.
        int actualValue = 100;
        actualValue += 5;
        System.out.println("El valor despues de la modificacion es " + actualValue);
        actualValue -= 20;
        System.out.println("El valor despues de la modificacion es " + actualValue);
        actualValue *= 2;
        System.out.println("El valor despues de la modificacion es " + actualValue);
        actualValue /= 85;
        System.out.println("El valor despues de la modificacion es " + actualValue);

    }

    public void ejercicio4() {
        //E4: Desarrolla un programa que pida un número al usuario y determine si es par o impar usando el operador módulo. Muestra el resultado por consola.
        teclado = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int numeroPedido = teclado.nextInt();

        if ((numeroPedido % 2) == 0) {
            System.out.printf("El numero %d es par.", numeroPedido);
        } else {
            System.out.printf("El numero %d es impar.", numeroPedido);
        }

        teclado.close();
        teclado = null;
    }

    public void ejercicio5() {
        //E5:Crea un programa que pida la edad del usuario y si tiene carnet de conducir (true/false). Usa operadores lógicos para determinar si puede alquilar un coche (debe tener 21 años o más Y tener carnet).
        teclado = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        byte edad = teclado.nextByte();
        System.out.println("¿Tiene carnet de conducir?(true/false)");
        boolean tieneCarnet = teclado.nextBoolean();
        if (edad >= 21 && tieneCarnet) {
            System.out.println("Perfecto, puedes alquilar el coche");
        } else if (edad >= 21 && !tieneCarnet) {
            System.out.println("lo sentimos, aunque tenga la edad es necesario tener carnet para poder alquilar un coche");
        } else if (tieneCarnet && edad < 21) {
            System.out.println("No tiene la edad requerida para alquilar el coche");
        } else {
            System.out.println("lo sentimos, para alquilar un coche hay que tener carnet y tener al menos 21 años de edad");
        }

        teclado.close();
        teclado = null;
    }

    public void ejercicio6() {
        //E6:Escribe un programa que pida el precio de un producto y el porcentaje de descuento. Calcula el precio final después del descuento usando operadores aritméticos y muestra todos los pasos del cálculo.
        teclado = new Scanner(System.in);
        System.out.println("Introduce el precio original del articulo");
        double precioOriginal = teclado.nextDouble();
        System.out.println("Introduce el porcentaje de descuento");
        byte porcentajeDescuento = teclado.nextByte();

        double cantidadDescuento = (precioOriginal * porcentajeDescuento) / 100;
        double cantidadFinal = precioOriginal - cantidadDescuento;

        System.out.println("El precio original es: " + precioOriginal);
        System.out.println("La cantidad descontada es: " + cantidadDescuento);
        System.out.println("El precio final es: " + cantidadFinal);

        teclado.close();
        teclado = null;
    }

    public void ejercicio7() {
        //E7:Crea un programa que pida al usuario su edad y si es estudiante (true/false). Usa operadores lógicos (AND, OR, NOT) para determinar si puede acceder a diferentes descuentos: descuento joven (menor de 26 años), descuento estudiante, o descuento especial (menor de 26 Y estudiante).
        teclado = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        byte edad = teclado.nextByte();
        System.out.println("¿Eres estudiante? (true/false)");
        boolean isStudent = teclado.nextBoolean();
        if (edad < 26) {
            if (isStudent) {
                System.out.println("tienes el descuento especial");
            } else {
                System.out.println("tienes el descuento joven");
            }
        } else {
            System.out.println("no tienes ningún descuento");
        }
        teclado.close();
        teclado = null;
    }

    public void ejercicio8() {
        //E8: Desarrolla un programa que pida tres números al usuario y calcule: la suma de los tres, el promedio, el resultado de multiplicar el primero por el segundo y dividirlo entre el tercero. Usa paréntesis para controlar la precedencia de operadores.
        teclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        double primerNumero = teclado.nextDouble();
        System.out.println("Introduce el segundo numero: ");
        double segundoNumero = teclado.nextDouble();
        System.out.println("Introduce el tercer numero: ");
        double tercerNumero = teclado.nextDouble();

        double suma = primerNumero + segundoNumero + tercerNumero;
        double promedio = suma / 3;
        double resutadoCalculo = (primerNumero * segundoNumero) / tercerNumero;

        System.out.printf("la suma de sus numeros es %.0f%n", suma);
        System.out.printf("el promedio de sus numero es %.2f%n", promedio);
        System.out.println("El resultado de mltiplicar el primero por el segundo y dividirlo entre el tercero es : " + resutadoCalculo);
        teclado.close();
        teclado = null;
    }

    public void ejercicio9() {
        //E9:Escribe un programa que pida al usuario la puntuación de tres exámenes. Calcula la nota media y usa operadores relacionales para determinar si ha aprobado (>=5), si tiene notable (>=7), y si tiene sobresaliente (>=9). Muestra todos los resultados.
        teclado = new Scanner(System.in);
        System.out.println("Introduce la nota del primer examen");
        double nota1 = teclado.nextDouble();
        System.out.println("Introduce la nota del segundo examen");
        double nota2 = teclado.nextDouble();
        System.out.println("Introduce la nota del tercer examen");
        double nota3 = teclado.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        boolean aprobado = promedio >= 5;
        boolean notable = promedio >= 7;
        boolean sobresaliente = promedio >= 9;

        System.out.println("¿Ha aprobado? :" + aprobado);
        System.out.println("¿Tiene notable? :" + notable);
        System.out.println("¿Tiene sobresaliente? :" + sobresaliente);

        teclado.close();
        teclado = null;
    }

    public void ejercicio10() {
        //10: Crea un programa que pida el salario base por hora, las horas trabajadas y si ha hecho horas extra (true/false). Si ha hecho horas extra y trabajó más de 40 horas, las horas que excedan de 40 se pagan al doble. Usa operadores lógicos, relacionales y aritméticos para calcular el salario total.
        teclado = new Scanner(System.in);
        System.out.println("Introduce el salario por hora");
        double salarioHora = teclado.nextDouble();
        System.out.println("Introduce las horas trabajadas");
        int horasTrabajadas = teclado.nextInt();
        System.out.println("¿Has hecho horas extra? (true/false)");
        boolean horaExtras = teclado.nextBoolean();
        int horasNormales, horasExtras;
        double salarioBase, salarioExtra, salarioTotal;

        if (horaExtras) {
            horasNormales = 40;
            horasExtras = horasTrabajadas - horasNormales;
            salarioExtra = horasExtras * (salarioHora * 2);
            salarioBase = salarioHora * 40;
            salarioTotal = salarioBase + salarioExtra;
        } else {
            horasNormales = horasTrabajadas;
            horasExtras = 0;
            salarioExtra = 0;
            salarioBase = horasTrabajadas * salarioHora;
            salarioTotal = salarioBase + salarioExtra;
        }

        System.out.println("horas normales: " + horasNormales);
        System.out.println("horas extra: " + horasExtras);
        System.out.println("trabajaste mas de 40 horas? " + horaExtras);
        System.out.println("Tienes derecho a horas extra? " + horaExtras);
        System.out.println("Salario por horas normales: " + salarioBase + "€");
        System.out.println("Salario por hora extra:  " + salarioExtra + "€");
        System.out.println("Salario total:  " + salarioTotal + "€");


    }
}
