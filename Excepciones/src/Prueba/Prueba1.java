package Prueba;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba1 {

	// Realizar un programa que pida al usuario
	// 2 numeros y un operador y controlar que el
	// usuario escriba valores numericos y que si 
	// Divide entre cero mediante excepciones
	
	public static void main(String[] args){
		
	// Declaramos las variables
		
	int varNum1;
	int varNum2;
	int resultado = 0;
	String operacion;
	
	// Creamos la consola
	
	Scanner sc=new Scanner(System.in);
	
	try {

		// Introducimos los valores 1 y 2
		
		System.out.println("Introduce el primer numero: ");
		varNum1=sc.nextInt();
		
		System.out.println("Introduce el segundo numero: ");
		varNum2=sc.nextInt();
		
		System.out.println("Introduce '+' para sumar,'-' para restar, '/' para dividir:");
		operacion=sc.next();
	
		switch(operacion){
		
			case "+":
				resultado=varNum1+varNum2;
				break;
				
			case "-":
				resultado=varNum1-varNum2;
				break;
				
			case "/":
				resultado=varNum1/varNum2;
				break;
				
		}
		
		System.out.println("El resultado es: "+resultado);
		
	} catch (InputMismatchException en) {

		System.out.println("El valor introducido no es un valor númerico.");

	} 
	
	 catch (ArithmeticException e) {

		System.out.println("No es posible dividir entre 0.");
		
	}
	
	finally {
			
	}
	
	}
}
