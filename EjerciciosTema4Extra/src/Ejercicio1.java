import java.util.Scanner;

public class Ejercicio1 {
    public void iniciarPrograma() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero de filas de las matrices");
        int tamanoFila = scanner.nextInt();
        System.out.println("Introduce el numero de columnas de las matrices");
        int tamanoColumna = scanner.nextInt();
        int[][] matriz1 = crearMatrices(tamanoFila, tamanoColumna);
        int[][] matriz2 = crearMatrices(tamanoFila, tamanoColumna);
        int[][] matrizSumada = sumarMatrices(matriz1, matriz2, tamanoFila, tamanoColumna);

        tituloMatriz("PRIMERA");
        verMatriz(matriz1);
        tituloMatriz("SEGUNDA");
        verMatriz(matriz2);
        tituloMatriz("SUMADA");
        verMatriz(matrizSumada);
    }

    private int[][] crearMatrices(int fila, int columna) {
        int[][] matriz = new int[fila][columna];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 51);
            }
        }
        return matriz;
    }

    private int[][] sumarMatrices(int[][] matrizA, int[][] matrizB, int filas, int columnas) {
        int[][] matrizSumada = new int[filas][columnas];
        for (int i = 0; i < matrizA.length; i++) {
            for (int i1 = 0; i1 < matrizA[i].length; i1++) {
                matrizSumada[i][i1] = (matrizA[i][i1] + matrizB[i][i1]);
            }
        }
        return matrizSumada;
    }

    private void verMatriz(int[][] matriz) {
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[j].length; i++) {
                System.out.print(matriz[j][i] + "\t");
            }
            System.out.println();
        }
    }

    private void tituloMatriz(String nombre) {
        System.out.printf("------MATRIZ %s----------\n", nombre);
    }
}
