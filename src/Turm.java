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
	
	public void turmBauen(ArrayList<Paket> pakete) {
		for (Paket p: pakete) {
			if (p.getHoehe() <= verbleibendeHoehe()) {
				stapel.add(p);
			}
		}
	}
	
	public void anzeigen() {
		for (Paket p: stapel) {
			System.out.println(p.getBreite());
		}
	}
}