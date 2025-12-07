import java.util.Scanner;

public class Ejercicio1 {
    private boolean validarContrasena(String password) {
        if (password.length() < 8) {
            return false;
        } else if (!buscarMayuscula(password)) {
            return false;
        } else if (!buscarNumero(password)) {
            return false;
        }
        return true;
    }

    private boolean buscarMayuscula(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean buscarNumero(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public void mainControl() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la contraseña que desea validar: (Debe contener 8 caracteres, mayusculas y Numeros");
        String UserPass = scanner.next();
        if (validarContrasena(UserPass)) {
            System.out.println("Contraseña validada correctamente");

        } else {
            System.out.println("La contraseña no cumple con los requisitos");
        }
    }
}
