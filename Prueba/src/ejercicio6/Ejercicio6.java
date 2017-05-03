package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Declaramos las variables
		
		int varNum1;
		int varNum2;
		int varSwap=0;
		
		// Creamos la consola 
		
		Scanner sc=new Scanner(System.in);

		// Introducimos el primer valor
		
		System.out.print("Introduce el primer numero: ");
		varNum1=sc.nextInt();
		
		System.out.print("Introduce el segundo numero: ");
		varNum2=sc.nextInt();
		
		if(varNum1>varNum2){
			varSwap=varNum1;
			varNum1=varNum2;
			varNum2=varSwap;
		}
		
		for(int i=varNum1;i<=varNum2;i++){
			if(i%2!=0){
				System.out.print(i+" ");
			}
		}

		}

}