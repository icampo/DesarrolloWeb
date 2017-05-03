package Ejercicio4;

public class Vehiculo {
	
	// Declaramos las variables
	
	private String matricula;
	private int numRuedas;
	private int socio;
	
	// Creamos los metodos getters y setters
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getNumRuedas() {
		return numRuedas;
	}
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	public int getSocio() {
		return socio;
	}
	public void setSocio(int socio) {
		this.socio = socio;
	} 
	
	// Creamos el constructor
	
	public Vehiculo(String matricula) {
		this.setMatricula(matricula);
	}
	
	public boolean equals(Vehiculo v){
		if(this.matricula.equals(v.matricula)){
			return true;
		}
		else{
			return false;
		}
	}

	public String toString() {
		return matricula;
	}
	
}
