import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int numero = 2;
        //tamaño fijo -> estructuras estaticas
        int[] numeros = new int[]{2,3,4,5,6};
        for (int num : numeros) {
            System.out.println(num);
        }
        System.out.println("---------------");
        numeros = Arrays.copyOf(numeros, numeros.length+1); //Copia el array y le asignas un nuevo tamaño
        for (int i : numeros) {
            System.out.println(i);
        }
        System.out.println("----------------");
        Arrays.sort(numeros);  // ordena automaticamente
        for (int num: numeros){
            System.out.println(num);
        }
  /*      Arrays.sort(numeros, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2){
                    return 1;
                } else if (o2 > o1) {
                    return 0;
                }
                return 0;
            }
            });*/

        //Colecciones dinamicas
        //ArraList -> [] empieza en 0
        ArrayList<Integer> listaCosas = new ArrayList<>();
        //tamaño del Arraylist
        System.out.println(listaCosas.size());
        listaCosas.add(3);
        listaCosas.add(2);
        listaCosas.add(5);
        //obtener elementos
        listaCosas.get(1);
        //eliminar cosas
        listaCosas.remove(2);
        //modificar datos
        listaCosas.set(1,56);
        for (Integer listaCosa : listaCosas) {
            System.out.println(listaCosa);
        }
        


        System.out.println(listaCosas.size());
    }
}
