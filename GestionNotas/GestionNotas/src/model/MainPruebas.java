package model;

import controller.Gestor;

import java.util.Optional;

public class MainPruebas {
    public static void main(String[] args) {
        Gestor gestor = new Gestor();
        gestor.agregarAlumno(new Alumno("Alumn1", "apelllido1", "1234", 2));
        gestor.agregarAlumno(new Alumno("Alumn4", "apelllido4", "1234"));
        gestor.agregarAlumno(new Alumno("Alumn5", "apelllido5", "1234"));
        gestor.agregarAlumno(new Alumno("Alumn2", "apelllido2", "4568", 8));
        gestor.agregarAlumno(new Alumno("Alumn3", "apelllido3", "3245", 7));
        gestor.calificarAlumnos();
        gestor.mostrarAlumno();

        System.out.println(gestor.getNumeroAprobado());
        gestor.getAprobados().forEach(Alumno::mostrarDatos);

        //podemos separa con , funciones de consumo //ifPresent para una respuesta, ifPresentOrElse permite dar una alternativa si no lo encuentra separado por comas
        String dni = "2333";
        gestor.getAlumnoByCorreo("2333").ifPresentOrElse(Alumno::mostrarDatos, () -> gestor.agregarAlumno(new Alumno("nuevo", "nuevo", dni, 4)));

        gestor.ordenarNotas().forEach(Alumno::mostrarDatos);

        gestor.getAlumnosUmbral((item, nota) -> item.getNota() > nota , 8);
        gestor.getAlumnosUmbral((item, nota) -> item.getNota() < nota , 8);
        gestor.getAlumnosUmbral((item, nota) -> (item.getNota()*2 /3) > nota , 8);

    }

}
