import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
	
	private static final int OPCION_SALIR=5;
	private static GestorPlantacionesFichero gp=new GestorPlantacionesFichero();
	private static Scanner sc=new Scanner(System.in);
	private static SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yy");

	public static void main(String[] args) {
		try{
		int opc=0;
		do{
			mostrarMenu();
			opc=leerOpcion();
			ejecutarOpcion(opc);
		}while(opc!=OPCION_SALIR);
		sc.close();
		}catch (NullPointerException e){
			System.out.println("No se puede guardar");
		}
	}
	
	public static void mostrarMenu(){
		System.out.println("********MENÚ PLANTACIONES********");
		System.out.println("1.Sembrar/Plantar");
		System.out.println("2.Recolectar");
		System.out.println("3.Listar");
		System.out.println("4.Alertas");
		System.out.println("5.Salir");
		System.out.print("Opción: ");
	}
	
	private static int leerOpcion(){
		try{
			int opc=sc.nextInt();
			sc.nextLine();
			return opc;
		}catch(InputMismatchException e){
			System.out.println("Has Introducido un valor no entero.");
			//para saltar lo escrito anteriormente
			sc.nextLine();
			//esperar a que pulse intro
			pulsaIntro();
			return 0;
		}
		
	}
	
	public static void pulsaIntro(){
		System.out.println("Pulse intro para continuar...");
		sc.nextLine();
	}
	
	public static void ejecutarOpcion(int opc){
		switch(opc){
			case 1:
				sembrar();
				break;
			case 2:
				recolectar();
				break;
			case 3:
				System.out.println(gp.getPlantaciones());
				break;
			case 4:
				System.out.println(gp.getPlanRecoger());
				break;
			case 5:
				break;
			default:
				System.out.println("No has introducido una opción del menú.");
				pulsaIntro();
		}
	}
	
	public static Plantacion pedirPlantacion(){
		try{
		System.out.println("Introduce los siguientes datos de la plantacion:");
		
		//parcela
		
		System.out.println("Parcela:");
		int parcela=sc.nextInt();
		sc.nextLine();
		
		//fecha de plantacion
		
		System.out.println("Fecha de Plantación:");
		System.out.println("Año:");
		int anoPlan=sc.nextInt();
		sc.nextLine();
		System.out.println("Mes:");
		int mesPlan=sc.nextInt();
		sc.nextLine();
		System.out.println("Dia:");
		int diaPlan=sc.nextInt();
		sc.nextLine();
		
		Date fechaPlan=null;
		try {
			fechaPlan = sdf.parse(diaPlan+"/"+mesPlan+"/"+anoPlan);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //este -1900 es porque la fecha con Date se guarda fecha actual + 1900.
		
		//fecha de recoleccion
		
		System.out.println("Fecha de Recolección:");
		System.out.println("Año:");
		int anoRec=sc.nextInt();
		sc.nextLine();
		System.out.println("Mes:");
		int mesRec=sc.nextInt();
		sc.nextLine();
		System.out.println("Dia:");
		int diaRec=sc.nextInt();
		sc.nextLine();
		Date fechaRec=null;
		try {
			fechaRec = sdf.parse(diaRec+"/"+mesRec+"/"+anoRec);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //este -1900 es porque la fecha con Date se guarda fecha actual + 1900.
		
		//especie
		
		System.out.println("Especie:");
		String especie=sc.nextLine();
		
		//cantidad plantada
		
		System.out.println("Cantidad Plantada:");
		int cantPlan=sc.nextInt();
		sc.nextLine();
		
		Plantacion plant=new Plantacion(parcela,fechaPlan,fechaRec,especie,cantPlan);
		
		return plant;
		
		}catch (InputMismatchException e){
			System.out.println("Valor no valido.");
		}
		return null;
	}
	
	/*public static Plantacion pedirPlantacionCorto(){
		System.out.println("Introduce los siguientes datos de la plantacion:");
		
		//parcela
		
		System.out.println("Parcela:");
		int parcela=sc.nextInt();
		sc.nextLine();
		
		//fecha de plantacion
		
		System.out.println("Fecha de Plantación:");
		System.out.println("Año:");
		int añoPlan=sc.nextInt();
		sc.nextLine();
		System.out.println("Mes:");
		int mesPlan=sc.nextInt();
		sc.nextLine();
		System.out.println("Dia:");
		int diaPlan=sc.nextInt();
		sc.nextLine();
		Date fechaPlan=new Date(añoPlan,mesPlan,diaPlan);
		
		Plantacion plant=new Plantacion(parcela, fechaPlan);
		
		return plant;
	}*/
	
	public static void sembrar(){
		Plantacion plant=pedirPlantacion();
		gp.addPlantacion(plant);
	}
	
	public static void recolectar(){		
		try{
		System.out.println("Introduce los siguientes datos de la plantacion:");
		
		System.out.println("Parcela:");
		int parcela=sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("Fecha de Plantación:");
		System.out.println("Año:");
		int anoPlan=sc.nextInt();
		sc.nextLine();
		System.out.println("Mes:");
		int mesPlan=sc.nextInt()-1; //este -1 es porque al introducir la fecha me cogia +1. Introducia 6 y me contaba como 7.
		sc.nextLine();
		System.out.println("Dia:");
		int diaPlan=sc.nextInt();
		sc.nextLine();
		Date fechaPlan=null;
		try {
			fechaPlan = sdf.parse(diaPlan+"/"+mesPlan+"/"+anoPlan);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //este -1900 es porque la fecha con Date se guarda fecha actual + 1900.
				
		System.out.println("Cantidad Recogida:");
		int cantRec=sc.nextInt();
		sc.nextLine();
		
		gp.recolectar(parcela, fechaPlan, cantRec);
		}catch (InputMismatchException e){
			System.out.println("Valor no valido.");
			pulsaIntro();
		}
	}

}
