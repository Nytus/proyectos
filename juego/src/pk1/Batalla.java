package pk1;
import java.util.Scanner;
public class Batalla extends Menu{
	Scanner input = new Scanner (System.in);
	boolean termino = true;
	
	public void inicioBatalla(Ataque_j1 dañoj1,Overworld menu,Heals curacion,Enemigo enemigo1, Ataque_ene tipoAtaque, Jugador jugador1, Armas arma1, Armas arma2, Armas arma3) {
		System.out.println("Encontraste un mounstruo!");
		
		while(termino = true) { 
			
			System.out.println(""
					+ "----------------------------------------------------------------------------------------"
					+ "     /|                                           |\\\r\n" + 
					"             /||             ^               ^             ||\\\r\n" + 
					"            / \\\\__          //               \\\\          __// \\\r\n" + 
					"           /  |_  \\         | \\   /     \\   / |         /  _|  \\\r\n" + 
					"          /  /  \\  \\         \\  \\/ \\---/ \\/  /         /  /     \\\r\n" + 
					"         /  /    |  \\         \\  \\/\\   /\\/  /         /  |       \\\r\n" + 
					"        /  /     \\   \\__       \\ ( 0\\ /0 ) /       __/   /        \\\r\n" + 
					"       /  /       \\     \\___    \\ \\_/|\\_/ /    ___/     /\\         \\\r\n" + 
					"      /  /         \\_)      \\___ \\/-\\|/-\\/ ___/      (_/\\ \\      `  \\\r\n" + 
					"     /  /           /\\__)       \\/  oVo  \\/       (__/   ` \\      `  \\\r\n" + 
					"    /  /           /,   \\__)    (_/\\ _ /\\_)    (__/         `      \\  \\\r\n" + 
					"   /  '           //       \\__)  (__V_V__)  (__/                    \\  \\\r\n" + 
					"  /  '  '        /'           \\   |{___}|   /         .              \\  \\\r\n" + 
					" /  '  /        /              \\/ |{___}| \\/\\          `              \\  \\\r\n" + 
					"/     /        '       .        \\/{_____}\\/  \\          \\    `         \\  \\\r\n" + 
					"     /                ,         /{_______}\\   \\          \\    \\         \\\r\n" + 
					"                     /         /{___/_\\___}\\   `          \\    `\r\n" + 
					"\r\n" + 
					"                                                  \r\n" + 
					"\r\n" + 
					"--------------------------------------------------------------------------------------\r\n" + 
					"");
			
			
			System.out.println("__________________________________________________________");
			System.out.println("Que vas a hacer?");
			System.out.println("1.Atacar");
			System.out.println("2.Cargar poder");
			System.out.println("3.Escapar");
			System.out.println("__________________________________________________________");
			System.out.println("");
			System.out.printf(("Vida :")+ jugador1.vida);
			System.out.println(("Esp :")+ jugador1.esp);
			System.out.println("");
			
			
			
			
			int eleccion2 = input.nextInt();
				if (eleccion2 ==1) {
					atacarEnemigo(jugador1,enemigo1, arma1, arma2, arma3, dañoj1);	
					System.out.println("Daño total "+ dañoj1.ataqueTotal(jugador1, arma1, arma2, arma3));
					ataqueEnemigo(jugador1, tipoAtaque);
					System.out.println("Recibiste "+ tipoAtaque.generarAtaque());
					if (jugador1.vida <= 0) {
						System.out.println("############	Perdiste	##############");
						System.out.println("");
						System.out.println("\r\n" + 
		"\r\n" + 
		"\r\n" + 
		"                _|_\r\n" + 
		"                 |\r\n" + 
		"             .-'''''-.\r\n" + 
		"          .-'    '-.\r\n" + 
		"       .-'  :::::_:::::  '-.\r\n" + 
		"   ___/ ==:...:::-:::...:== \\___\r\n" + 
		"  /_____________________________\\\r\n" + 
		"':'-._________________________.-'_\r\n" + 
		" ':::\\ @-,`-[-][-^-][-]-`,-@ / _| |_\r\n" + 
		"  '::| .-------------------. ||_ @ _|\r\n" + 
		"   ::|=|*   ___  _  ___   *|=|'.| |\r\n" + 
		"   ':| |'   ))_) )) ))_)  '| |::.^|\r\n" + 
		"   _:|=|'  ((`\\ (( ((     '|=|::::::.\r\n" + 
		" _| || |' ataco sin pensar'| |:::::::.\r\n" + 
		"|_   |=|'1998  _( )_  2019'|=|':::::.\r\n" + 
		"  | || |' (   (_ ~ _)   ) '| | ':::'\r\n" + 
		"  |^||=|*  )    (_)    (  *|=| '::'\r\n" + 
		"     | '-------------------' .::::'\r\n" + 
		"     |_____________________.::::::'\r\n" + 
		"   .'___________________.::::::''\r\n" + 
		"   |_______________.::::'':::'''\r\n" + 
		" .'_____________.::::::''::::''\r\n" + 
		"            .:::'''' LGB .'::::'\r\n" + 
		"         .:::::''':.   .:::::'");
						System.out.println("");
						System.out.println("REINICIA PARA INTENTAR DE NUEVO");
						
						jugador1.dinero = jugador1.dinero + 10;
						break;
						}
					else if (enemigo1.getVida() <= 0) {
						System.out.println("##############	Ganaste	#############");
						System.out.println("");
						System.out.println("");
						System.out.println("");
						System.out.println("");
						System.out.println("");
						System.out.println("*Sientes que alguien viene corriendo*");
						System.out.println("*Es el dueño de la tienda");
						System.out.println("¡Wow lo hiciste! ");
						System.out.println("*El dueño de la tienda se prepara a dar patadas al cuerpo del mounstruo*");
						System.out.println("Esto es por el basurero ");
						System.out.println("*El dueño de la tienda se tropieza al dar la primera patada ");
						System.out.println("¡Maldicion!... oh mira la billetera de mi vecino");
						System.out.println("Toma el dinero antes que nos vea");
						System.out.println("<Recibiste 1000 de dinero>");
						System.out.println("Puede que te sirva en un futuro");
						System.out.println("Pero en este no");
						System.out.println("En realidad no hay nada mas programado en este juego como para que gastes todo ese dinero");
						System.out.println("De hecho mataste el unico mounstruo de la ciudad");
						System.out.println("Ya no puedo vender mis productos a los tontos que quieren enfrentarse a esta cosa");
						System.out.println("A si que ¡Muchas gracias oh gran heroe del pueblo!");
						System.out.println("¡Muchisimas gracias por dejarme en la pobreza!");
						System.out.println("¡ESPERO QUE ESTES FELIZ!");
						System.out.println("*El dueño de la tienda sale golpeando las puertas de la iglesia*");
						System.out.println("FIN");
						System.out.println("                        \r\n" + 
								"   ad88 88              \r\n" + 
								"  d8\"   \"\"              \r\n" + 
								"  88                    \r\n" + 
								"MM88MMM 88 8b,dPPYba,   \r\n" + 
								"  88    88 88P'   `\"8a  \r\n" + 
								"  88    88 88       88  \r\n" + 
								"  88    88 88       88  \r\n" + 
								"  88    88 88       88  \r\n" + 
								"                        \r\n" + 
								"                        ");
						
						jugador1.dinero = jugador1.dinero + 1000;
						break;
						}	
					
					else{
						termino = true;
						
						}
					}
				else if(eleccion2 ==2) {
					recargarPoder(jugador1,dañoj1, arma1, arma2, arma3);
					System.out.printf("Te quedan " + jugador1.esp ," esp");
					ataqueEnemigo(jugador1, tipoAtaque);
					System.out.println("Recibiste "+ tipoAtaque.generarAtaque()+1);
					if (jugador1.vida <= 0) {
						System.out.println("##############	Perdiste	##############");
						System.out.println("");
						System.out.println("\r\n" + 
		"\r\n" + 
		"\r\n" + 
		"                _|_\r\n" + 
		"                 |\r\n" + 
		"             .-'''''-.\r\n" + 
		"          .-'    '-.\r\n" + 
		"       .-'  :::::_:::::  '-.\r\n" + 
		"   ___/ ==:...:::-:::...:== \\___\r\n" + 
		"  /_____________________________\\\r\n" + 
		"':'-._________________________.-'_\r\n" + 
		" ':::\\ @-,`-[-][-^-][-]-`,-@ / _| |_\r\n" + 
		"  '::| .-------------------. ||_ @ _|\r\n" + 
		"   ::|=|*   ___  _  ___   *|=|'.| |\r\n" + 
		"   ':| |'   ))_) )) ))_)  '| |::.^|\r\n" + 
		"   _:|=|'  ((`\\ (( ((     '|=|::::::.\r\n" + 
		" _| || |' murio cargando  '| |:::::::.\r\n" + 
		"|_   |=|'1998  _( )_  2019'|=|':::::.\r\n" + 
		"  | || |' (   (_ ~ _)   ) '| | ':::'\r\n" + 
		"  |^||=|*  )    (_)    (  *|=| '::'\r\n" + 
		"     | '-------------------' .::::'\r\n" + 
		"     |_____________________.::::::'\r\n" + 
		"   .'___________________.::::::''\r\n" + 
		"   |_______________.::::'':::'''\r\n" + 
		" .'_____________.::::::''::::''\r\n" + 
		"            .:::'''' LGB .'::::'\r\n" + 
		"         .:::::''':.   .:::::'");
						System.out.println("");
						System.out.println("REINICIA PARA INTENTAR DE NUEVO");
						jugador1.dinero = jugador1.dinero + 10;
						break;
						}
					
				}
				else if(eleccion2 == 3) {
					ataqueEnemigo(jugador1, tipoAtaque);
					System.out.println("Recibiste "+ tipoAtaque.generarAtaque()+1);
					if (jugador1.vida <= 0) {
						System.out.println("##############	Perdiste	##############");
						System.out.println("");
						System.out.println("\r\n" + 
		"\r\n" + 
		"\r\n" + 
		"                _|_\r\n" + 
		"                 |\r\n" + 
		"             .-'''''-.\r\n" + 
		"          .-'    '-.\r\n" + 
		"       .-'  :::::_:::::  '-.\r\n" + 
		"   ___/ ==:...:::-:::...:== \\___\r\n" + 
		"  /_____________________________\\\r\n" + 
		"':'-._________________________.-'_\r\n" + 
		" ':::\\ @-,`-[-][-^-][-]-`,-@ / _| |_\r\n" + 
		"  '::| .-------------------. ||_ @ _|\r\n" + 
		"   ::|=|*   ___  _  ___   *|=|'.| |\r\n" + 
		"   ':| |'   ))_) )) ))_)  '| |::.^|\r\n" + 
		"   _:|=|'  ((`\\ (( ((     '|=|::::::.\r\n" + 
		" _| || |' intento escapar '| |:::::::.\r\n" + 
		"|_   |=|'1998  _( )_  2019'|=|':::::.\r\n" + 
		"  | || |' (   (_ ~ _)   ) '| | ':::'\r\n" + 
		"  |^||=|*  )    (_)    (  *|=| '::'\r\n" + 
		"     | '-------------------' .::::'\r\n" + 
		"     |_____________________.::::::'\r\n" + 
		"   .'___________________.::::::''\r\n" + 
		"   |_______________.::::'':::'''\r\n" + 
		" .'_____________.::::::''::::''\r\n" + 
		"            .:::'''' LGB .'::::'\r\n" + 
		"         .:::::''':.   .:::::'");
						System.out.println("");
						System.out.println("REINICIA PARA INTENTAR DE NUEVO");
						break;
						}
					else {
						System.out.println("Escapaste por poco , lograste recoger 5 de dinero");
						jugador1.dinero = jugador1.dinero + 5;
						menu.Inicio(jugador1);
						menu.Respuesta(dañoj1, menu, curacion, enemigo1, tipoAtaque, jugador1, arma1, arma2, arma3);
						break;
					}
				}
				else {
					System.out.println("Opcion no valida");
					termino = true;
				}
			if (termino = false) {			
				menu.Inicio(jugador1);
				menu.Respuesta(dañoj1, menu, curacion, enemigo1, tipoAtaque, jugador1, arma1, arma2, arma3);
				break;	}
				
			
		
	
			}
		}

	public int ataqueEnemigo(Jugador jugador1,Ataque_ene tipoAtaque ) {
		jugador1.vida = jugador1.getVida() - tipoAtaque.generarAtaque()+1;
		return jugador1.vida;
		
	}
		
	public int atacarEnemigo(Jugador jugador1, Enemigo enemigo1, Armas arma1, Armas arma2, Armas arma3, Ataque_j1 dañoj1) {
		enemigo1.vida = enemigo1.getVida() - dañoj1.ataqueTotal(jugador1, arma1, arma2, arma3);
		return enemigo1.vida;
		}
	
	public int recargarPoder(Jugador jugador1,Ataque_j1 dañoj1,Armas arma1, Armas arma2, Armas arma3) {
		if(jugador1.esp <= 0) {
			System.out.println("NO TE QUEDA ESP");
			int suma = 0;
			return suma;
		}
		else {
			jugador1.esp = jugador1.esp - 5;
			int suma = 	dañoj1.ataqueTotal(jugador1, arma1, arma2, arma3) * 2;
		
		return suma;
		}

}}

		

