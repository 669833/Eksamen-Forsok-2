package v19;

public class Videoarkiv {

	private Video[] vtab;
	private int antall;

	public Videoarkiv(int maksAntall) {

		vtab = new Video[maksAntall];
		antall = 0;
	}

	public void leggTil(Video v) {
		
		boolean plass = false;
		
		if (antall < vtab.length && !plass) {
			vtab[antall] = v;
			antall++;
			plass = true;
		} else
			System.out.println("Ikke mer ledig plass i tabellen");
	}
	
	public int finnTotalTid() {
		
		int totalsek = 0;
		
		for (int i = 0; i < antall; i++) {
			totalsek += vtab[i].getSekund;
		}
		return totalsek;
	}
	
	public void listAlle(String produsent) {
		
		
	}
}
