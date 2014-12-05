import javax.swing.JOptionPane;
/**
 * A07 Teamarbeit, Testklasse*
 * @author Yehezkel Sivan
 * @version 2014.12.05
 */
public class Test {
	public static void main(String[]args){
		JOptionPane.showMessageDialog(null, "Made by YSCompany™.\nAll rights reserved.");
		
		//Alle berechnungen vom Raum
		//Quader
		Raum q = new Raum(4, 3, 2);
		System.out.println("Quader,l=4m, b=3m, h=2m, Volumen="+q.Quader()+"m³");
		//Pyramide
		Raum p = new Raum(6, 2);
		System.out.println("Pyramide,l=6m, b=2m, h=1m, Volumen="+p.Pyramide()+"m³");
		//Kegel
		Raum k = new Raum(5);
		System.out.println("Kegel, l=5, b=1, h=1m, Volumen="+k.Kegel()+"m³");
		
		//Alle berechnung von der Flaeche
		Flaeche f = new Flaeche();
		f.setA(3);
		f.setB(5);
		f.setC(7);
		//Rechteck
		System.out.println("Rechteck, l=3m, b=5m, Fläche="+f.rechteck()+"m²");
		//Kreis
		System.out.println("Kreis, r=3m, Fläche="+f.kreis()+"m²");
		//Allgemeiner Dreieck
		System.out.println("Dreieck, a=3m, b=5m, c=7m, Fläche="+f.allgDreieck()+"m²");
		
		
	}
}
