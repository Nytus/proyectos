package pk2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Salir extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salir frame = new Salir();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Salir() {
		setBounds(100, 100, 399, 142);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("NO");
		btnNewButton.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 11));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			}
		});
		btnNewButton.setBounds(10, 69, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SI");
		btnNewButton_1.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 11));
		btnNewButton_1.setForeground(Color.GRAY);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
        System.exit(0);
			}
		});
		btnNewButton_1.setBounds(284, 69, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblseguroQueQuieres = new JLabel("\u00BFSeguro que quieres salir?");
		lblseguroQueQuieres.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 11));
		lblseguroQueQuieres.setForeground(Color.WHITE);
		lblseguroQueQuieres.setHorizontalAlignment(SwingConstants.CENTER);
		lblseguroQueQuieres.setBounds(10, 11, 363, 14);
		contentPane.add(lblseguroQueQuieres);
		
		JLabel lblNewLabel = new JLabel("(guardado aun no esta implementado)");
		lblNewLabel.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 11));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 36, 363, 14);
		contentPane.add(lblNewLabel);
	}
}
