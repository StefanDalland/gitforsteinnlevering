package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class innleveringoppgave3 {

	public static void main(String[] args) {
		long tall = parseInt(showInputDialog("Skriv inn heltall"));

		if (tall <= 0) {
			showMessageDialog(null, "Prøv et tall større en null");
		} else {
			showMessageDialog(null, tall + " fakultet er: " + factorial(tall));
		}
	}

	private static long factorial(long n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
