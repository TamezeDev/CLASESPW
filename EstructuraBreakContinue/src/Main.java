public class Main {
    public static void main(String[] args) {

        // break -> para la repetición en el momento donde see indica. Siempre es la ultima linea del cuerpo de repeticion.
        // return -> retorna un valor (EL METODO) . El return es la ultima linea del metodo.
        // continue -> pasa el turno cuando te indique
        // if ternario -> decide el VALOR de una variable dependiendo de una condición lógica
        for (int i = 0; i < 10; i++) {
            System.out.println("Repitiendo " + i);
            if (i == 3) {
                break;
            }
        }
        System.out.println("Terminando el programa");

        int acumulador = 0;
        do{
            acumulador += (int)(Math.random() * 41);
            if (acumulador > 100 && acumulador <=120){
                System.out.println("Te acercas peligrosamente");
                break;// break solo puede ir dentro de un bucle. Te saca solo del primer bucle.
            }
        }while(acumulador <= 301);

        //ir ternario
        //variable = un valor segun una condicion ? valor de variable cuando es true : valor cuando es false
        int nota = 7;
        String resultado = nota <5 ? "suspenso" : "aprobado";
        System.out.println(resultado);

    }



}
