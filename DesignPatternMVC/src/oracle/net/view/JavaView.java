package oracle.net.view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JavaView extends JFrame {

	private JTextField firstNumber = new JTextField(10);

	private JLabel additionLabel = new JLabel("+");

	private JTextField secondNumber = new JTextField(10);

	private JButton calculateButton = new JButton("Calculate");

	private JTextField calcSolution = new JTextField(10);

	public JavaView() {
		// TODO Auto-generated constructor stub
		JPanel calcPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 100);

		calcPanel.add(firstNumber);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);
		this.add(calcPanel);
	}

	public int getFirstNumber() {
		return Integer.parseInt(firstNumber.getText());

	}

	public int getAdditionLabel() {
		return Integer.parseInt(additionLabel.getText());
	}

	public int getSecondNumber() {
		return Integer.parseInt(secondNumber.getText());
	}

	public int getCalculateButton() {
		return Integer.parseInt(calculateButton.getText());
	}

	public int getCalcSolution() {
		return Integer.parseInt(calcSolution.getText());
	}

	public void setCalcSolution(int solution) {
		calcSolution.setText(Integer.toString(solution));
	}

	public void addCalListener(ActionListener listenForButton) {
		calculateButton.addActionListener(listenForButton);
	}

	public void displayErrorMessage(String error) {
		JOptionPane.showMessageDialog(this, error);
	}

}
