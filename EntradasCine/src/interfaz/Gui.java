package interfaz;

import javax.swing.*;

import modelo.Datos;
import modelo.Operacion;
import utilidades.Terminal;


public class Gui {

    private JPanel panel1;
    private JButton abrirTerminalButton;
    private JTextField txtPrecioSingleEntrada;
    private JTextField txtNumeroEntradas;
    private JTextField txtDiaSemana;
    private JTextField txtEstudiante;
    private JButton calcularPreciosButton;
    private JTextArea taResults;
    private JButton resetearCamposButton;

    Operacion operacion = new Operacion();
    Datos datos = new Datos();
    Terminal terminal = new Terminal();

    private String errores = "";

    public Gui() {
        calcularPreciosButton.addActionListener(_ -> {
            comprobarNuevoPrecioEntrada();
            comprobarCantidadEntradas();
            comprobarDiaSemana();
            comprobarEstudiante();
            hacerOperaciones();
        });
        resetearCamposButton.addActionListener(_ -> limpiarCampos());
        abrirTerminalButton.addActionListener(_ -> {

        });
        abrirTerminalButton.addActionListener(_ -> {
            terminal.ejcutarTerminal();
        });

    }

    private void hacerOperaciones() {
        if (validarCampos()) {
            operacion.aplicarDescuentos(datos.getDiaSemana(), datos.getEstudiante());
            double precioFinal = operacion.calcularPrecioFinal(datos.getNumeroEntradas());
            operacion.comboChecker(precioFinal);
            mostrarResumen();
        } else {
            mostrarErrores();
            limpiarErrores();
        }
    }

    private void mostrarResumen() {
        taResults.setText(operacion.generarResumen(datos.getNumeroEntradas()));
    }

    private boolean validarCampos() {
        return (operacion.getPRECIO_BASE() > 0 && datos.getNumeroEntradas() > 0 && datos.getDiaSemana() != null && datos.getEstudiante() != null);
    }

    private void comprobarEstudiante() {
        String datosRecibidos = txtEstudiante.getText();
        if (datosRecibidos.equalsIgnoreCase("SI") || datosRecibidos.equalsIgnoreCase("NO")) {
            datos.setEstudiante(datosRecibidos.toUpperCase());
        } else {
            errores += "Debe indicar si es estudiante en el campo 'Estudiante'\n";
        }
    }

    private void comprobarDiaSemana() {
        String diaElegido = txtDiaSemana.getText().toUpperCase();
        if (datos.comprobarDiaSemana(diaElegido)) {
            datos.setDiaSemana(diaElegido);
        } else {
            errores += "Debe introducir un día de la semana válido en el campo 'Día de la semana'\n";
        }
    }

    private void comprobarCantidadEntradas() {
        try {
            datos.setNumeroEntradas(Integer.parseInt(txtNumeroEntradas.getText()));
            if (datos.getNumeroEntradas() <= 0) {
                errores += "Debe introducir un número mayor a 0 en el campo 'Número de entradas'\n";
            }
        } catch (NumberFormatException error) {
            errores += "Debe introducir un número entero en el campo 'Número de entradas'\n";
        }
    }

    public void cargarPrecioBase() {
        txtPrecioSingleEntrada.setText(String.valueOf(operacion.getPRECIO_BASE()));
    }

    private void comprobarNuevoPrecioEntrada() {
        try {
            double valorElegidoEntrada = Double.parseDouble(txtPrecioSingleEntrada.getText());
            if (valorElegidoEntrada <= 0) {
                errores += "Debe introducir un valor mayor a 0 en el campo 'Precio por entrada'\n";
            } else if (valorElegidoEntrada != 8.0) {
                operacion.setPrecioBase(valorElegidoEntrada);
            }
        } catch (NumberFormatException error) {
            errores += "Debe introducir un valor numérico en el campo 'Precio por entrada'\n";
        }

    }

    private void limpiarCampos() {
        datos.setNumeroEntradas(0);
        datos.setDiaSemana(null);
        datos.setEstudiante(null);
        txtNumeroEntradas.setText("");
        txtDiaSemana.setText("");
        txtEstudiante.setText("");
        taResults.setText(errores);

    }

    private void mostrarErrores() {
        taResults.setText(errores);
    }

    private void limpiarErrores() {
        errores = "";
    }

    public JPanel getPanel() {
        return panel1;
    }
}
