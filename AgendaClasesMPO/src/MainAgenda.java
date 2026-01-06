import model.Agenda;

import java.util.Scanner;

public class MainAgenda {

    public void menuPrincipal() {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcion;
        do {
            System.out.println("1. Agregar contacto");
            System.out.println("2. Borrar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Listar contacto");
            System.out.println("5. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduce el nombre");
                    String nombre = sc.next();
                    System.out.println("Introduce el apellido");
                    String apellido = sc.next();
                    System.out.println("Introduce el correo");
                    String correo = sc.next();
                    System.out.println("Introduce el dni");
                    String dni = sc.next();
                    System.out.println("Introduce el telefono");
                    int telefono = sc.nextInt();



                }
                case 2 -> {

                }
                case 3 -> {
                }
                case 4 -> {
                }
            }

        } while (opcion != 5);
    }
}
