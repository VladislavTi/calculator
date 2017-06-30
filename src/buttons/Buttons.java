package buttons;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Buttons extends JFrame{

	public JButton bPlus, bMinus, bZero, bOne, bTwo, bThree, bFour, bFive, bClear, bSqrt;
	public JButton bSix, bSeven, bEight, bNine, bEqual, bDel, bUmno, bPoint, bPlMin;
	
	public JLabel labPodskazka, lab2, lab3, lab4;
	public JTextField t1;

	
	private double x;
	private double y;
	public int after;
	private String funct = "ok";
	
	
	
	
	
	public void setFunc (Buttons btn, String s) {
		btn.funct = s;
	}
	
	public String getFunc (Buttons btn) {
		return btn.funct;
	}
	
	
	public void setX (Buttons btn, double i) {
		btn.x = i;
	}
	
	public void setY (Buttons btn, double i) {
		btn.y = i;
	}
	
	public double getX (Buttons btn, double i) {
		return btn.x;
	}
	
	public double getY (Buttons btn, double i) {
		return btn.y;
	}
	
	
	public boolean isAfterEqual (Buttons btn) {
		if (btn.after == 1) {
			return true;
		}
		return false;
	}
	
	
	public double plus (Buttons btn) {
		return btn.x+btn.y;
	}
	
	public double multiply (Buttons btn) {
		return btn.x*btn.y;
	}
	
	public double divide (Buttons btn) {
		return btn.x/btn.y;
	}
	
	public double minus (Buttons btn) {
		return btn.x-btn.y;
	}
	
	public void setLabels(Buttons btn, String lbPodsk, String tSetText) {
		btn.t1.setText(tSetText);
		btn.labPodskazka.setText(lbPodsk);
	}
	
	public void setLabels(Buttons btn, String tSetText) {
		String s = btn.t1.getText();
		btn.t1.setText(s + tSetText);
	}
	
	public void setLabels(Buttons btn) {
		btn.t1.setText("");
		btn.labPodskazka.setText("");
	}
	
	
	
	public double vibor(Buttons btn) {
		double res = 0;
		
		switch (btn.funct.toLowerCase()) {
			case "minus":
				res = minus(btn);
			break;
			case "plus":
				res = plus(btn);
			break;
			case "divide":
				res = divide(btn);
			break;
			case "multiply":
				res = multiply(btn);
			break;
			case "ok":
				res = Double.parseDouble(btn.t1.getText());
			break;
			case "":
				res = Double.parseDouble(btn.t1.getText());
			break;
		}
		
		return res;
	}
	
	
	
}
