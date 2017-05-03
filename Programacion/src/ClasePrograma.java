import java.util.Scanner;
public class ClasePrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int varTotal;
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduce el numero de alumnos en Total: ");
		varTotal=sc.nextInt();
		
		int delegado = (int)(Math.random() * varTotal+1);
		int subdelegado = (int)(Math.random() * varTotal+1);
		
		
		while(delegado==subdelegado){
			subdelegado = (int)(Math.random() * varTotal+1);
		}
		
		System.out.println("El Delegado es el "+delegado);
		System.out.print("El Subdelegado es el "+subdelegado);
		
	}

}
