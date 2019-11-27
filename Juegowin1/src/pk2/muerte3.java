package pk2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class muerte3 extends JFrame {

	private JPanel contentPane;
	String filepath1 = "musica/MuerteMus.wav";

	
	/**
	 * Create the frame.
	 */
	boolean parar1 = true;
	void playMusic () {
		try {
			File musicPath = new File(filepath1);
			if (musicPath.exists()) {
				AudioInputStream audioInput = AudioSystem.getAudioInputStream (musicPath);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
				if(parar1 = false) {
				
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
	public muerte3() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(Color.RED);
		Image img = new ImageIcon(this.getClass().getResource("/Muerteesc.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));		
		lblNewLabel_1.setBounds(0, 0, 784, 561);
		contentPane.add(lblNewLabel_1);
	}

}
