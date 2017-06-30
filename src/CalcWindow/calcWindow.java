package CalcWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import TxtReadWrite.txtReWr;
import buttons.Buttons;
import calc.Calc;
import calc.mainCalc;

public class calcWindow  extends JFrame{
	
	
	public Buttons btn = new Buttons();
	
	
	
	public Object configButtons(String s) {
		ImageIcon icon = new ImageIcon(s);
        Image img = icon.getImage() ;
        Image newimg = img.getScaledInstance( 20, 20,  java.awt.Image.SCALE_SMOOTH ) ;
        icon = new ImageIcon(newimg);
		
		return icon;
	}
	

	
	public calcWindow(String s) {
		super(s);
		setLayout(new FlowLayout());
		
		eHandler handler = new eHandler();

		btn.bPlus = new JButton((Icon) configButtons("+.png"));
		btn.bMinus = new JButton((Icon) configButtons("-.png"));

		
		btn.bZero =  new JButton((Icon) configButtons("0.png"));
		btn.bZero.setPreferredSize(new Dimension(114,30));
		btn.bOne =   new JButton((Icon) configButtons("1.png"));
		btn.bTwo =   new JButton((Icon) configButtons("2.png"));
		btn.bThree = new JButton((Icon) configButtons("3.png"));
		btn.bFour =  new JButton((Icon) configButtons("4.png"));
		btn.bFive=   new JButton((Icon) configButtons("5.png"));
		btn.bSix =  new JButton((Icon) configButtons("6.png"));
		btn.bSeven = new JButton((Icon) configButtons("7.png"));
		btn.bEight = new JButton((Icon) configButtons("8.png"));
		btn.bNine =  new JButton((Icon) configButtons("9.png"));
		btn.bEqual = new JButton((Icon) configButtons("equal.png"));
		btn.bDel =   new JButton((Icon) configButtons("divide.png"));
		btn.bUmno =  new JButton((Icon) configButtons("mult.png"));
		btn.bPoint = new JButton((Icon) configButtons("point.png"));
		btn.bPlMin = new JButton((Icon) configButtons("plMin.png"));
		btn.bClear = new JButton((Icon) configButtons("clear.png"));
		btn.bSqrt =  new JButton((Icon) configButtons("sqrt.png"));
		
		btn.labPodskazka = new JLabel("Введите число");
		btn.lab2 = new JLabel("");
		btn.lab3 = new JLabel("");
		btn.lab4 = new JLabel("");
		
		btn.t1 = new JTextField(30);
		
		add(btn.labPodskazka);
		add(btn.t1);
		
		add(btn.bSeven);
		add(btn.bEight);
		add(btn.bNine);
		
		add(btn.bDel);
		add(btn.bClear);
		
		add(btn.bFour);
		add(btn.bFive);
		add(btn.bSix);
		
		add(btn.bUmno);
		add(btn.bPlMin);
		
		
		add(btn.bOne);
		add(btn.bTwo);
		add(btn.bThree);
		add(btn.bMinus);
		add(btn.bSqrt);
		
		
		add(btn.bZero);
		add(btn.bPoint);
		add(btn.bPlus);
		add(btn.bEqual);
		
		btn.bPlus.addActionListener(handler);
		btn.bMinus.addActionListener(handler);
		btn.bZero.addActionListener(handler);
		btn.bOne.addActionListener(handler);
		btn.bTwo.addActionListener(handler);
		btn.bThree.addActionListener(handler);
		btn.bFour.addActionListener(handler);
		btn.bFive.addActionListener(handler);
		btn.bSix.addActionListener(handler);
		btn.bSeven.addActionListener(handler);
		btn.bEight.addActionListener(handler);
		btn.bNine.addActionListener(handler);
		btn.bEqual.addActionListener(handler);
		btn.bDel.addActionListener(handler);
		btn.bUmno.addActionListener(handler);
		btn.bPoint.addActionListener(handler);
		btn.bPlMin.addActionListener(handler);
		btn.bClear.addActionListener(handler);
		btn.bSqrt.addActionListener(handler);
		
	}
	
	
	
	public class eHandler extends mainCalc implements ActionListener {
		

		txtReWr txt = new txtReWr();

		public void actionPerformed(ActionEvent act) {
			
			Calc h = new Calc();
			
			try {	
				mainCalc st = new mainCalc();
				st.start(btn, act.getSource());
			} catch (Exception ex) { 
				JOptionPane.showMessageDialog(null, "Что-то пошло не так"); 
			}
			
			

		}
		
	}
	
	

}
