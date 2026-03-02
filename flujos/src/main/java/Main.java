import controller.GestorFicheros;

public class Main {
    public static void main(String[] args) {
        GestorFicheros gestor = new GestorFicheros();
        gestor.crearFichero("src/main/java/recursos/escritura.txt");
        gestor.crearaCarpeta("src/main/java/ra/ejemplo");
        gestor.informacionFichero("src/main/java/recursos");
        gestor.lectorFichero("src/main/java/recursos/lectura.txt");
        gestor.lectorPorLineas("src/main/java/recursos/lectura.txt");
        gestor.escrituraFichero("src/main/java/recursos/escritura.txt");
        gestor.escrituraLineas("src/main/java/recursos/escritura.txt");
        gestor.codificarMensaje("src/main/java/recursos/codificado.txt");
        gestor.descifrarMensaje("src/main/java/recursos/codificado.txt");
    }
}
