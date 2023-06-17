package ejercicio1;
/**
 * 
 * @author speedemon
 *
 */
public class PruebaGlobo {
	
	/*
	 * Crear la clase globo con una variable estática entera para asignar la referencia del globo. 
	 * En una clase principal PruebaGlobo se crearán distintos objetos y desde cada uno de ellos se mostrará la referencia del globo.
	 */
	
	public static void main(String[] args) {

		// Creo 3 objetos de tipo Globo
		Globo one = new Globo();
		// Guardo la referencia
		int reference1 = one.getReference();
		// Imprimo su valor
		System.out.println(reference1);
		
		Globo two = new Globo();
		int reference2 = two.getReference();
		System.out.println(reference2);

		
		Globo three = new Globo();
		// Utilizando el metodo toString obtengo la informacion de la referencia
		System.out.println(three.toString());
		
		
	}

}
