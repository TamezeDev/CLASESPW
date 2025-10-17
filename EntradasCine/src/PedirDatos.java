import java.util.Scanner;

public class PedirDatos {
    int numeroEntradas;
    String diaSemana;
    boolean esEstudiante;

    public void pideDatos(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuantas entradas quieres comprar?");
        numeroEntradas = teclado.nextInt();
        do{
        System.out.println("¿Que dia de la semana es hoy?");}while()

    }

    public void comprobarDiaSemana(String dia){
        String [] diasValidos = new String[]{"LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO"};
        for (int i = 0;i < diasValidos.length; i++){
            if (!diaSemana.toUpperCase().equals(diasValidos[i])){
                System.out.println("Debe introducir un día de la semana");
            }else{
                return;
            }
        }
    }
}
