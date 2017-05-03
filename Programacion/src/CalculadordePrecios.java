import java.util.Scanner;

public class CalculadordePrecios {

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
	 
		varDescuento=0;
		
		double varDTO;
		
		// Constante del minimo de descuento
		
		final int VOL_MIN_DESCUENTO=100;
		
		// Constante del minimo de descuento
		
		final int DTO=10;
		
		// Constante del minimo de descuento
		
		final int DTO_ESPECIAL=5;
		
		// Definir Scanner para leer en consola
		
		Scanner sc=new Scanner(System.in);
		
		// Introducción de datos en las variables
		
		// Leer producto
		
		System.out.print("Introduce el Producto ");
		varProducto=sc.nextLine();
		
		// Leer Precio
		
		System.out.print("Introduce el Precio ");
		varPrecio=sc.nextDouble();
		
		// Leer Cantidad
		
		System.out.print("Introduce la Cantidad ");
		varCantidad=sc.nextDouble();
		
		// Introducción del calculo
		
		varTotal=(varPrecio*varCantidad);
		
		// Definir Descuento
		
		// Si el total es mayor o igual a 100, descuento del 10%
		
		if(varTotal>=VOL_MIN_DESCUENTO){
			varDescuento=varDescuento+DTO;
		}
		
		// Si son Peras, un 5% de Descuento
		
		if (varProducto.equals("Peras")){
			varDescuento=varDescuento+DTO_ESPECIAL;
		}
		varDTO=varTotal*varDescuento/100;
		varTotal=varTotal-varDTO;
		
		// Definición del programa
		
		System.out.print("Has comprado "+varCantidad+" Kg de "+varProducto+", "+String.format("%.2f",varTotal)+"€ a pagar!");
		
	}
}
