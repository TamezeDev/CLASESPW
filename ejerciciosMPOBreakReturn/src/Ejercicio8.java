public class Ejercicio8 {
    public int contarEdadesValidas(int[] edades){
        int count = 0;
        for (int edade : edades) {
            if (edade < 0 || edade > 120){
                continue;
            }count ++;
        }return count;
    }
    public void mostrarEdadesValidas(int[] edades){
        for (int edade : edades) {
            if (edade < 0 || edade > 120){
                continue;
            }
            System.out.println(edade);
        }
    }

}
