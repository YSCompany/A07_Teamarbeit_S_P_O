/**
 * A07 Teamarbeit, Klasse zur berechnung des Raumes
 * @author Yehezkel Sivan
 * @version 2014-12-05, v1.0
 */
public class Raum {
	public double laenge, breite, hoehe;
	/**
	 * Standard Konstruktor
	 */
	public Raum(){
		laenge = 1;
		breite = 1;
		hoehe = 1;
	}
	/**
	 * @param laenge
	 */
	public Raum(double laenge){
		this.laenge = laenge;
		breite = 1;
		hoehe = 1;
	}
	/**
	 * @param laenge
	 * @param breite
	 */
	public Raum(double laenge, double breite){
		this.laenge = laenge;
		this.breite = breite;
		hoehe = 1;
	}
	/**
	 * @param laenge
	 * @param breite
	 * @param hoehe
	 */
	public Raum(double laenge, double breite, double hoehe){
		this.laenge = laenge;
		this.breite = breite;
		this.hoehe = hoehe;
	}
	/**
	 * Methode zur berechnung eines Kegels
	 * @return
	 */
	public double Kegel() {
		double k = (laenge*laenge*Math.PI*hoehe)/3;
		return k;
	}
	/**
	 * Methode zur berechung einer Pyramide
	 * @return
	 */
	public double Pyramide(){
		double p = (laenge*breite*hoehe)/3;
		return p;
	}
	/**
	 * Methode zur berechnung  eines Quaders
	 * @return
	 */
	public double Quader(){
		double q = laenge*breite*hoehe;
		return q;
	}
}
