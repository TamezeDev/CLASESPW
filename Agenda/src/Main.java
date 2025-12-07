
public class Main {
    public static void main(String[] args) {
        //Object[] -> [nombre,apellido,dni,telefono]
        //array unidimensional -> guarda un alista de elementos de distinto una sola fila
        Object[] persona = new Object[4];
        persona[0] = "Ezequiel";
        persona[1] = "Tamayo";
        persona[2] = "ezequielTamayo@gmail.com";
        persona[3] = 123;

        for (Object item : persona) {
            System.out.println(item);
        }

        //array bidimensional guarda varias filas y columnas
        int[][] numeros = new int[4][4];        //declara 4 filas y 4 columnas
        int[][] numeros2 = new int[][]{{4, 5, 6}, {1, 2, 3}, {11, 34, 54}};

        System.out.println(numeros2[0][2]);  // imprime la posición que queremos, filas y columnas empiezan por 0
        for (int i = 0; i < numeros2.length; i++) {
            for (int j = 0; j < numeros2[i].length; j++) {
              numeros2[i][j] = (int)(Math.random() *16);
            }
            System.out.println();
        }

        for(int [] item : numeros2){
            for (int i : item){
                System.out.print(i + "\t");
            }
            System.out.println();
        }


        Sudoku sudoku = new Sudoku();
        sudoku.iniciarCuadrado();
        sudoku.rellenarNumeros();
        sudoku.mostrarNumeros();
    }
}
