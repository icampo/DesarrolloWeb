package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Declarar variables
		
		double varNota;
		double media=0;
		double mejor=0;
		double peor=10;
		double mediaNota = 0;
		int i=0;
		int cont=1;

		// Declarar para leer consola
				
		Scanner sc=new Scanner(System.in);
		
		// Creamos la condicion
		
		do{
			
			System.out.print("Introduce la nota "+cont+": " );
			varNota=sc.nextDouble();
			
			if(varNota>=0 && varNota<=10){
				
				i++;
				
				if(varNota<peor){
					peor=varNota;
				}
				
				if(varNota>mejor){
					mejor=varNota;
				}
				
				mediaNota=mediaNota+varNota;
				media=mediaNota/i;
				
			}
			 
			cont++;
		
		}
		
		while(cont<11);
		
		/*
		 * final int MAX_NOTAS=10;
		 * double nota;
		 * double suma=0;
		 * int cont=0;
		 * double maxNota;
		 * double minNota;
		 */
		
		/* Metodo for
		 * for(int i;i<=MAX_NOTAS;i++){
		 * System.out.print("Nota "+i+":");
		 * nota=sc.nextDouble();
		 * if(nota>=0 && nota<=10){
		 * 	suma=suma+nota;
		 * 	cont=cont+1;
		 * 	if(nota<minNota){
			minNota=varNota;
			}
			if(nota>maxNota){
			maxNota=nota;
			}
			}
			}
			media=suma/cont;
			
		 */
		
		System.out.println("Mejor nota: "+mejor);
		System.out.println("Peor nota: "+peor);
		
		if(media<5){
			System.out.println("Nota Media: INSUFICIENTE("+media+")");
		}
		else if(media<6){
			System.out.println("Nota Media: SUFICIENTE("+media+")");
		}
		else if(media<7){
			System.out.println("Nota Media: BIEN("+media+")");
		}
		else if(media<9){
			System.out.println("Nota Media: NOTABLE("+media+")");
		}
		else if(media<10){
			System.out.println("Nota Media: SOBRESALIENTE("+media+")");
		}
		else{
			System.out.println("Nota Media: MATRICULA DE HONOR("+media+")");
		}
	}

}
