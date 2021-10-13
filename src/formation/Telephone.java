package formation;

public class Telephone {
	
	String marque;
	String modele;
	String couleur;
	double prix;
	
	public Telephone () {
		
	}
	
	public Telephone (String marque, String model, String couleur, double prix) {
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
		this.prix = prix;
	}
	
	public void envoyerMessage(String message) {
		System.out.println(message);
	}
	
	public void appeler(String destinataire) {
		System.out.println("je suis en train d'appeler "+ destinataire);
	}
	public String toString() {
		return "Vehicule{"+"marque='"+marque+'\''+", couleur='"+couleur+'\''+", prix= "+prix+" }";
	}
	
}
