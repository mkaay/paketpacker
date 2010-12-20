import java.util.ArrayList;

public class Container {
	private int maxGewicht;
	private int leerGewicht;
	
	private int breite;
	private int hoehe;
	private int tiefe;
	
	private ArrayList<Paket> inhalt = new ArrayList<Paket>();
	
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
		for (Paket p: inhalt) {
			gewicht += p.getGewicht();
		}
		return gewicht;
	}
	
	public boolean platzFrei(Paket np, int x, int y, int z) {
		for (Paket p: inhalt) {
			if (p.getXPosition() < np.getXPosition()) {
				if (p.getXPosition() + p.getBreite() > np.getXPosition()) {
					return false;
				}
			}
			if (p.getYPosition() < np.getYPosition()) {
				if (p.getYPosition() + p.getHoehe() > np.getYPosition()) {
					return false;
				}
			}
			if (p.getZPosition() < np.getZPosition()) {
				if (p.getZPosition() + p.getTiefe() > np.getZPosition()) {
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean passtRein(Paket p, int x, int y, int z) {
		if (aktuellesGewicht() + p.getGewicht() > maxGewicht) {
			return false;
		}
		if (p.getBreite() + x > breite) {
			return false;
		}
		if (p.getTiefe() + z > tiefe) {
			return false;
		}
		if (p.getHoehe() + y > hoehe) {
			return false;
		}
		if (platzFrei(p, x, y, z)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean einladen(Paket p) {
		if (passtRein(p, p.getXPosition(), p.getYPosition(), p.getZPosition())) {
			inhalt.add(p);
			return true;
		} else {
			return false;
		}
	}
}
