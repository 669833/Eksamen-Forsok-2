package h21;

public class Utleiefirma {

	private String navn;
	private Hytte[] hytter;
	private int antall;
	private int START_ANTALL; //står i b) at den skal være med

	public Utleiefirma(String navn) {
		this.navn = navn;
		hytter = new Hytte[START_ANTALL];
		this.antall = 0;
	}

	public void leggTil(Hytte hytte) {



		if (antall >= hytter.length) {
			utvid();
		} 
		
		hytter[antall] = hytte;
		antall++;
	}

	private void utvid() {

		hytter[START_ANTALL] = hytter[START_ANTALL * 2];
		leggTil();
	}

	public void visAlleLedige(int mnd) {


	}

}
