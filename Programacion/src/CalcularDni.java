import java.util.Scanner;

public class CalcularDni {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		// Definir variable
		
		int varDni;
		String varLetras="TRWAGMYFPDXBNJZSQVHLCKE";
		
		// Definir consola
		
		Scanner sc=new Scanner(System.in);
		
		// Solicitar introducci�n de datos
		
		System.out.println("Introduce los n�meros del DNI");
		varDni=sc.nextInt();
		
		// Hacer c�lculo para indicar la letra que contiene nuestro DNI
		
		int varCalculo = varDni - (Math.abs(varDni/23)*23);
		System.out.println("La letra de tu DNI es: "+ varLetras.charAt(varCalculo));
		
	}

}

