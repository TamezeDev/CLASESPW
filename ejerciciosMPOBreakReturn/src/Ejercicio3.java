public class Ejercicio3 {

    void mostrarPares(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0){
                continue;
            }
            System.out.println(numeros [i]);
        }
    }
}
