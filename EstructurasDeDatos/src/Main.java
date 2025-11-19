import java.sql.Array;

public class Main {
    /*Estructura de datos -> Variables complejas  - guardar varios datos dentro de un mismo puntero
        Estáticas: No pueden alterar su tamaño
            Array unidimensionales: aquel que solo tiene una fila con b columna: armario con huecos
         Array bidimensional: aquel que tiene n filas y en cada uno hay n columnas. Matrices
        Dinámico: aquella que puede alterar si tamaño
            Basadas em posiciones: ArrayList
            Basadas en claves: HashMap
    */
    public static void main(String[]args){

        //Array
        //mediante numero de "huecos"
        int[] listaNumeros = new int[5];   //[0,0,0,0,0]
        boolean[] listaAciertos = new boolean[3]; //[false,false,false]
        String[] listaNombres = new String[2];  //[null,null]  -> los datos de tipo complejos crea por defecto null

        //mediante elementos
        int [] listaNUmerosIntroducidos = new int[]{32,12,34,54,32,3543,};  //modo largo
        System.out.println("el tamaño del array es " + listaNumeros.length);
        listaNumeros[listaNumeros.length -1 ] = 45;
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println(listaNumeros[i]);

        }

        //Foreach -> Se usa para recorrer arrays
        for(int numero: listaNumeros){
            System.out.println(numero);
        }

        Bonoloto bonoloto = new Bonoloto();
        bonoloto.iniciarJuegi();
        bonoloto.listarNumeros();
        bonoloto.listarNumerosUsuario();
        bonoloto.decirAciertos();
    }
}
