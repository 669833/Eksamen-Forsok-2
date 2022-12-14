package v19;

public class Innlegg {

	private String bruker;
	private String dato;
	private int likes;

	public Innlegg(String bruker, String dato) {
		this.bruker = bruker;
		this.dato = dato;
		likes = 0;
	}

	public void skrivUt() {

		System.out.println("Bruker: " + bruker);
		System.out.println("Dato: " + dato);
		System.out.println("Likes: " + likes);
	}

	public class Bilde extends Innlegg {

		private String url;

		public Bilde(String bruker, String dato, String url) {

			super(bruker, dato);
			this.url = url;
		}
		
		public void skrivUt() {
			
			super.skrivUt();
			System.out.println("Nettadresse: " + url);
		}
	}

	public class Tekst extends Innlegg {

		private String tekst;


		public Tekst(String bruker, String dato, String tekst) {

			super(bruker, dato);
			this.tekst = tekst;
		}
		
		public void skrivUt() {
			
			super.skrivUt();
			System.out.println(tekst);
		}
	}
}