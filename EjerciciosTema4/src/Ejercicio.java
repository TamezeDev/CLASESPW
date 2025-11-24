import java.util.Scanner;

public class Ejercicio {

    //ejercicio1
    public void ejercicio1() {
        //Crea un programa que defina un array llamado frutas con 5 nombres de frutas. Luego, muestra todos los elementos del array en la consola, uno por línea.
        String[] frutas = new String[]{"Manzana", "Platano", "Naranja", "Fresa", "Uva"};
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }

    //ejercicio2
    public void ejercicio2() {
        //Escribe un programa que cree un array de 6 números enteros. Usa un bucle for para recorrer el array y mostrar cada número junto con su posición (índice).
        int[] numeros = new int[6];
        int inicialNumero = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = inicialNumero += 10;
            System.out.println("Posicion " + i + ": " + inicialNumero);
        }
    }

    //ejercicio3
    public void ejercicio3() {
        // Desarrolla un programa que cree un array vacío de tamaño 5. Usa un bucle for para pedir al usuario que introduzca 5 nombres, guardándolos en el array. Al final, muestra todos los nombres almacenados.
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[5];
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Introduce el nombre " + i + ":");
            nombres[i] = scanner.next();
        }
        System.out.println("\nLos nombres introducidos:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }

    //ejercicio4
    public void ejercicio4() {
        //Crea un programa con un array de 7 números. Pide al usuario un número a buscar y usa un bucle for para recorrer el array. Si el número existe, muestra su posición. Si no existe, indica que no se encontró.
        int[] bolsaNumeros = new int[7];
        Scanner scanner = new Scanner(System.in);
        int userNumero;
        for (int i = 0; i < bolsaNumeros.length; i++) {
            int randomNum = (int) ((Math.random() * 60) + 1);
            bolsaNumeros[i] = randomNum;
        }
        System.out.println("Introduce el numero a buscar");
        userNumero = scanner.nextInt();
        for (int numero : bolsaNumeros) {
            if (numero == userNumero) {
                System.out.println("numero encontrado en la lista");
                return;
            }
        }
    }

    //ejercicio5
    public void ejercicio5() {
        //Escribe un programa que defina un array de 10 números enteros. Usa un bucle for para contar cuántos números son mayores que 50 y muestra el resultado.
        int[] bolsaNumeros = new int[10];
        for (int i = 0; i < bolsaNumeros.length; i++) {
            int randomNum = (int) ((Math.random() * 98) + 1);
            bolsaNumeros[i] = randomNum;
        }
        System.out.println("numeros mayores de 50");
        for (int numero : bolsaNumeros) {
            if (numero > 50) {
                System.out.println(numero);
            }
        }
    }

    //ejercicio6
    public void ejercicio6() {
        //Crea un programa con un array de 8 números decimales. Recorre el array con un bucle for para calcular la suma de todos los elementos. Luego, calcula y muestra el promedio.
        double[] bolsaNumeros = new double[8];
        double suma = 0;
        for (int i = 0; i < bolsaNumeros.length; i++) {
            double randomNum = ((Math.random() * 98));
            bolsaNumeros[i] = randomNum;
        }
        for (double numero : bolsaNumeros) {
            suma += numero;
        }
        System.out.printf("La suma total es: %.2f%n", suma);
        System.out.printf("El promedio es: %.2f%n", (suma / bolsaNumeros.length));
    }

    //ejercicio7
    public void ejercicio7() {
        // Desarrolla un programa que cree un array de 6 números. Usa bucles for para encontrar el número mayor y el número menor del array, y muestra ambos resultados.
        int[] bolsaNumeros = new int[6];
        int min = 100, max = 0;
        for (int i = 0; i < bolsaNumeros.length; i++) {
            int randomNum = (int) ((Math.random() * 98) + 1);
            bolsaNumeros[i] = randomNum;
        }
        for (int numero : bolsaNumeros) {
            if (numero < min) {
                min = numero;
            }
            if (numero > max) {
                max = numero;
            }
            System.out.println(numero);
        }
        System.out.println("minimo: " + min);
        System.out.println("maximo: " + max);
    }

    // ejercicio8
    public void ejercicio8() {
        //Crea un programa con un array de 10 palabras (pueden repetirse). Pide al usuario una palabra y usa un bucle for para contar cuántas veces aparece esa palabra en el array.
        String[] listaAnimal = new String[]{"gato", "perro", "gato", "pájaro", "gato", "pez", "perro", "gato", "conejo", "perro"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la palabra a buscar:");
        String palabra = scanner.next();
        int counter = 0;
        for (String animal : listaAnimal) {
            if (animal.equals(palabra)) {
                counter++;
            }
        }
        System.out.println("La palabra " + palabra + " aparece " + counter + " veces en el array");
    }

    //ejercicio9
    public void ejercicio9() {
        //Escribe un programa que cree un array de 7 números. Usa un bucle for para crear un nuevo array con los elementos en orden inverso. Muestra ambos arrays: el original y el invertido.
        int[] bolsaNumeros = new int[7];
        int[] inversaBolsaNumeros = new int[7];
        for (int i = 0; i < bolsaNumeros.length; i++) {
            int randomNum = (int) ((Math.random() * 98) + 1);
            bolsaNumeros[i] = randomNum;
        }

        for (int i = 0; i < bolsaNumeros.length; i++) {
            inversaBolsaNumeros[inversaBolsaNumeros.length - (i + 1)] = bolsaNumeros[i];
        }
        System.out.println("lista original");
        for (int numero : bolsaNumeros) {
            System.out.println(numero);
        }
        System.out.println("lista invertida");
        for (int numero : inversaBolsaNumeros) {
            System.out.println(numero);
        }
    }

    //ejercicio19
    public void ejercicio10() {
        //Desarrolla un programa que pida al usuario cuántos estudiantes hay en una clase. Crea un array para almacenar sus calificaciones (0-10). Usa un bucle while para rellenar el array con las notas. Luego, usa un bucle for para:
        //
        //1. Mostrar todas las calificaciones
        //
        //2. Calcular el promedio de la clase
        //
        //3. Contar cuántos estudiantes aprobaron (nota ≥ 5)
        //
        //4. Encontrar la nota más alta y la más baja

        Scanner scanner = new Scanner(System.in);
        int numeroEstudiantes, aprobados = 0;
        double suma = 0, min = 11, max = 0;
        System.out.println("¿Cuántos estudiantes hay?");
        numeroEstudiantes = scanner.nextInt();
        double[] notaAlumnos = new double[numeroEstudiantes];

        for (int i = 0; i < numeroEstudiantes; i++) {
            System.out.println("Introduce la nota del estudiante " + (i + 1));
            notaAlumnos[i] = scanner.nextDouble();
        }

        System.out.println("---REPORTE DE CALIFICACIONES---");
        System.out.print("Calificaciones: ");
        for (double calificacion : notaAlumnos) {
            System.out.printf("%.1f ", calificacion);
            suma += calificacion;
            if (calificacion >= 5) {
                aprobados++;
            }
            if (calificacion < min) {
                min = calificacion;
            }
            if (calificacion > max) {
                max = calificacion;
            }
        }
        System.out.println("Promedio de la clase: " + (suma / numeroEstudiantes));
        System.out.println("Estudiantes aprobados: " + aprobados);
        System.out.println("Nota mas alta: " + max);
        System.out.println("Nota mas baja: " + min);
    }
}
