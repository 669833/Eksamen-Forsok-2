package Skoleprøve;

public class Bestilling {

	private int kontaktnummer;
	private String kundenavn;
	private String adresse;

	public Bestilling(int kontaktnummer, String kundenavn, String adresse) {
		
		this.kontaktnummer = kontaktnummer;
		this.kundenavn = kundenavn;
		this.adresse = adresse;
	}

	public int getKontaktnummer() {
		return kontaktnummer;
	}

	public void setKontaktnummer(int kontaktnummer) {
		this.kontaktnummer = kontaktnummer;
	}

	public String getKundenavn() {
		return kundenavn;
	}

	public void setKundenavn(String kundenavn) {
		this.kundenavn = kundenavn;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void skrivUt() {

		System.out.println("Kontaktnummer: " + kontaktnummer);
		System.out.println("Kundenavn:     " + kundenavn);
		System.out.println("Adresse:       " + adresse);
	}

	public class SnarestMulig extends Bestilling {

		private int maxtid;

		public SnarestMulig(int kontaktnummer, String kundenavn, String adresse, int maxtid) {

			super(kontaktnummer, kundenavn, adresse);
			this.maxtid = maxtid;
		}
		
		public void skrivUt() {
			
			super.skrivUt();
			System.out.println("Max ventetid: " + maxtid);
		}
	}

	public class Tidspunkt extends Bestilling {

		private String dato;
		private String tidspunkt;


		public Tidspunkt(int kontaktnummer, String kundenavn, String adresse, String tidspunkt, String dato) {

			super(kontaktnummer, kundenavn, adresse);
			this.dato = dato;
			this.tidspunkt = tidspunkt;
		}
		
		public void skrivUt() {
			
			super.skrivUt();
			System.out.println("Dato:      " + dato);
			System.out.println("Tidspunkt: " + tidspunkt);
		}
	}
}