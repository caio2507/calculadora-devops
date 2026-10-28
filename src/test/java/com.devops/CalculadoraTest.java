package com.devops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    @Test
    public void testSomar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.somar(2, 3));
    }

    @Test
    public void testSubtrair() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.subtrair(3, 2));
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicar(2, 3));
    }

    @Test
    public void testDividirSucesso() {
        Calculadora calc = new Calculadora();
        assertEquals(2.5, calc.dividir(5.0, 2.0));
    }

    @Test
    public void testDividirPorZeroExcecao() {
        Calculadora calc = new Calculadora();
        assertThrows(IllegalArgumentException.class, () -> {
            calc.dividir(10.0, 0.0);
        });
    }
}