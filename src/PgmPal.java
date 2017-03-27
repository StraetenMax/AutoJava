
public class PgmPal {

	public static void main(String[] args) {
		Voiture voiture = new Voiture();
		Voiture voiture2 = new Voiture(4, "Bleu", "Essence", 170);
		Voiture voiture3 = new Voiture();
		Voiture voiture4 = new Voiture(6, "Rouge", "Diesel", 200);
		System.out.println(voiture4.couleur);
		System.out.println(voiture2.energie);
		System.out.println(voiture4.nbOccupants);
		System.out.println(voiture4.vitesseMax);
	}

}

