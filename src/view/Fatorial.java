package view;

import controller.*;
import javax.swing.JOptionPane;

public class Fatorial {
	public static void main(String[] args) {
		int position = 0;

		position = Integer.parseInt(JOptionPane.showInputDialog(
			"Digite o termo do fatorial: "));

		JOptionPane.showMessageDialog(null, FatorialController.genFatorial(position));
	}
}
