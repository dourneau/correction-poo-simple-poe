package formation;

public class Student {
	public String nom;
	public int note1;
	public int note2;
	
	public Student( ) {}
	
	public Student (String nom,int note1, int note2) {
		this.nom = nom;
		this.note1 = note1;
		this.note2 = note2;
	}
	
	public double calculMoyenne() {
		double moyenne =(double) (this.note1 + this.note2)/2;
		return moyenne;
	}
	//public void show(double moyenne) {
	//	System.out.println("L'étudiant "+ nom + " a pour moyenne : "+ moyenne);
	
	
	public void show() {
		System.out.println("L'étudiant "+ nom + " a pour moyenne : "+ this.calculMoyenne());
	
	
	}
	
	
}
