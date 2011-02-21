
public class Ladung implements Comparable<Ladung> {
	protected int breite;
	protected int tiefe;
	protected int hoehe;
	
	protected int gewicht;
	protected int x = 0;
	protected int y = 0;
	protected int z = 0;
	
	public Ladung(int b, int h, int t, int g) {
		this.breite = b;
		this.tiefe = t;
		this.hoehe = h;
		this.gewicht = g;
	}
	
	public void optimieren() {
		int b = breite;
		int t = tiefe;
		if (b < t) {
			this.tiefe = b;
			this.breite = t;
		}
	}
	
	@Override
    public int compareTo(Ladung o)
    {
        if (o == null)
        {
            throw new IllegalArgumentException();
        }
        return o.breite - this.breite;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException();
        }

        if (obj instanceof Ladung)
        {
            return this.breite == ((Ladung) obj).breite;
        }

        return false;
    }
    
    protected Ladung(Ladung original) {
    	breite = original.breite;
		tiefe = original.tiefe;
		hoehe = original.hoehe;
		gewicht = original.gewicht;
    }

    public Ladung copy() {
        return new Ladung(this);
    }

}
