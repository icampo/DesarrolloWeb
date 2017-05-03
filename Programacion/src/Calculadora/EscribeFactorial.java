package Calculadora;

import java.util.Scanner;

public class EscribeFactorial {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Declarar variables
		
		int numero;
		int factorial=1;

		// Declarar consola
		
		Scanner sc=new Scanner(System.in);
		
		// Solicitar un numero
		
		System.out.print("Introduce un numero: ");
		numero=sc.nextInt();
		
		// Realizar metodo
		
		/*
		for(int i=1; i <= numero; i++){
			factorial=factorial*i;
		}
		*/
		
		for(int i=numero;i > 0; i--){
			factorial=factorial*i;
		}
		
		// Mostrar resultado
		
		System.out.print("El factorial del numero "+numero+" es "+factorial);
		
	}
	
}
