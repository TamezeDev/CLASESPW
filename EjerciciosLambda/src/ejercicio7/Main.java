package ejercicio7;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {

        //E7
        BiFunction<Producto,Producto,Producto> mayorPrecio = (producto, producto2) ->  producto.getPrecio() > producto2.getPrecio() ? producto : producto2;
        List<Producto> listaProductos = List.of(new Producto("Pan", 1),
                new Producto("Leche", 2),
                new Producto("yogurt",3),
                new Producto("cafe", 4),
                new Producto("Wiski", 5));

        Producto masCaro = listaProductos.stream().reduce((BinaryOperator<Producto>)mayorPrecio::apply).get();
        System.out.println(masCaro);
    }
}
