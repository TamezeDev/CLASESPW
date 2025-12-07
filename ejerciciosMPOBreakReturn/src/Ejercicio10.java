public class Ejercicio10 {
    public boolean verificarStock(int cantidad, int stock){
        if (cantidad > stock){
            return false;
        }return true;
    }
    public double calcularDescuento(double precio, int cantidad){
        if (cantidad > 10){
            return precio * 0.1;
        } else if (cantidad >20) {
            return precio * 0.2;
        }
        return precio;
    }
    public void procesarPedidos(String[] productos, int[]cantidades, double[]precios){
        for (int cantidade : cantidades) {
            if (cantidade <= 0){
                continue;
            }verificarStock(cantidade, 20);
        }

    }
}
