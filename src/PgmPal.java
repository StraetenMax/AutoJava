
public class PgmPal {

	public static void main(String[] args) {
		Voiture voiture = new Voiture();
		Voiture voiture2 = new Voiture(4, "Bleu", "Essence", 170);
		Voiture voiture3 = new Voiture();
		Voiture voiture4 = new Voiture(12, "Rouge", "Diesel", 200);
		//variables d'instance
		voiture4.setCouleur("Bleu citron"); // modification des variables instance private
		System.out.println(voiture4.getCouleur());
		voiture2.setEnergie("électrique"); // modification VI private
		System.out.println(voiture2.getEnergie());
		voiture4.setNbOccupants(22); // modification VI private
		System.out.println(voiture4.getNbOccupants());
		voiture4.setVitesseMax(88); // modification VI private
		System.out.println(voiture4.getVitesseMax());
		System.out.println(voiture4.getTypeTrsprt());
		System.out.println(voiture2.getTypeTrsprt());
		
		Voiture V1 = new Voiture(3,"Jaune","Hydrogène",50);
		Voiture V = new Voiture(4,"Bleu","Essence",170);
		Voiture V2 = new Voiture(40,"Rouge","Diesel",100);
		Voiture V3 = new Voiture(2,"Vert", "Electricité",20);
		System.out.println(V3.plusRapide(V2));
		System.out.println(V1.plusRapide(V));
		System.out.println(V1.plusRapide(V3));
	}

}

