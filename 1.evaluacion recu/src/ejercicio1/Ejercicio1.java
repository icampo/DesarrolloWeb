package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		// Declaramos las variables

		int varNum1=0;
		int varNum2=0;
		int varApoyo=0;
		
		// Creamos la consola
		
		Scanner sc=new Scanner(System.in);
		
		// Introducimos valores
		
		System.out.print("Introduce el primer numero: ");
		varNum1=sc.nextInt();
		
		System.out.print("Introduce el segundo numero: ");
		varNum2=sc.nextInt();
		
		varApoyo=varNum1;
		varNum1=varNum2;
		varNum2=varApoyo;
		
		System.out.print("Num1= "+varNum1+" "+"Num2= "+varNum2);
	
	}

}
