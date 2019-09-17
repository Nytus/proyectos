package pk1;
public class main {

	public static void main(String[] args) {
		//jugador
		Jugador jugador1 = new Jugador("Kyle", 100 , 20, true, 0, 0);
		Ataque_j1 dañoj1 = new Ataque_j1();
		
		//enemigo
		Enemigo enemigo1 = new Enemigo("Mounstruo", 10000, true);
		Ataque_ene tipoAtaque = new Ataque_ene(5,20);
		//objetos tienda
		Heals curacion = new Heals ("Medkit", 30,10);
		Armas arma1 = new Armas ("Palo", 10 ,false,10);
		Armas arma2 = new Armas ("Cuchilla", 20 , false,20);
		Armas arma3 = new Armas ("Espada" , 30 , false,30);
		// 
		Overworld menu = new Overworld();
		
		menu.Inicio(jugador1);
		menu.Respuesta(dañoj1, menu, curacion, enemigo1, tipoAtaque, jugador1,arma1, arma2, arma3);
		
	}


	}
	
	
		
