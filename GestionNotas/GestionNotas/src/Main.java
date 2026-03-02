import model.Alumno;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {

        Alumno a1 = new Alumno("Borja", "Martin", "1234A", 8);
        Alumno a2 = new Alumno("Paco", "maria", "2345A" );
        Alumno a3 = new Alumno("Juan", "gomez", "5678G");
        Alumno a4 = new Alumno("Pedro", "Jimenez", "8374E");
        Alumno a5 = new Alumno("Sergio", "Gomez", "9845F");

        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        alumnos.add(a4);
        alumnos.add(a5);
        //forma tradicional
        /*for (Alumno alumno : alumnos) {
            alumno.mostrarDatos();
        }*/

        //Funcion lambda:
        //param -> cuerpo
        //tras la llamada a la función foreach se llama a la función flecha definida en los parámetros
        //Se puede añadir un cuerpo
        alumnos.forEach(alumno -> alumno.mostrarDatos());  // el retorno está implícito en la funcion
        alumnos.forEach(alumno -> {
            System.out.println("Vamos a imprimir los datos de " + alumno.getNombre());
            alumno.mostrarDatos();
            //si retorna algo debes pones  return lo que sea
        });
        //metodo de acceso directo  //DIRECTOS
        alumnos.forEach(Alumno::mostrarDatos);  // no necesita los paréntesis de la funcion por el  método no puede tener parámetros
        //stream es una copia sin afectar al original
        //Copiar recorrer y modificar listas
        //map -> recorre y transforma
        //obtiene una copia de la lista y modifica uno a uno
        alumnos.stream().map(Alumno::getNota).forEach(System.out::println);  //stream es una copia sin afectar al original
        alumnos.stream().map(Alumno::getNota).forEach(nota -> {
            System.out.println(nota * 2);
        });

        //BiFunction obligatorio 3 parametros
        //
        BiFunction<Integer, Integer, Integer> funcionMulti = (p1, p2) -> p1 *p2; // 1 sola linea
        BiFunction<Integer, Integer, Integer> funcionMultion2 = (p1, p2) -> {
            return p1* p2;
        }; // 1 sola linea

        alumnos.stream().map(Alumno::getNota).forEach(nota ->System.out.println(funcionMulti.apply(nota, 2)));

        //BiConsumer = Funcion de 2 parametros, 1º tipo de dato que admite la funcion, 2º es el tipo de retorno de la funcion

        Alumno[] arrayAlumnos =  {a1,a2, a3,a4,a5};
     }
}
