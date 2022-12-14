package h20;

public abstract class Vare {

	private String navn;
	private int nummer;
	private double pris;

	public Vare(String navn, int nummer, double pris) {

		this.navn = navn;
		this.nummer = nummer;
		this.pris = pris;
	}

	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public int getNummer() {
		return nummer;
	}
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
	public double getPris() {
		return pris;
	}
	public void setPris(double pris) {
		this.pris = pris;
	}

	public String toString() {

		String str = navn + "\nVarenummer: " + nummer + "\nPris: " + pris + "\n";
		return str;
	}

	public class DigitalVare extends Vare {

		private String url;

		public DigitalVare(String navn, int nummer, double pris, String url) {

			super(navn, nummer, pris);
			this.url = url;
		}

		@Override
		public String toString() {

			String dstr = super.toString() + "Download: " + url + "\n";
			return dstr;
		}
	}

	public class FysiskVare extends Vare {

		private int antall;

		public FysiskVare(String navn, int nummer, double pris, int antall) {

			super(navn, nummer, pris);
			this.antall = antall;
		}
		@Override
		public String toString() {
			
			String tilgj = "Ikke tilgjengelig";
			
			if (antall > 50) {
				tilgj = "50+ tilgjengelig";
			} else if ((antall <= 50) && (antall > 0)) {
				tilgj = antall + " tilgjengelig";
			}
			
			String fstr = super.toString() + tilgj;
			return fstr;		
		}
	}
}
