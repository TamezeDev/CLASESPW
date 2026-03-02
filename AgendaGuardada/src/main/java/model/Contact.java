package model;

public class Contact {
    private  String name;
    private String lastName;
    private String dni;
    private String email;
    private String phone;

    public Contact(String name, String lastName, String email, String dni, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.dni = dni;
        this.phone = phone;
    }
    public void showContact(){
        System.out.println("Nombre: " + name);
        System.out.println("Apellidos: " + lastName);
        System.out.println("Dni: " + dni);
        System.out.println("Teléfono: " + phone);
        System.out.println("Email: " + email + "\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
