package Ejercicio3;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
	
		// Consola
		
		Scanner sc=new Scanner(System.in);
		
		// Creamos los objetos
		
		Circulo rueda;
		Circulo moneda;
		
		// Declaramos las variables
		
		System.out.println("Ingrese el radio de la rueda: ");
		double valorRueda=sc.nextDouble();
		rueda=new Circulo(valorRueda);
		
		System.out.println("Ingrese el radio de la moneda: ");
		double valorMoneda=sc.nextDouble();
		moneda=new Circulo(valorMoneda);
		
		// Programa
		
		System.out.println("Area de la rueda "+rueda.calcularArea());
		System.out.println("Perimetro de la rueda "+rueda.calcularPerimetro());
		System.out.println("Area de la moneda "+moneda.calcularArea());
		System.out.println("Perimetro de la moneda "+moneda.calcularPerimetro());
		
		
	
}
}
