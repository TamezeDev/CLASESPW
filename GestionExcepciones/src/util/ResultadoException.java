package util;

public class ResultadoException extends Exception {
    //Crear propias excepciones
    //Heredar de Exception
    //Constructor del padre modificado a gusto
    //ponerlos en la firmna

    public ResultadoException(String message) {
        super(message);
        System.out.println("Lanzando excepción");
    }
}
