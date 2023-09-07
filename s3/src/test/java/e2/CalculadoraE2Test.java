package e2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class CalculadoraE2Test {

    @Mock
    private CalculadoraDao dao;

    @InjectMocks
    private CalculadoraE2 calculadoraE2;

    @BeforeEach
    void setUp() {
        given(dao.findValorConstante()).willReturn(3);
    }

    @Test
    @DisplayName("Suma de dos números")
    void suma() {
        int esperado = 8;
       assertEquals(esperado, calculadoraE2.suma(3, 2));
    }

    @Test
    @DisplayName("Resta de dos números")
    void resta() {
        int esperado = 4;
        assertEquals(esperado, calculadoraE2.resta(3, 2));

    }

    @Test
    @DisplayName("Multiplicación de dos números")
    void multiplica() {
        int esperado = 15;
        assertEquals(esperado, calculadoraE2.multiplica(6, 2));
    }
}