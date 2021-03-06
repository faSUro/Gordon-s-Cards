package it.fasuro.gordonscards.view;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import it.fasuro.gordonscards.utilities.PathHandler;

@SuppressWarnings("serial")
public class StartMenuFrame extends JFrame {
	
	private final static int WIDTH = 500;
	private final static int HEIGHT = 250;
	
	private JButton createDeckButton; 
	private JButton studyDeckButton; 
	
	public StartMenuFrame() {
		setTitle("Gordon's Card");
		try {
			String iconPath = "res" + PathHandler.getSeparator() + "icon.png"; //sets frame icon
			setIconImage(ImageIO.read(new File(iconPath)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSize(WIDTH, HEIGHT);
		setResizable(false);
		
		JPanel mainPanel = new JPanel();
		Container contentPane = getContentPane();
		contentPane.add(mainPanel);
		
		mainPanel.setLayout(new GridLayout(2, 1));
		
		JPanel createDeckPanel = new JPanel();
		JLabel emptyLabel1 = new JLabel("                                     "
				+ "                                          ");
		JLabel emptyLabel2 = new JLabel("                                                    "
				+ "                                                         ");
		createDeckButton = new JButton("  Create flashcards  ");
		createDeckButton.setFont(new Font("Dialog", Font.BOLD, 18));
		createDeckPanel.add(emptyLabel1); createDeckPanel.add(emptyLabel2);
		createDeckPanel.add(createDeckButton);
		
		JPanel studyDeckPanel = new JPanel();
		studyDeckButton = new JButton("  Study deck  ");
		studyDeckButton.setFont(new Font("Dialog", Font.BOLD, 18));
		studyDeckPanel.add(studyDeckButton);
		
		mainPanel.add(createDeckPanel);
		mainPanel.add(studyDeckPanel);
		
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}

	public JButton getCreateDeckButton() {
		return createDeckButton;
	}

	public JButton getStudyDeckButton() {
		return studyDeckButton;
	}

}
