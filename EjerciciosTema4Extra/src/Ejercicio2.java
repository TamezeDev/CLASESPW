

import java.util.Scanner;

public class Ejercicio2 {
    Scanner scanner = new Scanner(System.in);

    public void ejecutarPrograma() {

        int[] randomArray = crearArray();
        int eleccionUsuario;
        do {
            System.out.println("ELIGE UNA OPCIÓN\n1. Imprimir el array\n2.Mover un numero a la izquierda\n3. Mover un numero a la derecha\n4. Invertir orden\n5. Salir");
            eleccionUsuario = scanner.nextInt();
            ejecutarSeleccion(eleccionUsuario,randomArray);

        }while (eleccionUsuario != 5);

        System.out.println("Saliendo del programa");
    }

    private int[] crearArray() {
        int[] randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int)((Math.random() *20) +1);
        }
        return randomArray;
    }

    private void ejecutarSeleccion(int eleccionUsuario, int[] array) {
        switch (eleccionUsuario) {
            case 1 -> mostrarArray(array);
            case 2 ->
                moverNumeroIzquierda(array);
            case 3 -> moverNumeroDerecha(array);
            case 4 -> invertirArray(array);
        }

    }

    private void mostrarArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private int[] moverNumeroIzquierda(int[] array) {
        int posicion1 = array[0];
        try{
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i +1];
            }

        }catch (ArrayIndexOutOfBoundsException error){
            array[array.length -1] = posicion1;
        }return array;

    }
    private int[] moverNumeroDerecha(int[] array) {
        int posicion1 = array[array.length - 1];
            for (int i = 1; i < array.length; i++) {
                array[i] = array[i - 1];
            }
            array[0] = posicion1;

        return array;
    }
    private int[] invertirArray(int [] array){
        for (int i = 0; i < array.length/2; i++) {
            int reserva = array[i];
            array[i] = array[array.length -1 -i];
            array[array.length -1 -i] =  reserva;
        }
        return array;
    }

}