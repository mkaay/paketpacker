import java.util.ArrayList;

public class ZielPaket {
	protected int breite;
	protected int hoehe;
	protected int tiefe;
	
	private ArrayList<Bereich> inhalt = new ArrayList<Bereich>();
	
	public ZielPaket(int b, int h, int t) {
		breite = b;
		hoehe = h;
		tiefe = t;
	}
	
	public int aktuellesGewicht() {
		int gewicht = 0;
		for (Bereich t: inhalt) {
			gewicht += t.getGewicht();
		}
		return gewicht;
	}
}
