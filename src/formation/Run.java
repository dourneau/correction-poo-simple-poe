package formation;


public class Run {
	
public static void main(String[] args) {
		
		//System.out.println("Hello world");
		Vehicule v1 = new Vehicule();
		v1.marque = "Tesla";
		v1.couleur = "Rouge";
		v1.prix = 10.99;
		System.out.println(v1.toString());
		
		System.out.println(v1.couleur);
		System.out.println(v1);
		
		Vehicule v2 = new Vehicule("Renault","Verte",17.99 );
		System.out.println(v2);
		
		Vehicule v3 = new Vehicule("Peugeot",27.99);
		v3.repeindre("Blanche");
		System.out.println(v3);
	};

}
