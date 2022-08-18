package com.zhou.jinengdabiwu;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Hello world!
 *
 */
public class App extends JFrame {

	private JPanel centerJPanel = new JPanel();
	private ImageIcon bgimage = new ImageIcon("2.png");
	private JLabel bgimageJLabel = new JLabel(bgimage);
	
	/**
	 * 构造函数
	 */
	public App() {
//		bgimageJLabel.setBounds(0, 0, bgimage.getIconWidth()/2, bgimage.getIconHeight()/2);
//		centerJPanel.setOpaque(false);
		centerJPanel.add(bgimageJLabel);
		
		this.add(centerJPanel, BorderLayout.CENTER);
		this.setSize(800, 450);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new App();
	}

	
}
