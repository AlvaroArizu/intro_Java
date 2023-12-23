
public class inicio {

	public static void main(String[] args) {
		double dbNumero;
		int intNro=100;
		dbNumero=intNro; //CASTEO IMPLICITO
		System.out.println("\nValor del int1: "+ intNro);
		System.out.println("\nValor del double: "+ dbNumero);
		
		
		
		float fltNro;
		fltNro=(float)dbNumero; //CASTEO EXPLICITO
		System.out.println("\nValor del float: "+ fltNro);
		
		
		fltNro=31.68f;
		System.out.println("\nValor del float: "+ fltNro);
		int intNro2;
		intNro2=(int)fltNro;
		System.out.println("\nValor del int2: "+ intNro2);
		
		char miChar='A';
		int miInt= miChar; //Lo transforma en asqui // CASTEO IMPLICITO
		System.out.println("\nValor del miInt: "+ miInt);
		
		char miChar2;
		miChar2= (char)intNro; //CASTEO EXPLICITO
		System.out.println("\nValor del miChar2: "+ miChar2);
		
	}

}
