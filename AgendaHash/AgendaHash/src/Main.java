import controller.Agenda;
import model.Persona;

public class Main {
    static void main() {
        Agenda agenda = new Agenda();
        agenda.agregarPersona(new Persona("Ezequiel", "Tamayo", "1234"));

        System.out.println(agenda.obtenerPersona("1234"));
    }
}
