public class Piston {

    private Piece tete;
    private Piece axe;
    private Piece jupe;

    public Piston(Piece tete, Piece axe, Piece jupe) {
        this.tete = tete;
        this.axe = axe;
        this.jupe = jupe;
    }

    public Piece getTete() {
        return this.tete;
    }

    public Piece getAxe() {
        return this.axe;
    }

    public Piece getJupe() {
        return this.jupe;
    }
}
