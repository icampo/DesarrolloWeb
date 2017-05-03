import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar variables del numero 1 y numero 2
		
		int varNumero1;
		int varNumero2;
		
		// Definir escaner para leer consola
		
		Scanner sc=new Scanner(System.in);
		
		// Introducir datos en consola del primer numero
		
		System.out.println("Introduce el primer numero:");
		varNumero1=sc.nextInt();
		
		// Introducir datos en consola del primer numero
		
		System.out.println("Introduce el segundo numero:");
		varNumero2=sc.nextInt();
		
		// Comparación de ambos numeros
		
		if (varNumero1==varNumero2){
	    System.out.println("Los numeros son iguales");
		}
		else {
			System.out.println("Los numeros no son iguales");
		}
	}

}
