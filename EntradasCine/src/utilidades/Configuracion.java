package utilidades;

import modelo.Datos;
import modelo.Operacion;
import interfaz.Gui;

import javax.swing.*;

public class Configuracion {
    public boolean debug = true;//modo debug desactivado para UI

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public void ejecutarPrograma() {
        if (debug) {
            modoDebug();
        } else {
            modoUI();
        }
    }

    public void modoDebug() {
        startDebug();
    }

    public void modoUI() {
        startUi();

    }

    private void startUi() {
        Gui gui = new Gui();
        JFrame frame = new JFrame("Principal");
        frame.setContentPane(gui.getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        gui.cargarPrecioBase();
    }

    private void startDebug() {
        Datos datos = new Datos();
        Operacion operacion = new Operacion();
        datos.pedirDatos();
        operacion.aplicarDescuentos(datos.getDiaSemana(), datos.getEstudiante());
        double precioFinal = operacion.calcularPrecioFinal(datos.getNumeroEntradas());
        operacion.comboChecker(precioFinal);
        System.out.println(operacion.generarResumen(datos.getNumeroEntradas()));
    }
}
