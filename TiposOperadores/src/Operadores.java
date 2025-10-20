public class Operadores {
    public void operadoresAritmeticos() {
        //unarios
        int operandoUno = 5;
        //incremento -> le suma uno al valor que ya tenía
        operandoUno++;
        operandoUno++;
        operandoUno++;
        operandoUno++;
        System.out.println("El valor del operando despues de los aumentos es " + operandoUno);
        //decremento -> le resta uno al valor que ya tenía
        operandoUno--;
        operandoUno--;
        operandoUno--;
        System.out.println("EL valor del operando despues de los decrementos es: " + operandoUno);
        //Binarios -> necesita dos operadores: suma(+), resta(-) , multi(*), div(/), modulo = resto de una division (%)
        int operandoDos = 8;
        int suma = operandoUno + operandoDos;
        System.out.println("El resutado de la suma es de : "+ suma);
        int resta = operandoUno - operandoDos;
        System.out.println(" El resultado de la resta es :" + resta);
        int multi = operandoUno * operandoDos;
        System.out.println("El resultado de la multiplicación es " + multi);
        double div = (double)operandoUno/operandoDos;   //hay que castear el primero momentaneamente
        System.out.println("El resultadod de la división es "+ div);
        int modulo = operandoUno%operandoDos;
        System.out.println("El módulo de la división es "+modulo);
        //me vale para saber si un numero es par o no
    }

    public static void operadoresAsignacion(){
        int operadorUno = 10;
        operadorUno += 5; //guarda el valor anterior mas el nuevo;
        System.out.println("El nuevo valor del operadorUno es "+ operadorUno);
        operadorUno-=5;
        System.out.println("El nuevo valor del operadorUno es "+ operadorUno);
        operadorUno *= 2;
        System.out.println("El nuevo valor del operadorUno es "+ operadorUno);
        operadorUno /= 2;
        System.out.println("El modulo de operadorUno es "+ operadorUno);
    }
    public void operadoresComparacion(){
        //el resultado de una comparacion siempre da un booleano
        int operandoUno = 10;
        int operandoDOs = 20;
        boolean resultado = operandoUno > operandoDOs;
        System.out.println("El resultado de la comparacion es "+ resultado);
        resultado = operandoUno < operandoDOs;
        resultado = operandoUno >= operandoDOs;
        resultado = operandoUno <= operandoDOs;
        resultado = operandoUno == operandoDOs;
        resultado = operandoUno != operandoDOs;


    }

    public void operadoresLogicos(){
        int sueldo = 20000;
        int edad = 20;
        boolean condicion = false;
        boolean candidatoValido = sueldo < 30000 && edad < 40 && condicion;
        System.out.println(candidatoValido);
        candidatoValido = sueldo < 30000 || edad < 20 || condicion;
        System.out.println(candidatoValido);
    }
    public void evaluarCandidato(double sueldo, int edad, boolean conducir){
        boolean resultado = sueldo  < 20000 && edad < 40 && conducir;
        System.out.println("La evaluacion del candidato es " + resultado);
    }
}
