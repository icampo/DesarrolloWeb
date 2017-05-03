package Ejercicio1;

public class CuentaCredito extends Cuenta {
	
	static double MAX_NEGATIVO=100;
	static double COMISION=0.01;
	
	public CuentaCredito(String titular, double saldo) {
		
		super(titular, saldo);
		
	}

	@Override
	
	public void reintegro(double cantidad) {
	
		// Condicion de la cuenta sea positiva
		
		   if(getSaldo()-cantidad>=0){
			   
			   setSaldo(getSaldo()-cantidad);
			   
		   }else{
			  
			  double saldoNegativo = getSaldo()-cantidad;
			  double interes = saldoNegativo*COMISION;
			  
			  // Condicion de tope negativo de la cuenta bancaria
			  
			  if(MAX_NEGATIVO<=saldoNegativo+interes){
				  setSaldo(saldoNegativo+interes);
			  }
			  
		   }
	       

	}
}