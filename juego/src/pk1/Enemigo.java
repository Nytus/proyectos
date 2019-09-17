package pk1;

public class Enemigo extends Batalla {
	private String nombre;
	public int vida;
	public int ataque1;
	public int ataque2;
	public int ataque3;
	private boolean estado;
	
	public Enemigo(String nombre, int vida, boolean estado) {
		this.nombre = nombre;
		this.vida = vida;
		this.estado = estado;
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
	public int getAtaque1() {
		return ataque1;
	}
	public void setAtaque1(int ataque1) {
		this.ataque1 = 10;
	}
	public int getAtaque2() {
		return ataque2;
	}
	public void setAtaque2(int ataque2) {
		this.ataque2 = 5;
	}
	public int getAtaque3() {
		return ataque3;
	}
	public void setAtaque3(int ataque3) {
		this.ataque3 = 7;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = true;
	}

}
	
	
		
	