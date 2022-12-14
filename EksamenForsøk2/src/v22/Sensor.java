package v22;

public abstract class Sensor {
	
	private String navn;
	private int id;
	
	public Sensor(String navn, int id) {
		
		this.navn = navn;
		this.id = id;
	}
	
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String toString() {
		
		String str = "Sensor [id=" + getId() + ", navn=" + getNavn() + "]";
		return str;
	}
	
	public class TemperaturSensor extends Sensor {
		
		double temp;
		
		public TemperaturSensor(String navn, int id, double temp) {
			
			super(navn, id);
			this.temp = temp;
		}
		
		public String toString() {
			
			String tempstr = "TemperaturSensor [temperatur=" + temp + ", " + super.toString() + "]";
			return tempstr;
		}
	}
}

