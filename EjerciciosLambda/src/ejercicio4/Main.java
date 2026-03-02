package ejercicio4;

import java.util.List;
import java.util.function.BiPredicate;


public class Main {
    public static void main(String[] args) {

        //E4
        BiPredicate<String, String> iguales = ((string, string2) -> string.length() == string2.length());
        List<List<String>> listaComparaciones = List.of(
                List.of("casa", "gato"),
                List.of("mando", "movil"),
                List.of("botella", "mando"),
                List.of("televisor", "antena"));

        listaComparaciones.stream().map(it -> iguales.test(it.get(0), it.get(1) )).forEach(System.out::println);
}}
