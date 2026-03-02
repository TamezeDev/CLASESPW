package model;

public final class LlamadaProvincial extends Llamada implements Tarificable {

    private final double COSTE_SEG = 0.15;

    @Override
    public void mostrarDatos() {
        System.out.println("Llamada provincial");
        super.mostrarDatos();
    }

    public LlamadaProvincial() {
    }

    public LlamadaProvincial(long nOrigen, long nDestino, int duracion) {
        super(nOrigen, nDestino, duracion);
    }

    @Override
    public void calcularCoste() {
        setCoste(getDuracion() * COSTE_SEG);
        System.out.println();
    }

}
