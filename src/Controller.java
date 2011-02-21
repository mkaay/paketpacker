import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Controller {
	public static void main(String[] args) {
		Controller c = new Controller();
		ArrayList<Ladung> ladungen = new ArrayList<Ladung>();
		Object[] standard = c.standardPakete();
		
		Random r = new Random();
		for (int i = 0; i < 200; i++) {
			Ladung ladung = ((Ladung) standard[r.nextInt(standard.length-1)]).copy();
			ladung.optimieren();
			ladungen.add(ladung);
		}
		
		Collections.sort(ladungen);
	}
	
	public Object[] standardPakete() {
		ArrayList<Ladung> standardLadung = new ArrayList<Ladung>();
		standardLadung.add(new Ladung(300, 440, 145, 10));
		standardLadung.add(new Ladung(370, 440, 145, 10));
		standardLadung.add(new Ladung(260, 330, 385, 10));
		standardLadung.add(new Ladung(260, 440, 385, 10));
		standardLadung.add(new Ladung(260, 550, 385, 10));
		standardLadung.add(new Ladung(300, 165, 385, 10));
		standardLadung.add(new Ladung(300, 220, 385, 10));
		standardLadung.add(new Ladung(300, 330, 385, 10));
		standardLadung.add(new Ladung(300, 440, 385, 10));
		standardLadung.add(new Ladung(300, 550, 385, 10));
		standardLadung.add(new Ladung(370, 165, 270, 10));
		standardLadung.add(new Ladung(370, 220, 270, 10));
		standardLadung.add(new Ladung(370, 330, 270, 10));
		standardLadung.add(new Ladung(370, 440, 270, 10));
		standardLadung.add(new Ladung(370, 550, 270, 10));
		standardLadung.add(new Ladung(520, 660, 385, 10));
		standardLadung.add(new Ladung(335, 440, 140, 10));
		return standardLadung.toArray();
	}
}
