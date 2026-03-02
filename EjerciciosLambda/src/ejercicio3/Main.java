package ejercicio3;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        //E3
        BiFunction<Integer,Integer,Integer> suma = Integer::sum;
        BiFunction<Integer,Integer,Integer> resta = (n1,n2) -> n1 - n2;
        BiFunction<Integer,Integer,Double> division = (n1,n2) -> (double)n1 / n2;;
        BiFunction<Integer,Integer,Integer> multi = (n1,n2) -> n1 * n2;

        IntStream.rangeClosed(1,5).forEach(it->{
            System.out.println(suma.apply((it  +1) , it));
            System.out.println(resta.apply((it  +1) , it));
            System.out.println(multi.apply((it  +1) , it));
            System.out.println(division.apply((it  +1) , it));
        });
    }
}
