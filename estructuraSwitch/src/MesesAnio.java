public enum MesesAnio {
    Enero("invierno", 1), Febrero("invierno", 2), Marzo("primavera", 3), Abril("primavera", 4), Mayo("primavera", 5), Junio("verano", 6), Julio("verano", 7), Agosto("verano", 8), Septiembre("Otoño", 9), Octubre("Otoño", 10), Noviembre("Otoño", 11), Diciembre("invierno", 12);

    // Me vale para contruir los enums
    int numeroMes;
    String estacion;

    MesesAnio(String estacionP, int numeroMesP) {
        estacion = estacionP;
        numeroMes = numeroMesP;
    }
}
