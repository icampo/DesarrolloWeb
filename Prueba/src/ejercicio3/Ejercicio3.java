package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Declaramos las variables necesarias
		
		int varNum1;
		int varNum2;
		int varNum3;
		
		// Creamos una consola nueva
		
		Scanner sc=new Scanner(System.in);
		
		// Solicitamos los datos al usuario
		
		// Primer numero
		
		System.out.print("Introduce el primer numero: ");
		varNum1=sc.nextInt();
		
		// Segundo numero
		
		System.out.print("Introduce el segundo numero: ");
		varNum2=sc.nextInt();
		
		// Tercer numero
		
		System.out.print("Introduce el tercer numero: ");
		varNum3=sc.nextInt();
		
		// Creamos el metodo
		
		System.out.print("Orden inverso: "+varNum3+" "+varNum2+" "+varNum1);

	}

}
