public class Ejercicio9 {

    public int contarVocales(String texto) {
        int vocales = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.toUpperCase().charAt(i) != 'A' && texto.toUpperCase().charAt(i) != 'E' && texto.toUpperCase().charAt(i) != 'I' && texto.toUpperCase().charAt(i) != 'O' && texto.toUpperCase().charAt(i) != 'U') {
                continue;
            }
            vocales++;
        }
        return vocales;
    }
    public boolean contienePalabraProhibida(String texto, String[] palabrasProhibidas){
        for (String palabrasProhibida : palabrasProhibidas) {
            if (texto.contains(palabrasProhibida)){
                return true;
            }
        }return false;
    }
    public String primeraPalabraLarga(String texto, int longitudMinima){
        String[] arrayTexto = texto.split(" ");
        for (String item : arrayTexto) {
            if (item.length() > longitudMinima){
                return item;
            }
        }return "Ninguna palabra supera la longitud mínima";
    }
}
