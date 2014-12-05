

/**
 * Klasse zum berechnen der Flächeninhalte(Rechteck, Kreis, Dreieck)
 * @author Aaron Purger
 * @Date 05.12.2014
 * @Version 1.0
 * 
 */


public class Flaeche {

	private double a, b, c; //Variablen a, b, c (Längen)

	public Flaeche() {

	}
	
	/**
	 * Methode zum berechnen des Flächeninhaltes eines Rechteckes
	 */
	public double rechteck() {
		return a * b;
	}
	
	/**
	 * Methode zum berechnen des Flächeninhaltes eines Kreises
	 */
	public double kreis() {
		return Math.PI * (a * a);
	}
	
	/**
	 * Methode zum berechnen des Flächeninhaltes eines allgemeinen Dreiecks
	 */
	public double allgDreieck() {
		return Math.sqrt((a + b + c) * (a + b - c) * (b + c - a) * (c + a - b)) / 4;
	}
	
	// get a
	public double getA() {
		return this.a;
	}
	
	/**
	 * @param a
	 * a wird gesetzt
	 */
	public void setA(double a) {
		this.a = a;
	}
	
	//get b
	public double getB() {
		return this.b;
	}
	
	/**
	 * @param b
	 * b wird gesetzt
	 */
	public void setB(double b) {
		this.b = b;
	}
	
	//get c
	public double getC() {
		return this.c;
	}
	
	/**
	 * @param c
	 * c wird gesetzt
	 */
	public void setC(double c) {
		this.c = c;
	}
}
