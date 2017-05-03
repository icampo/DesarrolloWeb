package Ejercicio5.Gui;

public class Garaje {
	
	private final int MAX_PLAZAS=10;
	private Vehiculo[]plazas=new Vehiculo[MAX_PLAZAS];
	private String nombre;
	private double longitud;
	private double latitud;
	private int numPlazasOcupadas=0;
	
	// Creamos el constructor
	
	public Garaje(String nombre){
		this.nombre=nombre;
	}
	
	// Creamos el metodo
	
	public int getPlazasLibres(){
		return(MAX_PLAZAS-numPlazasOcupadas);
	}
	
	public int[] getListadoPlazasLibres(){
		
		// Creamos un array donde introducir las plazas libres
		
		int[] lista=new int[getPlazasLibres()];
		
		// Contador para saber donde meter el indice de la plaza libre
		
		int contLista=0;
		
		// Recorrer cada una de las plazas
		
		for(int i=0; i<MAX_PLAZAS; i++){
			
			if(plazas[i]==null){
				lista[contLista]=i;
				contLista++;
			}
		}
		
		return lista;
	}
	
	public void entra(Vehiculo v){
		for(int i=0;i<MAX_PLAZAS;i++){
			if(plazas[i]==null){
				plazas[i]=v;
				break;
			}
		}
	}
	
	public void sale(Vehiculo v){
		for(int i=0;i<MAX_PLAZAS;i++){
			if(plazas[i]!=null){
				if(plazas[i].equals(v)){
					plazas[i]=null;
					break;
				}
			}
		}
	}
	
	public Vehiculo getVehiculoPlazas(int numPlazas){
		return plazas[numPlazas];
	}
	
	public int getPlazaVehiculo(Vehiculo v){
		for(int i=0;i<MAX_PLAZAS;i++){
			if(plazas[i]!=null){
			if(plazas[i].equals(v)){
				return i;
			}
			}
		}
		return -1;
	}
	
}
