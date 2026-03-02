package controller;

import model.Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Agend {

    private List<Contact> contactList;

    Scanner scanner = new Scanner(System.in);

    ContactFile contactFile = new ContactFile();
    public Agend() {
        System.out.println("Cargando datos de agenda guardada...");
        List<Contact> saveContacts = contactFile.loadFile();
        if (saveContacts == null){
            this.contactList = new ArrayList<>();
        }else {
            this.contactList = saveContacts;
            System.out.println("Datos de agenda importados correctamente");
        }
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void showAllContacts() {
        if (contactList.size() != 0){
            System.out.println("Mostrando sus contactos:");
            contactList.forEach(contact -> System.out.println(contact.getName() + " " + contact.getLastName() + "\n"));
            return;
        }
        System.out.println("La lista de contactos está vacía");
    }

    public void addContact() {
        //Enter data
        System.out.println("Introduce el nombre del contacto:");
        String name = scanner.nextLine();
        System.out.println("Introduce los apellidos del contacto:");
        String lastName = scanner.nextLine();
        System.out.println("Introduce el dni del contacto:");
        String dni = scanner.nextLine();
        System.out.println("Introduce el email del contacto:");
        String email = scanner.nextLine();
        System.out.println("Introduce el teléfono del contacto:");
        String phone = scanner.nextLine();
        //check if exists
        if (contactList.stream().anyMatch(contact -> contact.getDni().equals(dni))) {
            System.out.println("Error: El dni indicado ya ha sido registrado");
        } else {
            //Save in list
            Contact contact = new Contact(name, lastName, email, dni, phone);
            contactList.add(contact);
            System.out.println("Contacto añadido correctamente\n");
        }
    }

    public void editContact(String dni) {
        contactList.stream().filter(contact -> contact.getDni().equals(dni)).findFirst().ifPresentOrElse(contact -> {
            System.out.println("Introduce los nuevos datos del contacto:");
            System.out.println("Nombre:");
            String name = scanner.nextLine();
            System.out.println("Apellidos:");
            String lastName = scanner.nextLine();
            System.out.println("Email:");
            String email = scanner.nextLine();
            System.out.println("Teléfono:");
            String phone = scanner.nextLine();
            contact.setName(name);
            contact.setLastName(lastName);
            contact.setEmail(email);
            contact.setPhone(phone);
        }, () -> System.out.println("Contacto no encontrado en la agenda\n"));
    }

    public void foundContact(String dni) {
        contactList.stream().filter(contact -> contact.getDni().equals(dni)).findFirst().ifPresentOrElse(Contact::showContact, () -> System.out.println("Contacto no encontrado en la agenda\n"));
    }

    public void deleteContact(String dni) {
        contactList.stream().filter(contact -> contact.getDni().equals(dni)).findFirst().ifPresentOrElse(contact -> contactList.remove(contact), () -> System.out.println("Usuario no encontrado en la agenda"));
    }

    public void deleteAllContacts(){
        contactList.clear();
    }
}