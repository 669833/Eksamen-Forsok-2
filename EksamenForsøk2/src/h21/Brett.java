package h21;

public class Brett {
	
	private int[][] brett;
	private int n;
	
	public Brett(int størrelse) {
		størrelse = 5;
		n = størrelse;
		brett = new int[n][n];
	}
	
	public boolean harKryss(int r, int k) {
		
		boolean kryss = false;
		
		if (brett[r][k] == 0) {
			kryss = true;
		}
		return kryss;
	}
	
	private boolean rekkeBingo(int r) {
		
		boolean rekke = false;
		int i = 0;
		
		while (i < n && harKryss(r, i)) {
			i++;
		}
		
		}
}

