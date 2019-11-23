package pk1;


	import java.util.ArrayList;
	import java.util.Scanner;

	public class Tienda1 extends Menu {
		boolean terminar = true;
		Scanner input = new Scanner(System.in);
		
		public boolean isTerminar() {
			return terminar;
		}
		public void setTerminar(boolean terminar) {
			this.terminar = terminar;
		}
		public void ofrecerProducto(Enemigo enemigo1,Ataque_ene tipoAtaque, Ataque_j1 dañoj1 ,Heals curacion, Armas arma1, Armas arma2, Armas arma3, Jugador jugador1, Overworld menu) {
				
				System.out.println("  ____     _____________\r\n" + 
						"  |==|____/_____________\\___\r\n" + 
						"  |==/UUUU|.---.---.---.|UUU\\\r\n" + 
						"  |=/UUUUU||___|___|___||UUUU\\\r\n" + 
						"  |/UUUUUU||___|___|___||UUUUU\\\r\n" + 
						"  /UUUUUUU\"=============\"UUUUUU\\\r\n" + 
						" /UUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\__\r\n" + 
						" |\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|=\r\n" + 
						" |TIENDA DEL TIO LUSHO(NO ROBAR)=|-\r\n" + 
						" |= _______________ =  _______ =|=\r\n" + 
						" |=|:::|:::|:::|:::| =|.-----.|=|-\r\n" + 
						" |=|^^^|^^^|^^^|^^^|1O|||_|_|||=|=\r\n" + 
						" |=|---+---+---+---| =|||_|_|||=|=\r\n" + 
						" |=|   |   |   |   |= ||     ||=|-\r\n" + 
						" |=|___|___|___|___| =|| == O||=|=\r\n" + 
						" |=\"\"\"\"\"o&,@%8o\"\"\"\"\" \"||     ||=|-\r\n" + 
						" |= =.o%&hjw8@&o.== ==||_____||=|-\r\n" + 
						" \"\"\"\"|__________|\"\"\"\"\"/_______\\\" \"\"\r\n" + 
						"                      \"\"\"\"\"\"\"\"\"\r\n" + 
						"\r\n" + 
						"------------------------------------------------\r\n" + ""
						);
				while (terminar = true){
				System.out.println("____________________________________________________________________________________________________________________________________________________________________________________");
				System.out.println("Bienvenido a mi tienda , que se te ofrece?");
				System.out.println("0. Hablar sobre la situacion en el pueblo");
				System.out.println("1. Curar mis heridas (valor: 10 de dinero)");
				System.out.println("2. Palo (+ 10 de ataque)(valor: 10 de dinero) (<Es algo que facilmente puedes encontrar abajo de un arbol pero de seguro eres muy torpe como para bajar la mirada y tenerlo gratis>)");
				System.out.println("3. Cuchillo Cleaver (+20 de ataque)(valor: 20 de dinero)(<Tiene algo de sangre y huele muy mal parece que tiene una etiqueta con un nombre escrito pero no lo alcanzas a ver>)");
				System.out.println("4. Espada (+30 de ataque)(valor: 30 de dinero)(<Es muy ligera y justa para tu tamaño pero se ve algo sospechoso comparandolo con la basura que hay en este lugar>)");
				System.out.println("5. Salir ");
				System.out.println("____________________________________________________________________________________________________________________________________________________________________________________");
				System.out.println("Dinero: "+jugador1.dinero);
				System.out.println("");
				int numero = input.nextInt();
				
				if (numero == 1) {
					if(jugador1.dinero >=10) {
						jugador1.dinero =(jugador1.dinero - curacion.getPrecio());
						System.out.println("Listo amigo, el mounstruo puede que sea muy fuerte pero se que lo venceras... con mis productos claro ");
						jugador1.vida = 100;
						terminar = false;
						}
					else {
						System.out.println("No tienes dinero suficiente, ve a pelear con ese mounstruo puede que te suelte algo de dinero");
						terminar = false;
					}
				}
				else if (numero ==0) {
					¿Te refieres al mounstruo verdad?
					Si, es un dolor de cabeza tenerlo cerca
					Llego hace unos dias y no se ha ido
					El otro dia con su cola dio vuelta mi basurero
					Lo peor de todo es que ni siquiera se disculpo 
					Creo que se esconde en la iglesia 
					Lo se por que trate de vengarme lanzandole papas
					Si.... no funciono ... pero puedes intentarlo tu
					Si necesitas algo puedes venir a verme aqui
					Oh si tambien lo olvidaba , ese mounstruo se robo la billetera de mi vecino
					Mi vecino es un idiota toma el dinero que encuentres y traemelo para que te venda cosas
				}
				else if(numero ==2 ) {
					if(jugador1.dinero >= 10) {
						jugador1.dinero = (jugador1.dinero - arma1.getPrecio());
						arma1.usando = true;
						System.out.println("Toma amigo este palo te ayudara a enfrentarte a tus enemigos... por lo menos hasta que se rompa (+10 de ataque)");
						terminar = false;
						}
					else {
						System.out.println("No tienes dinero suficiente, ve a pelear con ese mounstruo puede que te suelte algo de dinero");
						terminar = false;
					}
				}
				
				else if(numero == 3) {
					if(jugador1.dinero >= 20) {
						jugador1.dinero = (jugador1.dinero - arma1.getPrecio());	
						arma2.usando = true;
						System.out.println("Listo amigo ve y pelea con esta belleza que le robe al carnicero de la esquina (+20 de ataque)");
						terminar = false;
					}
					else {
						System.out.println("No tienes dinero suficiente, ve a pelear con ese mounstruo puede que te suelte algo de dinero ");
						terminar = false;
					}
				}
				else if (numero == 4) {
					if(jugador1.dinero >= 30) {
						jugador1.dinero =(jugador1.dinero - arma3.getPrecio());
						System.out.println("Cuidado! esta espada no es como las otras basuras que te vendi (+30 de ataque)");
						arma3.usando = true;
						terminar = false;
					}
					else {
						System.out.println("No tienes dinero suficiente, ve a pelear con ese mounstruo puede que te suelte algo de dinero");
						terminar = false;
					}
				}
				else if(numero ==5) {
					terminar = false;
					menu.Inicio(jugador1);
					menu.Respuesta(dañoj1, menu, curacion, enemigo1, tipoAtaque, jugador1, arma1, arma2, arma3);}
				else {
					System.out.println("Opcion no valida ");
					terminar = false;
			}
				if (terminar = false) break;
		}
	}
		}

		


