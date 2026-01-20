package controller;

import model.Persona;

import java.util.HashMap;
import java.util.Set;

public class Agenda {
    private HashMap<String, Persona> listaContactos;

    public Agenda(){
        listaContactos = new HashMap<>();
    }

    public void agregarPersona(Persona persona){
        if (listaContactos.containsKey(persona.getDni())){
            System.out.println("No se puede agregar, DNI duplicado");
        }else {
            listaContactos.put(persona.getDni(), persona);
        }
    }

    public void borrarPersona(String dni){
        if (listaContactos.remove(dni) != null) {
            System.out.println("Borrado correctamente");
        }else{
            System.out.println("El dni no se encuentra en la lista, no se puede borrar");
        }
    }
    public Persona obtenerPersona(String dni){
        return  listaContactos.get(dni);
    }

    public void obtenerPersonas(){
        Set<String> keys = listaContactos.keySet();
        for (String item : keys) {
            System.out.println(listaContactos.get(item));
        }
    }
}
