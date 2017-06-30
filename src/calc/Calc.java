package calc;

import buttons.Buttons;

public class Calc extends Buttons{



	
	public void whatButtClick(Buttons btn, Object objec) {
		
		String str = new String();
		
		
		
		if (objec == btn.bPlus) {
			setX(btn, Double.parseDouble(btn.t1.getText()));
			setLabels(btn, "Введите следующее число", "");
			setFunc(btn, "plus");
		}
		
		if (objec == btn.bMinus) {
			setX(btn, Double.parseDouble(btn.t1.getText()));
			setLabels(btn, "Введите следующее число", "");
			setFunc(btn, "minus");
		}
		
		if (objec == btn.bUmno) {
			setX(btn, Double.parseDouble(btn.t1.getText()));
			setLabels(btn, "Введите следующее число", "");
			setFunc(btn, "multiply");
		}
		
		if (objec == btn.bDel) {
			setX(btn, Double.parseDouble(btn.t1.getText()));
			setLabels(btn, "Введите следующее число", "");
			setFunc(btn, "divide");
		}
		
		if (objec == btn.bPlMin) {
			String s = btn.t1.getText();
			if ((s.length() != 0)) {
				if ((s.length() == 2) && (s.equals("0."))){
				} if ((s.length() == 1) && (s.equals("0"))){
				}else {
					if (s.indexOf("-") == -1) {
						setLabels(btn, "Произошла смена знака", "-"+s);
					} else {
						setLabels(btn, "Произошла смена знака", s.substring(1, s.length()));
					}
				}
			}
		}
		
		
		
		
		
		if (objec == btn.bPoint) {
			
			if (getFunc(btn).equals("ok")) {
				setLabels(btn, "Введите число" ,"0.");
			} else {
				if (btn.t1.getText().indexOf(".") == -1) {
					if (btn.t1.getText().length() == 0){
						setLabels(btn, "0.");
					} else {
						setLabels(btn, ".");
					}
				}
			}
		}
		
		
		if (objec == btn.bSqrt) {
			setLabels(btn, "Был взят корень", "" + Math.sqrt(Double.parseDouble(btn.t1.getText())));
		}
	
		
		if (objec == btn.bZero) {
			if (getFunc(btn).length() == 2) {
				setFunc(btn, "");
			}
				setLabels(btn, "0");
		}
		
		
		if (objec == btn.bOne) {
			if (getFunc(btn).length() == 2) {
				setFunc(btn, "");
			}
			setLabels(btn, "1");
			
		}
		
		if (objec == btn.bTwo) {
			if (getFunc(btn).length() == 2) {
				setFunc(btn, "");
			}
			setLabels(btn, "2");
		}
		
		if (objec == btn.bThree) {
			if (getFunc(btn).length() == 2) {
				setFunc(btn, "");
			}
			setLabels(btn, "3");
		}
		
		if (objec == btn.bFour) {
			if (getFunc(btn).length() == 2) {
				setFunc(btn, "");
			}
			setLabels(btn, "4");
		}
		
		if (objec == btn.bFive) {
			if (getFunc(btn).length() == 2) {
				setFunc(btn, "");
			}
			setLabels(btn, "5");
		}
		
		
		if (objec == btn.bSix) {
			if (getFunc(btn).length() == 2) {
				setFunc(btn, "");
			}
			setLabels(btn, "6");
		}
		
		if (objec == btn.bSeven) {
			if (getFunc(btn).length() == 2) {
				setFunc(btn, "");
			}
			setLabels(btn, "7");
		}
		
		if (objec == btn.bEight) {
			if (getFunc(btn).length() == 2) {
				setFunc(btn, "");
			}
			setLabels(btn, "8");
		}
		
		if (objec == btn.bNine) {
			if (getFunc(btn).length() == 2) {
				setFunc(btn, "");
			}
			setLabels(btn, "9");
		}
		
		
		if (objec == btn.bEqual) {
			
			setY(btn, Double.parseDouble(btn.t1.getText()));
			
			int a = (int) vibor(btn);
			
			if (vibor(btn)-a != 0.0) {
				setLabels(btn, "       Итог        ", ""+vibor(btn));
			} else {
				setLabels(btn, "       Итог        ", ""+a);
			}
			setFunc (btn, "ok");
		}
		
		if (objec == btn.bClear) {
			setLabels(btn, "Начните вводить значения", "");
		}
	}
	
	
}
