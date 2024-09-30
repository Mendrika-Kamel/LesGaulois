package personnages;
import java.security.PublicKey;
import java.util.Iterator;

public class Gaulois {
	private String nom;
	private int effetPotion = 1;
	private int force;
	private int nbTrophees; 
	private Equipement trophees[] = new Equipement[100];
	
	public void boirePotion(int force) {
		effetPotion = force;
		parler("Merci Druide, je sens que ma force est " + force + " fois décuplée");
		
		
	}
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "Â« " + texte + "Â»");
		
	}

//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}
	
	private String prendreParole() { 
		return "Le gaulois " + nom + " : "; 
	}

	
//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la mÃ¢choire de "
//				+ romain.getNom());
//		romain.recevoirCoup((force/3) * effetPotion);
//		
//	}
	
	public void frapper(Romain romain) { 
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom()); 
		Equipement[] tabTrophees = romain.recevoirCoup((force / 3) * effetPotion); 
		for (int i = 0; tabTrophees != null && i < tabTrophees.length; i++, nbTrophees++) { 
			this.trophees[nbTrophees] = tabTrophees[i]; 
			} 
		
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("AstÃ©rix", 8);
		System.out.println(asterix.getNom());
		System.out.println(asterix);
		asterix.parler("Hey, je suis Asterix.");
		asterix.boirePotion(5);
		
		Romain Jules = new Romain("Jules",6);
		asterix.frapper(Jules);
		

	}
	
	

	



	

}
