package PandS;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Timer;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.Timer;

public class PandS_Main extends JFrame implements ActionListener, MouseListener {

	static int[] world = new int[46];// World CO2
	// data,World[0]:1970,World[1]:1971....World[45]:2015
	static String[] countryname = new String[10];
	static double[][] countrydata = new double[10][46];// 10 country,each has 46
	// data
	static int year;
	static int judge = 0;

	// -----------------------------------------------------------------

	public static JFrame frame = new JFrame();
	public static int state = 0;
	public static int country_pic = 0;
	MainMenu mainmenu = new MainMenu();
	CountryPage countrypage = new CountryPage();

	static YearFrame yearframe = new YearFrame();

	public static void main(String[] args) {

		Scanner Worldfilein = null;
		Scanner Countryfilein = null;

		try {
			Worldfilein = new Scanner(new FileInputStream("World_data.txt"));
			Countryfilein = new Scanner(new FileInputStream("country_data.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < 46; i++) {// read world data
			world[i] = Worldfilein.nextInt();
			Worldfilein.nextLine();// read "\n"
		}

		for (int i = 0; i < 10; i++)// read country name
		{
			countryname[i] = Countryfilein.next();
		}
		Countryfilein.nextLine();// read "\n"

		for (int i = 0; i < 46; i++) {
			for (int j = 0; j < 10; j++) {
				countrydata[j][i] = Countryfilein.nextDouble();
			}
			Countryfilein.nextLine();// read "\n"
		}

		for (int i = 0; i < 10; i++)// read country name
		{
			System.out.println(countrydata[9][i]);
		}
		// ----------------------------------------------------------

		PandS_Main PandSMain = new PandS_Main();

	}

	public PandS_Main() {

		frame.setTitle("Probability and Statistics");
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());

		mainmenu.setLocation(0, 0);
		mainmenu.setSize(1000, 1000);
		mainmenu.setBackground(Color.white);

		countrypage.setLocation(0, 0);
		countrypage.setSize(1000, 1000);
		countrypage.setBackground(Color.white);

		Timer timer = new Timer(10, this);
		timer.start();

		frame.add(mainmenu);
		frame.add(countrypage);

		frame.addMouseListener(this);
		frame.setResizable(true);
		frame.setLayout(null);
		frame.setVisible(true);

	}

	public void actionPerformed(ActionEvent arg0) {
		// System.out.println(state);
		if (state == 0) {
			mainmenu.repaint();

		} else if (state == 1) {
			countrypage.repaint();

		} else if (state == 2) {
			if (judge == 0) {
				Pie.ani = 360;
				yearframe.setVisible(true);
				judge = 1;
				frame.setVisible(false);
			} else
				;

		}

	}

	public void mouseClicked(MouseEvent arg0) {

		if ((arg0.getModifiers() & MouseEvent.BUTTON1_MASK) != 0) {

			int x = arg0.getX();
			int y = arg0.getY();
			System.out.println("\nX:" + x + " Y:" + y);

			if (state == 0) {

				if (x >= 385 && x <= 635 && y >= 510 && y <= 610) {
					state = 1;
				} else if (x >= 385 && x <= 635 && y >= 510 + 150 && y <= 610 + 150) {
					state = 2;
				}
			} else if (state == 1) {

				if (x >= 20 && x <= 170 && y >= 50 && y <= 100) {

					country_pic = 1;

				} else if (x >= 20 && x <= 170 && y >= 110 && y <= 160) {

					country_pic = 2;

				} else if (x >= 20 && x <= 170 && y >= 170 && y <= 220) {

					country_pic = 3;

				}

				else if (x >= 20 && x <= 170 && y >= 230 && y <= 280) {

					country_pic = 4;

				}

				else if (x >= 20 && x <= 170 && y >= 290 && y <= 340) {

					country_pic = 5;

				} else if (x >= 20 && x <= 170 && y >= 350 && y <= 400) {

					country_pic = 6;

				} else if (x >= 20 && x <= 170 && y >= 410 && y <= 460) {

					country_pic = 7;

				} else if (x >= 20 && x <= 170 && y >= 470 && y <= 520) {

					country_pic = 8;

				} else if (x >= 20 && x <= 170 && y >= 530 && y <= 580) {

					country_pic = 9;

				} else if (x >= 20 && x <= 170 && y >= 590 && y <= 640) {

					country_pic = 10;

				} else if (x >= 20 && x <= 170 && y >= 650 && y <= 700) {

					country_pic = 11;

				} else if (x >= 20 && x <= 170 && y >= 710 && y <= 760) {

					country_pic = 12;

				} else if (x >= 20 && x <= 170 && y >= 935 && y <= 985) {

					country_pic = 0;
					state = 0;

				} else if (country_pic == 1 && x >= 890 && x <= 940 && y >= 740 && y <= 790) {
					AmericaSound();
				} else if (country_pic == 2 && x >= 890 && x <= 940 && y >= 740 && y <= 790) {
					RussiaSound();
				}else if (country_pic == 3 && x >= 890 && x <= 940 && y >= 740 && y <= 790) {
					GermanySound();
				}else if (country_pic == 4 && x >= 890 && x <= 940 && y >= 740 && y <= 790) {
					ChinaSound();
				}else if (country_pic == 5 && x >= 890 && x <= 940 && y >= 740 && y <= 790) {
					JapanSound();
				}else if (country_pic == 6 && x >= 890 && x <= 940 && y >= 740 && y <= 790) {
					EnglandSound();
				}else if (country_pic == 7 && x >= 890 && x <= 940 && y >= 740 && y <= 790) {
					UkraineSound();
				}else if (country_pic == 8 && x >= 890 && x <= 940 && y >= 740 && y <= 790) {
					FranceSound();
				}else if (country_pic == 9 && x >= 890 && x <= 940 && y >= 740 && y <= 790) {
					CanadaSound();
				}else if (country_pic == 10 && x >= 890 && x <= 940 && y >= 740 && y <= 790) {
					ItalySound();
				}else if (country_pic == 11 && x >= 890 && x <= 940 && y >= 740 && y <= 790) {
					PolandSound();
				}else if (country_pic == 12 && x >= 890 && x <= 940 && y >= 740 && y <= 790) {
					TaiwanSound();
				}

				countrypage.define_pic(country_pic);
				countrypage.repaint();
			}

		}

	}

	public void mouseEntered(MouseEvent arg0) {

	}

	public void mouseExited(MouseEvent arg0) {

	}

	public void mousePressed(MouseEvent arg0) {

	}

	public void mouseReleased(MouseEvent arg0) {

	}

	public static void AmericaSound() {

		try {
			File file = new File("America" + ".wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(file));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength() / 2000);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static void RussiaSound() {

		try {
			File file = new File("Russia" + ".wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(file));
			clip.start();

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void GermanySound() {

		try {
			File file = new File("Germany" + ".wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(file));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength() / 2000);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void ChinaSound() {

		try {
			File file = new File("China" + ".wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(file));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength() / 2000);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void JapanSound() {

		try {
			File file = new File("Japan" + ".wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(file));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength() / 2000);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void EnglandSound() {

		try {
			File file = new File("England" + ".wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(file));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength() / 2000);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void UkraineSound() {

		try {
			File file = new File("Ukraine" + ".wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(file));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength() / 2000);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void FranceSound() {

		try {
			File file = new File("France" + ".wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(file));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength() / 2000);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void CanadaSound() {

		try {
			File file = new File("Canada" + ".wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(file));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength() / 2000);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void ItalySound() {

		try {
			File file = new File("Italy" + ".wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(file));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength() / 2000);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void PolandSound() {

		try {
			File file = new File("Poland" + ".wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(file));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength() / 2000);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void TaiwanSound() {

		try {
			File file = new File("Taiwan" + ".wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(file)); 
			clip.start();
			Thread.sleep(clip.getMicrosecondLength() / 2000);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	

}
