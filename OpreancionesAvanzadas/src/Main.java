//necesito funcionalidad de otra clase
import controller.GestorDocumental;
//import.controller.*; //importa todas las clases de un paquete, si no necestitas usarlas todas no las uses

public class Main {
    public static void main(String[] args){
        GestorDocumental gestorDocumental = new GestorDocumental();
        gestorDocumental.enviarDocumento(); //llama al metetodo de la clase
    }
}
