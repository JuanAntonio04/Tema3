package Pruebas;

public class Calculadora {

	private int numero1;
	private int numero2;

	public Calculadora(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public int suma() {
		int resultado = numero1+ numero2;
		return resultado;

	}

	public int resta() {

		return numero1 - numero2;

	}

	public int multiplicacion() {

		return numero1 * numero2;

	}

	public int division() {

		return numero1 / numero2;

	}

	public int divide0() {
		int resultado;
		
		if (numero2 == 0) {

			throw new java.lang.ArithmeticException("Division por 0");
			
		}else {
			
			resultado = numero1 / numero2;
			
		}
		
		return resultado;
		
	}

}
