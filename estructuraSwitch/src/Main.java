public class Main {
    /*uso de los enum desde otro archivo*/
    public static void main(String[] args) {
        DiaSemana diaSemana = DiaSemana.Viernes;
        switch (diaSemana) {
            case Lunes, Martes, Miercoles, Jueves -> System.out.println("Día laborable");

            case Viernes -> System.out.println("Laborable, casi lo tenemos");

            case Sabado, Domingo -> System.out.println("Fin de semana");

        }
        MesesAnio mesActual = MesesAnio.Noviembre;
        System.out.printf("La fecha de hoy es %d de %s de %d, estacion: %s, mes numero: %d", 7,mesActual, 2025, mesActual.estacion, mesActual.numeroMes);
    }
}
