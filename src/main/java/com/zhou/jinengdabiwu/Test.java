package com.zhou.jinengdabiwu;

import java.awt.Container;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Test extends JFrame {
	
	private static final int imageWidth = 800;
	private static final int imageHeight = 600;
	
	// 创建一个容器
	private Container ct;
	// 创建背景面板。
	private BackgroundPanel bgp;

	public static void main(String[] args) {
		new Test();
	}
	

	public Test() {
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize()); 
		this.setLocation(0,0); 
		
		// 不采用任何布局方式。
		ct = this.getContentPane();
		this.setLayout(null);

		// 在这里随便找一张400*300的照片既可以看到测试结果。
		bgp = new BackgroundPanel((new ImageIcon("2.png")).getImage());
		bgp.setBounds(0, 0, this.getWidth()-6, this.getHeight()-30);
		ct.add(bgp);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(true);
	}
}
