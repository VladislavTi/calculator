package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import buttons.Buttons;

public class mainCalc extends Calc{

	
	public void start(Buttons btn, Object h) {
		try {
			Calc cl = new Calc();
			cl.whatButtClick(btn, h);
		}catch (Exception ex) { 
			setLabels(btn, "¬ведите число", "");
			JOptionPane.showMessageDialog(null, "¬ведите в поле число"); 
		}
	}


	
	
}
