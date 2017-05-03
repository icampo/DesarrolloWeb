import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		// Pedir un numero y mostrar en el primer indice en el que se encuentra
		
		// Declarar Variables
		
		int []tNotas={5,4,8,10};
		int varNota;
		int posicion = -1;
		boolean enc;
		Scanner sc=new Scanner(System.in);
		
		// Solicitar numero
		
		System.out.print("Introduce un numero: ");
		varNota=sc.nextInt();
		
		// Crear metodo
		
		for(int i=0;i<tNotas.length;i++){
			if(tNotas[i]==varNota){
				posicion=i;
				break;
			}
			
		}
				if(posicion>-1 && posicion<=tNotas.length ){
				System.out.print("El numero introducido "+varNota+" se encuentra dentro del array "+posicion);
			}else{
				System.out.print("El numero introducido "+varNota+" no se encuentra dentro del array.");
			}
				
		}

}