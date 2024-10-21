package musee;
import personnages.Gaulois;
import personnages.Equipement;


public class Musee {

	
	private Trophee[] trophees = new Trophee[200];  // Tableau de trophées
    private int nbTrophee = 0;  // Compteur de trophées

    // Méthode pour ajouter un trophée
    public void donnerTrophees(Gaulois gaulois, Equipement equipement) {
        if (nbTrophee < trophees.length) {
            trophees[nbTrophee] = new Trophee(gaulois, equipement);
            nbTrophee++;
            System.out.println(gaulois.getNom() + " a donné un " + equipement + " au musée.");
        } else {
            System.out.println("Le musée est plein, impossible d'ajouter plus de trophées.");
        }
    }

    // Getter pour obtenir le nombre de trophées
    public int getNbTrophee() {
        return nbTrophee;
    }
	
	
	
	
}
