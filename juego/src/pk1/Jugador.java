package pk1;
public class Jugador {
	
	private String nombre;
	public int vida;
	public int esp;
	private boolean estado;
	public int dinero;
	public int ataque;
	
	public Jugador(String nombre, int vida, int esp,boolean estado, int dinero, int ataque) {
		this.nombre = nombre;
		this.vida = vida;
		this.esp = esp;
		this.estado = estado;
		this.dinero = dinero;
		this.ataque = ataque;
		}
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getVida() {
			return vida;
		}
		public void setVida(int vida) {
			this.vida = vida;
		}
		public int getEsp() {
			return esp;
		}
		public void setEsp(int esp) {
			this.esp = esp;
		}
		public boolean isEstado() {
			return estado;
		}
		public void setEstado(boolean estado) {
			this.estado = true;
		}
		public int getDinero() {
			return dinero;
		}
		public void setDinero(int dinero) {
			this.dinero = dinero;
		}
		public int getAtaque() {
			return ataque;
		}
		public void setAtaque(int ataque) {
			this.ataque = ataque;
		}
		
	
	}

	
	
	
	
		  