package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 431, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(22, 20, 369, 56);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber );
			}
		});
		btn7.setBounds(22, 119, 61, 56);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber );
			}
		});
		btn8.setBounds(93, 119, 61, 56);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber );
			}
		});
		btn9.setBounds(164, 119, 61, 56);
		frame.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber );
			}
		});
		btn4.setBounds(22, 204, 61, 56);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber );
			}
		});
		btn5.setBounds(93, 204, 61, 56);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber );
			}
		});
		btn6.setBounds(164, 204, 61, 56);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber );
			}
		});
		btn1.setBounds(22, 289, 61, 56);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber );
			}
		});
		btn2.setBounds(93, 289, 61, 56);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber );
			}
		});
		btn3.setBounds(164, 289, 61, 56);
		frame.getContentPane().add(btn3);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum =Double.parseDouble(textField.getText());
				textField.setText("");
				operations ="+";
			}
		});
		btnplus.setBounds(251, 119, 69, 56);
		frame.getContentPane().add(btnplus);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum =Double.parseDouble(textField.getText());
				textField.setText("");
				operations ="-";
			}
		});
		btnsub.setBounds(251, 204, 69, 56);
		frame.getContentPane().add(btnsub);
		
		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum =Double.parseDouble(textField.getText());
				textField.setText("");
				operations ="*";
			}
		});
		btnmul.setBounds(251, 289, 69, 56);
		frame.getContentPane().add(btnmul);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum =Double.parseDouble(textField.getText());
				textField.setText("");
				operations ="/";
			}
		});
		btndiv.setBounds(338, 119, 69, 56);
		frame.getContentPane().add(btndiv);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btndot.getText();
				textField.setText(EnterNumber );
			}
		});
		btndot.setBounds(22, 369, 61, 56);
		frame.getContentPane().add(btndot);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber );
			}
		});
		btn0.setBounds(93, 369, 61, 56);
		frame.getContentPane().add(btn0);
		
		JButton btnPM = new JButton("+/-");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops =Double.parseDouble(String.valueOf(textField.getText()));
				ops =ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setBounds(164, 369, 61, 56);
		frame.getContentPane().add(btnPM);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum =Double.parseDouble(textField.getText());
				if (operations =="+")
				{
					result =firstnum + secondnum;
					answer =String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations == "-")
				{
					result =firstnum - secondnum;
					answer =String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations == "*")
				{
					result =firstnum * secondnum;
					answer =String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations == "/")
				{
					result =firstnum / secondnum;
					answer =String.format("%.2f", result);
					textField.setText(answer);
				}
				
				
			}
		});
		btnequal.setBounds(251, 369, 61, 56);
		frame.getContentPane().add(btnequal);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null );
			}
		});
		btnClear.setBounds(338, 204, 69, 56);
		frame.getContentPane().add(btnClear);
		
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace =null;
				
				if(textField.getText().length()>0) {
					StringBuilder strB =new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() -1);
					backspace =strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btnBackSpace.setBounds(338, 289, 69, 56);
		frame.getContentPane().add(btnBackSpace);
	}
}
