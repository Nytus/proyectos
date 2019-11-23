package pk2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
public class Historiaframe extends Menuframe {

	private JPanel contentPane;
	private JTextArea txtAsdas;
	
	/**
	 * Create the frame.
	 */
	public Historiaframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Historiaframe1.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(44, 36, 1365, 553);
		contentPane.add(lblNewLabel_1);
		
		JTextArea txtrHolaEstoy = new JTextArea();
		txtrHolaEstoy.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtrHolaEstoy.setForeground(Color.WHITE);
		txtrHolaEstoy.setBackground(Color.DARK_GRAY);
		txtrHolaEstoy.setText("Hola , estoy algo ocupado pero creo que podemos hablar un poco");
		txtrHolaEstoy.setBounds(10, 603, 761, 115);
		contentPane.add(txtrHolaEstoy);
				
		JButton btnVolverALa = new JButton("Volver a la Tienda");
		btnVolverALa.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 11));
		btnVolverALa.setForeground(Color.GRAY);
		btnVolverALa.setBackground(Color.DARK_GRAY);
		btnVolverALa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Tiendaframe2 tiendaframe = new Tiendaframe2();
				tiendaframe.setVisible(true);
			}
		});
		btnVolverALa.setBounds(803, 685, 195, 33);
		contentPane.add(btnVolverALa);
		
		JButton btnSalirDelJuego = new JButton("Salir");
		btnSalirDelJuego.setBackground(Color.DARK_GRAY);
		btnSalirDelJuego.setForeground(Color.GRAY);
		btnSalirDelJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Salir salir = new Salir();
			salir.setVisible(true);
			}
			
		});
		btnSalirDelJuego.setBounds(909, 11, 89, 23);
		contentPane.add(btnSalirDelJuego);
		
		JButton btnAtras = new JButton("\u00BFDonde esta?");
		btnAtras.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 11));
		btnAtras.setBackground(Color.DARK_GRAY);
		btnAtras.setForeground(Color.GRAY);
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Image img = new ImageIcon(this.getClass().getResource("/Historiaframe1.png")).getImage();
				lblNewLabel_1.setIcon(new ImageIcon(img));
				txtrHolaEstoy.setForeground(Color.WHITE);
				txtrHolaEstoy.setBackground(Color.DARK_GRAY);
				lblNewLabel_1.setBounds(44, 36, 1365, 553);
				contentPane.add(lblNewLabel_1);
				txtrHolaEstoy.setText("Creo que esta junto a la escalera hacia el balcon del restaurant\r\n" + 
						"Espero que el dueño se encuentre bien\r\n" + 
						"Pareces alguien fuerte ¿crees que podrias con el mounstruo?\r\n" + 
						"Si te encargas del mounstruo te podria dar unos cuantos barriles de mi cerveza artesanal propia \r\n" + 
						"Si necesitas algo ven a mi tienda y te vendo equipamiento\r\n" + 
						"Pero no podre ayudarte si tienes problemas con el mounstruo ");
				
					
			}
		});
		btnAtras.setBounds(803, 649, 195, 33);
		contentPane.add(btnAtras);
		
		JButton btnSiguiente = new JButton("\u00BFQue esta pasando?");
		btnSiguiente.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 11));
		btnSiguiente.setForeground(Color.GRAY);
		btnSiguiente.setBackground(Color.DARK_GRAY);
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Image img = new ImageIcon(this.getClass().getResource("/Historiaframe2.png")).getImage();
				lblNewLabel_1.setIcon(new ImageIcon(img));
				txtrHolaEstoy.setForeground(Color.WHITE);
				txtrHolaEstoy.setBackground(Color.DARK_GRAY);
				lblNewLabel_1.setBounds(44, 36, 1365, 553);
				contentPane.add(lblNewLabel_1);
				
				txtrHolaEstoy.setText("¿Te refieres al Mounstruo verdad?\r\n" + 
						"Si, me dio algo de miedo al verlo\r\n" + 
						"Llego hace unas horas y ha causado varios problemas\r\n" + 
						"Creo que escuche unos gritos hace unos minutos\r\n" + 
						"Unos gritos realmente desgarradores ");
				
				
				
				
			}
		});
		btnSiguiente.setBounds(803, 613, 195, 33);
		contentPane.add(btnSiguiente);
		
	
		
	
		

	
		
	}
}
