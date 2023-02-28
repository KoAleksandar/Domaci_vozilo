package vozila;

public class Test {
	public static void main(String[] args) {
		
		Vozac vozac1 = new Vozac();
		Vozac vozac2 = new Vozac("Aleksandar", "Kozarov", 100000);
		System.out.println(vozac1.toString());
		System.out.println(vozac2.toString());
		
		Vozilo vozilo = new Vozilo("BMW", "520", "crna");
		System.out.println(vozilo.toString());
		System.out.println("Cena goriva na 100km: " + vozilo.cenaGorivaNa100Km(200) + "din.");
		
		Kamion kamion = new Kamion("Volvo", "FH", "bela");
		System.out.println(kamion.toString());
		System.out.println("Cena goriva na 100km: " + kamion.cenaGorivaNa100Km(200) + "din.");
	}
}
