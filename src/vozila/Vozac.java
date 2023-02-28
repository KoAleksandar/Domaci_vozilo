package vozila;

public class Vozac {
	private String ime;
	private String prezime;
	private int plata;
	
	public Vozac() {
		
	}
	public Vozac(String ime, String prezime, int plata) {
		this.ime = ime;
		this.prezime = prezime;
		this.plata = plata;
	}
	
	@Override
	public String toString() {
		return "Ime vozaca: " + this.ime + ", Prezime vozaca: " + this.prezime + ", Plata vozaca: " + this.plata;
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getPlata() {
		return plata;
	}
	public void setPlata(int plata) {
		this.plata = plata;
	}
}
