
public class VoitureSport extends Voiture {
	private int nbreChevaux;
	//constructeur par defaut	
	public VoitureSport(){
		// le mot clé super appelle le constructeur de la classe mère
		super();
		nbreChevaux = 0;
		//this.couleur = "Blanc"; cet exemple montre l'inaxeccabilité d'un attribut private
	
	}
	
	//constructeur initilise
	public VoitureSport(int nbOccupants, String couleur, String energie, int vitesseMax, int nbreChevaux){
		super(nbOccupants, couleur, energie, vitesseMax);
		this.nbreChevaux = nbreChevaux;
	}
	
	//accesseur
	public int getNbreChevaux(){
		return nbreChevaux;
	}
	
	//mutateur
	public void setNbreChevaux(int pNbreChevaux){
		nbreChevaux = pNbreChevaux;
	}
	
	
	
	
	
}
