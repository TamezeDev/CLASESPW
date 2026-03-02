package service;

import controller.Agend;
import controller.ContactFile;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserService {
    Scanner scanner = new Scanner(System.in);
    ContactFile contactFile = new ContactFile();
    public void showMenu() {

        Agend agend = new Agend();
        boolean exit = false;
        System.out.println("Bienvenido al programa de agenda electronica\n");

        while (!exit) {
            try {
                System.out.println("Selecciona una opción:\n1. Listar contactos.\n" +
                        "2. Añadir contacto\n3. Editar contacto por dni.\n" +
                        "4. Buscar contacto por dni.\n5. Eliminar contacto por dni.\n6.Vaciar agenda.\n7.Salir");
                byte userOption = scanner.nextByte();
                exit = selectOption(agend, userOption);

            } catch (InputMismatchException e) {
                System.out.println("❌Error: Debe introducir un valor numérico.");
                scanner.nextLine();

            }

        }
    }

    public boolean selectOption(Agend agend, byte option) {

        switch (option) {
            case 1 -> agend.showAllContacts();
            case 2 -> agend.addContact();
            case 3 -> {
                scanner.nextLine();
                System.out.println("Introduce el dni del contacto a modificar");
                agend.editContact(scanner.nextLine());
            }
            case 4 -> {
                scanner.nextLine();
                System.out.println("Introduce el dni del contacto a buscar");
                agend.foundContact(scanner.nextLine());
            }
            case 5 -> {
                scanner.nextLine();
                System.out.println("Introduce el dni del contacto a eliminar");
                agend.deleteContact(scanner.nextLine());
            }
            case 6 -> {
                String choice;
                scanner.nextLine();
                boolean exit = false;
                do {
                    System.out.println("¿Realmente quieres vaciar toda la agenda? (si/no)");
                    choice = scanner.next();
                    switch (choice) {
                        case "si" -> {
                            agend.deleteAllContacts();
                            System.out.println("La agenda ahora ha quedado vacía");
                            exit = true;
                        }
                        case "no" ->{
                            System.out.println("Volviendo al menu principal");
                            exit = true;
                        }
                        default -> System.out.println("Debe contestar si o no");
                    }
                } while (!exit);
            }
            case 7 -> {
                scanner.nextLine();
                contactFile.saveFile(agend.getContactList());
                System.out.println("Saliendo del programa agenda....");
                return true;
            }
            default -> System.out.println("El número introducido está fuera del rango indicado\n");
        }

        return false;
    }
}
