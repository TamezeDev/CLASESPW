import model.Alumno;
import model.Persona;
import model.Profesor;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Borja", "Martin", 1234);
        alumno.setCurso("DAM");
        alumno.mostrarDatos();
        Profesor profesor = new Profesor("Ezequiel", "Tamayo", 2323, 1111);
        profesor.mostrarDatos();
        ArrayList<Persona> personaArrayList = new ArrayList<>();
        personaArrayList.add(alumno);
        personaArrayList.add(profesor);

        for (Persona persona : personaArrayList) {
            if (persona instanceof Profesor){
                ((Profesor) persona).getNivelExperiencia();

            } else if (persona instanceof Alumno) {
                ((Alumno) persona).realizarExamen();
            }

        }
    }
}
