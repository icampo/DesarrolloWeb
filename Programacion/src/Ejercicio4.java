import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Declarar numero
		
		int varNumero;
		
		// Definir scanner para leer consola
		
		Scanner sc=new Scanner(System.in);
		
		// Introducir variable para leer la consola
		
		System.out.print("Introduce el numero:");
		varNumero=sc.nextInt();
		
		// Comando para comparar si el dato es negativo o positivo
		
		// Si el valor introducido es igual a 0, el valor será negativo
		
		if(varNumero==0){
		System.out.println("El numero "+varNumero+" es nulo");
		}
		
		// Si el valor introducido es igual a 0, el valor será positivo en caso de ser lo contrario
		// El valor será nulo
		
		if (varNumero > 0){
		System.out.println("El numero " +varNumero+" es positivo");
		}
		else{
		System.out.println("El numero "+varNumero+" es negativo");
		}
		
	}

}
