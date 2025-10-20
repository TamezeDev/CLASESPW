public class Main {
    public static void main(String[] args) {

        /*E1: Definir y mostrar variables
        Crea un programa que defina tres variables: nombre, edad y ciudad. Asigna valores a cada una y muestra su contenido en la consola.*/

        String nombre = "Ezequiel", ciudad = "Algeciras";
        byte edad = 38; //declaro byte porque la edad no superará 127

        System.out.println("Hola, me llamo " + nombre + ", tengo " + edad + " años y vivo en " + ciudad + "\n"); // \n para separar los ejercicios

        /*
        E2: modificar variables
        Crea un programa que defina una variable llamada puntuación con valor inicial 0. Luego, modifica su valor tres veces y muestra el resultado final.
                 */
        int puntuacion = 0;
        for(byte i = 0; i <= 3; i++){
            if (i == 0){
                System.out.println("El número inicial es "+ puntuacion);
            } else if (i < 3) {
                System.out.println("El número despues de la " + i +" modificación es "+ puntuacion);
            }else{
                System.out.println("El número final es "+ puntuacion + "\n");

            }
            puntuacion++;
        }
        /*
        E3: Tipos de variables
        Define cinco variables con diferentes tipos de datos (String, int, boolean, double, char) y muestra tanto su valor como su tipo.
         */
        String nombre2 = "Alberto";
        Integer edad2 = 42;
        Boolean es_trabajador = true;
        Double altura = 1.60;
        Character inicial = 'A';

        System.out.println("valor: " + nombre2 + ", tipo: "+ nombre2.getClass().getSimpleName());
        System.out.println("valor: " + edad2 + ", tipo: "+ edad2.getClass().getSimpleName());
        System.out.println("valor: " + es_trabajador + ", tipo: "+ es_trabajador.getClass().getSimpleName());
        System.out.println("valor: " + altura + ", tipo: "+ altura.getClass().getSimpleName());
        System.out.println("valor: " + inicial + ", tipo: "+ inicial.getClass().getSimpleName() + "\n");

        /*
        E4: Variable con nombres descriptivos
        Crea un programa que simule la información de un libro usando variables con nombres descriptivos. Muestra toda la información del libro en la consola.
         */
        String titulo = "Don Quijote de la Mancha";
        String autor = "Miguel de Cervantes";
        int annoPublicacion = 1605;
        int numPaginas = 863;
        boolean isAvailable = true;

        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + annoPublicacion);
        System.out.println("Número de páginas: " + numPaginas);
        System.out.println("¿Disponible en la biblioteca? " + isAvailable + "\n");

        /*E5:Declaración y uso de constantes
        Crea un programa que use constantes para almacenar información que no debe cambiar (como el valor de PI o el nombre de una aplicación) y variables para información que puede cambiar. Muestra todos los valores.

         */

        final String app = "Mi App";
        String version = "1.0.0";
        final double pi = 3.14159;
        String usuarioActual = "Laura";
        int nivel = 1;
        int puntuacion2 = 0;

        System.out.println("App: " + app);
        System.out.println("Version: " + version);
        System.out.println("Pi: " + pi);
        System.out.println("Usuario actual: " + usuarioActual);
        System.out.println("Nivel: " + nivel);
        System.out.println("Puntuación: " + puntuacion2 + "\n");


        usuarioActual = "Miguel";
        nivel = 2;
        puntuacion = 150;

        System.out.println("App: " + app);
        System.out.println("Version: " + version);
        System.out.println("Pi: " + pi);
        System.out.println("Usuario actual: " + usuarioActual);
        System.out.println("Nivel: " + nivel);
        System.out.println("Puntuación: " + puntuacion);


    }
}
