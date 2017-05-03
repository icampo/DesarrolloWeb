import java.nio.IntBuffer;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Declarar variables
		
		String varNumero;
		String inverNumero;

		// Definir scanner
		
		Scanner sc=new Scanner(System.in);
		
		// Introducción de datos en consola
		
		System.out.print("Introduce un Numero: ");
		varNumero=sc.nextLine();
		
		// Definir constructor para que se muestre el numero al reves
		
		inverNumero = new StringBuilder(varNumero).reverse().toString();
		
		// Mostrar en numero invertido
			
		if(inverNumero==varNumero)
			 System.out.println("\nEl numero es capicua\n");
			else
			 System.out.println("\nEl numero no es capicua\n");
				
		}
}