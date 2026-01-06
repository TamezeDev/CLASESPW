
import java.util.List;

public class User {
    private String name;
    private String surname;
    private int phone;
    private String dni;

    public User(){

    }

    public User(String name, String surname, int phone, String dni) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.dni = dni;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", phone=" + phone + ", dni='" + dni + '}';
    }
}
