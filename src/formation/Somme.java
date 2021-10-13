package formation;

public class Somme {
	double n1;
	double n2;
	
	public Somme( ) {}
	
	public Somme(double n1,double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public double sum() {
		double valeurSomme = this.n1+this.n2;
		return valeurSomme;
	}
}
