package pk1;

import java.util.Scanner;


public class Overworld extends Menu {
	
	Scanner input = new Scanner(System.in);
	Batalla1 menuBatalla = new Batalla1();
	Tienda1 menuTienda = new Tienda1();
	public void Inicio(Jugador jugador1) {
		System.out.println("_____________________________________________________");
		System.out.println("~         ~~          __\r\n" + 
				"       _T      .,,.    ~--~ ^^\r\n" + 
				" ^^   // \\                    ~\r\n" + 
				"      ][O]    ^^      ,-~ ~\r\n" + 
				"   /''-I_I         _II____\r\n" + 
				"__/_  /   \\ ______/ ''   /'\\_,__\r\n" + 
				"  | II--'''' \\,--:--..,_/,.-{ },\r\n" + 
				"; '/__\\,.--';|   |[] .-.| O{ _ }\r\n" + 
				":' |  | []  -|   ''--:.;[,.'\\,/\r\n" + 
				"'  |[]|,.--'' '',   ''-,.    |\r\n" + 
				"  ..    ..-''    ;       ''. '");
		System.out.println("_____________________________________________________");
		System.out.println("Que accion deseas hacer");
		System.out.println("__________________________");
		System.out.println("1.Ir a Iglesia ");
		System.out.println("2.Ir a Tienda");
		System.out.println("__________________________");
		System.out.printf(("Vida: ") +jugador1.vida);
		System.out.println("");
		System.out.println("Dinero: "+ jugador1.dinero);
		
	}

	public void Respuesta(Ataque_j1 dañoj1,Overworld menu,Heals curacion, Enemigo enemigo1, Ataque_ene tipoAtaque, Jugador jugador1, Armas arma1,
			Armas arma2, Armas arma3) {
		int respuesta = input.nextInt();
		if (respuesta == 1) {
			menuBatalla.inicioBatalla(dañoj1, menu,	curacion, enemigo1, tipoAtaque, jugador1, arma1, arma2, arma3);
		}
		if (respuesta == 2) {
			menuTienda.ofrecerProducto(enemigo1, tipoAtaque, dañoj1, curacion, arma1, arma2, arma3, jugador1, menu); 
			}
		
	}
		
	}		
	
