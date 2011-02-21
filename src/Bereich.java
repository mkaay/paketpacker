import java.util.ArrayList;

public class Bereich {
	private ArrayList<Ladung> ladung = new ArrayList<Ladung>();
	protected int breite;
	protected int hoehe;
	protected int tiefe;
	
	public Bereich(int b, int h, int t) {
		breite = b;
		hoehe = h;
		tiefe = t;
	}
	
	public int aktuelleHoehe() {
		int h = 0;
		for (Ladung p: ladung) {
			h += p.hoehe;
		}
		return h;
	}
	
	public int verbleibendeHoehe() {
		return hoehe - aktuelleHoehe();
	}
	
	public int minimaleBreite() {
		int x = -1;
		for (Ladung p: ladung) {
			if (x == -1) {
				x = p.breite;
			} else if (x > p.breite) {
				x = p.breite;
			}
		}
		return x;
	}
	
	public int minimaleTiefe() {
		int x = -1;
		for (Ladung p: ladung) {
			if (x == -1) {
				x = p.tiefe;
			} else if (x > p.tiefe) {
				x = p.tiefe;
			}
		}
		return x;
	}
	
	public int maximaleBreite() {
		int x = 0;
		for (Ladung p: ladung) {
			if (x < p.breite) {
				x = p.breite;
			}
		}
		return x;
	}
	
	public int maximaleTiefe() {
		int x = 0;
		for (Ladung p: ladung) {
			if (x < p.tiefe) {
				x = p.tiefe;
			}
		}
		return x;
	}
	
	public ArrayList<Ladung> fuellen(ArrayList<Ladung> pakete) {
		for (Ladung p: pakete) {
			if (p.hoehe <= verbleibendeHoehe()) {
				int mt = minimaleTiefe();
				int mb = minimaleBreite();
				if ((mt < 0 || p.tiefe <= mt) && (mb < 0 || p.breite <= mb)) {
					ladung.add(p);
				}
			}
		}
		for (Ladung p: ladung) {
			pakete.remove(p);
		}
		return ladung;
	}
	
	public void anzeigen() {
		for (Ladung p: ladung) {
			System.out.print(p.breite);
			System.out.print(" ");
			System.out.print(p.tiefe);
			System.out.println();
		}
	}
	
	public int maximalesVolumen() {
		return maximaleBreite()*maximaleTiefe()*hoehe;
	}
	
	public int freierPlatz() {
		int maxVolumen = maximalesVolumen();
		int aktuellesVolumen = 0;
		for (Ladung p: ladung) {
			aktuellesVolumen += p.breite*p.tiefe*p.hoehe;
		}
		return maxVolumen - aktuellesVolumen;
	}

	public int getGewicht() {
		int gewicht = 0;
		for (Ladung p: ladung) {
			gewicht += p.gewicht;
		}
		return gewicht;
	}
}