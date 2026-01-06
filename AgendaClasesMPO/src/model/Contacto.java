package model;

public class Contacto {
    private int id;
    private  String nombre, apellido, dni;
    private int telefono;

    public Contacto() {
    }

    public Contacto(int id, String nombre, String apellido, String dni, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
    }

    public Contacto(String apellido, String nombre, String dni, int telefono) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }

    public void mostrarDatos(){
        System.out.println("Mostrando datos del contacto " + nombre);
        System.out.println("id: " + id);
        System.out.println("nombre: " + nombre);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
