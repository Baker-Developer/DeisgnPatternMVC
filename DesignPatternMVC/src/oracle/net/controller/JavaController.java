package oracle.net.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import oracle.net.model.JavaModel;
import oracle.net.view.JavaView;

public class JavaController {

	private JavaView View;
	private JavaModel theModel;
	
	public JavaController(JavaView theView, JavaModel theModel) {
		this.View = theView;
		this.theModel = theModel;
		
		// Tell the View that when ever the calculate button
		// is clicked to execute the actionPerformed method
		// in the CalculateListener inner class
		
		this.View.addCalListener(new CalculateListener());
	}
	
	public class CalculateListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int firstNumber, secondNumber = 0;
			
			// Surround interactions with the view with
			// a try block in case numbers weren't
			// properly entered
			
			try{
			
				firstNumber = View.getFirstNumber();
				secondNumber = View.getSecondNumber();
				
				theModel.addTwoNumbers(firstNumber, secondNumber);
				
				View.setCalcSolution(theModel.getCalculationValue());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				View.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
		
	}

	
	
}
