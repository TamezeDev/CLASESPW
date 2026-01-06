import java.util.Scanner;

public class UserService {

    Agend agend = new Agend();

    public void mainMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("-------MENU AGENDA-------\n1. Agregar persona.\n2. Buscar persona,\n3. Borrar persona.\n4. Listar personas.\n5. Salir\n");
            int userChoice;
            userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1 -> getUserData();
                case 2 -> getDniUserToSearch();
                case 3 -> getDniToDeleteUser();
                case 4 -> agend.showAgend();
                case 5 ->{
                    System.out.println("Saliendo del programa Agenda");
                return;}
            }
        }
    }

    private void getUserData() {
        Scanner sc = new Scanner(System.in);
        String name, surname, dni;
        int phone;
        System.out.println("Introduce el nombre:");
        name = sc.next();
        System.out.println("Introduce el apellido:");
        surname = sc.next();
        System.out.println("Introduce el telefono;:");
        phone = sc.nextInt();
        System.out.println("Introduce tu dni:");
        dni = sc.next();

        User user = new User(name, surname, phone, dni);

        agend.addUserToList(user);
    }

    private void getDniUserToSearch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el dni del usuario a buscar:");
        String dni = sc.next();
        agend.searchUser(dni);
    }

    private void getDniToDeleteUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el dni del usuario a eliminar:");
        String dni = sc.next();
        agend.deleteUser(dni);
    }


}
