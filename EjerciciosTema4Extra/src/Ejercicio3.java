import java.util.Scanner;

public class Ejercicio3 {

    public void iniciarPrograma(){
        Scanner scanner = new Scanner(System.in);
        double [] notas = new double[10];
        double nota;
        for (int i = 0; i < notas.length; i++) {
            do {
                System.out.println("Indicame la nota del alumno");
                nota = scanner.nextDouble();
                if (nota < 0 || nota > 10){
                    System.out.println("invalida");
                }else{
                    notas[i] = nota;
                }
            }while (nota >= 0 && nota <= 10);
        }
    }
}
