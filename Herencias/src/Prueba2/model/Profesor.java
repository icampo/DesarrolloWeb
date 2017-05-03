package Prueba2.model;

public class Profesor extends Persona {
	private Double salario;

	public Profesor(String nombre, double salario){
		this.setNombre(nombre);
		this.salario=salario;
	}
	
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
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		// Si tiene el mismo nombre y salario es el mismo profesor
		if(obj instanceof Profesor){
			Profesor pr=(Profesor) obj;
		if(salario==pr.salario && getNombre().equals(pr.nombre)){
		return true;
		}
	}
		return false;
}
}
