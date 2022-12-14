package h20;

public class Arrangement {
	
	private String navn;
	private Kontakt[] deltakere;
	private int antall;
	
	public Arrangement(String navn) {
		this.navn = navn;
		deltakere = new Kontakt[50];
		antall = 0;
	}
	
	public boolean leggTilKontakt(Kontakt k) {
		
		boolean plass = false;
		
		if (antall < deltakere.length && !plass) {
			deltakere[antall] = k;
			antall++;
			plass = true;
		}
		return plass;
	}
	
	public boolean finnes(String navn, int nummer) {
		
		boolean finnes = false;
		
		for (int i = 0; i < antall; i++) {
			if ((deltakere[i].getNavn == navn) && !finnes) {
				if ((deltakere[i].getNummer == nummer) && !finnes) {
					finnes = true;
				}
			}
			return finnes;
		}
	}
	
	public boolean registrer(String navn, int nummer) {
		
		boolean reg = false;
		
		if ()
	}
}
