package Wojtyna.Aliyah.Chapter6.Java.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;
	private JTextField TextNum;
	private JTextField TextDen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		TextNum = new JTextField();
		TextNum.setBounds(169, 80, 96, 20);
		frame.getContentPane().add(TextNum);
		TextNum.setColumns(10);
		
		TextDen = new JTextField();
		TextDen.setBounds(169, 124, 96, 20);
		frame.getContentPane().add(TextDen);
		TextDen.setColumns(10);
		
		JLabel LblNum = new JLabel("Numerator");
		LblNum.setBounds(73, 83, 86, 14);
		frame.getContentPane().add(LblNum);
		
		JLabel LblDen = new JLabel("Denominator");
		LblDen.setBounds(73, 127, 86, 14);
		frame.getContentPane().add(LblDen);
		
		JLabel LblResult = new JLabel("New label");
		LblResult.setBounds(336, 106, 47, 14);
		frame.getContentPane().add(LblResult);
		
		JButton BtnCalculate = new JButton("Calculate");
		
		BtnCalculate.setBounds(163, 188, 112, 23);
		frame.getContentPane().add(BtnCalculate);
		
		BtnCalculate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				double numerator = Double.parseDouble(TextNum.getText());
				double denominator = Double.parseDouble(TextDen.getText());
				
				SimpleMath math = new SimpleMath();
				double result = math.Divide(numerator, denominator);
				
				try {
					LblResult.setText(Double.toString(result));
					}
				catch (ArithmeticException error){
					LblResult.setText("Cannot divide by 0");
				}
			}
		});
	}
}
