import java.util.Scanner;

public class ProgramaIntentos {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Declarar variables
		
		int numero;
		int contador=0;
		
		// Declarar consola
		
		Scanner sc=new Scanner(System.in);
		
		// Ejecucion de la consola
		
		System.out.print("Introduce un numero: ");
		numero=sc.nextInt();
		
		// Ejecucion del metodo
		
		while(numero>=0){
		 contador++;
		 System.out.print("Introduce un numero: ");
		 numero=sc.nextInt();
		}
		System.out.print(contador);
	}

}
