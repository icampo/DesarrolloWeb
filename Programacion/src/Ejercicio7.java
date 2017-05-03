import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
	// Declarar varibles
		
	int varNumero;
	String varCifra;
	
	// Definir scanner
		
	Scanner sc=new Scanner(System.in);
		
	// Introducir datos en consola
	
	System.out.print("Introduce un Numero: ");
	varNumero=sc.nextInt();
	
	// Pasamos de integer a string el numero introducido
	
	varCifra = Integer.toString(varNumero);
	
	// Introducimos la condicion de que sea un numero entre 0 y 9999
	
		if(varNumero<9999 && varNumero>0){
			System.out.println(varNumero + " tiene " + varCifra.length() + " dígitos");
		}
		else 
		{
			System.out.println("El dato introducido es mayor que 9999");
		}
		}
}
