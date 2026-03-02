package ejercicio10;

import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        //E10
        List<Alumno> alumnos = List.of(
                new Alumno("Paco", 3, 8),
                new Alumno("Juan", 7, 5),
                new Alumno("Pedro", 8, 6),
                new Alumno("lucas", 2, 3),
                new Alumno("David", 4, 5),
                new Alumno("Marta", 9, 7),
                new Alumno("Sebastian", 1, 9),
                new Alumno("Inés", 3, 7),
                new Alumno("Pepe", 7, 4)
        );
        //Funciones
        BiFunction<Double, Double, Double> calcularNotaFinal = ((teorica, practica) -> (teorica * 0.6) + (practica * 0.4));
        BiPredicate<Double,Double> haAprobado = ((teorica, practica) ->calcularNotaFinal.apply(teorica, practica) >= 5);
        Function<Double, Character> convertidorLetra = ((nota) -> nota <= 3 ? 'F' : nota < 5 ? 'D' : nota < 6 ? 'C' : nota > 9 ? 'B' : 'A');
        BiConsumer<String, String> impresionAlumno = ((nombre, resultado) -> System.out.println(nombre + ": " + resultado));
        Predicate<Alumno> aprobado = alumno -> haAprobado.test(alumno.getNotaTeoria(), alumno.getNotaPractica());

        //Funcionamiento
        System.out.println("=== INFORME COMPLETO ===");
        alumnos.forEach(alumno -> {
            double teoria = alumno.getNotaTeoria();
            double practica = alumno.getNotaPractica();
            double notaFinal = calcularNotaFinal.apply(teoria, practica);
            char letra = convertidorLetra.apply(notaFinal);
            String estado = aprobado.test(alumno) ? "APROBADO" : "SUSPENDIDO";

            System.out.printf("%s - Nota final: %.2f (%s) - %s%n", alumno.getNombre(), notaFinal, letra, estado);
        });

        System.out.println("=== APROBADOS ===");
        alumnos.stream().filter(aprobado).map(Alumno::getNombre).forEach(System.out::println);
    }
}