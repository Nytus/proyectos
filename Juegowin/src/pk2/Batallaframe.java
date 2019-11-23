package pk2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Taskbar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.util.*;
import pk1.Jugador;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Color;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.beans.PropertyChangeEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

public class Batallaframe extends Ventana{

	private static final long LOOP_LENGTH = 85000000;

	private JPanel Batalla_frame;
	
String filepath1 = "musica/BatallaMus.wav";

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
	public Batallaframe() {

		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		Batalla_frame = new JPanel();
		Batalla_frame.setBackground(Color.DARK_GRAY);
		Batalla_frame.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Batalla_frame);
		Batalla_frame.setLayout(null);
		
		JLabel HP = new JLabel("HP :"+ jugador1.getVida());
		HP.setForeground(Color.RED);
		HP.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 29));
		HP.setHorizontalAlignment(SwingConstants.CENTER);
		HP.setBounds(259, 475, 210, 50);
		Batalla_frame.add(HP);
		
		JLabel ESP = new JLabel("ESP :" + jugador1.getEsp());
		ESP.setForeground(Color.BLUE);
		ESP.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 29));
		ESP.setHorizontalAlignment(SwingConstants.CENTER);
		ESP.setBounds(539, 475, 210, 50);
		Batalla_frame.add(ESP);
		
		JLabel EHP = new JLabel("__---"+ enemigo1.getVida() + "---___");
		EHP.setHorizontalAlignment(SwingConstants.CENTER);
		EHP.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 33));
		EHP.setBounds(10, -4, 988, 50);
		Batalla_frame.add(EHP);
		
		JLabel lblEnemigo = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Batallaframe.png")).getImage();
		lblEnemigo.setIcon(new ImageIcon(img));		
		lblEnemigo.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnemigo.setBounds(10, 57, 988, 411);
		Batalla_frame.add(lblEnemigo);
		
		JButton btnCargar = new JButton("Cargar");
		btnCargar.setForeground(Color.GRAY);
		btnCargar.setBackground(Color.DARK_GRAY);
		btnCargar.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jugador1.setVida(jugador1.getVida()-ataE1.generarae());
				if(jugador1.getEsp() < 5) {
					JOptionPane.showMessageDialog(null,"No te queda mas cerbeza");
					HP.setText("HP :"+ jugador1.getVida());
					ESP.setText("ESP :" + jugador1.getEsp());
					EHP.setText("__---"+ enemigo1.getVida() + "---___");
				}
				if(jugador1.getVida()>0) {
					jugador1.setAtaque(jugador1.getAtaque()*2);
					jugador1.setEsp(jugador1.getEsp()-5);
					HP.setText("HP :"+ jugador1.getVida());
					ESP.setText("ESP :" + jugador1.getEsp());
					EHP.setText("__---"+ enemigo1.getVida() + "---___");
				}
					
				else {
					parar1= true;
					Batallaframe.this.setVisible(false);
					Muerte1 muerte1 = new Muerte1();
					muerte1.setVisible(true);}
					
					
				
			}
		});
		btnCargar.setBounds(10, 536, 239, 182);
		Batalla_frame.add(btnCargar);
		
		JButton btnAtacar = new JButton("Atacar");
		btnAtacar.setBackground(Color.DARK_GRAY);
		btnAtacar.setForeground(Color.GRAY);
		btnAtacar.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnAtacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jugador1.setVida(jugador1.getVida() - ataE1.generarae());	
				if(jugador1.getVida()>0) {
					enemigo1.setVida(enemigo1.getVida() -jugador1.getAtaque());
					if (enemigo1.getVida() <= 0) {
						dispose();
						Victoria victoria = new Victoria();
						victoria.setVisible(true);
					}
					HP.setText("HP :"+ jugador1.getVida());
					ESP.setText("ESP :" + jugador1.getEsp());
					EHP.setText("__---"+ enemigo1.getVida() + "---___");
					}
				else {
					parar1= true;
					Batallaframe.this.setVisible(false);
					Muerte2 muerte2 = new Muerte2();
					muerte2.setVisible(true);}
					
					
				
			}
		});
		btnAtacar.setBounds(259, 536, 490, 182);
		Batalla_frame.add(btnAtacar);
		
		JButton btnEscapar = new JButton("Escapar");
		btnEscapar.setForeground(Color.GRAY);
		btnEscapar.setBackground(Color.DARK_GRAY);
		btnEscapar.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnEscapar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
				jugador1.setVida(jugador1.getVida() - 15);	
				if(jugador1.getVida() >0) {
					setVisible(false);	
					parar1= true;
					Menuframe menuframe = new Menuframe();
					menuframe.setVisible(true);
					jugador1.setDinero(jugador1.getDinero() + 5);
					System.out.println(jugador1.getDinero());
					System.out.println(jugador1.getVida());
					HP.setText("HP :"+ jugador1.getVida());
					ESP.setText("ESP :" + jugador1.getEsp());
					EHP.setText("__---"+ enemigo1.getVida() + "---___");
				}
				else {
					parar1= true;
					Batallaframe.this.setVisible(false);
					muerte3 muerte3 = new muerte3();
					muerte3.setVisible(true);}
					
					
				
			}
		});
		btnEscapar.setBounds(759, 536, 239, 182);
		Batalla_frame.add(btnEscapar);
		
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
		Batalla_frame.add(btnSalirDelJuego);
		
		
		
			
		
		
		
	}	
}
