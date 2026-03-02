import controller.Gestor;
import model.Categoria;
import model.Producto;

public class Main {
    public static void main(String[] args) {
        Gestor gestor = new Gestor();
        Producto televisor = new Producto("Televisor","AA1", Categoria.TECNOLOGICO, 600.5  );
        gestor.agregarProducto(televisor);

        System.out.println(gestor.calcularPrecioMedio());
        gestor.getProductosPorCondicion((item, value) -> item.getPrecio() > value , 90.0);
    }
}
