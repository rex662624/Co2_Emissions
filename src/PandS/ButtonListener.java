package PandS;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class ButtonListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {

		String command = e.getActionCommand();
		if (command.equals("Return")) {
			PandS_Main.state = 0;
			PandS_Main.frame.setVisible(true);
			PandS_Main.yearframe.setVisible(false);
			PandS_Main.judge=0;
			Pie.ani = 360;
		} else if (command.equals("Block Chart")) {
			
			PandS_Main.state = 3;
		} else if (command.equals("Pie Chart")) {
			Pie.ani = 360;
			PandS_Main.state = 2;
		}


	}
}
