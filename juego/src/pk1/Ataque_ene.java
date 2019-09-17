package pk1;

public class Ataque_ene {
	private int num1;
	private int num2;
	
	public Ataque_ene(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		}
	public int generarAtaque() {
		int valor= (int)(Math.random()*(this.num2 - this.num1 + 1));
		return valor;
}}


