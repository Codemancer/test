
public class MainClass {
	public static void main(String[] args) {
		Kassenbon obj = new Kassenbon();
		obj.setLadenName("CC Kiosk 24/7");
		obj.setStrasse("Klüngelgasse 3");
		obj.setPlzOrt("32423 Minden");
		obj.setTelefonNr("555 123 456 78");
		
		obj.AddArtikel("15 Fischstäbchen", 1.79f, 3);
		obj.AddArtikel("Steaks", 3.99f, 5);
		obj.AddArtikel("Naturelle (1l)", 4.99f, 6);
		obj.AddArtikel("Magnum Eis Creme", 2.99f, 2);
		
		obj.Ausgabe();
	}
}
