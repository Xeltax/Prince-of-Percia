package fr.caensup.licence.prince;

public class Emplacement {
    private AbstractObject object;
    private Personnage personnage;
    public int niveau;
    private int x,y;

    public Emplacement(int niveau, int x, int y) {
        this.niveau = niveau;
        this.x = x;
        this.y = y;
    }

    public Emplacement(int niveau, AbstractObject object) {
        this.niveau = niveau;
        this.object = object;
    }

    public Emplacement(int niveau, Personnage personnage) {
        this.niveau = niveau;
        this.personnage = personnage;
    }

    public Emplacement getNord(Emplacement[][] plateau) {
        return plateau[this.x+1][this.y];
    }

    public Emplacement getSud(Emplacement[][] plateau) {
        return this;
    }

    public Emplacement getEst(Emplacement[][] plateau) {
        return this;
    }

    public Emplacement getOuest(Emplacement[][] plateau) {
        return this;
    }
}