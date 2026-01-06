package model;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> listaContacto;
    private  int id;

    public Agenda(){
        listaContacto = new ArrayList<>();
        id = 1;
    }
    public Agenda(ArrayList<Contacto> listaContacto, int id) {
        this.listaContacto = listaContacto;
        this.id = id;
    }

    public void agregarContacto(String contacto) {

    }
    private Contacto estaContacto(String dni){
        for (Contacto contacto : listaContacto) {
            if(contacto.getDni().equals(dni)){
                return contacto;
            }

        }
        return  null;
    }

    public ArrayList<Contacto> getListaContacto() {
        return listaContacto;
    }

    public void setListaContacto(ArrayList<Contacto> listaContacto) {
        this.listaContacto = listaContacto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
