package personnages;
import java.security.PublicKey;
import java.util.Iterator;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public void boirePotion(int force) {
		effetPotion = force;
		parler("Merci Druide, je sens que ma force est " + force + " fois d�cupl�e");
		
		
	}
	
	public Gaulois(String nom, int force) {
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
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
				+ romain.getNom());
		romain.recevoirCoup((force/3) * effetPotion);
		
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix.getNom());
		System.out.println(asterix);
		asterix.parler("Hey, je suis Asterix.");
		asterix.boirePotion(5);
		
		Romain Jules = new Romain("Jules",6);
		asterix.frapper(Jules);
		

	}
	
	

	



	

}
