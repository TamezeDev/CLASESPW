package ejercicio10;

public class Alumno {
    private String nombre;
    private double notaTeoria;
    private double notaPractica;

    public Alumno(String nombre, int notaTeoria, int notaPractica) {
        this.nombre = nombre;
        this.notaTeoria = notaTeoria;
        this.notaPractica = notaPractica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaTeoria() {
        return notaTeoria;
    }

    public void setNotaTeoria(double notaTeoria) {
        this.notaTeoria = notaTeoria;
    }

    public double getNotaPractica() {
        return notaPractica;
    }

    public void setNotaPractica(double notaPractica) {
        this.notaPractica = notaPractica;
    }
}
