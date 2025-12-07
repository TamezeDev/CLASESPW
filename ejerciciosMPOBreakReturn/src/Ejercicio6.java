public class Ejercicio6 {
    public String procesarTareas(String[] tareas){
        for (String tarea : tareas) {
            if(tarea.equals("URGENTE")){
                return tarea;
            }
        }return "No hay tareas urgentes";
    }
}
