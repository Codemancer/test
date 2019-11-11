import java.util.ArrayList;

public class Kassenbon {
	private final String SEPERATOR = "***************************";
	private final String SUMSEP =    "                      =====";
	
	private String ladenName;
	public void setLadenName(String value) { ladenName = value; }
	
	private String strasse;
	public void setStrasse(String value) { strasse = value; }
	
	private String plzOrt;
	public void setPlzOrt(String value) { plzOrt = value; }
	
	private String telefonNr;
	public void setTelefonNr(String value) { telefonNr = value; }
	
	private ArrayList<Artikel> liste;
		
	public Kassenbon() {
		liste = new ArrayList<Artikel>();
	}
	
	public void AddArtikel(String name, float einzelpreis, int anzahl) {
		liste.add(new Artikel(name, einzelpreis, anzahl));
	}
	
	public void Ausgabe() {
		System.out.println(SEPERATOR);
		System.out.println(ladenName);
		System.out.println(strasse);
		System.out.println(plzOrt);
		System.out.println(telefonNr);
		System.out.println(SEPERATOR);
		System.out.println();
		
		float summe = 0;
		
		for (Artikel item : liste) {
			item.toConsole();
			summe += item.getSumme();
		}
		
		System.out.println();
		System.out.println(SUMSEP);
		System.out.println(String.format("Summe EUR%18.2f", summe));
		System.out.println(SUMSEP);
		
	}
}
