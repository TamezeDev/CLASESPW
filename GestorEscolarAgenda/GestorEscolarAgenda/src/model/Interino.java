package model;

public class Interino extends Profesor implements Inspector{

    private int horasOposicion;
    private  int estadoBolsa;



    public int getHorasOposicion() {
        return horasOposicion;
    }

    public void setHorasOposicion(int horasOposicion) {
        this.horasOposicion = horasOposicion;
    }

    public Interino() {
    }


    public int getEstadoBolsa() {
        return estadoBolsa;
    }

    public void setEstadoBolsa(int estadoBolsa) {
        this.estadoBolsa = estadoBolsa;
    }
    @Override
    public  void realizarInspeccion(){

    }

    public void realizarOposicion(){
        System.out.println("voy a realizar la oposicion");
        int randomN = (int)(Math.random() * 11);
        if (randomN > 5){
            System.out.println("he aprobado la oposicion");
        }
        else {
            System.out.println("he suspendido la oposicion");
        }
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }

    @Override
    public void saludar() {
        super.saludar();
    }

    @Override
    public void corregirExamen() {
        super.corregirExamen();
    }
}
