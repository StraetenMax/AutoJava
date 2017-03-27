
public class Voiture {
	//propriétés de la classe voiture
	int nbOccupants;
	String couleur;
	String energie;
	int vitesseMax;

	//constructeur vide
	public Voiture(){
		System.out.println("Creation d'une voiture !");
		nbOccupants = 0;
		couleur = "Inconnu";
		energie = "Inconnu";
		vitesseMax = 0;
	}
	
	//constructeur initialisé
	public Voiture(int cNbOccupants, String cCouleur, String cEnergie, int cVitesseMax){
	System.out.println("Création d'une voiture initialisée !");
	nbOccupants = cNbOccupants;
	couleur = cCouleur;
	energie = cEnergie;
	vitesseMax = cVitesseMax;
	}
}
