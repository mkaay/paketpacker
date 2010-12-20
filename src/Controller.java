import java.util.ArrayList;
import java.util.Collections;

public class Controller {
	public static void main(String[] args) {
		Container c = new Container(100, 100, 800, 4000, 5);
		
		Paket paket1 = new Paket(5, 10, 10, 5);
		Paket paket2 = new Paket(15, 10, 10, 5);
		Paket paket3 = new Paket(10, 10, 10, 5);
		Paket paket4 = new Paket(10, 5, 5, 5);
		
		paket1.positionieren(0, 0, 0);
		paket2.positionieren(11, 0, 0);
		paket3.positionieren(0, 11, 0);
		paket4.positionieren(0, 11, 0);
		
		c.einladen(paket1);
		c.einladen(paket2);
		c.einladen(paket3);
		c.einladen(paket4);
		
		ArrayList<Paket> pakete = new ArrayList<Paket>();
		pakete.add(paket1);
		pakete.add(paket2);
		pakete.add(paket3);
		pakete.add(paket4);
		Collections.sort(pakete);
		//for (Paket p: pakete) {
		//	System.out.println(p.getBreite());
		//}
		
		Turm t = new Turm(25);
		t.turmBauen(pakete);
		t.anzeigen();
	}
	
	public ArrayList<Paket> sortiere(ArrayList<Paket> pakete) {
		return null;
	}
}
