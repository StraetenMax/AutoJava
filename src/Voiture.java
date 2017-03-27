
public class Voiture {
	//propriétés de la classe voiture
	private int nbOccupants;
	private String couleur;
	private String energie;
	private int vitesseMax;

	//constructeur vide
	public Voiture(){
		System.out.println("Creation d'une voiture !");
		nbOccupants = 0;
		couleur = "Inconnu";
		energie = "Inconnu";
		vitesseMax = 0;
	}
	
	//constructeur initialisé
	public Voiture(int nbOccupants, String couleur, String energie, int vitesseMax){
	System.out.println("Création d'une voiture initialisée !");
	this.nbOccupants = nbOccupants;
	this.couleur = couleur;
	this.energie = energie;
	this.vitesseMax = vitesseMax;
	}
	
	//accesseurs
	public int getNbOccupants(){
		return nbOccupants;	
	}
	public String getCouleur(){
		return couleur;
	}
	public String getEnergie(){
		return energie;
	}
	public int getVitesseMax(){
		return vitesseMax;
	}
	//mutateur
	public void setEnergie(String energie){
		 this.energie = energie;
	}
	public void setCouleur(String couleur){
		this.couleur = couleur;
	}
	public void setVitesseMax(int vitesseMax){
		this.vitesseMax = vitesseMax;
	}
	public void setNbOccupants(int nbOccupants){
		this.nbOccupants = nbOccupants;
	}
	
	
	
	
	
	
}
