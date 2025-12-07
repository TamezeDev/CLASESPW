public class Sudoku {

    private int[][] numeros = new int[4][4];

    public void iniciarCuadrado() {
        System.out.println("Procedemos a iniciar el programa");
    }

    public void rellenarNumeros() {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                int randonNum;
                do {
                    randonNum = (int) (Math.random() * 90);
                }while (numeroRepetido(randonNum));
                    numeros[i][j] = randonNum;
            }
        }
    }

    public void mostrarNumeros() {
        for (int[] ints : numeros) {
            for (int i : ints) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

    private boolean numeroRepetido(int numero) {
        for (int[] filas : numeros) {
            for (int col : filas) {
                if (col == numero) {
                    return true;
                }
            }
        }
        return false;
    }
}
