import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Controller {
	public static void main(String[] args) {
		Controller c = new Controller();
		ArrayList<Paket> pakete = new ArrayList<Paket>();
		Object[] standard = c.standardPakete();
		
		Random r = new Random();
		for (int i = 0; i < 200; i++) {
			Paket paket = ((Paket) standard[r.nextInt(standard.length-1)]).copy();
			paket.optimieren();
			pakete.add(paket);
		}
		
		Collections.sort(pakete);
		
		ArrayList<Turm> tuerme = new ArrayList<Turm>(); 
		for (int i = 0; i < 20; i++) {
			Turm t = new Turm(2393); //Standard Container
			t.turmBauen(pakete);
			System.out.print("Turm ");
			System.out.print(t.aktuelleHoehe());
			System.out.print(" ");
			int frei = t.freierPlatz();
			int max = t.maximalesVolumen();
			System.out.print(((float) frei) / ((float) max) * 100);
			System.out.print("% frei");
			System.out.println();
			t.anzeigen();
			tuerme.add(t);
		}
	}
	
	public Object[] standardPakete() {
		ArrayList<Paket> standardPakete = new ArrayList<Paket>();
		standardPakete.add(new Paket(300, 440, 145, 10));
		standardPakete.add(new Paket(370, 440, 145, 10));
		standardPakete.add(new Paket(260, 330, 385, 10));
		standardPakete.add(new Paket(260, 440, 385, 10));
		standardPakete.add(new Paket(260, 550, 385, 10));
		standardPakete.add(new Paket(300, 165, 385, 10));
		standardPakete.add(new Paket(300, 220, 385, 10));
		standardPakete.add(new Paket(300, 330, 385, 10));
		standardPakete.add(new Paket(300, 440, 385, 10));
		standardPakete.add(new Paket(300, 550, 385, 10));
		standardPakete.add(new Paket(370, 165, 270, 10));
		standardPakete.add(new Paket(370, 220, 270, 10));
		standardPakete.add(new Paket(370, 330, 270, 10));
		standardPakete.add(new Paket(370, 440, 270, 10));
		standardPakete.add(new Paket(370, 550, 270, 10));
		standardPakete.add(new Paket(520, 660, 385, 10));
		standardPakete.add(new Paket(335, 440, 140, 10));
		return standardPakete.toArray();
	}
}
