package histoire;

import personnages.Gaulois;
import personnages.Druide;
import personnages.Romain;


public class Scenario {

	public static void main(String[] args) {
		
	Gaulois asterix = new Gaulois("Astérix",8);
	Romain minus = new Romain("Minus",6);
	Gaulois obelix = new Gaulois("Ob�lix",25);
	Druide panoramix  = new Druide("Panoramix",5,10);
	

	panoramix.preparerPotion();
	panoramix.booste(obelix);
	obelix.parler(" Par B�l�nos, ce n'est pas juste !");
	
	panoramix.booste(asterix);
	asterix.parler("Bonjour");
	minus.parler(" UN GAU... UN GAUGAU...");
	asterix.frapper(minus);
	


	}

}
