package model;

public final class Fijo extends Profesor{

    private int pagaExtra;
    private  int horasExtra;

    public Fijo(){}

    public Fijo(String nombre, String apellido, int pagaExtra, int horasExtra) {
        super(nombre, apellido);
        setNivelExperiencia(8);
        this.pagaExtra = pagaExtra;
        this.horasExtra = horasExtra;

    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("pagaExtra = " + pagaExtra);
        System.out.println("nHoras = " + horasExtra);
    }

    @Override
    public void corregirExamen(){
        super.corregirExamen();
        System.out.println("Soy un profesor y corrijo duramente");
    }
    @Override
    public void  saludar(){
        super.saludar();
        System.out.println("Vamos a dar la clase que soy un profesor fijo");
    }

    public void  pedirCambioHoras(int horas){
        if (horas > this.horasExtra){
            System.out.println("no se puede, te quedas en negativo");
        }else {
            this.horasExtra -= horas;
        }
    }

    public int getPagaExtra() {
        return pagaExtra;
    }

    public void setPagaExtra(int pagaExtra) {
        this.pagaExtra = pagaExtra;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }
}
