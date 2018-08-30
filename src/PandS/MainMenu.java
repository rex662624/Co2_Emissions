package PandS;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JPanel;



public class MainMenu extends JPanel {
	
	public static Image countrybutton = null;
	public static Image yearbutton = null;
	public static Image back = null;
	
	
	public void paint(Graphics g) {
		
		paintComponent(g);

		try {
			back= ImageIO.read(this.getClass().getResource("/image/bg.jpg"));
			countrybutton = ImageIO.read(this.getClass().getResource("/image/country.jpg"));
			yearbutton = ImageIO.read(this.getClass().getResource("/image/year.jpg"));
				
		 }
			 catch (IOException e) {
				
				e.printStackTrace();
			}
			
		g.drawImage(back, 0,0, 1000,1000, null);
		g.drawImage(countrybutton, 375,450, 250, 100, null);
		g.drawImage(yearbutton, 375,600, 250, 100, null);
		
		
		g.setColor(Color.BLACK);
		Font f = new Font("Arial Bold", Font.BOLD | Font.ITALIC, 50);
		g.setFont(f);
		g.drawString("Proportion and Trend", 250, 150);
		g.drawString("Of", 470, 250);
		g.drawString("CO2 Emissions ", 330,350);

		
		
	
		
	}

}

