import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadorSimpleTest {

    @Test
    void dosMasDosIgualCuatro() {
        var resultado = new CalculadorSimple();
        assertEquals(4, resultado.suma(2, 2));
    }

    @Test
    void dosMenosDosIgualCero() {
        var resultado = new CalculadorSimple();
        assertEquals(0, resultado.resta(2, 2));
    }

    @Test
    void dosPorDosIgualCuatro() {
        var resultado = new CalculadorSimple();
        assertEquals (4, resultado.multiplicacion(2, 2));
    }

    @Test
    void dosDivididoDosIgualCuatro() {
        var resultado = new CalculadorSimple();
        assertEquals(1, resultado.divicion(2, 2));
    }
}