package controller;

import model.Alumno;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class Gestor {
    private ArrayList<Alumno> alumnos;
    private HashMap<String, Alumno> alumnosMap;

    public Gestor() {
        this.alumnosMap = new HashMap<>();
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        if (alumnosMap.containsKey(alumno.getDni())) {
            System.out.println("no se puede agregar");
        } else {
            System.out.println("agregado correctamente");
            alumnosMap.put(alumno.getDni(), alumno);

        }

        if (alumnosMap.put(alumno.getDni(), alumno) == null) {  //el put retorna un alumno si lo puede agregar, devuelve el alumno si no pudo
            System.out.println("alumno agregado correctamente");
        } else {
            System.out.println("Alumno no agregado, dni duplicado");
        }
        /* Hacerlo asi es mas largo
        for(Alumno item: alumnos){
            if (item.getDni().equals(alumno.getDni())){
                System.out.println("no puedo");
                return
            }
            alumnos.add(alumno);
        }*/

        boolean esta = alumnos.stream().anyMatch(item -> item.getDni().equals(alumno.getDni())); // comprueba si  esta ono en la copìa de la lista
        if (esta) {
            System.out.println("No se puede agregar");
        } else {
            System.out.println("usuario registrado con exito");
            alumnos.add(alumno);
        }
    }

    public void mostrarAlumno() {
        /*alumnos.forEach()  */
        alumnos.forEach(Alumno::mostrarDatos);

        // para hacerlo con Map
        alumnosMap.values().forEach(Alumno::mostrarDatos);  // devuelve solo los valores asociados en el map
    }

    public void calificarAlumnos() {
        //para modificar la original
        alumnos.forEach(item -> {
            if (item.getNota() == -1) {
                item.setNota((int) (Math.random() * 11));
            }
        });
    }

    public void calcularMedia() {
        double acumulador;
        //alumnos.stream().mapMulti(item ->item.getNota()).forEach( item -> acumulador += item) / size;
        OptionalDouble media = alumnos.stream().mapToDouble(Alumno::getNota).average();  // Hay funciones de todo tipo, medias, sumas, restas
        System.out.println(media.getAsDouble());     //getAsDouble transforma un optionalDouble
    }

    //numero de usuarios que  han aprobado
    public int getNumeroAprobado() {
        return (int) alumnos.stream().filter(alumno -> alumno.getNota() >= 5).count();
    }

    public List<Alumno> getAprobados() {
        return alumnos.stream().filter(alumno -> alumno.getNota() >= 5).toList();
    }

    public Optional<Alumno> getAlumnoByCorreo(String dni) {
        //filter devuelve la copia de la lista filtrada
        return alumnos.stream().filter(alumno -> alumno.getDni().equals(dni)).findAny();
    }

    public List<Alumno> ordenarNotas() {
        //recorro y comparo de 2 en 2
        //Collections.sot(lista) // para objetos Collecctions.sort(objeto, new Comparator<Alumno>(){.....})
        return alumnos.stream().sorted(Comparator.comparing(Alumno::getNota)).toList();
    }

    public void getNotaUmbral(int nota) {
        alumnos.stream().filter(item -> item.getNota() >= nota).forEach(Alumno::mostrarDatos);
    }
//tenemos que crear tantos predicados como necesitesmos para usar la funcion
    public void getAlumnosUmbral(BiPredicate<Alumno, Integer> predicate, int nota){
       alumnos.stream().filter(item -> predicate.test(item, nota)).forEach(Alumno::mostrarDatos);
    }
}
