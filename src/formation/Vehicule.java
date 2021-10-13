package formation;

public class Vehicule {
	
	public String couleur;
	public String marque;
	public double prix;
	
	public Vehicule () {
		System.out.println("Passage par le construteur vide");
		this.couleur = "Verte";
		this.marque = "Tesla";
		this.prix = 10.99;
	}
	
	
	public Vehicule (String marque, String couleur, double prix) {
		System.out.println("Passage par le construteur plein");
		this.marque = marque;
		//this(couleur,prix);
		this.couleur = couleur;
		this.prix = prix;
	}
	
	public Vehicule(String marque,double prix) {
		this.marque = marque;
		this.prix = prix;
	}
	
	public void repeindre(String nouvelleCouleur) {
		this.couleur = nouvelleCouleur;
	}
	
	
	public String toString() {
		return "Vehicule{"+"marque='"+marque+'\''+", couleur='"+couleur+'\''+", prix= "+prix+" }";
	}
	
	

}
