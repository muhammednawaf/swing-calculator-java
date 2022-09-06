import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculator implements ActionListener {
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton clearButton;
	JButton divButton;
	JButton plusButton;
	JButton subButton;
	JButton modulusButton;
	JButton multiplyButton;
	JButton equalButton;
	boolean onOperator=false;
	String oldValue;
	char operator;
	float result;
	
	Calculator(){
		jf=new JFrame("calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocation(300, 100);
		displayLabel=new JLabel();
		displayLabel.setBounds(30, 50, 540, 40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(JLabel.RIGHT);
		displayLabel.setForeground(Color.WHITE);
		jf.add(displayLabel);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30, 130, 80, 80);
		sevenButton.addActionListener(this);
		sevenButton.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 22));
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(130, 130, 80, 80);
		eightButton.addActionListener(this);
		eightButton.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 22));
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(230, 130, 80, 80);
	    nineButton.addActionListener(this);
		nineButton.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 22));
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30, 230, 80, 80);
		fourButton.addActionListener(this);
		fourButton.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 22));
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(130, 230, 80, 80);
		fiveButton.addActionListener(this);
		fiveButton.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 22));
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(230, 230, 80, 80);
		sixButton.addActionListener(this);
		sixButton.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 22));
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30, 330, 80, 80);
		oneButton.addActionListener(this);
		oneButton.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 22));
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(130, 330, 80, 80);
		twoButton.addActionListener(this);
		twoButton.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 22));
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(230, 330, 80, 80);
		threeButton.addActionListener(this);
		threeButton.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 22));
		jf.add(threeButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(30, 430, 80, 80);
		dotButton.addActionListener(this);
		dotButton.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 22));
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
	    zeroButton.setBounds(130, 430, 80, 80);
	    zeroButton.addActionListener(this);
	    zeroButton.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 22));
		jf.add(zeroButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(230, 430, 80, 80);
		equalButton.addActionListener(this);
		equalButton.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 22));
		jf.add(equalButton);
		
		divButton=new JButton("/");
		divButton.setBounds(330, 130, 80, 80);
		divButton.addActionListener(this);
		divButton.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 22));
		jf.add(divButton);
		
		divButton=new JButton("%");
		divButton.setBounds(330, 130, 80, 80);
		divButton.addActionListener(this);
		divButton.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 22));
		jf.add(divButton);
		
		multiplyButton=new JButton("x");
		multiplyButton.setBounds(330, 230, 80, 80);
		multiplyButton.addActionListener(this);
		multiplyButton.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 22));
		jf.add(multiplyButton);
		
		subButton=new JButton("-");
		subButton.setBounds(330, 330, 80, 80);
		subButton.addActionListener(this);
		subButton.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 22));
		jf.add(subButton);
		
		plusButton=new JButton("+");
		plusButton.setBounds(330, 430, 80, 80);
		plusButton.addActionListener(this);
		plusButton.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 22));
		jf.add(plusButton);
		
		clearButton=new JButton("clr");
		clearButton.setBounds(430, 430, 80, 80);
		clearButton.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 22));
		jf.add(clearButton);
		clearButton.addActionListener(this);
		
		
		
		
		
		
		}
	
	public static void main(String[] args) {
		new Calculator();
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenButton) {
			if(onOperator==true) {
				displayLabel.setText("7");
				onOperator=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
		}
		else if(e.getSource()==eightButton){
			if(onOperator==true) {
				displayLabel.setText("8");
				onOperator=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
		}
		else if(e.getSource()==nineButton){
			if(onOperator==true) {
				displayLabel.setText("9");
				onOperator=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
		}
		else if(e.getSource()==fourButton){
			if(onOperator==true) {
				displayLabel.setText("4");
				onOperator=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
		}
		else if(e.getSource()==fiveButton){
			if(onOperator==true) {
				displayLabel.setText("5");
				onOperator=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
		}
		else if(e.getSource()==sixButton){
			if(onOperator==true) {
				displayLabel.setText("6");
				onOperator=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
		}
		else if(e.getSource()==oneButton){
			if(onOperator==true) {
				displayLabel.setText("1");
				onOperator=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
		}
		else if(e.getSource()==twoButton){
			if(onOperator==true) {
				displayLabel.setText("2");
				onOperator=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
		}
		else if(e.getSource()==threeButton){
			if(onOperator==true) {
				displayLabel.setText("3");
				onOperator=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
		}
		else if(e.getSource()==zeroButton){
			if(onOperator==true) {
				displayLabel.setText("0");
				onOperator=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
		}
		else if(e.getSource()==dotButton){
			if(onOperator==true) {
				displayLabel.setText(".");
				onOperator=false;
			}else {
				displayLabel.setText(displayLabel.getText()+".");
			}
		}
		else if(e.getSource()==clearButton){
			displayLabel.setText("");
		}
		else if(e.getSource()==plusButton){
			onOperator=true;
			operator='+';
			oldValue=displayLabel.getText();
		}
		else if(e.getSource()==subButton){
			onOperator=true;
			operator='-';
			oldValue=displayLabel.getText();
		}
		else if(e.getSource()==multiplyButton){
			onOperator=true;
			operator='*';
			oldValue=displayLabel.getText();
		}
		else if(e.getSource()==divButton){
			onOperator=true;
			operator='/';
			oldValue=displayLabel.getText();
		}
		else if(e.getSource()==divButton){
			onOperator=true;
			operator='%';
			oldValue=displayLabel.getText();
		}
		else if(e.getSource()==equalButton){
			String newValue=displayLabel.getText();
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
			if(operator=='+') {
				result=oldValueF+newValueF;
				displayLabel.setText(result+"");
			}
			else if(operator=='-') {
				result=oldValueF-newValueF;
				displayLabel.setText(result+"");
			}
			else if(operator=='*') {
				result=oldValueF*newValueF;
				displayLabel.setText(result+"");
			}
			else if(operator=='/') {
				result=oldValueF/newValueF;
				displayLabel.setText(result+"");
			}
			else if(operator=='%') {
				result=oldValueF/newValueF;
				displayLabel.setText(result+"");
			}
		}
		
	}
	
	
	
	
	

}
