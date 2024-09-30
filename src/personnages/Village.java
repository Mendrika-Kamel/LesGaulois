package personnages;
import personnages.Chef;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] Villageois;
	private int nbVillageois = 0;
	
	

	public Village(String nom, int 
			 nbVillageoisMaximum) {
		super();
		this.nom = nom;
		this.Villageois = new Gaulois[nbVillageoisMaximum];
		
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois < Villageois.length) {
		Villageois[nbVillageois] = gaulois;
		nbVillageois++; }
		else {
			System.out.println("On ne peut plus ajouter de villageois");
		}
	}
	
	public Gaulois trouverHabitant(int num_villageois) {
		if (num_villageois >= 0 && num_villageois < Villageois.length) {
			return Villageois[num_villageois];
		} else {
			System.out.println("Numéro d'indice invalide");
			return null;
		}
	}


	public Village(String nom) {
		this.nom = nom;
	}
	

	 public void setChef(Chef chef) { 
	 this.chef = chef; 
	 }

	public String getNom() {
		return nom;
	}
	
	public void afficherVillageois () {
		
		if (chef != null) {
		System.out.println("Dans le village du chef " + chef.getNom() + " vivent les "
				+ "l�gendaires gaulois :");}
		else {
			System.out.println("Le chef n'a pas encore été nommé.");
			
		}
		
		if (nbVillageois>0) {
		for (int i=0; i<nbVillageois; i++) {
			
			System.out.println("- " + Villageois[i].getNom());
			}
		} else {
			System.out.println("Il n'y a pas de villageois dans le village.");
		}
		
	}



	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles",30);
		// Gaulois gaulois = village.trouverHabitant(30); 
		
		// On obtient une exception car le nb de gaulois maximum est de 30, on fait un out of range
		// Il n'y a pas d'élément à l'indice 30, c'est de 0 à 29 d'où l'exception ArrayIndexOutOfBoundsException
		
		Chef chef = new Chef("Abraracourcix", 6, village);
		village.setChef(chef);
		
		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterHabitant(asterix);
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(obelix);
	
		village.afficherVillageois();
		
		


		
		//Gaulois gaulois = village.trouverHabitant(1); 
		//System.out.println(gaulois);
		// Cela renvoie null car le seul gaulois qu'on a ajouté est à l'indice 0 
		//et après cet indice il n'y a pas de gaulois donc c'est null qui est retourné
	


		
	}	
	
	

	
}
