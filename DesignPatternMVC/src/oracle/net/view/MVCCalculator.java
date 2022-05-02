package oracle.net.view;

import oracle.net.controller.JavaController;
import oracle.net.model.JavaModel;

public class MVCCalculator {

	public static void main(String[] args) {
		JavaView view = new JavaView();
		JavaModel model = new JavaModel();
		JavaController controller = new JavaController(view, model);
		view.setVisible(true);
		
	}

}
