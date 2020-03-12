package sample;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    public void testSumar() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.sumar(1, 1));
    }

    public void testRestar() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.restar(2, 1));
    }

    public void testMultiplicar() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.multiplicar(1, 1));
    }

    public void testDividir() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.dividir(1, 1));
    }
}