import java.util.Scanner;

public class SentenciaFor {
    public void senteciaFor() {
        /*Para(un rango qu empieza en 0; termina en 5 ;incrementa 1){ejecuta este bloque de codigo}*/
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
/*        for (int i=100; i>= 0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }*/
    }

    public void tablaMultiplcarNumero() {
        int numero;
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();
        System.out.println("Procedemos a escribir la tabla del " + numero);
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d * %d = %d", numero, i, (numero * i));

        }
    }

    public void todasTablas() {
        for (int i = 1; i < 11; i++) {
            System.out.println("Sacando la tabla de " + i);
            for (int j = 0; j < 11; j++) {
                System.out.printf("\t %d * %d = %d%n", j, i, i * j);

            }
        }
    }

    public void dibujarCuadradO() {
        for (int i = 0; i < 2; i++) {
            System.out.println();
        }
    }

    public void palabraPalindromo() {
        //Palabra es palíndromo cuando se lee igual de principio a fin
        String frase = "alli ves sevilla";
        frase = frase.replaceAll(" ", "");
        boolean esPalindromo = true;

        for (int i = 0; i < frase.length() / 2; i++) {
            char letraUno = frase.charAt(i);
            char letraDos = frase.charAt(frase.length() - 1 - i);
            if (letraUno != letraDos) {
                System.out.println("La palabra de un palindromo");
                break;
            }
        }
            System.out.println("Es un palindromo");
    }

    public void calcularFactorial() {
        //5 = 5*4*3*2*1
        int numeroCalcular = 7;
        int factorial = 1;
        for (int i = 1; i < numeroCalcular; i++) {
            factorial *= i;
        }
        System.out.printf("El factorial de %d es %d", numeroCalcular, factorial);
    }
//Uso del forEach en java
    public void recorrerColeccion(){
        int [] numeros = {1,10,90,40};
/*        for (int i = 0;i <numeros.length; i++){
            System.out.println(numeros[i]);
        }*/

        for(int item : numeros){
            System.out.println(item);
        }
    }

}
