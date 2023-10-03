package fr.caensup.licence.prince;

public abstract class Personnage {
	private int activePV;
	private int maxPv;
	private boolean epee;
	
	public Personnage() {
		this.activePV=3;
		this.epee=false;
	}
	
	public int getPointDeVie() {
		return this.activePV;
	}
	
	public boolean hasEpee() {
		return this.epee;
	}
	
	public void boire(Fiole fiole) {
		this.activePV=this.activePV+fiole.getEffetPv();
	}
	
	public void attaquer(Personnage personnage) {
		if (personnage.activePV > 0) {
			personnage.activePV = personnage.activePV - 1;
		} else {
			System.out.println("L'ennemi est mort");
		}
	}

	public void deplacement(Orientation sens) {
		
	}

	public void tuer() {
		this.activePV = 0;
	}
}












