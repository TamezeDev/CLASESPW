package utilidades;

import interfaz.Gui;

import javax.swing.*;
import java.io.File;

public class Terminal {

    public void ejcutarTerminal() {
        //Esto lo ha generado la IA para lanzar la consola según ejecutemos .jar/.class
        try {
            File currentPath = new File(Gui.class.getProtectionDomain().getCodeSource().getLocation().toURI());
            String command;

            if (currentPath.getName().endsWith(".jar")) {
                command = "java -jar \"" + currentPath.getName() + "\" debug";
                new ProcessBuilder("cmd.exe", "/c", "start cmd /k " + command)
                        .directory(currentPath.getParentFile())
                        .start();
            } else {
                command = "java Main debug";
                new ProcessBuilder("cmd.exe", "/c", "start cmd /k " + command)
                        .directory(new File("out/production/EntradasCine"))
                        .start();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al abrir la terminal");
        }
    }
}
