public class Piece {

    private String typePiece;
    private Integer qualite;

    public Piece(String typePiece, Integer qualite) {
        this.typePiece = typePiece;

        if (qualite < 0) {
            this.qualite = 0;
        } else {
            this.qualite = qualite;
        }
    }

    /**
     * Returns the type of this piece.
     * 
     * @return The type of this piece.
     */
    public String getTypePiece() {
        return this.typePiece;
    }

    /**
     * Returns the quality of this piece.
     * 
     * @return The quality of this piece.
     */
    public Integer getQualite() {
        return this.qualite;
    }
}
