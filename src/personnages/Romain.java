package personnages;

public class Romain {
	
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	private String texte; 

	
	
	
	
	
	public Romain(String nom, int force) {
		assert force>0 : "La force d'un romain est positive";
		this.nom = nom;
		this.force = force;
	}


	public int getForce() {
		return force;
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
	
//	public void recevoirCoup(int forceCoup) {
//		assert force>0 : "la force d’un Romain est positive";
//		int a = force;
//		force -= forceCoup;
//		if (force>0) {
//			parler("Aïe");
//		} else {
//			parler("J'abandonne...");
//
//		}
//		
//		assert a>force : "la force d’un Romain a diminué";
//		
//		
//		
//	}
	
	private int calculResistanceEquipement(int forceCoup) {
		texte = "Ma force est de " + this.force + ", et la force du "
				+ "coup est de " + forceCoup; 
		int resistanceEquipement = 0; 
		if (nbEquipement != 0) { 
			texte += "\nMais heureusement, grace � mon �quipement sa force est diminu� de "; 
			for (int i = 0; i < nbEquipement;i++) { 
				if ((equipements[i] != null && 
						equipements[i].equals(Equipement.BOUCLIER))) {
		
					resistanceEquipement += 8; } else { 
						System.out.println("Equipement casque"); 
						resistanceEquipement += 5; } 
				} 
			texte += resistanceEquipement + "!"; 
			}
		parler(texte); 
		forceCoup -= resistanceEquipement; 
		return forceCoup; 
	}

	private Equipement[] ejecterEquipement() { 
		Equipement[] equipementEjecte = new Equipement[nbEquipement]; 
		System.out.println("L'�quipement de " + nom.toString() + " s'envole sous la force du coup."); 
		//TODO 
		int nbEquipementEjecte = 0; 
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] != null) { 
					equipementEjecte[nbEquipementEjecte] = equipements[i]; 
					nbEquipementEjecte++; 
					equipements[i] = null; } 
			} return equipementEjecte; 
		}


	
	public Equipement[] recevoirCoup(int forceCoup) { 
	Equipement[] equipementEjecte = null; 
	// pr�condition 
	assert force > 0; 
	int oldForce = force; 
	forceCoup = calculResistanceEquipement(forceCoup); 
	force -= forceCoup; 

	
	if (force==0) { 
		parler("A�e");} else {
		equipementEjecte = ejecterEquipement(); 
		parler("J'abandonne..."); 
		}
	// post condition la force a diminu�e 
	assert force < oldForce; 
	return equipementEjecte;

	
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
