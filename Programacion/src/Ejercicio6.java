import java.util.Scanner;

public class Ejercicio6 {

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
		
		// Condicion de si el numero 1 y el 2 son iguales nos lo ordene
		
			if(varNumero1==varNumero2){
				System.out.print(varNumero1+" = "+varNumero2);
			}
		
		// Condicion de si el numero 1 es mayor que el 2 nos lo ordene
		
			if(varNumero1>varNumero2){
				System.out.print(varNumero1+" > "+varNumero2);}
		
		// Condicion de si el numero 2 es mayor que el 1 nos lo ordene
		
			else if(varNumero2>varNumero1){
				System.out.print(varNumero2+" > "+varNumero1);
			}
		
		}
}
