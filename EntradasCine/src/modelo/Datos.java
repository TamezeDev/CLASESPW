package modelo;

import java.util.Scanner;
import java.util.Arrays;

public class Datos {
    private int numeroEntradas;
    private String diaSemana;
    private String estudiante;

    public void pedirDatos() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuántas entradas quieres comprar?");
        while (true) {
            try {
                numeroEntradas = Integer.parseInt(teclado.nextLine());
                if (numeroEntradas > 0) break;
                System.out.println("Por favor, introduce un número válido mayor que 0.");
            } catch (NumberFormatException error) {
                System.out.println("Entrada no válida. Debes introducir un número.");
            }
        }

        System.out.println("¿Qué día de la semana es hoy?");
        while (true) {
            diaSemana = teclado.nextLine().trim().toUpperCase();
            if (comprobarDiaSemana(diaSemana)) {
                break;
            } else {
                System.out.println("Debe introducir un día de la semana válido.");
            }
        }

        System.out.println("¿Eres estudiante? (SI/NO)");
        while (true) {
            estudiante = teclado.nextLine().trim().toUpperCase();
            if (comprobarEstudiante(estudiante)) {
                break;
            } else {
                System.out.println("Debes responder SI o NO.");
            }
        }
    }

    public boolean comprobarDiaSemana(String dia) {
        return Arrays.asList("LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO")
                .contains(dia);
    }

    private boolean comprobarEstudiante(String estudiante) {
        return estudiante.equals("SI") || estudiante.equals("NO");
    }

    public int getNumeroEntradas() {
        return numeroEntradas;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setNumeroEntradas(int numeroEntradas) {
        this.numeroEntradas = numeroEntradas;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }
}
