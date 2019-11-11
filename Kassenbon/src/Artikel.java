
public class Artikel {
	private String name;
	private float einzelpreis;
	private int anzahl;
	
	public float getSumme() {
		return einzelpreis * anzahl;
	}
	
	public Artikel(String name, float einzelpreis, int anzahl) {
		this.name = name;
		this.einzelpreis = einzelpreis;
		this.anzahl = anzahl;
	}
	
	public void toConsole() {
		System.out.println(name);
		System.out.println(String.format("%3dx%23.2f", anzahl, einzelpreis));
	}
	
	public String test() {
		String strReturn = "";
		int zahl = 5;
		
		// tatsächliche Methode
		if(zahl < 0) {
			strReturn = "Yay!";
		} else {
			strReturn = "Nee!";
		}
		
		return strReturn;
	}
}
