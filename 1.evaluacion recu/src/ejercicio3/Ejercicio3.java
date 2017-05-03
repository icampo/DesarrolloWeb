package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Declaramos las variables
		
		double varNum;
		double varTotal=0;
		double varMayor=0;
		int contador=0;
		
		// Creamos consola para introducir los datos
		
		Scanner sc=new Scanner(System.in);
		
		// Creamos la condicion
		
		do{
					
			// Introducimos la nota
					
			System.out.print("Introduce la nota: ");
			varNum=sc.nextDouble();
					
			// Creamos una condicion para introducir numeros mayores a 0
					
				if(varNum>0){
				
				// Condicion para el numero mas alto
					
				if(varNum>=varMayor){
				varMayor=varNum;
				}
				
				varTotal=varTotal+varNum;
				contador++;
				
				}
				
		}while(varNum>0);
	
		System.out.println("Cantidad: "+contador);
		System.out.println("Suma: "+varTotal);
		System.out.println("Mayor: "+varMayor);
		
		
	}

}
