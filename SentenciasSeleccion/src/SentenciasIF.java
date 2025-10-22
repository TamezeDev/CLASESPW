public class SentenciasIF {
    public void examenAprobado(int nota) {
        System.out.println("Procedemos a evaluar si un examen esta bien");
        System.out.println("La nota que ha sacado es " + nota);
        if (nota >= 5) {
            System.out.println("Has aprobado");

        } else {
            System.out.println("Has suspendido");
        }
        System.out.println("cerrando el programa de evaluacion");
    }

    public void notaExamen(int nota) {
        if (nota > 0 && nota <= 10) {


            if (nota < 5) {
                System.out.println("El examen está suspenso");
            } else if (nota < 8) {
                System.out.println("El examen está aprobado");

            } else if (nota < 9) {
                System.out.println("tu nota es notable");
            } else if (nota < 10) {
                System.out.println("tu nota es matricula");
            } else {
                System.out.println("tu nota es MH");
            }        //pedir datos
        } else {
            System.out.println("tu numero no esta en la escala correcta");
        }
    }
}
