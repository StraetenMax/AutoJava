
public class PgmPal {

	public static void main(String[] args) {
		Voiture voiture = new Voiture();
		Voiture voiture2 = new Voiture(4, "Bleu", "Essence", 170);
		Voiture voiture3 = new Voiture();
		Voiture voiture4 = new Voiture(12, "Rouge", "Diesel", 200);
		Auto voiture21 = new Auto(2, "vert canard", "Air comprimé", 20);
		Auto voiture22 = new Auto(3,"rouge cerise", "Eau", 23);
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
		System.out.println(voiture4.getTypeSport());
		
		Voiture V1 = new Voiture(3,"Jaune","Hydrogène",50);
		Voiture V = new Voiture(4,"Bleu","Essence",170);
		Voiture V2 = new Voiture(40,"Rouge","Diesel",100);
		Voiture V3 = new Voiture(2,"Vert", "Electricité",20);
		System.out.println(V3.plusRapide(V2));
		System.out.println(V1.plusRapide(V));
		System.out.println(V1.plusRapide(V3));
		System.out.println(V.getTypeSport());
		voiture2.setVitesseMax(20);
		System.out.println(voiture2.getTypeSport());
		System.out.println(voiture21.getNombreInstances());
		System.out.println(voiture21.getNombreInstancesClasses());
		System.out.println(voiture22.getNombreInstances());
		System.out.println(voiture22.getNombreInstancesClasses());
		System.out.println(voiture4.getNombreInstance());
		System.out.println(voiture4.getNombreInstanceClasses());
		System.out.println(V3.getNombreInstance());
		System.out.println(V3.getNombreInstanceClasses());
	}

}

