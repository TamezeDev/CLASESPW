package ejercicio9;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //E9
        BiFunction<List<Integer>, List<Integer>, List<Integer>> listaEnteros = ((lista1, lista2) ->
                Stream.of(lista1, lista2).
                        flatMap(List::stream).
                        collect(Collectors.toSet())
                        .stream().sorted()
                        .toList());

        List<Integer> listaA = List.of(23, 78, 11, 22, 22, 34, 65, 11);
        List<Integer> listaB = List.of(50, 22, 67, 44, 23, 99, 12, 23);

        List<Integer> sinDobles = listaEnteros.apply(listaA, listaB);
        sinDobles.forEach(System.out::println);

    }
}
