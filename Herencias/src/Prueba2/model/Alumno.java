package Prueba2.model;

import java.io.Serializable;

public class Alumno extends Persona implements Comparable,Serializable{
	
	private double nota;
	
	public Alumno(String nombre, double nota){
		this.setNombre(nombre);
		this.nota=nota;
	}

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

	@Override
	public int compareTo(Object obj){
		Alumno alu=(Alumno)obj;
		return(int)(this.nota*100-alu.nota*100);
	
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		// Si tiene el mismo nombre y nota es el mismo alumno
		if(obj instanceof Alumno){
			Alumno al=(Alumno) obj;
		if(nota==al.nota && getNombre().equals(al.nombre)){
		return true;
		}
	}
		return false;
}

}
