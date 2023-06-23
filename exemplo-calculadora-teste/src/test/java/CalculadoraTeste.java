import org.example.Calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTeste {
    @Test
    public void testaMultiplicaPorDois () {

        Calculadora calculadora = new Calculadora();

        // Teste com um número positivo
        int resultadoPositivo = calculadora.multiplicaPorDois(2);

        //Assert(4 == calculadora.multiplicaPorDois(2));
        assertEquals(7, calculadora.multiplicaPorDois(2));

        assertEquals(4, resultadoPositivo);

        // Teste com um número negativo
        int resultadoNegativo = calculadora.multiplicaPorDois(-3);
        assertEquals(-6, resultadoNegativo);

        // Teste com zero
        int resultadoZero = calculadora.multiplicaPorDois(0);
        assertEquals(0, resultadoZero);


    }

}

