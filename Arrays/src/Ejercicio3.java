import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		// Pedir un numero y mostrar en el primer indice en el que se encuentra
		
		// Declarar Variables
		
		int []tNotas={5,4,8,10,4,4};
		int varNota;
		int posicion = -1;
		int [] indice2 = {-1,-1,-1};
		int cont=0;
		Scanner sc=new Scanner(System.in);
		
		// Solicitar numero
		
		System.out.print("Introduce un numero: ");
		varNota=sc.nextInt();
		
		// Crear metodo
		
		for(int i=0;i<tNotas.length;i++){
			if(tNotas[i]==varNota){
				indice2[cont]=i;
				cont++;
			}
		}
		
		System.out.print("El numero introducido "+varNota+" se encuentra dentro del array ");
		
		for(int i=0;i<indice2.length;i++){
			if(indice2[i]!=-1){
				System.out.print(" "+indice2[i]);
							  }
										}
		
		}
	}