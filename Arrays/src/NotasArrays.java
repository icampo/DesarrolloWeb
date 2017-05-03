import java.util.Scanner;

public class NotasArrays {

	public static final int MAX_NOTAS=10;
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Definir array
		
		int []tNotas={5,4,8,10};
		Scanner sc=new Scanner(System.in);
		
		// Mostrar array
		
		System.out.print("[");
			for(int i=0;i<tNotas.length-1;i++){
				System.out.print(tNotas[i]+",");
			}
			if(tNotas.length>0){
			System.out.print(tNotas[tNotas.length-1]+"]");
			}else{
				System.out.print("]");
			}
			System.out.println("");

		// Escribe las notas en orden inverso al introducido
		
			System.out.println("");
		for(int i=tNotas.length-1;i>=0;i--){
			System.out.println(tNotas[i]);
		}
		System.out.println("");
		
		// Escribe solo las notas aprobadas en orden introducido

		for(int i=0;i<tNotas.length;i++){
			if(tNotas[i]>=5){
			System.out.println(tNotas[i]);
		}
			}
		System.out.println("");
	
		// Contar el numero de aprobados y suspensos
		
		int a=0;
		int s=0;
		
		for(int i=0;i<tNotas.length;i++){
			if(tNotas[i]>=5){
				a++;
			}else{
				s++;
			}
		}
		
		System.out.println("Aprobados: "+a);
		System.out.println("Suspendidos: "+s);
		
		System.out.println("");
		
		//
		
		
		
		// Calcular la suma de las notas
		
		int suma=0;
		for(int i=0;i<tNotas.length;i++){
		suma=suma+tNotas[i];
		}

		System.out.print("La media totas es "+((double)suma)/tNotas.length);
	}

}

