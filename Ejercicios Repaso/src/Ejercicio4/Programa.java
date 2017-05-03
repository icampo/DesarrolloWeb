package Ejercicio4;

public class Programa {
	
	private static int x=0;
	
	public static void main(String[] args){
		
		int x=1;
		System.out.println(x);
		imprime(x);
		imprime();
		imprime2();
		
	}
	
	public static void imprime(int x){
		x=x+1;
		System.out.println(x);
	}
	
	public static void imprime(){
		System.out.println(x);
	}
	
	public static void imprime2(){
		int x=3;
		System.out.println(x);
	}
	
}