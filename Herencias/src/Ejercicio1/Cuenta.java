package Ejercicio1;

public abstract class Cuenta {
	
	// Declaramos las variables
	
	private String titular;
	private double saldo;
	
	// Creamos los constructores
	
	public Cuenta(String titular, double saldo){
		this.titular=titular;
		this.saldo=saldo;
	}
	
	// Creamos los metodos getters y setters
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	// Creamos los metodos para reintegro
	
	public abstract void reintegro(double cantidad);
	
	// Creamos los metodos para ingreso
	
	 public void ingreso(double cantidad){
	       saldo=saldo + cantidad; 
	    }

	// Creamos metodo toString
	
	public String toString() {
		return saldo+" "+titular;
	}
}
