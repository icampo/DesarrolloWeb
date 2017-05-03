package Agenda.datos;

	public class amigos {

		// Declarar atributos
		
		private String nombre;
		private String email;
		private String tlfno;
		
		public amigos(String nombre){
			this.nombre = nombre;
		}
		
		// Declarar Constructores getters and setters
		
		/* public void setNombre(String nombre) {
		this.nombre = nombre;
			} */
		
		public String getNombre() {
			return nombre;
		}
		
		public String getEmail() {
			return email;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		
		public String getTlfno() {
			return tlfno;
		}
		
		public void setTlfno(String tlfno) {
			this.tlfno = tlfno;
		}
		
		
	
}
