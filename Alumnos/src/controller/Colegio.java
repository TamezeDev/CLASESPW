package controller;

import model.Alumno;
import model.Profesor;

import java.util.ArrayList;

public class Colegio {
    private ArrayList<Alumno> alumnos;
    private Profesor profesor;
    private int matriculas;

    public Colegio(){
        alumnos = new ArrayList<>();
        profesor = new Profesor();
        matriculas = 1;
    }
    public Colegio(Profesor profesor){
        alumnos = new ArrayList<>();
        this.profesor = profesor;
    }
    public void matricularAlumno(String nombre){
        alumnos.add(new Alumno(matriculas))
    }
}
