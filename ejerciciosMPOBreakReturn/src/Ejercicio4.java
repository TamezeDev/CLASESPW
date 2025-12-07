public class Ejercicio4 {
    public double calcularPromedio(double[] notas) {
        double suma = 0;
        int notasValidas = 0;
        double promedio;
        for (double nota : notas) {
            if (nota < 0 || nota > 10) {
                continue;
            }
            suma += nota;
            notasValidas++;
        }
        if(notasValidas == 0) return 0;
        promedio = suma / notasValidas;
        return promedio;
    }
}
