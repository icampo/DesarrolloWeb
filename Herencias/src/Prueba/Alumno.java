package Prueba;

public class Alumno extends Persona {

	private double nota;

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	@Override
	public String toString(){
		return super.toString()+ ", nota: "+nota;
	}
	
}
