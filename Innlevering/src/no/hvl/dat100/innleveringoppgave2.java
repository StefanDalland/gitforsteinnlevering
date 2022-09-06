package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class innleveringoppgave2 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			String poengTxt = showInputDialog("Hva ble poengsummen til eleven?");

			int poeng = parseInt(poengTxt);

			if (poeng >= 0 && poeng <= 39) {
				String utTxt2 = ("Eleven har fått karakteren F");
				showMessageDialog(null, utTxt2);
			} else if (poeng <= 49 && poeng >= 40) {
				String utTxt3 = ("Eleven har fått karakteren E");
				showMessageDialog(null, utTxt3);
			} else if (poeng <= 59 && poeng >= 50) {
				String utTxt4 = ("Eleven har fått karakteren D");
				showMessageDialog(null, utTxt4);
			} else if (poeng <= 79 && poeng >= 60) {
				String utTxt5 = ("Eleven har fått karakteren C");
				showMessageDialog(null, utTxt5);
			} else if (poeng <= 89 && poeng >= 80) {
				String utTxt6 = ("Eleven har fått karakteren B");
				showMessageDialog(null, utTxt6);
			} else if (poeng <= 100 && poeng >= 90) {
				String utTxt7 = ("Eleven har fått karakteren A");
				showMessageDialog(null, utTxt7);
			} else if (poeng > 100 || poeng < 0) {
				showMessageDialog(null, "Ugyldig poengsum prøv på nytt");
				i--;
			}
		}
	}
}