package model;

import util.ResultadoException;

public class Operaciones {
    public int operarSuma(int operando1, int operando2) throws ClassCastException{
        return  operando1 + operando2;
    }
    public int operarResta(int operando1, int operando2) throws ResultadoException{
        if (operando2 > operando1) throw new ResultadoException("El resultado de la resta es negativo");
        return  operando1 - operando2;
    }
    public int operarMulti(int operando1, int operando2) throws NoSuchFieldException{
        return  operando1 * operando2;
    }
    //POne en aviso que este metodo podria dar ese tipo de error
    public int operarDivision(int operando1, int operando2) throws ArithmeticException, Exception{
        return  operando1 / operando2;
    }
}
