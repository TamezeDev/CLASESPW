import java.util.Scanner;

public class Ejercicios {
    public void ejercicio1() {
        int[][] numeros = new int[3][3];
        int numeroGuardar = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeroGuardar++;
                numeros[i][j] = numeroGuardar;
            }
        }
        for (int[] numero : numeros) {
            for (int i : numero) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

    }

    public void ejercicio2() {
        int[][] numerosUsuario = new int[2][4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numerosUsuario.length; i++) {
            for (int j = 0; j < numerosUsuario[i].length; j++) {
                System.out.printf("Introduce el numero para la posición [%d][%d]%n", i, j);
                numerosUsuario[i][j] = sc.nextInt();
            }
        }
        for (int[] ints : numerosUsuario) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    public void ejercicio3() {

        int[][] randomMatriz = new int[4][4];
        int suma = 0;
        for (int i = 0; i < randomMatriz.length; i++) {
            for (int j = 0; j < randomMatriz[i].length; j++) {
                int random = (int) (Math.random() * 20);
                randomMatriz[i][j] = random;
                suma += random;
            }
        }
        for (int[] ints : randomMatriz) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        System.out.println("Suma total de elementos: " + suma);

    }

    public void ejercicio4() {
        int[][] matrizPruebas = {{12, 45, 23, 67, 89}, {34, 56, 78, 90, 11}, {22, 33, 44, 55, 66}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero a buscar: ");
        int numeroBuscar = sc.nextInt();
        for (int i = 0; i < matrizPruebas.length; i++) {
            for (int j = 0; j < matrizPruebas[i].length; j++) {
                if (matrizPruebas[i][j] == numeroBuscar) {
                    System.out.printf("El numero %d se encuentra en la posicion [%d][%d]%n", numeroBuscar, i, j);
                    return;
                }
            }
            System.out.println("El numero" + numeroBuscar + " no se encuentra en la matriz");
        }
    }

    public void ejercicio5() {
        double[][] arrayDecimales = new double[4][3];

        for (int i = 0; i < arrayDecimales.length; i++) {
            for (int j = 0; j < arrayDecimales[i].length; j++) {
                arrayDecimales[i][j] = ((double) Math.round((Math.random() * 51) * 10) / 10);
            }
        }
        for (double[] arrayDecimale : arrayDecimales) {
            for (double v : arrayDecimale) {
                System.out.printf("%8.1f\t", v);
            }
            System.out.println();
        }

        for (int j = 0; j < arrayDecimales.length; j++) {
            double sumartorio = 0;
            for (int k = 0; k < arrayDecimales[j].length; k++) {
                sumartorio += arrayDecimales[j][k] / arrayDecimales[j].length;
            }
            System.out.printf("Promedio de la fila %d: %.1f%n", j, sumartorio);
        }


    }

    public void ejercicio6() {
        int[][] arrayPruebas = new int[3][4];
        for (int i = 0; i < arrayPruebas.length; i++) {
            for (int j = 0; j < arrayPruebas[i].length; j++) {
                arrayPruebas[i][j] = (int) (Math.random() * 30);
            }
        }
        for (int[] arrayPrueba : arrayPruebas) {
            for (int i : arrayPrueba) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

        for (int col = 0; col < arrayPruebas[0].length; col++) {
            int max = arrayPruebas[0][col];
            for (int fila = 0; fila < arrayPruebas.length; fila++) {
                if (arrayPruebas[fila][col] <= max) {
                    continue;
                }
                max = arrayPruebas[fila][col];
            }
            System.out.printf("Mayor de la columna %d: %d%n", col, max);
        }
    }

    public void ejercicio7() {
        int[][] matrizNormal = new int[3][4];
        int[][] matrizTranspuesta = new int[4][3];

        for (int i = 0; i < matrizNormal.length; i++) {
            for (int j = 0; j < matrizNormal[i].length; j++) {
                matrizNormal[i][j] = (int) (Math.random() * 50);
            }
        }
        for (int i = 0; i < matrizNormal.length; i++) {
            for (int j = 0; j < matrizNormal[i].length; j++) {
                matrizTranspuesta[j][i] = matrizNormal[i][j];
            }
        }
        for (int[] ints : matrizNormal) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();

        }
        for (int[] ints : matrizTranspuesta) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();

        }
    }

    public void ejercicio8() {
        int[][] matrizPruebas = new int[4][5];
        int contadorPares = 0;
        int contadorImpares = 0;


        for (int i = 0; i < matrizPruebas.length; i++) {
            for (int j = 0; j < matrizPruebas[i].length; j++) {
                matrizPruebas[i][j] = (int) (Math.random() * 50);
            }
        }

        for (int[] matrizPrueba : matrizPruebas) {
            for (int i : matrizPrueba) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < matrizPruebas.length; i++) {
            for (int j = 0; j < matrizPruebas[i].length; j++) {
                if (matrizPruebas[i][j] % 2 == 0) {
                    contadorPares++;
                    continue;
                }
                contadorImpares++;
            }
        }
        System.out.printf("Numeros pares: %d%nNumeros impares: %d", contadorPares, contadorImpares);

    }

    public void ejercicio9() {
        int[][] arrayTablasMultiplicar = new int[10][10];
        for (int i = 0; i < arrayTablasMultiplicar.length; i++) {
            for (int j = 0; j < arrayTablasMultiplicar[i].length; j++) {
                arrayTablasMultiplicar[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int[] filas : arrayTablasMultiplicar) {
            for (int col : filas) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }

    public void ejercicio10() {
        //PEDIR TABLA
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de estudiantes");
        int estudiantes = sc.nextInt();
        System.out.println("Introduce el numero de asignaturas");
        int asignaturas = sc.nextInt();
        //PEDIR NOTAS
        double[][] tablas = new double[estudiantes][asignaturas];
        for (int i = 0; i < tablas.length; i++) {
            for (int j = 0; j < tablas[i].length; j++) {
                System.out.printf("Introduce la nota de estudiante %d, asignatura %d: ", i + 1, j + 1);
                tablas[i][j] = sc.nextDouble();
            }
        }
        //MOSTRAR TABLA

        System.out.println("-----TABLA DE NOTAS-------");
        for (double[] tabla : tablas) {
            for (double v : tabla) {
                System.out.print(v + "\t");
            }
            System.out.println();
        }

        //PROMEDIOS ESTUDIANTE
        System.out.println("------PROMEDIOS POR ESTUDIANTE--------");
        for (int i = 0; i < tablas.length; i++) {
            double sumatorio = 0;
            for (int j = 0; j < tablas[i].length; j++) {
                sumatorio += tablas[i][j];

            }
            System.out.printf("Estudiante %d: %.2f%n", i + 1, sumatorio / tablas[i].length);
        }

        //PROMEDIOS POR ASIGNATURA
        System.out.println("-----PROMEDIOS POR ASIGNATURA");
        for (int col = 0; col < tablas[0].length; col++) {
            double sumatorio = 0;
            for (int fila = 0; fila < tablas.length; fila++) {
                sumatorio += tablas[fila][col];
            }
            System.out.printf("Asignatura %d: %.2f%n", col + 1, sumatorio / tablas[0].length);
        }

        //NOTA MAS ALTA
        double maxNota = 0;
        int estudiante=0, asignatura=0;
        for (int i = 0; i < tablas.length; i++) {
            for (int j = 0; j < tablas[i].length; j++) {
                if (tablas[i][j] > maxNota){
                    maxNota = tablas[i][j];
                    estudiante = i +1;
                    asignatura = j +1;
                }
            }
        }
        System.out.printf("La nota mas alta es %.1f (estudiate: %d, asignatura: %d)",maxNota,estudiante,asignatura);
    }

}


