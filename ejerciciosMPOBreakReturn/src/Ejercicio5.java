import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Ejercicio5 {
    public Map<String, String> cargarPruebas() {
        Map<String, String> pruebaCredenciales = new HashMap<>();
        String usuarioIntento1 = "Juan";
        String passwordIntento1 = "1234";

        String usuarioIntento2 = "Maria";
        String passwordIntento2 = "abcd";

        String usuarioIntento3 = "admin";
        String passwordIntento3 = "1234";
        pruebaCredenciales.put(usuarioIntento1, passwordIntento1);
        pruebaCredenciales.put(usuarioIntento2, passwordIntento2);
        pruebaCredenciales.put(usuarioIntento3, passwordIntento3);
        return pruebaCredenciales;
    }

    public void intentarLogin(Map<String, String> pruebaCredenciales) {
        for (Map.Entry<String, String> user : pruebaCredenciales.entrySet()) {
            String name = user.getKey();
            String pass = user.getValue();
            System.out.println("Probando usuario: " + name); // AÑADE ESTA LÍNEA
            if (comprobarLogin(name, pass)) {
                System.out.println("usuario logueado con éxito");
                break;
            }
        }
    }

    private boolean comprobarLogin(String usuario, String password) {
        String usuarioCorrecto = "Juan";
        String passwordCorrecta = "1234";
        if (usuario.equals(usuarioCorrecto) && password.equals(passwordCorrecta)) {
            System.out.println("credenciales correctas");
            return true;
        }
        System.out.println("Credenciales incorrectas, prueba de nuevo");
        return false;
    }
}
