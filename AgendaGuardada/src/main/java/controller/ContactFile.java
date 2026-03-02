package controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import model.Contact;
import util.Path;

public class ContactFile {
    Path path = new Path();

    public List<Contact> loadFile() {
        File file = new File(path.getContacts());
        List<Contact> saveContacts = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] contactData = line.split(",");
                Contact contact = new Contact(contactData[0], contactData[1], contactData[2], contactData[3], contactData[4]);
                saveContacts.add(contact);
            }

        } catch (FileNotFoundException e) {
            System.out.println("No existe agenda guardada anteriormente\n");
            return null;

        } catch (IOException e) {
            System.out.println("Error en la lectura del fichero");
            return null;
        }
        return saveContacts;
    }

    public void saveFile(List<Contact> contactList){
        File file = new File(path.getContacts());
        try(PrintWriter pw = new PrintWriter(file)){
            if (!file.exists()){
                file.createNewFile();
            }
            contactList.forEach(contact -> {
                String contactData = String.format("%s,%s,%s,%s,%s", contact.getName(), contact.getLastName(), contact.getEmail(),contact.getDni(),contact.getPhone());
                pw.write(contactData);
                pw.println();
            });
            System.out.println("Lista de contactos actualizada");

        }catch (FileNotFoundException e ){
            System.out.println("Fichero no localizado para guardar los contactos");
        }catch (IOException e ){
            System.out.println("Error de acceso al fichero de contactos");
        }
    }

}
