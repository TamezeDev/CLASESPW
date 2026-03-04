package test;

import app.Pedido;
import app.Producto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {
    Pedido pedido = new Pedido();

    @Test
    void lanzaErrorAniadiendoNull() {
        // Lanza error por null
        assertThrows(IllegalArgumentException.class,() -> pedido.addProducto(null) );
    }
    @Test
    void aniadePedidoCorrecto(){
        Producto producto1 = new Producto("Pan", 1.5);
        pedido.addProducto(producto1);
        assertEquals(producto1, pedido.getProductos().getFirst());
    }

}