
import model.Operaciones;
import util.ResultadoException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Excepciones
        //asegurar la disponibilidad de mi programa
        //codificando:
        //ERROR -> Algo mal estructurado dentro de un programa
        // int dato = true;  ERROR  porque el compilador no hace aun nada
        //FALLO:
        //Error producido en tiempo de ejecucion
        //EXCEPTION: -> Clase padre de las excepciones.(Hay que intentar capturar la correcta)
        //RuntimeException -> no se puede ejecutar en tiempo de ejecucion, no es obligatorio capturarlas
        // NullPointer  ->Acceder a un elemento que tiene como valor nulo
        // ArraysIndexOfBoundException -> acceder a posicion de array que no existe
        // StringIndexOfBoundException -> acceder a una posicion que no exite en un String
        //InputMissMatchException  -> entrada por Scanner tipo dato incorrecto
        //ArithmeticException -> division infinita o matematica incorrecta
        //CastClassException -> castear algo que no es posible en otro tipo
        //IOEXCEPTION -> No se producen en tiempo de ejecucion, ES OBLIGATORIO capturarlas, se produce al acceder a elementos externos
        //
         //Metodos de captura
        //try/catch/finally
            //intenta
                //hacer estas cosas
            //catch
                //primero se capturan las especificas y despues las genericas
                //si falla algo sal por su excepcion
                //e.getMessage -> nos muestra el tipo de fallo por consola
            //finally
                //finalmente pase una cosa u otra ejecutas esto
        //throws
            //pongo un aviso al metodo que puede producir el fallo para que cuando sea utilizado que se sepa
        //throw -> lanzar excepciones personalizadas o existentes
        int[] numeros = new int[]{2,5,3,67,8,4,};
        //System.out.println(numeros[60]); // ArraysIndexOfBoundException  el compilador no puede ejecutarlo

        Operaciones op = new Operaciones();
        Scanner sc = new Scanner(System.in);
    int op1,op2;
    try{
        System.out.println("Introduce el numero 1");
        op1 = sc.nextInt();
        System.out.println("Introduce el numero 2");
        op2 = sc.nextInt();
        System.out.println(op.operarSuma(op1,op2));
        System.out.println(op.operarResta(op1,op2));
        System.out.println(op.operarMulti(op1,op2));
        System.out.println(op.operarDivision(op1,op2));

    }catch (ArithmeticException e){
        System.out.println("Error en operacion");
    }catch (ClassCastException | NoSuchFieldException e){
        //Doble error con una misma solucion
    }
    catch (ResultadoException resultadoException){
        System.out.println("Debes poner el segundo valor mayor que el mayor");
        resultadoException.printStackTrace();
    }
    catch (Exception e) {
        System.out.println("Esta es una captura generica");
    }
    finally{
        System.out.println("Cerrando el programa de calculadora");
    }


    }
}
