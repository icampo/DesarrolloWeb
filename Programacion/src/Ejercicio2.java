import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Definir variable de Producto
		
		String varProducto;
		
		// Definir variable de Precio
		
		double varPrecio;
		
		// Definir variable de Cantidad
		
		double varCantidad;
		
		// Definir varTotal
		
		double varTotal;
		
		// Definir Descuento
		
		double varDescuento;
		
		// Definir Scanner para leer en consola
		
		Scanner sc=new Scanner(System.in);
		
		// Introducci�n de datos en las variables
		
		// Leer producto
		
		System.out.print("Introduce el Producto ");
		varProducto=sc.nextLine();
		
		// Leer Precio
		
		System.out.print("Introduce el Precio ");
		varPrecio=sc.nextDouble();
		
		// Leer Cantidad
		
		System.out.print("Introduce la Cantidad ");
		varCantidad=sc.nextDouble();
		
		// Introducci�n del calculo
		
		varTotal=(varPrecio*varCantidad);
		
		// Definir Descuento
		
		// Si el total es mayor o igual a 10, descuento del 10%
		
		if(varTotal>=10){
			varDescuento=varTotal*10/100;
			varTotal=varTotal-varDescuento;
		}
		
		// Si el total es mayor o igual a 10, descuento del 20%
		
		else if(varTotal>=20){
			varDescuento=varTotal*20/100;
			varTotal=varTotal-varDescuento;
		}
		
		// Si son Peras, un 5% de Descuento
		
		if (varProducto.equals("Peras")){
			varDescuento=varTotal*5/100;
			varTotal=varTotal-varDescuento;	
		}
		
		// Definici�n del programa
		
		System.out.print("Has comprado "+varCantidad+" Kg de "+varProducto+", "+String.format("%.2f",varTotal)+"� a pagar!");
		
	}
}