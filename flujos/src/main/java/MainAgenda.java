import java.util.Scanner;

public class MainAgenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        int opcion = -1;
        System.out.println("1.Agregar usuario");
        System.out.println("2.Listar usuario");
        System.out.println("3. Exportar usuario");

        System.out.println("¿Que quiere hacer?");
        opcion = scanner.nextInt();

    }
}
