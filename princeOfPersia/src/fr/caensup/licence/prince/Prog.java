package fr.caensup.licence.prince;

public class Prog {

	public static void main(String[] args) {
		Emplacement[][] plateau = new Emplacement[4][4];
		for (int i=0; i < plateau.length; i++) {
			for (int j = 0; j < plateau[i].length; j++) {
				Emplacement emplacement = new Emplacement(1, i, j);
				plateau[i][j] = emplacement;
				System.out.println(plateau[i][j]);
			}
		}
		Prince joe=new Prince();
		joe.emplacement=plateau[0][0];

		System.out.println(joe.emplacement);

		

		// Personnage ennemie = new Ennemie();
		// System.out.println("pv de joe : "+joe.getPointDeVie());
		// System.out.println("Epee : "+joe.hasEpee());
		// joe.attaquer(ennemie);
		// System.out.println("pv de joe : "+joe.getPointDeVie());
		// System.out.println("pv de ennemie : "+ennemie.getPointDeVie());
		// joe.attaquer(ennemie);
		// Fiole fMalefique=new Fiole();
		// fMalefique.setEffet(false);
		// joe.boire(fMalefique);
		// System.out.println("pv de joe : "+joe.getPointDeVie());
	}

}
