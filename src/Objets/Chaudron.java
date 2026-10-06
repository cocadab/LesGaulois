package Objets;

public class Chaudron {

	private int quatitePotion;
	private int forcePotion;
	
	public Chaudron() {
		this.quatitePotion = 0;
		this.forcePotion = 0;
	}
	
	public void remplirChaudron(int quantite, int forcePotion) {
		
		quatitePotion = quantite;
		this.forcePotion = forcePotion;
		
		
	}
	
	public boolean resterPotion() {
		
		if (quatitePotion == 0) {
			
			return false;
			
		}
		else {
			
			return true;
		}
		
		
	}
	
	public int prendreLouche() {
		
		quatitePotion = quatitePotion - 1;
		if (quatitePotion == 0) {
			
			forcePotion = 0;
			
		}
		return forcePotion;
		
	}
	
	
}
