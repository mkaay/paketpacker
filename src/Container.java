import java.util.ArrayList;

public class Container {
	private int maxGewicht;
	private int leerGewicht;
	
	private int breite;
	private int hoehe;
	private int tiefe;
	
	private ArrayList<Turm> inhalt = new ArrayList<Turm>();
	
	public Container(int b, int h, int t, int maxG, int g) {
		breite = b;
		hoehe = h;
		tiefe = t;
		maxGewicht = maxG;
		leerGewicht = g;
	}
	
	public int getMaxGewicht() {
		return maxGewicht;
	}
	
	public int getLeerGewicht() {
		return leerGewicht;
	}
	
	public int aktuellesGewicht() {
		int gewicht = getLeerGewicht();
		for (Turm t: inhalt) {
			gewicht += t.getGewicht();
		}
		return gewicht;
	}
}
