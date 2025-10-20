package Main;

import Functions.Function;

public class Main {
    public static void main(String[] args) {
        //Distinto paquete solo public
        Function operator = new Function();
        System.out.println(operator.sumar(5.14,6.13));

        //Mismo paquete lee public y protected

        System.out.println(Operators.restar(3.45, 1.13));
        System.out.println(operaciones());
    }

    private static double operaciones(){
        return Operators.multiply(3.3,4.5);
    }
}
