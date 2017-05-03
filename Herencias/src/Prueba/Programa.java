package Prueba;

public class Programa {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		Profesor profe1=new Profesor();
		profe1.setNombre("Igor");
		profe1.setSalario((double) 1000);
		System.out.println(profe1);

		
		Alumno alumno1=new Alumno();
		alumno1.setNombre("Ion");
		alumno1.setNota((double) 6.75);
		System.out.println(alumno1);
		
	}

}
