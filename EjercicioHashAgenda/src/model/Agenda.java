package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Agenda {
    HashMap<String, String> agenda;

    public Agenda() {
        agenda = new HashMap<>();
    }

    public void agregarContacto(Contacto contacto) {
        if (agenda == null) {
            new Agenda();
        }
        if (agenda.containsKey(contacto.getNombre())) {
            System.out.println("El contacto introducido ya está en la agenda");
            return;
        }
        agenda.put(contacto.getNombre(), contacto.getTelefono());
        System.out.println("Contacto agregado:" + contacto.getNombre() + " - " + contacto.getTelefono());
    }

    public String buscarContacto(String nombre) {
        System.out.println("Buscando teléfono de " + nombre);
        if (agenda.containsKey(nombre)) {
            return "Teléfono de " + nombre + ": " + agenda.get(nombre);
        }
        return "El teléfono de " + nombre + " no se encuentra registrado en la agenda";
    }

    public boolean eliminarContacto(String nombre) {
        if (agenda.containsKey(nombre)) {
            agenda.remove(nombre);
            return true;
        }
        return false;
    }

    public void listarContacto() {
        if (agenda.size() == 0 || agenda == null) {
            System.out.println("No hay contactos en la agenda");
            return;
        }
        System.out.println("listado de contactos:");
        Set<String> nombresContactos = agenda.keySet();
        for (String contacto : nombresContactos) {
            System.out.println(" - " + contacto + ": " + agenda.get(contacto));
        }
    }

    public void contarContactos() {
        System.out.println("Total de contactos: " + agenda.size());
    }

    public boolean existeContacto(String nombre) {
        return agenda.containsKey(nombre);
    }
}
