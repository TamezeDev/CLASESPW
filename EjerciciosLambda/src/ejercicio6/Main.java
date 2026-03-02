package ejercicio6;

import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        //E6
        Function<Integer, Integer> sumar = ((entrada) -> entrada + 10);
        Function<Integer,Integer>  multiplicar = ((entrada) -> entrada * 2);
        Function<Integer, String> convertir = String::valueOf;

        List<Integer> listaNumeros = IntStream.rangeClosed(1, 10).boxed().toList();
        listaNumeros.stream().map(sumar.andThen(multiplicar.andThen(convertir))).forEach(System.out::println);

    }
}
