package model;

public class Asignatura {

    private int id;
    private  double calificacion;

    public Asignatura() {
    }

    public Asignatura(int id) {
        this.id = id;
    }

    public Asignatura(int id, double calificacion) {
        this.id = id;
        this.calificacion = calificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    public  void mostrarDatos(){
        System.out.println("id: "+ id);
        System.out.println("calificacion: " + calificacion);
    }
}
