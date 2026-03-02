public class Main {
    public static void main(String[] args) {
        OperacionesFichero operacionesFichero = new OperacionesFichero();
        operacionesFichero.leerDatosFichero();
        operacionesFichero.leerhijos("src/main/java/resources/ficheros");
        operacionesFichero.crearFicheros("src/main/java/resources/ficheros");
        operacionesFichero.crearDirectorio("src/main/java/resources/ficheros");
        operacionesFichero.lecturaAscii("src/main/java/resources/ficheros/ejemplo.txt");
        operacionesFichero.lecturaLinea("src/main/java/resources/ficheros/ejemplo.txt");
        operacionesFichero.lectorCodigos("src/main/java/resources/ficheros/ejemplo/codigo.txt");
    }
}
