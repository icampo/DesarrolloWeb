package ProgramaCuadrados;

import java.util.Scanner;

public class EscaleraCuadrados {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
				// Declarar variables
				
				int numero;
				String car="*";
				
				// Declarar consola
				
				Scanner sc=new Scanner(System.in);
				
				// Introducir cuadrados en consola
				
				System.out.print("Introduce las lineas totales: ");
				numero=sc.nextInt();
				
				// Iniciar Metodo
				
				for(int numcar=1; numcar<=numero; numcar++){
					for(int fila=0;fila<numcar;fila++){
					System.out.print(car);
				}
				System.out.print("\n");
				}
	}

}
