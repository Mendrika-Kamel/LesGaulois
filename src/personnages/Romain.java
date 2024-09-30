package personnages;

public class Romain {
	
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	
	
	
	public Romain(String nom, int force) {
		assert force>0 : "La force d'un romain est positive";
		this.nom = nom;
		this.force = force;
	}


	public String getNom() {
		return nom;
	}

	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
		
	}


	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert force>0 : "la force d’un Romain est positive";
		int a = force;
		force -= forceCoup;
		if (force>0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");

		}
		
		assert a>force : "la force d’un Romain a diminué";
		
		
		
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2 : 
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			break;
		case 1 : 
			if (equipements[0] == equipement) {
				System.out.println("Le soldat "+nom+" possède déjà un "+equipement+" !");
			} else {
				ajoutEquipement(equipement);

			}
			break;
		case 0 : 
			ajoutEquipement(equipement);
			break;
			
		}
	}
	
	private void ajoutEquipement(Equipement equipement) {
		equipements[nbEquipement] = equipement;
		System.out.println("Le soldat "+nom+"  s’équipe avec un "+equipement+" !");
		nbEquipement++;
		
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		minus.parler("Hey, je suis Minus, un romain.");
		minus.recevoirCoup(2);
		Equipement a = Equipement.BOUCLIER;
		Equipement b = Equipement.CASQUE;
				
		minus.sEquiper(b);
		minus.sEquiper(b);
		minus.sEquiper(a);
		minus.sEquiper(b);
		
	}

}
