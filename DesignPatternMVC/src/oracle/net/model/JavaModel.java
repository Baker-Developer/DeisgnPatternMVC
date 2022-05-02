package oracle.net.model;

public class JavaModel {

	public int calculationValue;

	public void addTwoNumbers(int firstNum, int secondNum) {

		calculationValue = firstNum + secondNum;

	}
	
	public int getCalculationValue() {
		return calculationValue;
	}
}
