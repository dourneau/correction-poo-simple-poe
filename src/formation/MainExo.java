package formation;

import java.util.Scanner;

public class MainExo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rectangle = new Rectangle();
		rectangle.surface(4, 5);
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		/*
		System.out.print ("Entrez un premier nombre : ");
		Scanner nombre = new Scanner(System.in);
		double n1 = Double.parseDouble(nombre.next());
		
		System.out.print ("Entrez un deuxième nombre : ");
		double n2 = Double.parseDouble(nombre.next());
		
		Somme s1 = new Somme(n1,n2);
		double valeurSomme = s1.sum();
		System.out.println("La somme des deux nombres est : "+valeurSomme);
		 */
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		/*
		System.out.print ("Entrez le nom de l'étudiant : ");
		Scanner mot = new Scanner(System.in);
		String nom = mot.next();
		
		System.out.print ("Entrez la note 1 : ");
		Scanner note = new Scanner(System.in);
		int note1 = note.nextInt();
		System.out.print ("Entrez la note 2 : ");
		int note2 = note.nextInt();
		
		Student student1 = new Student();
		student1.nom = nom;
		student1.note1 = note1;
		student1.note2 = note2;
		
		student1.show();
		*/
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		/*
		Scanner valeur = new Scanner(System.in);
		System.out.println("Premier nombre");
		System.out.print ("Entrez la partie réelle : ");
		double real1 = valeur.nextDouble();
		System.out.print ("Entrez la partie imaginaire : ");
		double imag1 = valeur.nextDouble();
		
		System.out.println();
		
		System.out.println("Deuxième nombre");
		System.out.print ("Entrez la partie réelle : ");
		double real2 = valeur.nextDouble();
		System.out.print ("Entrez la partie imaginaire : ");
		double imag2 = valeur.nextDouble();
		
		ComplexSum complexSum1 = new ComplexSum(real1, imag1, real2, imag2);
		double valeurReal = complexSum1.sommeReal();
		double valeurImag = complexSum1.sommeImag();
		
		System.out.println();
		
		System.out.println("La somme est : "+ valeurReal +" + "+ valeurImag +"i");
		*/
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		Point p1 = new Point(10.5,20.8);
		Point p2 = new Point(1.2,-5.6);
		double distance = p2.distance(p1);
		System.out.println("La distance entre les points est : "+distance);
		
		
	
	
	
		
		
	}

}
