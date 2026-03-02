package ejercicio5;

import java.util.Map;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {

        //E5
        BiConsumer<String, Integer> datos = ((nombre, edad) -> System.out.println("Nombre: " + nombre + ", edad: " + edad));
        Map<String, Integer> alumnos  = Map.of("Paco", 33, "Pedro", 15, "Juan", 35, "Bart", 12);
        alumnos.forEach(datos);

    }
}
