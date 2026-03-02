package ejercicio1;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        //E1 -
        Function<Integer,Integer> cuadrado = (num) -> num * num;
        IntStream.rangeClosed(1,5).map(cuadrado::apply).forEach(System.out::println);

    }
}
