package v19;

public class Video {
	
	private String tittel;
	private String produsent;
	private int sekund;
	
	public Video(String tittel, String produsent, int sekund) {
		this.tittel = tittel;
		this.produsent = produsent;
		this.sekund = sekund;
	}
	
	public String getTittel() {
		return tittel;
	}
	public void setTittel() {
		this.tittel = tittel;
	}
	public String getProdusent() {
		return produsent;
	}
	public void setProdusent() {
		this.produsent = produsent;
	}
	public int getSekund() {
		 return sekund;
	}
	public void setSekund() {
		this.sekund = sekund;
	}
	
	public String toString() {
		
		String dot = ".";
		boolean ti = false;
		int minutt = getSekund() / 60;
		int sekrest = getSekund() % 60;
		
		if (sekrest < 10 && !ti) {
			dot = ".0";
			ti = true;
		}
		
		String str = "Tittel: " + tittel + ", Produsent: " + produsent + "Tid: " + minutt + dot + sekrest;
		return str;
	}
}
