package model;

public abstract class Profesor extends Persona {

    private int salario;
    private int nivelExperiencia;
    public Profesor(){

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("salario: " + getSalario());
        System.out.println("nivel de experiencia: " + getNivelExperiencia());
    }

    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public  void saludar(){
        System.out.println("Hola soy un profesor");
    }

    public void corregirExamen(){
        System.out.println("Procedo a corregir los exámenes");
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(int nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }
}
