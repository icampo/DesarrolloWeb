import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Definir variable
		
		double varRadio;
		double varResultado;
		
		// Definir scanner para leer datos en consola
		
		Scanner sc=new Scanner(System.in);
		
		// Leer datos en consola
		
		System.out.print("Introduce radio del circulo: ");
		varRadio=sc.nextInt();
		
		// Hacer calculo del radio
		
		varResultado=(Math.PI*varRadio*varRadio);
		
		//Mostrar mensaje con el resultado
	
		System.out.print("El radio del circulo es "+varResultado);
	}

}