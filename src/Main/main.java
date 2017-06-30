package Main;

import javax.swing.JFrame;

import CalcWindow.calcWindow;
import TxtReadWrite.txtReWr;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		calcWindow window = new calcWindow("Калькулятор");
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(350, 220);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		
		

	}

}
