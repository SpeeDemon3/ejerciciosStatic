package ejercicio1;
/**
 */
public class Globo {
	// Atributo estatico
	private static int reference;
	private static int counter;
	
	// Constructor
	public Globo() {
		// Aumento en 1 el contador
		counter++;
		// Asigno el valor a la referencia
		reference = counter;
	}
	
	// Setters & Getters
	public int getReference() {
		return reference;
	}
	
	
	// Metodo toString() sobrescrito
	@Override
	public String toString() {
		return "Reference " + this.getReference();
	}

}
