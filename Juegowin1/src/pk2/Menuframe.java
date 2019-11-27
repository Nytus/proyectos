package pk2;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Menuframe extends Ventana {

	private JPanel Menu_frame;
	public boolean parar1 = false;
	
	public Menuframe() {
		parar1 = true;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		Menu_frame = new JPanel();
		Menu_frame.setBackground(Color.DARK_GRAY);
		Menu_frame.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Menu_frame);
		Menu_frame.setLayout(null);
		
		JButton button = new JButton("Ir a Escalera");
		button.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 11));
		button.setForeground(Color.GRAY);
		button.setBackground(Color.DARK_GRAY);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
				
				Batallaframe batallaframe = new Batallaframe();
				batallaframe.setVisible(true);
				
			
				
			}
		});
		button.setBounds(372, 329, 130, 38);
		Menu_frame.add(button);
		
		JButton btnSalirDelJuego = new JButton("Salir");
		btnSalirDelJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Salir salir = new Salir();
			salir.setVisible(true);
			}
			
		});
		btnSalirDelJuego.setBounds(909, 11, 89, 23);
		Menu_frame.add(btnSalirDelJuego);
		
		JButton button_2 = new JButton("Ir a Tienda");
		button_2.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 11));
		button_2.setForeground(Color.GRAY);
		button_2.setBackground(Color.DARK_GRAY);
		button_2.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				
				Menuframe.this.setVisible(false);
				Tiendaframe2 tiendaframe = new Tiendaframe2();
				
				tiendaframe.setVisible(true);
				
			}
		});
		button_2.setBounds(808, 336, 122, 38);
		Menu_frame.add(button_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setBackground(Color.DARK_GRAY);
		Image img = new ImageIcon(this.getClass().getResource("/Menuframeimg.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
				lblNewLabel.setBounds(0, 11, 1008, 737);
		Menu_frame.add(lblNewLabel);
	
	}

}
