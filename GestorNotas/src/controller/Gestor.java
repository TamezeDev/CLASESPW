package controller;

import model.Producto;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;

public class Gestor {

    private List<Producto> productos;

    public Gestor() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p){
      if (productos.stream().anyMatch(it -> it.getCodigo().equalsIgnoreCase(p.getCodigo()))){
          System.out.println("Codigo ya usado, no se puede agregar");

      }else{
          productos.add(p);
          System.out.println("Producto agregado correctamente");
      }
     /* if (buscarPorCodigo(p.getCodigo()).isPresent()){
          System.out.println("No se puede agregar codigo duplicado");
      }
      else {
          productos.add(p);
      }*/
    }

    public void asignarPrecios(){
        productos.stream().filter(item -> item.getPrecio() < 0).forEach(item -> item.setPrecio(Math.random() * 100 +1));

    }
    public void mostrarProductos(){
        productos.stream().forEach(Producto::mostrarDatos);
    }
    public double calcularPrecioMedio(){
        //si no pones orElse debes devolver un OptionalDouble y hay que tratarlo como throws y el error para cazarlo en la ejecucion
       return productos.stream().mapToDouble(Producto::getPrecio).average().orElse(0.0);
    }

    public long getNumeroProductosCaros(double limite){
        //coun devuelve  un long
        return productos.stream().filter(item -> item.getPrecio() >= limite).count();
    }

    public List<Producto> getListaProductos(double limite){
        return  productos.stream().filter(item -> item.getPrecio() >= limite).toList();
    }
    public Optional<Producto> buscarPorCodigo(String codigo){
        return productos.stream().filter(item -> item.getCodigo().equals(codigo)).findAny();
    }
    public void ordenarProductos(){
        productos.sort(Comparator.comparingDouble(Producto::getPrecio).reversed());
    }

    public List<Producto> getProductosPorCondicion(BiPredicate<Producto, Double> condicion,  double valor){
        return productos.stream().filter(item -> condicion.test(item, valor)).toList();
    }
}
