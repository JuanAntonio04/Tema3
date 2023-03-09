package Pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	private Calculadora calculadora;
	
	@BeforeEach
	public void CrearCalculadora() {
		
		calculadora = new Calculadora(20, 10);
		
	}
	
	@Test
	public void testSuma() {
		int valorEsperado = 30;
		double resultado = calculadora.suma();
		assertEquals(valorEsperado, resultado, 0);
	}

	@Test
	public void testResta() {
		double valorEsperado = 10, resultado ;
		resultado = calculadora.resta();
		assertEquals(valorEsperado, resultado, 0);
	}

	@Test
	public void testMultiplicacion() {
		double valorEsperado = 200, resultado ;
		resultado = calculadora.multiplicacion();
		assertEquals(valorEsperado, resultado, 0);
	}

	@Test
	public void testDivision() {
		double valorEsperado = 2, resultado ;
		resultado = calculadora.division();
		assertEquals(valorEsperado, resultado, 0);
	}
	
	@Test
	public void divide0() {
		Calculadora calcu = new Calculadora(20, 0);
		Exception exception = assertThrows(ArithmeticException.class, () -> calcu.divide0());
		assertEquals("Divide por 0", exception.getMessage());
	}
	
	@Test
	public void divide0_2() {
		Calculadora calcu = new Calculadora(20, 2);
		Exception exception = assertThrows(ArithmeticException.class, () -> calcu.divide0());
		assertEquals("Divide por 0", exception.getMessage());
	}

}
