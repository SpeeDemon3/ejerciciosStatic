package ejercicio2;
/**
 * 
 * @author speedemon
 *
 */
public class PruebasCalculadora {

	/*
	 * Crear una clase Calculadora con métodos estáticos: suma, resta, multiplica y divide. 
	 * Desde una clase principal PruebasCalculadora invocar a los cuatro métodos.
	 */
	public static void main(String[] args) {

		// LLamo a los metodos desde la propia clase Calculadora, pasando los valores necesarios por parametro
		Calculadora.add(9, 1);
		Calculadora.subtract(10, 9);
		Calculadora.multiply(3, 10);
		Calculadora.divide(10, 2);
		
	}

}
