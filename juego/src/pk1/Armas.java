package pk1;

public class Armas {
	private String nombre_arma;
	int ataque;
	boolean usando;
	private int precio;
	
	
	
	public Armas( String nombre_arma, int ataque, boolean usando,int precio ) {
		this.nombre_arma = nombre_arma;
		this.ataque = ataque;
		this.usando= false;
		this.precio = precio;
		
	}

	public String getNombre_arma() {
		return nombre_arma;
	}
	public void setNombre_arma(String nombre_arma) {
		this.nombre_arma = nombre_arma;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public boolean isUsando() {
		return usando;
	}
	public void setUsando(boolean usando) {
		this.usando = usando;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
