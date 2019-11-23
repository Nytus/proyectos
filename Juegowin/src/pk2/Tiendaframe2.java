package pk2;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;



public class Tiendaframe2 extends Menuframe{
	
	
	static JPanel Tienda_frame;
	String filepath1 = "musica/TiendaMus.wav";


	 
	/**
	 * Create the frame.
	 */
	boolean parar1 = false;
	void playMusic () {
		try {
			File musicPath = new File(filepath1);
			if (musicPath.exists()) {
				AudioInputStream audioInput = AudioSystem.getAudioInputStream (musicPath);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
				if(parar1 = true) {
					clip.stop();
				}
			}
			else {
				System.out.println("NO ECUENTRA MUSICA");
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	 
	public Tiendaframe2 () {
	
		playMusic();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		Tienda_frame = new JPanel();
		Tienda_frame.setBackground(Color.DARK_GRAY);
		Tienda_frame.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Tienda_frame);
		Tienda_frame.setLayout(null);
		
		
		
		JButton bttn_salir = new JButton("Salir de la tienda");
		bttn_salir.setForeground(Color.GRAY);
		bttn_salir.setBackground(Color.DARK_GRAY);
		bttn_salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tiendaframe2.this.setVisible(false);
				Menuframe menuframe =new Menuframe();
				menuframe.setVisible(true);
				parar1= true;
			}
		});
		
		JLabel label = new JLabel("Curacion -                     $10");
		label.setForeground(Color.WHITE);
		label.setBackground(new Color(128, 128, 128));
		label.setBounds(672, 88, 154, 14);
		Tienda_frame.add(label);
		bttn_salir.setBounds(44, 629, 231, 77);
		Tienda_frame.add(bttn_salir);
		
		JButton bttn_hablar = new JButton("hablar con el due\u00F1o");
		bttn_hablar.setBackground(Color.DARK_GRAY);
		bttn_hablar.setForeground(Color.GRAY);
		bttn_hablar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tiendaframe2.this.setVisible(false);
				Historiaframe historiaframe = new Historiaframe();
				historiaframe.setVisible(true);
				
			}
		});
		bttn_hablar.setBounds(571, 629, 427, 77);
		Tienda_frame.add(bttn_hablar);
		
		JButton btton_espada = new JButton("$");
		btton_espada.setBackground(Color.GRAY);
		btton_espada.setForeground(Color.DARK_GRAY);
		btton_espada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jugador1.getDinero()>= 30) {
					jugador1.setAtaque(jugador1.getAtaque() + 20);
					JOptionPane.showMessageDialog(null,"¡Cuidado! esta espada no es como las otras basuras que te vendi (+30 de ataque)");
					jugador1.setDinero(jugador1.getDinero() -30);
					
				}
				else {
					JOptionPane.showMessageDialog(null,"No tienes dinero suficiente, ve a pelear con ese mounstruo puede que te suelte algo de dinero");
					
				}
							
			}});
		btton_espada.setBounds(571, 488, 83, 83);
		Tienda_frame.add(btton_espada);
		
		JButton bttn_cuchillo = new JButton("$");
		bttn_cuchillo.setForeground(Color.GRAY);
		bttn_cuchillo.setBackground(Color.DARK_GRAY);
		bttn_cuchillo.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				if(jugador1.getDinero()>= 20) {
					jugador1.setAtaque(jugador1.getAtaque()+ 15);
					JOptionPane.showMessageDialog(null,"Una espada un poco muy corta para mi gusto (+20 de ataque)");
					jugador1.setDinero(jugador1.getDinero()-20);
					
					
				}
				else {
					JOptionPane.showMessageDialog(null,"No tienes dinero suficiente, ve a pelear con ese mounstruo puede que te suelte algo de dinero");

					
				}
				
			}
		});
		bttn_cuchillo.setBounds(571, 380, 83, 83);
		
		Tienda_frame.add(bttn_cuchillo);
		
		JButton bttn_palo = new JButton("$");
		bttn_palo.setForeground(Color.GRAY);
		bttn_palo.setBackground(Color.DARK_GRAY);
		bttn_palo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jugador1.getDinero()>= 10) {
					jugador1.setAtaque(jugador1.getAtaque()+ 10);
					JOptionPane.showMessageDialog(null,"Esta espada no tiene filo, esta dañada y posiblemente se rompa (+10 de ataque)");
					jugador1.setDinero(jugador1.getDinero()-10);
					}
				else {
					JOptionPane.showMessageDialog(null,"No tienes dinero suficiente, ve a pelear con ese mounstruo puede que te suelte algo de dinero");

					
				}
				
			}
		});
		bttn_palo.setBounds(571, 271, 83, 83);
		Tienda_frame.add(bttn_palo);
		
		JButton bttn_curacion = new JButton("$");
		bttn_curacion.setForeground(Color.GRAY);
		bttn_curacion.setBackground(Color.DARK_GRAY);
		bttn_curacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jugador1.getDinero()>= 10) {
				JOptionPane.showMessageDialog(null, "Te cure algunas heridas pero creo que estaras bien(+ 50 HP)");
				jugador1.setVida(jugador1.getVida() + 50);
				if( jugador1.getVida() >= 100 ) {
					jugador1.setVida(100);
				}
					jugador1.setDinero(jugador1.getDinero() - 10);
						}
					else {
						JOptionPane.showMessageDialog(null,"No tienes dinero suficiente, ve a pelear con ese mounstruo puede que te suelte algo de dinero");
						}
			}			
		
	 
	}
			
		);
		bttn_curacion.setBounds(569, 52, 83, 83);
		Tienda_frame.add(bttn_curacion);
		
		JLabel lblEspadaVieja = new JLabel("Espada vieja-                 $10");
		lblEspadaVieja.setForeground(Color.WHITE);
		lblEspadaVieja.setBounds(672, 305, 280, 14);
		Tienda_frame.add(lblEspadaVieja);
		
		JLabel lblEspadaCorta = new JLabel("Espada corta -                $20");
		lblEspadaCorta.setForeground(Color.WHITE);
		lblEspadaCorta.setBounds(672, 414, 280, 14);
		Tienda_frame.add(lblEspadaCorta);
		
		JLabel lblEyelander = new JLabel("Eyelander -                      $30");
		lblEyelander.setForeground(Color.WHITE);
		lblEyelander.setBounds(672, 522, 280, 14);
		Tienda_frame.add(lblEyelander);
		
		JButton btnSalirDelJuego = new JButton("Salir");
		btnSalirDelJuego.setForeground(Color.GRAY);
		btnSalirDelJuego.setBackground(Color.DARK_GRAY);
		btnSalirDelJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Salir salir = new Salir();
			salir.setVisible(true);
			}
			
		});
		btnSalirDelJuego.setBounds(909, 11, 89, 23);
		Tienda_frame.add(btnSalirDelJuego);
		
		
		JLabel Dialogo = new JLabel("");
		Dialogo.setBounds(41, 520, 483, 96);
		Tienda_frame.add(Dialogo);
		
		JButton button = new JButton("$");
		button.setForeground(Color.GRAY);
		button.setBackground(Color.DARK_GRAY);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jugador1.getDinero()>= 10) {
					JOptionPane.showMessageDialog(null, "Gracias por la compra de una de mis mejores creaciones (ESP rellenado)");
					jugador1.setEsp(jugador1.getEsp() + 20);
						jugador1.setDinero(jugador1.getDinero() - 15);
							}
						else {
							JOptionPane.showMessageDialog(null,"No tienes dinero suficiente, ve a pelear con ese mounstruo puede que te suelte algo de dinero");
			}}
		});
		button.setBounds(570, 160, 83, 83);
		Tienda_frame.add(button);
		
		JLabel lblNewLabel = new JLabel("Cerveza-                       $15");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(672, 194, 280, 14);
		Tienda_frame.add(lblNewLabel);
		Image img = new ImageIcon(this.getClass().getResource("/Tiendaframeimg.png")).getImage();
				
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(44, 36, 1365, 553);
		Tienda_frame.add(lblNewLabel_1);
		
		
		
	}
	}


