package pk2;

import java.awt.*;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Muerte2 extends JFrame {

	private JPanel contentPane;

public Muerte2() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);

		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
			
		JLabel lblNewLabel_1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Muerteata.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));		
		lblNewLabel_1.setBounds(0, 0, 784, 561);
		contentPane.add(lblNewLabel_1);
	}

}

	


