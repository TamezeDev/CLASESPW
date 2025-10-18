import utilidades.Configuracion;

public class Main {
    public static void main(String[] args) {
        Configuracion config = new Configuracion();

        config.setDebug(args.length > 0 && args[0].equalsIgnoreCase("debug"));

        config.ejecutarPrograma();
    }
}
