package sample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void sumar() {
        Calculator calculator = new Calculator();
        assertEquals((2 + 2), calculator.sumar(2, 2));
    }

    @Test
    public void restar() {
    }

    @Test
    public void multiplicar() {
    }

    @Test
    public void dividir() {
    }
}