package Pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Assertions;

class FactorialTest {

	@Test
	public void testCalculo1() {
		int factorial = Factorial.calculo(5), resultadoEsperado = 120;
		assertEquals(resultadoEsperado, factorial, 0);
	}

	@Test
	public void testCalculo2() {
		int factorial = Factorial.calculo(5);
		Assertions.assertThrows(IllegalArgumentException.class, () -> Factorial.calculo(-5));
	}

	@Test
	public void testCalculo3() {
		int factorial = Factorial.calculo(20);
		Assertions.assertThrows(ArithmeticException.class, () -> Factorial.calculo());
	}
	
	@ParameterizedTest
	@CsvSource({"5,120","7,5040"})
	void calculoParametrizado(int numero1, int result) {
		
		assertEquals(result, Factorial.calculo(numero1) , 0);
		
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"Viva el Murcia","Viva el betis"})
	void prueba2(String cadena) {
		
		assertNotNull(cadena);
		
	}
}
