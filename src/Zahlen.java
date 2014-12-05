import java.util.LinkedList;

/**
 * Eine Klasse zur Berechnung von Zahlen.
 * @author Oezsoy Ahmet
 * @version 05.12.2014
 */
public class Zahlen {
	private LinkedList<Double> list;
	/**
	 * Konstruktor 
	 */
	public Zahlen()
	{
		list = new LinkedList<Double>();
		
	}
	/**
	 * Eine Methode das die Summe berechnet.
	 * @return die Summe
	 */
	public double summe()
	{
		double summe = 0;
		for(double i : list)
		{
			summe += i;
		}
		return summe;
	}
	/**
	 * Eine Methode das das Maximum berechnet.
	 * @return das Maximum
	 */
	public double max() {
		double maximum = list.getFirst();

		for (double i : list) {
			if (i > maximum) {
				maximum = i;
			}
		}
		return maximum;
	}
	/**
	 * Eine Methode das das Minimum berechnet.
	 * 
	 * @return das minimum
	 */
	public double min() {
		double minimum = list.getFirst();

		for (double i : list) {
			if (i < minimum) {
				minimum = i;
			}
		}
		return minimum;
	}
	/**
	 * Eine Methode das Zahlen hinzufügt.
	 */
	public void add(double a)
	{
		list.add(a);
	}
}
