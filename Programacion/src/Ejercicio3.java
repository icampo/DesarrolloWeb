import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar variables del Nombre 1 y Nombre 2
		
		String varNombre1;
		String varNombre2;
		
		// Definir escaner para leer consola
		
		Scanner sc=new Scanner(System.in);
		
		// Introducir datos en consola del primer numero
		
		System.out.println("Introduce el primer nombre:");
		varNombre1=sc.nextLine();
		
		// Introducir datos en consola del primer numero
		
		System.out.println("Introduce el segundo ombre:");
		varNombre2=sc.nextLine();
		
		// Comparación de ambos numeros
		
		if (varNombre1.equals(varNombre2)){
	    System.out.println("Los nombres son iguales");
		}
		else {
			System.out.println("Los nombres no son iguales");
		}
	}

}
