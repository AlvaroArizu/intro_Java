import java.util.Scanner; //Accedo a la clase scaner desde el pgm


public class Inicio {

	public static void main(String[] args) {
		/*Pedir por consola 2 nros enteros
		 * Mostrarlos
		 * 1.SUMA
		 * 2.RESTA
		 * 3.MULTI
		 * 
		 * */
		String strNombre;
		int int1;
		int int2;
		long lngSuma;
		int intResta;
		long lngMulti; 
		
		//Objeto de la clase Scanner
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		//Captura - Asignacion 
		System.out.println("Ingrese el nombre: ");
		strNombre=teclado.next();
		System.out.print("Ingrese nro 1: ");
		int1=teclado.nextInt();
		System.out.print("Ingrese nro 2: ");
		int2=teclado.nextInt();
		
		//Resolucion 
		lngSuma=int1 + int2;
		intResta=int1-int2;
		lngMulti=int1*int2;
		
		//Mostrar resultados 
		System.out.println("\n El nombre es: "+ strNombre);
		System.out.println("\n Resultado de las operaciones matematicas");
		System.out.println("\n Suma de: "+int1 +"+" +int2+" = "+ lngSuma);
		System.out.println("\n Resta de: "+int1 +"-" +int2+" = "+ intResta);
		System.out.println("\n Suma de: "+int1 +"x" +int2+" = "+ lngMulti);
		
	}

}

