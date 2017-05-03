package EjercicioGlobal.datos;

import java.util.Scanner;

public class Alumno {
	
	// Declaramos constante
	
	private static final int MAX_ASIG=10;
	
	// Declaramos variables
	
	private String nomAlu;
	private Asignatura[] asignaturas = new Asignatura[MAX_ASIG];
	private int contAsig=0;
	
	// Crear constructora para nombre alumno
	
	public Alumno(String nomAlu){
		this.nomAlu=nomAlu;
	}

	public String getNomAlu() {
		return nomAlu;
	}

	public void setNomAlu(String nomAlu) {
		this.nomAlu = nomAlu;
	}
	
	// Crear metodo para la Asignatura
	
	/* public void addAsig(Asignatura asig){
		
		if(contAsig<MAX_ASIG){
		asignaturas[contAsig]=asig;
		contAsig++;
		}else{
			System.out.print("Has superado las 10 asignaturas!!!");
		}
	}
	*/
	public void addAssig(String nomAsig, double nota){
		
		// Comprobar si no se puede matricular de más asignatura
		
		if(contAsig<MAX_ASIG){
			
			// Crear una asignatura con los datos de los parametros
			
			Asignatura asig1=new Asignatura(nomAsig);
			asig1.setNota(nota);
			
			// Meter en el array de asignatura creada nuevamente
			
			asignaturas[contAsig]=asig1;
			contAsig++;
		}
		else{
			System.out.print("Has Superado las 10 asignaturas!!!!");
		}
	}
	
	// Indicar al sistema que se esta sobreescribiendo un metodo
	
	public String toString() {
		String lista=nomAlu+"[";
		for(int i=0;i<contAsig;i++){
			lista=lista+asignaturas[i];
					if(i<contAsig-1){
						lista=lista+", ";
					};
		}
		lista=lista+"]";
		return lista;
	}

	// Comparar 2 alumnos
	
	public boolean equals(Alumno al) {
		if(this.getNomAlu().equals(al.getNomAlu())){
			return true;
		}else{
			return false;
		}
	}
	
	// Metodo para calcular la nota media del alumno introducido
	
	public double getMedia(){
		double suma=0;
		double media=0;
		if(contAsig==0){
			return 0.0;
		}else{
		for(int i=0;i < contAsig;i++){
			suma=suma+asignaturas[i].getNota();
		}
		media=suma/contAsig;
		return media;
		}
	}
	
	// Metodo para calcular la nota mas alta del alumno introducido
	
	public double getMax(){
		double max=0;
		if(contAsig==0){
			return 0.0;
		}else{
		for(int i=0;i < contAsig;i++){
			if(max < asignaturas[i].getNota()){
				max=asignaturas[i].getNota();
			}
		}
		
		return max;
		}
	}
	
}