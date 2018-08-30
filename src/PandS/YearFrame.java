package PandS;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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

public class YearFrame extends JFrame implements ActionListener, MouseListener {

	Pie pie;
	static int Piex = 100, Piey = 200;
	JTextField input = new JTextField(50);
	static JLabel lb;
	String inputstring = "1970~2015";
	int count = 0;

	public YearFrame() {

		Timer timer = new Timer(35, this);
		timer.start();

		setTitle("Probability");
		setSize(1000, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		getContentPane().setBackground(Color.LIGHT_GRAY);

		JMenu Menu1 = new JMenu("Menu");
		JMenu Menu2 = new JMenu("Return");

		JMenuItem item1 = new JMenuItem("Block Chart");
		JMenuItem item2 = new JMenuItem("Return");
		JMenuItem item3 = new JMenuItem("Pie Chart");
		item1.addActionListener(new ButtonListener());
		item2.addActionListener(new ButtonListener());
		item3.addActionListener(new ButtonListener());
		Menu1.add(item1);
		Menu1.add(item3);
		Menu2.add(item2);

		JMenuBar bar = new JMenuBar();
		bar.setBackground(Color.GREEN);
		bar.add(Menu1);
		bar.add(Menu2);

		lb = new JLabel("Pie Chart & Block Chart");
		lb.setFont(new Font("Serif", Font.PLAIN, 50));
		lb.setLocation(250, 50);
		lb.setSize(600, 50);
		add(lb);

		// ---------------------------------------------
		pie = new Pie();
		pie.setLocation(Piex, Piey);
		pie.setSize(1000, 500);
		pie.setBackground(Color.LIGHT_GRAY);
		add(pie);

		input.setLocation(200, 150);
		input.setSize(input.getPreferredSize());
		input.setText("");
		add(input);

		// -----------------
		addMouseListener(this);
		setJMenuBar(bar);
		setVisible(false);
	}

	public void actionPerformed(ActionEvent e) {

		if (PandS_Main.state == 2) {
			PandS_Main.year = 1970;
			try {

				PandS_Main.year = Integer.valueOf(input.getText());
				if (PandS_Main.year > 2015 || PandS_Main.year < 1970) {
					Pie.wrong = 1;

				} else
					Pie.wrong = 0;

			} catch (IllegalArgumentException e2) {
				Pie.wrong = 1;

			}
			if (Pie.wrong == 0)
				Pie.index = PandS_Main.year - 1970;

			if (Pie.ani > 0)
				Pie.ani -= 10;

		} else if (PandS_Main.state == 3) {

			String tmp1, tmp2, tmp3;
			Pie.start = 1970;
			Pie.end = 2015;
			try {
				inputstring = input.getText();

				if (inputstring.length() == 9) {
					tmp1 = inputstring.substring(0, 4);
					tmp2 = inputstring.substring(4, 5);
					tmp3 = inputstring.substring(5, 9);
					Pie.start = Integer.valueOf(tmp1);
					Pie.end = Integer.valueOf(tmp3);
					//System.out.println(tmp1 + tmp2 + tmp3);
					if (Pie.start > Pie.end || Pie.end > 2015 || Pie.end < 1970 || Pie.start < 1970
							|| Pie.start > 2015) {
						Pie.wrong = 1;
						Pie.start=1970;
						Pie.end=2015;
						Pie.startindex =0;
						Pie.endindex =45;
					} else
						Pie.wrong = 0;
				}

				if (Pie.wrong == 0)
					Pie.startindex = Pie.start - 1970;
					Pie.endindex = Pie.end - 1970;
			} catch (IllegalArgumentException e2) {
				Pie.wrong = 1;

			}

		} else if (PandS_Main.state == 4) {
			count++;
			//System.out.println(count);
			if (count % 5 == 0) {
				Pie.index++;
			}

			if (Pie.index >= 45)
				PandS_Main.state = 2;

		}

		pie.repaint();

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		int x = arg0.getX();
		int y = arg0.getY();
		//System.out.println(x + "," + y);
		if (PandS_Main.state == 2) {

			if (x >= 135 && x <= 180 && y >= 280 && y <= 327) {
				PandS_Main.state = 4;
				Pie.index = 0;
			}
		}

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
