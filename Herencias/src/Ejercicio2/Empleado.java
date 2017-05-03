package Ejercicio2;

public class Empleado {

	// Se declara las variables
	
	private String nif;
	private String nombre;
	private int edad;
	
	// Creamos el constructor de nif
	
	public Empleado(String nif){
		this.nif=nif;
	}
	
	// Metodos getters y setters
	
	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	// Metodo toString
	
	@Override
	public String toString() {
		return "Empleado [nif=" + nif + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}