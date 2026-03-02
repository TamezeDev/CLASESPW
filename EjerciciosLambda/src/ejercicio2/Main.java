package ejercicio2;

import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        //E2
        List<Integer> listaNumeros = IntStream.rangeClosed(1,20).boxed().toList();
        listaNumeros.stream().filter(it -> it % 2 == 0).forEach(System.out::println);

    }
}
