package formation;

public class Rectangle {
	double longueur;
	double largeur;
	
	public void surface(double longueur, double largeur) {
		System.out.println("Longueur du rectange = "+longueur);
		System.out.println("Longueur du rectange = "+largeur);
		double valeurSurface = longueur * largeur;
		System.out.println("Surface du rectange = "+ valeurSurface);
	}
}
