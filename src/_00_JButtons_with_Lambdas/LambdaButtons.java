package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.*;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JTextField t1 = new JTextField(5);
	JTextField t2 = new JTextField(5);
	Random r = new Random();
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		label.setText("enter 2 numbers:");
		panel.add(label);
		panel.add(t1);
		panel.add(t2);
		window.add(panel);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener((ActionEvent e) ->  label.setText(Integer.parseInt(t1.getText().toString()) + " + "+ Integer.parseInt(t2.getText().toString()) + " = " + (Integer.parseInt(t1.getText().toString()) + Integer.parseInt(t2.getText().toString()))));
		randNumber.addActionListener((ActionEvent e) -> label.setText(Integer.toString(r.nextInt())));
		tellAJoke.addActionListener((ActionEvent e) -> JOptionPane.showMessageDialog(null, "A Roman centurion walks into a bar. He holds up two fingers and says, \"I'll have five drinks, please.\""));
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
