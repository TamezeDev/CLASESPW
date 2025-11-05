import java.util.Scanner;

public class SentenciaWhile {
    //While no garantiza una un numero minimo de veces
    public void evaluacionNumero(){
        Scanner scanner = new Scanner(System.in);
        //Math.random() -> 0 - 0.99
        int aleatorio = (int)(Math.random() *11);
        int intento = 1;
        System.out.printf("El numero aleatorio es %d%n", aleatorio);
        System.out.println("introduce un numero a ver si es el correcto");
        int numero = scanner.nextInt();

        while(numero != aleatorio){
            intento++;
            System.out.println("No es el numero correcto");
            System.out.println("Introduce un numero nuevo");
            numero = scanner.nextInt();
        }
        System.out.printf("Has acertado el numero. Lo has intentado %d veces",intento);
    }

    //Do-While garantiza que se meta 1 vez en el bucle
    public void imprimirMenu(){
        int numero = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Ejecutando tarea repetitiva");
            System.out.println("Introduce el numero de nuevo");
            numero = scanner.nextInt();
        }while(numero == 0);
        System.out.println("finalizando programa");
    }
}

