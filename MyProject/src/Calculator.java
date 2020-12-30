import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Calculator extends JFrame {
	static JLabel label;
	static JLabel info;
	static int flag = 0;
	static int check = 0;

	public Calculator() {
	
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5,5));
		c.setBackground(Color.BLACK);
		
		
		Window W = new Window();
		c.add(W, BorderLayout.EAST);
		Numbers N = new Numbers();
		c.add(N, BorderLayout.SOUTH);
		
		setSize(500,600);
		setVisible(true);
		
//		JPanel jp = new JPanel();
//		JButton[] bt = new JButton[17];
//		GridBagConstraints[] gbc = new GridBagConstraints[17];
//		GridBagLayout gbl = new GridBagLayout();
//		jp.setLayout(gbl);
//		for (int i = 0; i<17; i++) {
//			bt[i] = new JButton(i);
//		}
//		jp.setLayout(new FlowLayout());
//		jp.add(jb1);
//		jp.add(jb2);
//		jp.add(jb3);
//		jp.add(jb4);
//		jp.add(jb5);
//		jp.add(jb6);
//		jp.add(jb7);
//		jp.add(jb8);
//		jp.add(jb9);
//		jp.add(jb0);
//		jp.add(jbc);
//		add(jp);
	}
	class Window extends JPanel {
		public Window() {
			setLayout(new GridLayout(3,1));
			setBackground(Color.BLACK);
			info = new JLabel("숫자를 입력하세요");
			label = new JLabel("");
			
			info.setFont(new Font("맑은 고딕", 0, 20));	
			info.setBackground(Color.BLACK);
			info.setForeground(Color.WHITE);
			info.setHorizontalAlignment(SwingConstants.RIGHT);
			
			label.setFont(new Font("맑은 고딕", 0, 40));
			label.setBackground(Color.BLACK);
			label.setForeground(Color.WHITE);
			label.setHorizontalAlignment(SwingConstants.RIGHT);
			
			add(info);add(label);
			label.addMouseListener(new MyMouse());	
		}
	}
	class MyMouse extends MouseAdapter {
		public void mousePressed(MouseEvent m) {
			if (m.getClickCount() == 1) {
				flag = 0;
				label.setText("");
				info.setText("숫자를 입력하세요");
			}
		}
	}
	class Numbers extends JPanel {
		public Numbers() {
			JButton[] bt = new JButton[16];
			setBackground(Color.BLACK);
			setLayout(new GridLayout(4,4,5,5));
			bt[0] = new JButton("7");
			bt[1] = new JButton("8");
			bt[2] = new JButton("9");
			bt[3] = new JButton("÷");
			
			bt[4] = new JButton("4");
			bt[5] = new JButton("5");
			bt[6] = new JButton("6");
			bt[7] = new JButton("×");
			
			bt[8] = new JButton("1");
			bt[9] = new JButton("2");
			bt[10] = new JButton("3");
			bt[11] = new JButton("-");
			
			bt[12] = new JButton("C");
			bt[13] = new JButton("0");
			bt[14] = new JButton("=");
			bt[15] = new JButton("+");
			
			for (int i = 0; i <=15; i++) {
				if (i%4 != 3 && i <11) {
					bt[i].setFont(new Font("맑은 고딕", 0, 30));
					bt[i].setBackground(Color.GRAY);
					bt[i].setForeground(Color.WHITE);
					add(bt[i]);
					
					bt[i].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if (flag == 0) {
								JButton b = (JButton)e.getSource();
								String oldtext = label.getText();
								String text = b.getText();
								String newText = oldtext + text;
								
								int n = newText.length();
								if (n<=10) label.setFont(new Font("맑은 고딕", 0, 40));
								else if (n>10) label.setFont(new Font("맑은 고딕", 0, 30));
								
								if (n<=25) {
									label.setText(newText);
									info.setText("수식을 계산 중입니다");
								}
								else if (n>25) info.setText("입력 가능 범위 초과");
							}
						}
					});
				}
				else if (i == 12 || i == 14) {
					bt[i].setFont(new Font("맑은 고딕",0,30));
					bt[i].setBackground(Color.LIGHT_GRAY);
					bt[i].setForeground(Color.WHITE);
					add(bt[i]);
					
					bt[12].addActionListener(new ActionListener () {
						public void actionPerformed(ActionEvent e) {
							int n = label.getText().length()-1;
							
							if (n == 0) {
								label.setText("");
								info.setText("수식을 입력하세요 ");
								flag = 0;
							}						
							else if (n > 0 && n <= 10) {
								label.setFont(new Font("맑은 고딕", 0, 40));
								label.setText(label.getText().substring(0, n));
								info.setText("수식을 지우는 중입니다 ");						
							}						
							else {
								label.setFont(new Font("맑은 고딕", 0, 35));
								label.setText(label.getText().substring(0, n));
								info.setText("수식을 지우는 중입니다 ");
							}
						}
					});		
					bt[14].addActionListener(new CalcListener());
				}
				else if (i % 4 == 3){
					bt[i].setFont(new Font("맑은 고딕", 0, 40));
					bt[i].setBackground(new Color (234,150,72));
					bt[i].setForeground(Color.WHITE);
					add(bt[i]);				
					bt[i].addActionListener(new MyListener());
				}
				
				else if (i == 13) {
					bt[i].setFont(new Font("맑은 고딕", 0, 30));
					bt[i].setBackground(Color.GRAY);
					bt[i].setForeground(Color.WHITE);
					add(bt[i]);
					bt[i].addActionListener(new MyListener());
				}
			}
		}
	}
	private class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			int n = label.getText().length();
			Character c = label.getText().charAt(n-1);
			if (flag == 0 && c != '+' && c != '-' && c != '×' && c != '÷') {
				String oldtext = label.getText();
				String text = b.getText();
				String newtext = oldtext + text;
				label.setText(newtext);
				info.setText("수식을 계산 중입니다 ");
			}
		}
	}
	public class CalcListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {		
			String s = label.getText();		
			double result = Calculator(s);
			label.setFont(new Font("맑은 고딕", 0, 40));
			
			if (result < 0) {
				info.setText("양수 범위의 계산만 할 수 있습니다 ");
				label.setText(Double.toString(result));
				flag = 1;
			}	
			else if (result >= 10000000) {
				info.setText("10,000,000 미만의 범위만 계산할 수 있습니다 ");
				label.setText("0.0");
			}
			else label.setText(Double.toString(result));					
		}
	}
	
	public double Calculator(String ss) {	
		int i; double ans;
		check = 0;
		ArrayList<Double> v = new ArrayList<Double>();
		ArrayList<String> op = new ArrayList<String>();
		
		op.add(null);
		String str = new String("");
		for (i = 0; i < ss.length(); i++) {
			Character c = ss.charAt(i);
			String s = Character.toString(c);
			
			if(Character.isDigit(c)) {
				str += Character.toString(c);
				if(i == ss.length()-1)
					v.add(Double.parseDouble(str));
			}
			else if (s.equals(".")) str += s;
			else {
				v.add(Double.parseDouble(str));
				op.add(Character.toString(c));
				str = "";
			}
		}
		for(i = 0; i < v.size(); i++) {
			if (v.get(i) >= 10000000) {
				check = 1;		
				info.setText("10,000,000 미만의 수끼리만 계산할 수 있습니다 ");
				break;
			}
		}
		if (check == 0) {			
			for(i = 1; i < v.size(); i++) {
				String s = op.get(i);
				double tmp;
				
				if (s.equals("×")) {
					tmp = v.get(i-1) * v.get(i);
					op.remove(i);
					v.remove(i);
					v.remove(i-1);				
					v.add(i-1, tmp);
					i--;
				}	
				else if (s.equals("÷")) {
					tmp = v.get(i-1) / v.get(i);
					op.remove(i);
					v.remove(i);
					v.remove(i-1);		
					v.add(i-1, tmp);
					i--;
				}
			}
			ans = v.get(0);
			for(i = 1; i < v.size(); i++) {
				String s = op.get(i);
				double n = v.get(i);
				
				if(s.compareTo("+")==0) ans = ans + n;
				else if(s.compareTo("-")==0) ans = ans - n;
			}
			return ans;
		}	
		return 0;
	}
	public static void main(String[] args) {
		new Calculator();
	}

}
