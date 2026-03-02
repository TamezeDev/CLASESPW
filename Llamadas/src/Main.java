import model.LlamadaLocal;
import model.LlamadaProvincial;

public class Main {
    public static void main(String[] args) {
        LlamadaLocal local = new LlamadaLocal(456,743,3);
        LlamadaProvincial provincial = new LlamadaProvincial(123, 234, 5);
        provincial.calcularCoste();

    }
}