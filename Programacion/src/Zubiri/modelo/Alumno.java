package Zubiri.modelo;

public class Alumno {

//Declarar los atributos
	
	private String nombre;
	private String asignatura;
	private double nota;

//Declarar metodos	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public String getCalificacion(){
		if(nota>=5){
			return "Aprobado";
		}
		else{
			return "Suspendido";
		}
		
	}

}
