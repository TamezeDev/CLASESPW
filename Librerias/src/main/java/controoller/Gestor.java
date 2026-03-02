package controoller;

import model.Libreria;
import model.Libro;
import model.Personaje;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class Gestor {
    public void exportarXML() {

        Libreria libreria = new Libreria();
        Libro libro = new Libro(1994, 123123, 100, "Libro1", "Escritor1", "Ciencia FIcción");
        libro.getPersonajes().add(new Personaje("Pers1Libro1", "Principal", false));
        libro.getPersonajes().add(new Personaje("Pers2Libro", "Principal", true));
        libro.getPersonajes().add(new Personaje("Pers3Libro", "secundario", false));


        Libro libro2 = new Libro(2000, 234234, 200, "Libro1", "Escritor2", "Narrativa");
        libro2.getPersonajes().add(new Personaje("Pers1Libro2", "Principal", false));
        libro2.getPersonajes().add(new Personaje("Pers2Libro2", "Principal", false));

        Libro libro3 = new Libro(2020, 345345, 300, "Libro3", "Escritor3", "Accion");
        libro3.getPersonajes().add(new Personaje("Pers1Libro3", "Secundario", true));
        libro3.getPersonajes().add(new Personaje("Pers2Libro3", "Principal", false));

        libreria.getBooks().add(libro);
        libreria.getBooks().add(libro2);
        libreria.getBooks().add(libro3);

        try {
            JAXBContext context = JAXBContext.newInstance(Libreria.class);
            Marshaller marshaller = context.createMarshaller();    //Escritor
            marshaller.marshal(libreria, new File("src/main/java/ficheros/libreria.xml"));
        } catch (JAXBException e) {
            System.err.println("Error en los atributos XML");
        }catch (Exception e){
            System.err.println("Error en la gestion del fichero");
        }
    }

}
