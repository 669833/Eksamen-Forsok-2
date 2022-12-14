package v22;

public class Observasjoner {
	
	private Observasjon[] obs;
	private int antall;
	private int nr;
	private int maksAntall;
	
	public Observasjoner(int maksAntall) {
		
		obs = new Observasjon[maksAntall];
		this.antall = 0;
		this.nr = 0;
	}
	
	private boolean leggTil(Observasjon o) {
		
		boolean plass = false;
		
		if (antall < maksAntall) {
			obs[antall] = o;
			antall++;
			nr++;
			plass = true;
		}
		return plass;
	}
	
	public boolean registrer(double t, double f, int co2) {
		
		
	}
	
	public void print() {
		
		System.out.println(Observasjoner.toString());
	}
	
	
	
}
