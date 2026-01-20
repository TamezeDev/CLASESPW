package model;

public class Profesor extends Persona {

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

    public Profesor(String nombre, String apellido, int nivelExperiencia, int salario) {
        super(nombre, apellido);
        this.nivelExperiencia = nivelExperiencia;
        this.salario = salario;
    }

    @Override
    public  void saludar(){
        System.out.println("Hola soy un profesor");
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
