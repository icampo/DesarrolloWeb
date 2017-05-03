package Ejercicio1;

public class CuentaNomina extends Cuenta {
	
	private double nomina;
	
	// Metodo getter y setter de la nomina
	
	public double getNomina() {
		return nomina;
	}

	public void setNomina(double nomina) {
		this.nomina = nomina;
	}

	public CuentaNomina(String titular, double saldo) {
		
		super(titular, saldo);
		
	}
	
	@Override
	
	public void reintegro(double cantidad) {
		
		// TODO Auto-generated method stub
		
		if(getSaldo()+nomina<=cantidad){
			setSaldo(getSaldo()-cantidad);
		}
		
		
	}

}
