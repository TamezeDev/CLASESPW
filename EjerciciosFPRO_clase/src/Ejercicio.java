
import java.util.Scanner;

public class Ejercicio {
    //iniciar herrramientas
    Scanner lecturaTeclado;

    public void ejercicio1() {
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

    public void ejercicio2() {
        //pedir datos
        double precioFinal;
        byte iva;
        System.out.println("Introduce el precio total de la compra");
        lecturaTeclado = new Scanner(System.in);
        precioFinal = lecturaTeclado.nextDouble();
        System.out.println("Introduce el valor del iva de la compra");
        iva = lecturaTeclado.nextByte();
        //operar datos
        double precioBase = precioFinal / (1 + ((double) iva / 100));
        double precioIva = precioFinal - precioBase;
        //mostrar resultados
        System.out.printf("El precio base de la compra ha sido %.2f%n", precioBase);
        System.out.printf("El precio del iva ha sido %.2f%n", precioIva);
        lecturaTeclado.close();
        lecturaTeclado = null;
    }

    public void ejercicio3ModoA() {
        //pedir datos
        lecturaTeclado = new Scanner(System.in);
        int numeroSeleccionado;
        System.out.println("Introduce un numero de 5 dígitos");
        numeroSeleccionado = lecturaTeclado.nextInt();
        //operar datos
        String numeroAString = Integer.toString(numeroSeleccionado);
        String [] letras = numeroAString.split("");
        System.out.println(numeroAString);

        //mostrar datos
        System.out.println("decenas de mil: "+letras[0]);
        System.out.println("unidades de mil: "+letras[1]);
        System.out.println("centenas: "+letras[2]);
        System.out.println("decenas: "+letras[3]);
        System.out.println("unidades: "+letras[4]);

        lecturaTeclado.close();
        lecturaTeclado = null;
    }

    public  void ejercicio3ModoB(){
        //pedir datos
        lecturaTeclado = new Scanner(System.in);
        int numeroSeleccionado;
        System.out.println("Introduce un numero de 5 dígitos");
        numeroSeleccionado = lecturaTeclado.nextInt();
        //operar datos
        byte centenasDeMil = (byte)(numeroSeleccionado / 10000);
        byte decenasDeMil = (byte)((numeroSeleccionado -(centenasDeMil*10000))/1000);
        

        //mostrar datos

        lecturaTeclado.close();
        lecturaTeclado = null;
    }
    public void ejercicio4() {
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

