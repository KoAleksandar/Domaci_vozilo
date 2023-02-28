package vozila;

public class Vozilo {
	
	private String marka;
	private String model;
	private String boja;
	
	public int cenaGorivaNa100Km(int cenaGorivaPoLitri) {
		return cenaGorivaPoLitri * 8;
	}
	
	public Vozilo() {
			
	}
	public Vozilo(String marka, String model, String boja) {
		this.marka = marka;
		this.model = model;
		this.boja = boja;
	}

	@Override
	public String toString() {
		return "Marka vozila: " + this.marka + ", Model vozila: " + this.model + ", Boja vozila: " + this.boja;
	}
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
}
