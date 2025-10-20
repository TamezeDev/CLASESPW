
import java.util.Scanner;

public class Ejercicio {
    //iniciar herrramientas
    Scanner lecturaTeclado;

    public void ejercicio1(){
        //pedir datos
        lecturaTeclado = new Scanner(System.in);
        System.out.println("Cuantos bocatas vais a pedir?");
        int numeroBocatas = lecturaTeclado.nextInt();
        System.out.println("Cuantas bebidas vais a pedir?");
        int numeroBebidas = lecturaTeclado.nextInt();
        System.out.println("Cuanto cuesta cada bocata?");
        int precioBocata = lecturaTeclado.nextInt();
        System.out.println("Cuanto cuesta cada bebida?");
        int precioBebida = lecturaTeclado.nextInt();
        System.out.println("Cuantas personas entran en la cuenta?");
        int personas = lecturaTeclado.nextInt();
        //operar datos
        double precioBocatas = numeroBocatas * precioBocata;
        double precioBebidas = numeroBebidas * precioBebida;
        double precioFinal = precioBocatas + precioBebidas;
        double precioIndividual = precioFinal / personas;
        //mostrar datos
        System.out.printf("El precio de los bocatas es %.2f%n", precioBocatas);
        System.out.printf("El precio de las bebidas es %.2f%n", precioBebidas);
        System.out.printf("El precio total de la compra es %.2f%n", precioFinal);
        System.out.printf("El precio que tiene que pagar cada uno es %.2f%n", precioIndividual);
        lecturaTeclado.close();
        lecturaTeclado = null;


    }

    public void ejercicio4(){
        lecturaTeclado = new Scanner(System.in);
        System.out.println("¿Cuantos segundos quieres pasar a tiempo?");
        int segundosTotal = lecturaTeclado.nextInt();
        int horas = segundosTotal / 3600;
        int minutos = (segundosTotal % 3600) / 60;
        int segundos = (segundosTotal % 60);

        System.out.println("el numero de horas es : " + horas);
        System.out.println("el numero de minutos es : " + minutos);
        System.out.println("el numero de segundos es : " + segundos);

        lecturaTeclado.close();
        lecturaTeclado = null;

    }
}
