import java.util.Scanner;

public class IntercambiodeNombres {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Declarar variable de nombre 1 y 2
		
		String varNombre1;
		String varNombre2;
		
		// Declarar variable de axuliar
		
		String varAux;
		
		// Definir scanner para leer datos en consola
		
		Scanner sc=new Scanner(System.in);
		
		// Solicitud vía consola para introducir primer nombre
	
		System.out.println("¿Quién eres? ");
		varNombre1=sc.nextLine();
		
		// Solicitud vía consola para introducir segundo nombre
		
		System.out.println("¿Con quién quieres intercambiarte? ");
		varNombre2=sc.nextLine();
		
		// Programa de intercambio de variables
		// 'Auxiliar' es igual a 'X'
		// 'X' es igual a 'Y'
		// 'Y' es igual que 'auxiliar'
		
		varAux=varNombre1;
		varNombre1=varNombre2;
		varNombre2=varAux;
		
		// Mostrar mensaje final
		
		System.out.println("Ok! Ahora tu eres "+varNombre1+" y el otro es "+varNombre2+".");
	}

}
