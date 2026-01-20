package controller;

import model.Partido;

import java.util.ArrayList;

public class Registrador {
    private ArrayList<Partido> listaPartidos;

    public Registrador(){
        listaPartidos = new ArrayList<>();
    }
    public void anadirPartido(Partido partido){
        this.listaPartidos.add(partido);
    }
    public  void mostrarPartidos(){
        for (Partido partido : listaPartidos) {
            partido.mostrarDatos();
        }
    }
    public void mosrtrarPartidos(String nombre){
        for (Partido partido: listaPartidos){
            if (partido.isJugado() && (partido.getEquipoLocal().getNombre().equals(nombre) || partido.getEquipoVisitante().getNombre().equals(nombre))){
                partido.mostrarDatos();
            }
        }
    }
    public void mostrarEstadisticas(String nombre){
        for (Partido partido : listaPartidos) {
            if (partido.getEquipoLocal().getNombre().equals(nombre)){
                partido.getEquipoLocal().mostrarEstadisticas();
            } else if (partido.getEquipoVisitante().getNombre().equals(nombre)) {
                partido.getEquipoVisitante().mostrarEstadisticas();
            }
        }
    }
}
