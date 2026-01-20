package model;

public abstract class Persona {
        private String nombre;
        private String apellido;

        //TODO: Me olvido del constructor por ahora

    public Persona(){

    }
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public abstract  void saludar();

    public  void  mostrarDatos(){

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);

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
}
