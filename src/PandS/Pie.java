package PandS;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.lang.Integer;

public class Pie extends JPanel {

	static int index = 0;
	static int wrong = 0;

	static int ani = 360;

	static int count = 0;

	static int start = 1970, end = 2015;
	static int startindex = 0, endindex = 45;

	public void paint(Graphics g) {

		if (PandS_Main.state == 2 || PandS_Main.state == 4) {

			Font f2 = new Font("Arial Bold", Font.BOLD | Font.ITALIC, 20);

			super.paint(g);
			paintComponent(g);

			Color[] a = { Color.orange, Color.BLUE, Color.white, Color.MAGENTA, Color.gray, Color.CYAN, Color.pink,
					Color.red, Color.black, Color.green };
			int start = 0;
			int j = 0;
			for (; j < 9; j++) {

				g.setColor(a[j]);
				g.fillRect(550, 25 + 45 * j, 20, 20);
				g.setFont(f2);

				String s = String.format("%.3f", PandS_Main.countrydata[j][index] * 100 / PandS_Main.world[index]);

				g.drawString(PandS_Main.countryname[j] + " : " + s + "%", 580, 42 + 45 * j);

				g.fillArc(50, 50, 400, 400, start,
						(int) (PandS_Main.countrydata[j][index] * 360 / PandS_Main.world[index]));
				start += (int) (PandS_Main.countrydata[j][index] * 360 / PandS_Main.world[index]);
			}
			g.setColor(a[j]);
			g.fillRect(550, 25 + 45 * j, 20, 20);
			String s = String.format("%.3f", PandS_Main.countrydata[j][index] * 100 / PandS_Main.world[index]);
			g.drawString(PandS_Main.countryname[j] + " : " + s + "%", 580, 42 + 45 * j);
			g.fillArc(50, 50, 400, 400, start, 360 - start);
			// ------------------------------------
			g.setColor(Color.LIGHT_GRAY);
			g.fillOval(150, 150, 200, 200);

			g.setColor(Color.LIGHT_GRAY);
			g.fillArc(50, 50, 400, 400, 0, ani);

			// ----------------
			Font f = new Font("Arial Bold", Font.BOLD | Font.ITALIC, 32);
			g.setFont(f);
			g.setColor(Color.ORANGE.darker().darker().darker());
			g.drawString("" + (index + 1970), 200, 210);
			g.setColor(Color.ORANGE.darker().darker().darker());
			g.drawString(PandS_Main.world[index]+"kt", 160, 280);
			// ------------------
			g.setColor(Color.YELLOW);
			for (int i = 0; i < 8; i++) {
				g.drawLine(500 + i, 0, 500 + i, 480);
				g.drawRoundRect(0 + i, 0 + i, 780 - 2 * i, 480 - 2 * i, 5, 5);
			}

			// -------------------------------------
			g.fillRoundRect(25, 25, 50, 50, 10, 10);
			g.setColor(Color.BLACK);
			g.fillOval(30, 30, 40, 40);
			g.setColor(Color.RED);
			g.fillOval(40, 40, 20, 20);

		} else {
			super.paint(g);
			paintComponent(g);

			g.setColor(Color.green.darker());

			int scale = 46 / (endindex - startindex + 1);
			// System.out.println(scale);
			for (int i = 0, j = startindex; i <= endindex - startindex; i++, j++) {
				g.fillRect(100 + 16 * i * scale, 400 - (PandS_Main.world[j] / 100000), 5 * scale,
						PandS_Main.world[j] / 100000);
			}

			g.setColor(Color.BLACK);
			for (int i = 0; i < 2; i++) {
				g.drawLine(80 + i, 25, 80 + i, 400);
				g.drawLine(80, 400, 850, 400);
			}
			for (int i = 0; i <= 7; i++) {
				int number = i * 50 * 100000;
				g.drawString("" + number, 0, 400 - (0 + i * 50) + 5);
				g.drawLine(70, 400 - (0 + i * 50), 90, 400 - (0 + i * 50));
			}

			// ----------------------------------------------------------------
			g.setColor(Color.BLUE);
			g.setFont(new Font("Arial Bold", Font.BOLD | Font.ITALIC, 32));

			if (end - start == 0) {

				g.drawString("Co2 emission (kt) in "+end+" :"+PandS_Main.world[endindex], 100, 450);

				
			} else {

				// System.out.println(PandS_Main.world[endindex]+","+PandS_Main.world[startindex]);
				// double rate=((double)PandS_Main.world[endindex] -
				// PandS_Main.world[startindex])*100 /
				// PandS_Main.world[startindex];
				// System.out.println(rate);
				String rate = String.format("%.3f", (double) (PandS_Main.world[endindex] - PandS_Main.world[startindex])
						* 100 / PandS_Main.world[startindex]);
				g.drawString("Growth rate :" + rate + "%", 100, 450);
			}

			// ----------------------------------------------------------------

		}
	}

}
