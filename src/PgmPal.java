
public class PgmPal {

	public static void main(String[] args) {
		Voiture voiture = new Voiture();
		Voiture voiture2 = new Voiture(4, "Bleu", "Essence", 170);
		Voiture voiture3 = new Voiture();
		Voiture voiture4 = new Voiture(6, "Rouge", "Diesel", 200);
		//variables d'instance
		voiture4.couleur= "Bleu citron"; // modification des variables instance public
		System.out.println(voiture4.couleur);
		voiture2.energie = "électrique"; //modification VI public
		System.out.println(voiture2.energie);
		voiture4.nbOccupants = 22; //modification VI public
		System.out.println(voiture4.nbOccupants);
		voiture4.vitesseMax = 88; //modification VI public
		System.out.println(voiture4.vitesseMax);
	}

}

