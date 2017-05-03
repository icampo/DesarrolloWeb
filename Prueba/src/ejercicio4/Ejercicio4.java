package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Declaramos las variables necesarias
		
		int varNum1;
		int varNum2;
		
		// Creamos la consola
		
		Scanner sc=new Scanner(System.in);

		// Introducimos los datos necesarios
		
		// Primer valor
		
		System.out.print("Introduce el primer numero: ");
		varNum1=sc.nextInt();
		
		// Segundo valor
		
		System.out.print("Introduce el segundo numero:");
		varNum2=sc.nextInt();
		
		// Creamos el metodo de comparacion
		
		if(varNum1>varNum2){
			System.out.print("El valor "+varNum1+" es mayor que el valor "+varNum2);
		}
		else if(varNum2>varNum1){
			System.out.print("El valor "+varNum2+" es mayor que el valor "+varNum1);
		}else{
			System.out.print("El valor "+varNum1+" es igual que el valor "+varNum2);
		}
		
	}

}
