package vozila;

public class Kamion extends Vozilo{

	@Override
	public int cenaGorivaNa100Km(int cenaGorivaPoLitri) {
		return cenaGorivaPoLitri * 16;
	}
	
	public Kamion() {
		
	}
	public Kamion(String marka,String model, String boja) {
		super(marka, model, boja);
	}
}
