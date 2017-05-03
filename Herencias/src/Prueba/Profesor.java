package Prueba;

public class Profesor extends Persona{

	private Double salario;

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString(){
		return super.toString()+ ", salario: "+salario;
	}
	
}
