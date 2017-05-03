import java.util.Scanner;

public class CalculoParImpar {

	public static void main(String[] args) {
		
		// Declaramos las variables
		
		int varNum;
		
		// Creamos la consola 
		
		Scanner sc=new Scanner(System.in);
		
		// Introducimos un numero
		
		/*System.out.print("Introduce un numero: ");
		varNum=sc.nextInt();
		System.out.print(varNum+" ");
		*/
		
		// Creamos el metodo
		
		for(int i=1;i<100;i++){
			
			int num=i;
			
			while(num!=1){
			
				if(num%2==0){
					num=num/2;
				}else{
					num=(num*3)+1;
				
					System.out.print(num+" ");
				}
			}
		}
	}
	
}
