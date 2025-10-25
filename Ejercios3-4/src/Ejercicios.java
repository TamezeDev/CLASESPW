import java.util.Scanner;

public class Ejercicios {
    public void ejercicio3A(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indica un numero de 5 digitos: ");
        int numeroAnalizar = teclado.nextInt();
        if (numeroAnalizar >9999 && numeroAnalizar < 100000){
            //79050
            int decenasMil = numeroAnalizar/10000;
            int unidadesMil = (numeroAnalizar%10000)/1000;
            int centenas = ((numeroAnalizar%10000)%1000)/100;
            int decenas = (((numeroAnalizar%10000)%1000)%100)/10;
            int unidades = (((numeroAnalizar%10000)%1000)%100)%10;
        }else{
            System.out.println("Debe introducir un numero de 5 digitos");
        }
    }
}
