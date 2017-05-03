import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declarar varibles
		
		int varNumero1;
		int varNumero2;
		
		// Definir scanner
		
		Scanner sc=new Scanner(System.in);
		
		// Introducir datos en consola
		
		System.out.print("Introduce el Primer Numero: ");
		varNumero1=sc.nextInt();
		System.out.print("Introduce el Segundo Numero: ");
		varNumero2=sc.nextInt();
		
		// Condicion de si el numero 1 y 2 son iguales nos lo indique
		
			if(varNumero1==varNumero2){
				System.out.print("El numero "+varNumero1+" y el numero "+varNumero2+" son iguales");
			}
		
		// Condicion de si el numero 1 es mayor que el 2 son iguales nos lo indique
		
			if(varNumero1>varNumero2){
				System.out.println("El numero "+varNumero1+" es mayor que "+varNumero2);}
		
		// Condicion de si el numero 2 es mayor que el 1 son iguales nos lo indique
		
			else if(varNumero2>varNumero1){
				System.out.println("El numero "+varNumero2+" es mayor que "+varNumero1);
			}
		
	}

}
