package ejercicio8;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //E8
        List<Integer> numbers = List.of(34, 66,77,11,101,33,78);
        Predicate<Integer> mayores = (entrada -> entrada > 50);
        Predicate<Integer> pares = (entrada -> entrada % 2 == 0);
        Predicate<Integer> divisible = (entrada -> entrada % 3 == 0);

        numbers.stream().filter(mayores.and(pares).or(divisible)).forEach(System.out::println);

    }
}
