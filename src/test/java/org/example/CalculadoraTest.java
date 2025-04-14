package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    private Calculadora calc;

    @BeforeEach
    void prepararCalcudora() {
        calc = new Calculadora(); // Se ejecuta antes de cada test
    }

    // 
    @Test
    void sumaDosNumerosPositivos() {

        assertEquals(5, calc.suma(2, 3));
    }

    @Test
    void sumaNumeroPositivoYNegativo() {

        assertEquals(4, calc.suma(-1, 5));
    }

    @Test
    void sumaConCero() {

        assertEquals(0, calc.suma(0, 0));
    }

    // pruebas de restas
    @Test
    void restaDosNumerosPositivos() {

        assertEquals(2, calc.resta(5, 3));
    }

    @Test
    void restaNumeroPositivoYNegativo() {

        assertEquals(-5, calc.resta(10, 15));
    }

    // pruebas multiplicacion
    @Test
    void multiplicacionDosNumerosPositivos() {

        assertEquals(4, calc.multiplicacion(2, 2));
    }

    @Test
    void multiplicacionPorCero() {

        assertEquals(0, calc.multiplicacion(3, 0));
    }

    // rpuebas de division
    @Test
    void divisionValida() {
        assertEquals(2, calc.division(6, 3));
    }

    @Test
    void divisionPorCeroLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> calc.division(5, 0));
    }

    // si es par
    @Test
    void numeroPar() {
        assertTrue(calc.esPar(4));
    }

    @Test
    void numeroImpar() {
        assertFalse(calc.esPar(5));
    }

    // maximo numero
    @Test
    void maximoEntreTresNumeros() {

        assertEquals(3, calc.maximo(1, 2, 3));
    }

    // si es divisible
    @Test
    void esDivisible() {
        assertTrue(calc.esDivisible(10, 2));
    }

    @Test
    void noEsDivisible() {
        assertFalse(calc.esDivisible(10, 3));
    }
}
