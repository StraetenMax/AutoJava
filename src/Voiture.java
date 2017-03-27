
public class Voiture {
	//propriétés de la classe voiture
	int nbOccupants;
	String couleur;
	String energie;
	int vitesseMax;

	//constructeur
	public Voiture(){
		System.out.println("Creation d'une voiture !");
		nbOccupants = 0;
		couleur = "Inconnu";
		energie = "Inconnu";
		vitesseMax = 0;
	}
}
