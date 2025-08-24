package controller;

public class FatorialController {

	public FatorialController() {
		super();
	}

	public static int genFatorial(int position) {
		if (position == 1) {
			return position;
		}

		if (position > 1) {
			return position * genFatorial(position - 1);
		} else {
			return 1;
		}

	}
	
}
