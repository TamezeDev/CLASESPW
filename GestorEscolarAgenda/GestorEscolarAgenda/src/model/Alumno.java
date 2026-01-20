package model;

public class Alumno extends Persona {

    private int numeroMatricula;
    private String curso;

    public Alumno(String nombre, String apellido, int numeroMatricula) {
        super(nombre, apellido);
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    @Override
    public void saludar(){
        System.out.println("hola soy un alumno");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("matricula: " + numeroMatricula);
        System.out.println("curso:" + curso);
    }

    public void realizarExamen() {
        System.out.println("Vamos a realiza un examen");

    }
}
