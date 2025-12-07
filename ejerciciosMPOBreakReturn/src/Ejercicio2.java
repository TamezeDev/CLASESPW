public class Ejercicio2 {
    int[] arrayNumeros = new int[]{1,2,3,4,5,6};

    public  void controlNumero(){
        int posicionEncontrada = buscarNumero(arrayNumeros,3);
        if (posicionEncontrada >= 0){
            System.out.println("El numero encontrado esta en la posicion " + posicionEncontrada);
        }else {
            System.out.println("El numero no se encuentra en el array");
        }
    }
    private int buscarNumero(int[] numeros, int objetivo){
         int posicion = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == objetivo){
                posicion = i +1;
                break;
            }
        }return posicion;
    }
}
