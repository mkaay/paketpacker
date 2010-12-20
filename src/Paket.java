
public class Paket implements Comparable<Paket> {
	private int breite;
	private int tiefe;
	private int hoehe;
	
	private int gewicht;
	
	private boolean positioniert = false;
	private int x = 0;
	private int y = 0;
	private int z = 0;
	
	public Paket(int b, int h, int t, int g) {
		this.breite = b;
		this.tiefe = t;
		this.hoehe = h;
		this.gewicht = g;
	}
	
	public void positionieren(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.positioniert = true;
	}
	
	public boolean isPositioniert() {
		return positioniert;
	}
	
	public int getXPosition() {
		return x;
	}
	
	public int getYPosition() {
		return y;
	}
	
	public int getZPosition() {
		return z;
	}
	
	public int getHoehe() {
		return hoehe;
	}
	
	public int getTiefe() {
		return tiefe;
	}
	
	public int getBreite() {
		return breite;
	}
	
	public int getGewicht() {
		return gewicht;
	}
	
	@Override
    public int compareTo(Paket o)
    {
        if (o == null)
        {
            throw new IllegalArgumentException();
        }

        return x - o.x;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException();
        }

        if (obj instanceof Paket)
        {
            return x == ((Paket) obj).x;
        }

        return false;
    }
}
