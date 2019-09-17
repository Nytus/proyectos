package pk1;

public class Heals {
	private String nombre;
	private int valor;
	private int precio;
	
public Heals(String nombre, int valor, int precio) {
	this.nombre = nombre;
	this.valor = valor;
	this.precio = precio;	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}



public int Curacion (Jugador jugador1) {
	int valor = (jugador1.vida +30);
	return valor;
	}

}
	

		

	
