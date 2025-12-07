import java.util.ArrayList;

public class Main {

    static ArrayList<Object[]> listaContactos = new ArrayList<>();
    public static void main(String[] args) {
        //Agenda de contactos -> ArrayList<Object[]>
        //poder guardar tantos contactos como necesite
        //cada contacto tiene unos datos fijos -> nombre, apellido, dni, teléfono  -> Object []
        //Object[]array {"Borja", "Martin", "12344A", 1234}
        //Se puede acceder mediante Object [][0] -> primer elemento del primer elemento del arrays

        listaContactos.add(new Object[]{"Borja", "Martin", "12344A", 1234});
        listaContactos.add(new Object[]{"Maria", "Lopez", "2345A", 2345});
        listaContactos.add(new Object[]{"Juan", "Gomez  ", "4566A", 34354});
        mostrarContactos();
        System.out.println("Vamos a  ver el ultimo nombre");
        System.out.println(listaContactos.get(listaContactos.size() -1 )[0]);
        System.out.println("Procedemos a borrar un elemento con dni 4566A");
        borrarContacto("4566A");
        mostrarContactos();
    }

    public static void mostrarContactos(){
        for (Object[] listaContacto : listaContactos) {
            for (Object o : listaContacto) {
                System.out.print(o + "\t");
            }
            System.out.println();
        }
    }

    public static  void borrarContacto(String dni){

        for (int i = 0; i < listaContactos.size(); i++) {
            if (listaContactos.get(i)[2].equals(dni)){
                listaContactos.remove(listaContactos.get(i));
                break;
            }
        }
    }
}

