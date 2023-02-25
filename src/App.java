import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Machine mTete = new Machine(true, 2.0, 0.25, 0.0);
        Machine mAxe = new Machine(true, 3.5, 0.25, 0.0);
        Machine mJupe = new Machine(true, 2.5, 0.25, 0.0);
        Machine mPrincipale = new Machine(true, 1.0, 0.25, 0.0);
        double tempsReparationMin = 5.0;
        double tempsReparationMax = 10.0;
        double tempsTraitementTotal = 0;

        double tempsReparationTotal = 0;

        List<String> piston = new ArrayList<>();

        int nbPistonsProduits = 0;

        int nbPanne = 0;

        while (nbPistonsProduits < 100) {

            List<Piece> carton = new ArrayList<>();

            Double randomChanceTete = Math.random();

            Double randomChanceAxe = Math.random();

            Double randomChanceJupe = Math.random();

            Double randomChancePrincipale = Math.random();

            carton.add(new Piece("tete", 0));

            carton.add(new Piece("axe", 0));

            carton.add(new Piece("jupe", 0));

            Collections.shuffle(carton);

            for (Piece piece : carton) {

                if (piece.getTypePiece().equals("tete")) {
                    String tete = piece.getTypePiece();
                } else if (piece.getTypePiece().equals("axe")) {

                    String axe = piece.getTypePiece();

                } else if (piece.getTypePiece().equals("jupe")) {

                    String jupe = piece.getTypePiece();
                } else {

                    System.out.println("Piece non reconnu par le systeme, ejection de la piece...");
                }
            }

            if (randomChanceTete < 0.25) {

                mTete.setDisponibilite(false);

                mTete.setTempsReparation(
                        Math.random() * (tempsReparationMax - tempsReparationMin) + tempsReparationMin);

                tempsReparationTotal = tempsReparationTotal + mTete.getTempsReparation();

                nbPanne = nbPanne + 1;
            }

            if (randomChanceAxe < 0.25) {

                mAxe.setDisponibilite(false);

                mAxe.setTempsReparation(Math.random() * (tempsReparationMax - tempsReparationMin) + tempsReparationMin);

                tempsReparationTotal = tempsReparationTotal + mAxe.getTempsReparation();

                nbPanne = nbPanne + 1;
            }

            if (randomChanceJupe < 0.25) {

                mJupe.setDisponibilite(false);

                mJupe.setTempsReparation(
                        Math.random() * (tempsReparationMax - tempsReparationMin) + tempsReparationMin);

                tempsReparationTotal = tempsReparationTotal + mJupe.getTempsReparation();

                nbPanne = nbPanne + 1;
            }

            if (randomChancePrincipale < 0.25) {

                mJupe.setDisponibilite(false);

                mPrincipale.setTempsReparation(
                        Math.random() * (tempsReparationMax - tempsReparationMin) + tempsReparationMin);

                tempsReparationTotal = tempsReparationTotal + mPrincipale.getTempsReparation();

                nbPanne = nbPanne + 1;

            }

            nbPistonsProduits = nbPistonsProduits + 1;

            tempsTraitementTotal = tempsTraitementTotal + 3 + tempsReparationTotal;

            piston.add("tete");

            piston.add("axe");

            piston.add("jupe");

        }

        System.out.println("le nombre de piston fabriquer est " + nbPistonsProduits);

        System.out.println("le temps necessaire est de " + tempsTraitementTotal + " minutes");

        System.out.println("le nombre total de panne est " + nbPanne);
    }

}
