package modelo;

public class Operacion {
    private double PRECIO_BASE = 8;
    private double cantidadDescuentoTotalAplicado = 0;
    private double precioActualEntada = PRECIO_BASE;
    private int porcentajeDescuentoTotalAplicado = 0;
    private boolean descuentoAnterior;
    private String palomitasGratis;

    public double getPRECIO_BASE() {
        return PRECIO_BASE;
    }

    public void setPrecioBase(double precioBase) {
        this.PRECIO_BASE = precioBase;
        precioActualEntada = PRECIO_BASE;
    }

    public void aplicarDescuentos(String dia, String estudiante) {
        aplicarDescuentoDia(dia);
        aplicarDescuentoEstudiante(estudiante);
    }

    private void aplicarDescuentoDia(String dia) {
        if (dia.equals("MIERCOLES")) {
            System.out.println(dia);
            double descuentoEspectador = 0.5;
            cantidadDescuentoTotalAplicado = precioActualEntada * descuentoEspectador;
            porcentajeDescuentoTotalAplicado = (int) (descuentoEspectador * 100);
            precioActualEntada -= cantidadDescuentoTotalAplicado;
            descuentoAnterior = true;
        }
    }

    private void aplicarDescuentoEstudiante(String estudiante) {
        if (estudiante.equals("SI")) {
            double descuentoEstudiante = 0.2;
            double cantidadActualDescuento = precioActualEntada * descuentoEstudiante;
            cantidadDescuentoTotalAplicado += cantidadActualDescuento;
            precioActualEntada -= cantidadActualDescuento;
            if (descuentoAnterior) {
                int porcentajeActualDescuento = (int) (porcentajeDescuentoTotalAplicado * descuentoEstudiante);
                porcentajeDescuentoTotalAplicado += porcentajeActualDescuento;
            } else {
                porcentajeDescuentoTotalAplicado = (int) (descuentoEstudiante * 100);
            }
        }
    }

    public double calcularPrecioFinal(int numeroEntradas) {
        return precioActualEntada * numeroEntradas;
    }

    private double calcularDescuentoTotal(int numeroEntradas) {
        return cantidadDescuentoTotalAplicado * numeroEntradas;
    }

    public void comboChecker(double importeFinal) {
        if (importeFinal >= 30) {
            palomitasGratis = "Si";
        } else {
            palomitasGratis = "NO";
        }
    }

    public String generarResumen(int entradas) {
        return String.format("Total a pagar: %.2f€%n", calcularPrecioFinal(entradas)) +
                "Porcentaje de descuento total aplicado: " + porcentajeDescuentoTotalAplicado + "%\n" +
                String.format("Cantidad total de los descuentos: %.2f€%n", calcularDescuentoTotal(entradas)) +
                "Combo de palomitas gratis incluido: " + palomitasGratis;
    }

}
