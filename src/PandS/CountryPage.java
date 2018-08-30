package PandS;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;




public class CountryPage extends JPanel {
	
	public static Image picture = null;
	public static Image about = null;
	public static Image back = null;
	public static Image sound = null;

	public void paint(Graphics g) {

		try {
			back= ImageIO.read(this.getClass().getResource("/image/bg.jpg"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		g.drawImage(back, 0,0, 1000,1000, null);

		if(PandS_Main.country_pic == 0){
		g.setColor(Color.gray);
		g.fillRect(10,10,150,50);
		g.fillRect(10,70,150,50);
		g.fillRect(10,130,150,50);
		g.fillRect(10,190,150,50);
		g.fillRect(10,250,150,50);
		g.fillRect(10,310,150,50);
		g.fillRect(10,370,150,50);
		g.fillRect(10,430,150,50);
		g.fillRect(10,490,150,50);
		g.fillRect(10,550,150,50);
		g.fillRect(10,610,150,50);
		g.fillRect(10,670,150,50);
		
		g.fillRect(10,895,150,50);
		}
		
		else if(PandS_Main.country_pic == 1){
			g.setColor(Color.red);
			g.fillRect(10,10,150,50);
			g.setColor(Color.gray);
			g.fillRect(10,70,150,50);
			g.fillRect(10,130,150,50);
			g.fillRect(10,190,150,50);
			g.fillRect(10,250,150,50);
			g.fillRect(10,310,150,50);
			g.fillRect(10,370,150,50);
			g.fillRect(10,430,150,50);
			g.fillRect(10,490,150,50);
			g.fillRect(10,550,150,50);
			g.fillRect(10,610,150,50);
			g.fillRect(10,670,150,50);
			
			g.fillRect(10,895,150,50);
		}
		
		else if(PandS_Main.country_pic == 2){
			g.setColor(Color.red);
			g.fillRect(10,70,150,50);
			g.setColor(Color.gray);
			g.fillRect(10,10,150,50);
			g.fillRect(10,130,150,50);
			g.fillRect(10,190,150,50);
			g.fillRect(10,250,150,50);
			g.fillRect(10,310,150,50);
			g.fillRect(10,370,150,50);
			g.fillRect(10,430,150,50);
			g.fillRect(10,490,150,50);
			g.fillRect(10,550,150,50);
			g.fillRect(10,610,150,50);
			g.fillRect(10,670,150,50);
			
			g.fillRect(10,895,150,50);
		}
		
		else if(PandS_Main.country_pic == 3){
			g.setColor(Color.red);
			g.fillRect(10,130,150,50);
			g.setColor(Color.gray);
			g.fillRect(10,70,150,50);
			g.fillRect(10,10,150,50);
			g.fillRect(10,190,150,50);
			g.fillRect(10,250,150,50);
			g.fillRect(10,310,150,50);
			g.fillRect(10,370,150,50);
			g.fillRect(10,430,150,50);
			g.fillRect(10,490,150,50);
			g.fillRect(10,550,150,50);
			g.fillRect(10,610,150,50);
			g.fillRect(10,670,150,50);
			
			g.fillRect(10,895,150,50);
		}
		
		else if(PandS_Main.country_pic == 4){
			g.setColor(Color.red);
			g.fillRect(10,190,150,50);
			g.setColor(Color.gray);
			g.fillRect(10,70,150,50);
			g.fillRect(10,10,150,50);
			g.fillRect(10,130,150,50);
			g.fillRect(10,250,150,50);
			g.fillRect(10,310,150,50);
			g.fillRect(10,370,150,50);
			g.fillRect(10,430,150,50);
			g.fillRect(10,490,150,50);
			g.fillRect(10,550,150,50);
			g.fillRect(10,610,150,50);
			g.fillRect(10,670,150,50);
			
			g.fillRect(10,895,150,50);
		}
		
		else if(PandS_Main.country_pic == 5){
			g.setColor(Color.red);
			g.fillRect(10,250,150,50);
			g.setColor(Color.gray);
			g.fillRect(10,70,150,50);
			g.fillRect(10,10,150,50);
			g.fillRect(10,190,150,50);
			g.fillRect(10,130,150,50);
			g.fillRect(10,310,150,50);
			g.fillRect(10,370,150,50);
			g.fillRect(10,430,150,50);
			g.fillRect(10,490,150,50);
			g.fillRect(10,550,150,50);
			g.fillRect(10,610,150,50);
			g.fillRect(10,670,150,50);
			
			g.fillRect(10,895,150,50);
		}
		
		else if(PandS_Main.country_pic == 6){
			g.setColor(Color.red);
			g.fillRect(10,310,150,50);
			g.setColor(Color.gray);
			g.fillRect(10,70,150,50);
			g.fillRect(10,10,150,50);
			g.fillRect(10,190,150,50);
			g.fillRect(10,250,150,50);
			g.fillRect(10,130,150,50);
			g.fillRect(10,370,150,50);
			g.fillRect(10,430,150,50);
			g.fillRect(10,490,150,50);
			g.fillRect(10,550,150,50);
			g.fillRect(10,610,150,50);
			g.fillRect(10,670,150,50);
			
			g.fillRect(10,895,150,50);
		}
		
		else if(PandS_Main.country_pic == 7){
			g.setColor(Color.red);
			g.fillRect(10,370,150,50);
			g.setColor(Color.gray);
			g.fillRect(10,70,150,50);
			g.fillRect(10,10,150,50);
			g.fillRect(10,190,150,50);
			g.fillRect(10,250,150,50);
			g.fillRect(10,310,150,50);
			g.fillRect(10,130,150,50);
			g.fillRect(10,430,150,50);
			g.fillRect(10,490,150,50);
			g.fillRect(10,550,150,50);
			g.fillRect(10,610,150,50);
			g.fillRect(10,670,150,50);
			
			g.fillRect(10,895,150,50);
		}
		
		else if(PandS_Main.country_pic == 8){
			g.setColor(Color.red);
			g.fillRect(10,430,150,50);
			g.setColor(Color.gray);
			g.fillRect(10,70,150,50);
			g.fillRect(10,10,150,50);
			g.fillRect(10,190,150,50);
			g.fillRect(10,250,150,50);
			g.fillRect(10,310,150,50);
			g.fillRect(10,370,150,50);
			g.fillRect(10,130,150,50);
			g.fillRect(10,490,150,50);
			g.fillRect(10,550,150,50);
			g.fillRect(10,610,150,50);
			g.fillRect(10,670,150,50);
			
			g.fillRect(10,895,150,50);
		}
		
		else if(PandS_Main.country_pic == 9){
			g.setColor(Color.red);		
			g.fillRect(10,490,150,50);
			g.setColor(Color.gray);
			g.fillRect(10,70,150,50);
			g.fillRect(10,10,150,50);
			g.fillRect(10,190,150,50);
			g.fillRect(10,250,150,50);
			g.fillRect(10,310,150,50);
			g.fillRect(10,370,150,50);
			g.fillRect(10,430,150,50);
			g.fillRect(10,130,150,50);
			g.fillRect(10,550,150,50);
			g.fillRect(10,610,150,50);
			g.fillRect(10,670,150,50);
			
			g.fillRect(10,895,150,50);
		}
		
		else if(PandS_Main.country_pic == 10){
			g.setColor(Color.red);
			g.fillRect(10,550,150,50);
			g.setColor(Color.gray);
			g.fillRect(10,70,150,50);
			g.fillRect(10,10,150,50);
			g.fillRect(10,190,150,50);
			g.fillRect(10,250,150,50);
			g.fillRect(10,130,150,50);
			g.fillRect(10,310,150,50);
			g.fillRect(10,370,150,50);
			g.fillRect(10,430,150,50);
			g.fillRect(10,490,150,50);
			g.fillRect(10,610,150,50);
			g.fillRect(10,670,150,50);
			
			g.fillRect(10,895,150,50);
		}
		
		else if(PandS_Main.country_pic == 11){
			g.setColor(Color.red);	
			g.fillRect(10,610,150,50);
			g.setColor(Color.gray);
			g.fillRect(10,70,150,50);
			g.fillRect(10,10,150,50);
			g.fillRect(10,190,150,50);
			g.fillRect(10,250,150,50);
			g.fillRect(10,310,150,50);
			g.fillRect(10,370,150,50);
			g.fillRect(10,430,150,50);
			g.fillRect(10,490,150,50);
			g.fillRect(10,550,150,50);
			g.fillRect(10,130,150,50);
			g.fillRect(10,670,150,50);
			
			g.fillRect(10,895,150,50);
		}
		
		else if(PandS_Main.country_pic == 12){
			g.setColor(Color.red);
			g.fillRect(10,670,150,50);
			g.setColor(Color.gray);
			g.fillRect(10,70,150,50);
			g.fillRect(10,10,150,50);
			g.fillRect(10,190,150,50);
			g.fillRect(10,250,150,50);
			g.fillRect(10,310,150,50);
			g.fillRect(10,370,150,50);
			g.fillRect(10,430,150,50);
			g.fillRect(10,490,150,50);
			g.fillRect(10,550,150,50);
			g.fillRect(10,610,150,50);
			g.fillRect(10,130,150,50);
			
			g.fillRect(10,895,150,50);
		}
		
		g.setColor(Color.white);
		
		g.fillRect(280,100,600,400);
		g.fillRect(280,550,600,200);
		g.fillRect(880,700,50,50);
		
		
		
		
		g.setColor(Color.black);
		
		Font f = new Font("Arial Bold", Font.BOLD | Font.ITALIC, 30);
		g.setFont(f);
		
		g.drawString("America", 20,45);
		g.drawString("Russia", 20,105);
		g.drawString("Germany", 20,165);
		g.drawString("China", 20,225);
		g.drawString("Japan", 20,285);
		g.drawString("England", 20,345);
		g.drawString("Ukraine", 20,405);
		g.drawString("France", 20,465);
		g.drawString("Canada", 20,525);
		g.drawString("Italy", 20,585);
		g.drawString("Poland", 20,645);
		g.drawString("Taiwan", 20,705);
		
		g.drawString("Back", 45,930);
		
		g.drawImage(picture,280,100,600,400, null);
		g.drawImage(about,280,550,600,200, null);
		g.drawImage(sound,880,700,50,50, null);
		
		
			
	}
	
	public void define_pic(int country_pic){
		
		if(PandS_Main.country_pic == 0){
			picture=null;
			about=null;
			sound=null;
		}
		else if (PandS_Main.country_pic == 1) {
			picture = new ImageIcon(this.getClass().getResource("/image/America.png")).getImage();
			about = new ImageIcon(this.getClass().getResource("/image/about_America.jpg")).getImage();
			sound = new ImageIcon(this.getClass().getResource("/image/sound.png")).getImage();
		} 
		else if (PandS_Main.country_pic == 2) {
			picture = new ImageIcon(this.getClass().getResource("/image/Russia.png")).getImage();
			about = new ImageIcon(this.getClass().getResource("/image/about_Russia.jpg")).getImage();
			sound = new ImageIcon(this.getClass().getResource("/image/sound.png")).getImage();
		} 
		else if(PandS_Main.country_pic == 3){
			picture = new ImageIcon(this.getClass().getResource("/image/Germany.png")).getImage();
			about = new ImageIcon(this.getClass().getResource("/image/about_Germany.jpg")).getImage();
			sound = new ImageIcon(this.getClass().getResource("/image/sound.png")).getImage();
			
		}
		else if(PandS_Main.country_pic == 4){
			picture = new ImageIcon(this.getClass().getResource("/image/China.png")).getImage();
			about = new ImageIcon(this.getClass().getResource("/image/about_China.jpg")).getImage();
			sound = new ImageIcon(this.getClass().getResource("/image/sound.png")).getImage();
			
		}
		else if(PandS_Main.country_pic == 5){
			picture = new ImageIcon(this.getClass().getResource("/image/Japan.png")).getImage();
			about = new ImageIcon(this.getClass().getResource("/image/about_Japan.jpg")).getImage();
			sound = new ImageIcon(this.getClass().getResource("/image/sound.png")).getImage();
			
		}
		else if(PandS_Main.country_pic == 6){
			picture = new ImageIcon(this.getClass().getResource("/image/England.png")).getImage();
			about = new ImageIcon(this.getClass().getResource("/image/about_England.jpg")).getImage();
			sound = new ImageIcon(this.getClass().getResource("/image/sound.png")).getImage();
			
		}
		
		else if(PandS_Main.country_pic == 7){
			picture = new ImageIcon(this.getClass().getResource("/image/Ukraine.png")).getImage();
			about = new ImageIcon(this.getClass().getResource("/image/about_Ukraine.jpg")).getImage();
			sound = new ImageIcon(this.getClass().getResource("/image/sound.png")).getImage();
			
		}
		else if(PandS_Main.country_pic == 8){
			picture = new ImageIcon(this.getClass().getResource("/image/France.png")).getImage();
			about = new ImageIcon(this.getClass().getResource("/image/about_France.jpg")).getImage();
			sound = new ImageIcon(this.getClass().getResource("/image/sound.png")).getImage();
			
		}
		else if(PandS_Main.country_pic == 9){
			picture = new ImageIcon(this.getClass().getResource("/image/Canada.png")).getImage();
			about = new ImageIcon(this.getClass().getResource("/image/about_Canada.jpg")).getImage();
			sound = new ImageIcon(this.getClass().getResource("/image/sound.png")).getImage();
			
		}
		else if(PandS_Main.country_pic == 10){
			picture = new ImageIcon(this.getClass().getResource("/image/Italy.png")).getImage();
			about = new ImageIcon(this.getClass().getResource("/image/about_Italy.jpg")).getImage();
			sound = new ImageIcon(this.getClass().getResource("/image/sound.png")).getImage();
			
		}
		else if(PandS_Main.country_pic == 11){
			picture = new ImageIcon(this.getClass().getResource("/image/Poland.png")).getImage();
			about = new ImageIcon(this.getClass().getResource("/image/about_Poland.jpg")).getImage();
			sound = new ImageIcon(this.getClass().getResource("/image/sound.png")).getImage();
			
		}
		else if(PandS_Main.country_pic == 12){
			picture = new ImageIcon(this.getClass().getResource("/image/Taiwan.png")).getImage();
			about = new ImageIcon(this.getClass().getResource("/image/about_Taiwan.jpg")).getImage();
			sound = new ImageIcon(this.getClass().getResource("/image/sound.png")).getImage();
			
		}
		 
		 
			
	}

	


}
