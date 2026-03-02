package service;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class UserController {
    Scanner scanner = new Scanner(System.in);

    public void getUserData() {
        final int TOTAL_NUM_TO_GET = 10;
        AtomicInteger evenNumbers = new AtomicInteger();

        System.out.println("Introduce los números que quieres evaluar:");

        IntStream.range(0, TOTAL_NUM_TO_GET).map(num -> scanner.nextInt()).sorted().forEach(num -> {
            System.out.print(num + " ");
            evenNumbers.addAndGet(counter(num));
        });
        System.out.println("\nPares: " + evenNumbers + "\nImpares: " + (TOTAL_NUM_TO_GET - evenNumbers.get()));
    }
    private int counter ( int currentNumber){
        if (currentNumber % 2 == 0) {
            return 1;
        }
        return 0;
    }
}