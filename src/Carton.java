import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Carton {

    private Piece tete;
    private Piece axe;
    private Piece jupe;

    public Carton(Piece piece1, Piece piece2, Piece piece3) {
        // Tri des pièces par type
        ArrayList<Piece> pieces = new ArrayList<Piece>(Arrays.asList(piece1, piece2, piece3));
        Collections.sort(pieces, new Comparator<Piece>() {
            @Override
            public int compare(Piece p1, Piece p2) {
                return p1.getTypePiece().compareTo(p2.getTypePiece());
            }
        });

        this.tete = pieces.get(0);
        this.jupe = pieces.get(1);
        this.axe = pieces.get(2);
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
