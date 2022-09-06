package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class innleveringoppgave1 {

	public static void main(String[] args) {
		String bruttoinntekt = showInputDialog("Hva er din bruttoinntekt?");

		int bruttoLonn = parseInt(bruttoinntekt);

		double trinn1 = 0.017;
		double trinn2 = 0.04;
		double trinn3 = 0.134;
		double trinn4 = 0.164;
		double trinn5 = 0.174;

		if (bruttoLonn > 0 && bruttoLonn <= 190349) {
			String utTxt0 = ("Ingen trinnskatt er krevd når du har denne inntekten.");
			showMessageDialog(null, utTxt0);

		}

		else if (bruttoLonn <= 267899 && bruttoLonn >= 190350) {
			String utTxt1 = ("Dinn trinnskatt ligger på " + trinn1 * bruttoLonn + " kr");
			showMessageDialog(null, utTxt1);
		} else if (bruttoLonn <= 643799 && bruttoLonn >= 267900) {
			String utTxt2 = ("Dinn trinnskatt ligger på " + trinn2 * bruttoLonn + " kr");
			showMessageDialog(null, utTxt2);
		} else if (bruttoLonn <= 969199 && bruttoLonn >= 643800) {
			String utTxt3 = ("Dinn trinnskatt ligger på " + trinn3 * bruttoLonn + " kr");
			showMessageDialog(null, utTxt3);
		} else if (bruttoLonn <= 1999999 && bruttoLonn >= 9691200) {
			String utTxt4 = ("Dinn trinnskatt ligger på " + trinn4 * bruttoLonn + " kr");
			showMessageDialog(null, utTxt4);
		} else if (bruttoLonn > 2000000) {
			String utTxt5 = ("Dinn trinnskatt ligger på " + trinn5 * bruttoLonn + " kr");
			showMessageDialog(null, utTxt5);

		} else
			System.out.println("Ugyldig bruttoinntekt!");
	}

}