package Ejercicio1;

public class Programa {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		// Declarar las variables
		
		CuentaCredito cc = new CuentaCredito("ion", 200);
		CuentaAhorro ca = new CuentaAhorro("ion", 200);
		CuentaNomina cn = new CuentaNomina("ion", 200);
		
		System.out.println("Ingresando 50€...");
		
		cc.ingreso(50);
		ca.ingreso(50);
		cn.ingreso(50);
		
		System.out.println("Reintegro de 200€...");
		
		cc.reintegro(50);
		ca.reintegro(50);
		cn.reintegro(50);
		
		System.out.println("Cuenta Corriente " + cc);
		System.out.println("Cuenta Ahorro " + ca);
		System.out.println("Cuenta Nómina " + cn);
		
		
	}

}
