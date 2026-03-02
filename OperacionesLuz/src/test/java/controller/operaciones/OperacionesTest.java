package controller.operaciones;

import controller.operaciones.Operaciones;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OperacionesTest {
    Operaciones operaciones = new Operaciones();

    @Test
    void sumar() {
        // Prueba con números positivos
        int resultado = operaciones.sumar(5, 3);
        assertEquals(8, resultado, "La suma de 5 + 3 debe ser 8");

        // Prueba con números negativos
        resultado = operaciones.sumar(-5, -3);
        assertEquals(-8, resultado, "La suma de -5 + -3 debe ser -8");

        // Prueba con un positivo y un negativo
        resultado = operaciones.sumar(5, -3);
        assertEquals(2, resultado, "La suma de 5 + -3 debe ser 2");
    }


    @Test
    void restar() {
        // Prueba con números positivos
        int resultado = operaciones.restar(5, 3);
        assertEquals(2, resultado, "La resta de 5 - 3 debe ser 2");

        // Prueba con números negativos
        resultado = operaciones.restar(-5, -3);
        assertEquals(-2, resultado, "La resta de -5 - -3 debe ser -2");

        // Prueba con un positivo y un negativo
        resultado = operaciones.restar(5, -3);
        assertEquals(8, resultado, "La resta de 5 - -3 debe ser 8");
    }
}