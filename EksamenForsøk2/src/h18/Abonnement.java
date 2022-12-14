package h18;

public abstract class Abonnement {
	
	private String navn;
	private int fodselsnummer;
	private int telefon;
	private int minuttpris;
	
	public Abonnement(String navn, int fodselsnummer, int telefon, int minuttpris) {
		this.navn = navn;
		this.telefon = telefon;
		this.fodselsnummer = fodselsnummer;
		this.minuttpris = minuttpris;
	}
	
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public int getFodselsnummer() {
		return fodselsnummer;
	}
	public void setFodselsnummer(int fodselsnummer) {
		this.fodselsnummer = fodselsnummer;
	}
	public int getTelefon() {
		return telefon;
	}
	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}
	public int getMinuttpris() {
		return minuttpris;
	}
	public void setMinuttpris(int minuttpris) {
		this.minuttpris = minuttpris;
	}
	
	public abstract double pris(int lengde);
	
	public class KontantAbn extends Abonnement {
		
		private double balanse;
		
		public KontantAbn(String navn, int fodselsnummer, int telefon, int minuttpris, double balanse) {
			
			super(navn, fodselsnummer, telefon, minuttpris);
			this.balanse = balanse;
		}
		
		public double pris(int lengde) {
			
			double pris = minuttpris * lengde;
			return pris;
		}
	}
	
	public class MaanedAbn extends Abonnement {
		
		private int[] gratis;
		
		public MaanedAbn(int[] gratis) {
			
			super(navn, fodselsnummer, telefon, minuttpris);
			gratis = new int[4];
		}
		
		public double pris(int gratisnum, double pris) {
			
			for (int i = 0; i < gratis.length; i++) {
				if (gratis[i] == gratisnum) {
					pris = 0;
				} else {
					pris = KontantAbn.pris();
				}
			}
			return pris;
		}
	}
}
