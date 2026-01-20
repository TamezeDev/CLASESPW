package model;

public class Partido {

    private Equipo equipoLocal, equipoVisitante;

    private  int gLocal, gVisitante;

    private boolean jugado;

    public Partido() {
    }

    public Partido(Equipo equipoVisitante, Equipo equipoLocal) {
        this.equipoVisitante = equipoVisitante;
        this.equipoLocal = equipoLocal;
    }

    public Partido(Equipo equipoLocal, int gVisitante, int gLocal, Equipo equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.gVisitante = gVisitante;
        this.gLocal = gLocal;
        this.equipoVisitante = equipoVisitante;
        equipoLocal.setgFavor(equipoLocal.getgFavor()+gLocal);
        equipoLocal.setgContra(equipoLocal.getgContra() + gVisitante);
        equipoVisitante.setgFavor(equipoVisitante.getgFavor() + gVisitante);
        equipoVisitante.setgContra(equipoVisitante.getgContra() + gLocal);
        jugado = true;
    }

    public void jugarPartido(){
        if (!jugado){
            gLocal = (int)(Math.random() *4);
            gVisitante = (int)(Math.random() *4);
            jugado = true;
        }else{
            System.out.println("Partido ya jugado");
        }
    }
    public void mostrarDatos(){
        System.out.printf("%s:%d VS %s:%d%n", equipoLocal.getNombre(),gLocal, equipoVisitante.getNombre(), gVisitante);
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getgLocal() {
        return gLocal;
    }

    public void setgLocal(int gLocal) {
        this.gLocal = gLocal;
    }

    public int getgVisitante() {
        return gVisitante;
    }

    public void setgVisitante(int gVisitante) {
        this.gVisitante = gVisitante;
    }

    public boolean isJugado() {
        return jugado;
    }

    public void setJugado(boolean jugado) {
        this.jugado = jugado;
    }
}
