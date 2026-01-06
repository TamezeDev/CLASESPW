package model;

public class Alumno {
    private Asignatura asignatura1;
    private Asignatura asignatura2;
    private Asignatura asignatura3;
    private  double calificaciones;
    private String nombre;

    public Alumno() {
    }

    public Asignatura getAsignatura1() {
        return asignatura1;
    }

    public Alumno(String nombre, int id1, int id2, int id3){
        this.nombre = nombre;
        asignatura1 = new Asignatura(id1);
        asignatura2 = new Asignatura(id2);
        asignatura3 = new Asignatura(id3);

    }

    public void setAsignatura1(Asignatura asignatura1) {
        this.asignatura1 = asignatura1;
    }

    public Asignatura getAsignatura2() {
        return asignatura2;
    }

    public void setAsignatura2(Asignatura asignatura2) {
        this.asignatura2 = asignatura2;
    }

    public Asignatura getAsignatura3() {
        return asignatura3;
    }

    public void setAsignatura3(Asignatura asignatura3) {
        this.asignatura3 = asignatura3;
    }

    public double getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double calificaciones) {
        this.calificaciones = calificaciones;
    }

    public Alumno(Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3) {
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
    }
    public void mostrarDatos(){
        System.out.println("Mostrando los datos de las asignaturas");
        asignatura1.mostrarDatos();
        asignatura2.mostrarDatos();
        asignatura3.mostrarDatos();

    }
}
