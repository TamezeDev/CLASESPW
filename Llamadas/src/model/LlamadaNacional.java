package model;

public final class LlamadaNacional extends Llamada implements Tarificable {

    private int franja;

    public LlamadaNacional() {

    }

    public LlamadaNacional(long nOrigen, long nDestino, int duracion, int franja) {
        super(nOrigen, nDestino, duracion);
        this.franja = franja;
    }

    @Override
    public void calcularCoste() {
        switch (franja){
            case 1 -> setCoste((getDuracion() * 0.20));
            case 2 -> setCoste((getDuracion() * 0.25));
            case 3 -> setCoste((getDuracion() * 0.30));
            default-> setCoste((getDuracion() * 0.20));

        }
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Llamada Nacional");
        super.mostrarDatos();
        System.out.println("franja:" + franja);
    }
}
