import java.util.Scanner;

public class Ejercicio1 {

	public static final int MAX_NOTAS=10;
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		// Pedir un numero y comprobar si se encuentra en el array
		
			// Declarar Variables
			
			int []tNotas={5,4,8,10};
			int varNota;
			boolean enc;
			Scanner sc=new Scanner(System.in);
			
			// Solicitar numero
			
			System.out.print("Introduce un numero: ");
			varNota=sc.nextInt();
			
			// Crear metodo
			
			for(int i=0;i<tNotas.length;i++){
				if(tNotas[i]==varNota){
					enc=true;
					break;
				}
			}
					if(enc=true){
					System.out.print("El numero introducido "+varNota+" se encuentra dentro del array.");
				}else{
					System.out.print("El numero introducido "+varNota+" no se encuentra dentro del array.");
				}
					
			}
	
	}