public class Main {
    public static void main(String[] args) {
        //Autoboxing una variable primitiva la conviertes en compleja
        String palabra = "asd";
        int numero = 100;
        Integer numeroComplejo = 100;
        numeroComplejo = numero; //AUTOBOX
        //Unboxing -> pasa numero primitivo a numero complejo;


        //operadores
        //aritméticos + - * / %
        //asignación = += -= *= /= %=
        //relacionales < > != ---
        //lógicos && cuando todas las condiciones de la sentencia es false (solo comprara a nivel de boolean) (Para cuando encuentra un false)
        // & opera a nivel de bit (no para, comprueba entero
//        1 byte  = 8 bit = 00000000
//        256 128 64 32 16 8 4 2 1
//        RWX - 4 2 1
//         5 -> 101
//         6 -> 110
//         R -> 100 = 4 (READ)
//        | -> si todos son 1 = 1 ; si todos  son 0 = 0 (comprueba todos los elementos)
//        12 -> 1100
//        13 -> 1101
//        R -> 1101

//        ||Se para cuando encuentra un true

        String parabra = null;
//        System.out.println(parabra.length()); //NullPointerException

        //CASTEO -> paso temporal de un tipo de variable
        //implicito que esta
        String frase = "Esta frase la vamos a codificar";
        for (int i = 0; i < frase.length(); i++) {
            char letraPalabra = frase. charAt(i);
            System.out.print((int)letraPalabra + " ");
        }


    }
}
