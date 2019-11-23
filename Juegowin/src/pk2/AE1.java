package pk2;

public class AE1 {

	private int num1;
	private int num2;
	
	public AE1(int num1, int num2) {
		this.num1= num1;
		this.num2 =num2;
	}
	
	public int generarae() {
		int valor = (int) (Math.random()*(this.num2 - this.num1 + 1));
		return valor;
	}
}
