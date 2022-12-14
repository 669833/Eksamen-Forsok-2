package Skoleprøve;

public class ToDoListe {
	
	private ToDoElement[] todotab;
	private int antall;
	
	public ToDoListe(int maksAntall) {
		
		todotab = new ToDoElement[maksAntall];
		this.antall = antall;
	}
	
	public void leggTil(ToDoElement tde) {
		
		boolean plass = false;
		
		if (antall < todotab.length && !plass) {
			todotab[antall] = tde;
			antall++;
			plass = true;
		} else if (antall >= todotab.length) {
			System.out.print("ERROR! Ikke mer plass i tabellen");
		}
	}
	
	public ToDoElement finnViktig() {
		
	}

}
