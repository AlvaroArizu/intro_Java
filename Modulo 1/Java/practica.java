public class Principal {

	public static void main(String[] args) {
		/*
		 * Primer programa ejecutable en java Alvaro Arizu
		 * */
		//Punto de inicio del programa 
		//*** Declaracion de Variables y constantes*** 
		//1. Declaracio 
		String strNombre; //Caracter
		final String strSaludo="Hola "; //CONSTANTE
		int intNro=10; //Entero
		int intNro2;
		// "final" para declarar una variable constante 
		
		//*** Asignacion ***
		strNombre="Alvaro";
		
		
		//*** Muestro en consola***
		System.out.println(strSaludo+strNombre);
		
		//***Contadores***
		intNro++; //SUMO
		System.out.println("\n_____SUMA_____");
		System.out.println("Valor de la variable intNuro: "+ intNro);
		
		intNro--; //RESTO
		System.out.println("\n_____RESTA_____");
		System.out.println("Valor de la variable intNuro: "+ intNro);
		
		//***Operadores matematicos***
		intNro2=4;
		intNro2*=intNro;
		System.out.println("\n_____MULTIPLICACION_____");
		System.out.println("Multiplicacion: "+ intNro2);
	}

} 
