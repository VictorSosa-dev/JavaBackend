package reto2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class MathApplicationTest {

    @Mock
    private CalculadoraService calcService;

    @InjectMocks
    private MathApplication mathApplication;

    @BeforeEach
    void setUp() {

    }

    @Test
    void add() {
        when(calcService.add(5.0, 5.0)).thenReturn(10.00);

        assertEquals(10.0, mathApplication.add(5.0, 5.0));

        verify(calcService).add(5.0, 5.0);
    }

    @Test
    void subtract() {
        when(calcService.subtract(5.0, 5.0)).thenReturn(0.00);
        assertEquals(0.0, mathApplication.subtract(5.0, 5.0));
        verify(calcService).subtract(5.0, 5.0);
    }

    @Test
    void multiply() {
        when(calcService.multiply(5.0, 5.0)).thenReturn(25.00);
        assertEquals(25.0, mathApplication.multiply(5.0, 5.0));
        verify(calcService).multiply(5.0, 5.0);
    }

    @Test
    void divide() {
        when(calcService.divide(5.0, 5.0)).thenReturn(1.00);
        assertEquals(1.0, mathApplication.divide(5.0, 5.0));
        verify(calcService).divide(5.0, 5.0);
    }
}