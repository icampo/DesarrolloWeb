package Ejercicio1;

public class CuentaAhorro extends Cuenta {

	static double COMISION=0.01;
	
	public CuentaAhorro(String titular, double saldo) {
		
		super(titular, saldo);
		
	}
	
	@Override
	
	public void reintegro(double cantidad) {
		
		// TODO Auto-generated method stub

		// Condicion de la cuenta sea positiva
		
		   if(getSaldo()-cantidad>=0){
			   
			   setSaldo(getSaldo()-cantidad);
			   
		   }  

	}
	
	@Override
	
	 public void ingreso(double cantidad){
	       setSaldo(getSaldo() + cantidad + (cantidad*COMISION)); 
	    }
	
}