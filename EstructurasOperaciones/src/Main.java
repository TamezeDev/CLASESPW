import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Separar funcionalidades en métodos
        //Model
        //View -> Lo que interactúa con el usuario
        //Controller -> maneja la lógica

        //no anides iteraciones max 2
        //usa break/return para romper lógicas

        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. añadir correo");
            System.out.println("2 listar correo");
            System.out.println("3 Buscar correo");
            System.out.println("4 Salir");

            opcion = scanner.nextInt();
            switch (opcion){
                case 1 -> {
                    System.out.println("Introduce un email");
                    String email = scanner.next();

                    if(controller.metodoAnadir(email)){
                        System.out.println("Se ha agregado correctamente");
                    }else {
                        System.out.println("Error al agregar el usuario");
                    }
                }case  2-> {
                    controller.metodosListar();
                }case 3 -> {
                    System.out.println("Que correo quieres buscar?");
                    String emailBuscar = scanner.next();
                    controller.metodosBuscar(emailBuscar);
                }default -> System.out.println("numero no valorado en el menu");
            }

        }while(opcion != 4);
    }

}