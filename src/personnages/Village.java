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
		Villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}
	
	public void trouverHabitant(int num_villageois) {
		System.out.println(Villageois[nbVillageois-1].getNom());
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
	
	public void afficherVillageois (Chef chef) {
		System.out.println("Dans le village du chef " + chef.getNom() + " vivent les "
				+ "l�gendaires gaulois :");
		
		for (int i=0; i<nbVillageois; i++) {
			
			System.out.println("-" + Villageois[i].getNom());
		}
		
	}


	public static void main(String[] args) {
		Village village = new Village("Village des Irr�ductibles",30);
		// Gaulois gaulois = village.trouverHabitant(30); 
		// On obtient une exception car il n'y a pas de gaulois dans la 30�me case
		
		Chef chef = new Chef("Abraracourcix", 6, village);
		

		// Gaulois gaulois = village.trouverHabitant(1); 
		// System.out.println(gaulois); 
		// Type mismatch: cannot convert from void to Gaulois
		// On a pas de Gaulois dans la premi�re case du tableau

		Gaulois obelix = new Gaulois("Ob�lix", 25);
		
		village.ajouterHabitant(obelix);
		 village.afficherVillageois(chef);
	}	
	
	

	
}
