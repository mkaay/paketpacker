import java.util.ArrayList;

public class Turm {
	private ArrayList<Paket> stapel = new ArrayList<Paket>();
	private int maxHoehe;
	
	public Turm(int h) {
		maxHoehe = h;
	}
	
	public int aktuelleHoehe() {
		int h = 0;
		for (Paket p: stapel) {
			h += p.getHoehe();
		}
		return h;
	}
	
	public int verbleibendeHoehe() {
		return maxHoehe - aktuelleHoehe();
	}
	
	public int minimaleBreite() {
		int x = -1;
		for (Paket p: stapel) {
			if (x == -1) {
				x = p.getBreite();
			} else if (x > p.getBreite()) {
				x = p.getBreite();
			}
		}
		return x;
	}
	
	public int minimaleTiefe() {
		int x = -1;
		for (Paket p: stapel) {
			if (x == -1) {
				x = p.getTiefe();
			} else if (x > p.getTiefe()) {
				x = p.getTiefe();
			}
		}
		return x;
	}
	
	public int maximaleBreite() {
		int x = 0;
		for (Paket p: stapel) {
			if (x < p.getBreite()) {
				x = p.getBreite();
			}
		}
		return x;
	}
	
	public int maximaleTiefe() {
		int x = 0;
		for (Paket p: stapel) {
			if (x < p.getTiefe()) {
				x = p.getTiefe();
			}
		}
		return x;
	}
	
	public ArrayList<Paket> turmBauen(ArrayList<Paket> pakete) {
		for (Paket p: pakete) {
			if (p.getHoehe() <= verbleibendeHoehe()) {
				int mt = minimaleTiefe();
				int mb = minimaleBreite();
				if ((mt < 0 || p.getTiefe() <= mt) && (mb < 0 || p.getBreite() <= mb)) {
					stapel.add(p);
				}
			}
		}
		for (Paket p: stapel) {
			pakete.remove(p);
		}
		return stapel;
	}
	
	public void anzeigen() {
		for (Paket p: stapel) {
			System.out.print(p.getBreite());
			System.out.print(" ");
			System.out.print(p.getTiefe());
			System.out.println();
		}
	}
	
	public int maximalesVolumen() {
		return maximaleBreite()*maximaleTiefe()*maxHoehe;
	}
	
	public int freierPlatz() {
		int maxVolumen = maximalesVolumen();
		int aktuellesVolumen = 0;
		for (Paket p: stapel) {
			aktuellesVolumen += p.getBreite()*p.getTiefe()*p.getHoehe();
		}
		return maxVolumen - aktuellesVolumen;
	}

	public int getGewicht() {
		int gewicht = 0;
		for (Paket p: stapel) {
			gewicht += p.getGewicht();
		}
		return gewicht;
	}
}