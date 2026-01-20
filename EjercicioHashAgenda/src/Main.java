import model.Agenda;
import model.Contacto;

public class Main {
    public static void main(String[] args) {
        Contacto contacto = new Contacto("Pedro", "652987656");
        Contacto contacto1 = new Contacto("Sergio", "643123456");
        Contacto contacto2 = new Contacto("Juan", "658763498");
        Contacto contacto3 = new Contacto("Paco", "687423671");

        Agenda agenda = new Agenda();
        agenda.agregarContacto(contacto);
        agenda.agregarContacto(contacto1);
        agenda.agregarContacto(contacto2);
        agenda.agregarContacto(contacto3);

        agenda.contarContactos();

        System.out.println(agenda.buscarContacto("Juan"));

        agenda.listarContacto();

        if (agenda.eliminarContacto("Pedro")){
            System.out.println("Eliminando contacto Pedro...");
            System.out.println("Contacto eliminado exitosamente");
        }

        agenda.contarContactos();

    }
}
