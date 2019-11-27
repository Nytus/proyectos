package pk2;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
public class Ventana extends JFrame {

	public JFrame frame;
	public static J1 jugador1 = new J1(100, 20,0,10);
	public static E1 enemigo1 = new E1(10000,5,10,20);
	public static AE1 ataE1 = new AE1(10,20);
	
	public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				Ventana window = new Ventana();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}

	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Empezar");
		btnNewButton.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 11));
		btnNewButton.setForeground(Color.GRAY);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					frame.dispose();
					Menuframe menuframe = new Menuframe();
				menuframe.setVisible(true);
			}
		
		});
		btnNewButton.setBounds(158, 154, 126, 62);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Demoman\u00B4s Adventure");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 24, 414, 91);
		frame.getContentPane().add(lblNewLabel);
		
		JButton button = new JButton("New button");
		button.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 11));
		button.setForeground(Color.GRAY);
		button.setBackground(Color.DARK_GRAY);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		    
			}
		});
		button.setBounds(178, 227, 89, 23);
		frame.getContentPane().add(button);
	}
	
}
