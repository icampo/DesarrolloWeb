import java.nio.IntBuffer;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Declarar variables
		
		String varCapicua;
		String varNoCapicua;

		// Definir scanner
		
		Scanner sc=new Scanner(System.in);
		
		// Introducción de datos en consola
		
		System.out.print("Introduce un Numero: ");
		varCapicua=sc.nextLine();
		
		// Definir constructor para que se muestre el numero al reves
		
		varNoCapicua = new StringBuilder(varCapicua).reverse().toString();
		
		// Añadir condiciones para indicar que el numero es capicua o no
	
			if(varCapicua.equals(varNoCapicua)){
			 System.out.println("\nEl numero es capicua\n");
		}
			else{
			 System.out.println("\nEl numero no es capicua\n");
			}	
		}
}