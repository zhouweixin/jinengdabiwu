package com.zhou.jinengdabiwu;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

/**
 * @Author: zhouweixin
 * @Date: Created in 下午10:59:14 2018年8月15日
 * @Description:
 */
public class BackgroundPanel extends JPanel{
	Image im;

	public BackgroundPanel(Image im) {
		this.im = im;
		this.setOpaque(true);
	}

	// Draw the back ground.
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.drawImage(im, 0, 0, this.getWidth(), this.getHeight(), this);

	}
}
