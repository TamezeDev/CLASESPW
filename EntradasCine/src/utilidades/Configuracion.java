package utilidades;

import modelo.Datos;
import modelo.Operacion;

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
        Datos datos = new Datos();
        Operacion operacion = new Operacion();
        datos.pedirDatos();
        operacion.aplicarDescuentos(datos.getDiaSemana(), datos.getEstudiante());
        double precioFinal = operacion.calcularPrecioFinal(datos.getNumeroEntradas());
        operacion.comboChecker(precioFinal);
        System.out.println(operacion.generarResumen(datos.getNumeroEntradas()));
    }

    public void modoUI() {

    }

}
