package e1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {


    private Calculadora calc = new Calculadora();

    @Test
    @DisplayName("Test de la suma")
    void suma() {
        int esperado = 5;
        assertEquals(esperado, calc.suma(2,3));

    }

    @Test
    @DisplayName("Test de la resta")
    void resta() {
        int esperado = 1;
        assertEquals(esperado, calc.resta(3,2));

    }

    @Test
    @DisplayName("Test de la multiplicación")
    void multiplica() {
        int esperado = 6;
        assertEquals(esperado, calc.multiplica(2,3));
    }

    @Test
    @DisplayName("Test de la división")
    void divide() {
        float esperado = 2;
        assertEquals(esperado, calc.divide(6,3));
    }

    @Test
    @DisplayName("Test de la división por 0")
    void dividePorCero() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(6,0));
    }
}