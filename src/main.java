/**
 * Created by amineboufatah on 14/02/15.
 */
public class main {

    public static void main(String [] args ){

        // CREATING A DISTRIBUTEUR

        Distributeur distributeur = new Distributeur();

        // FIRST TEST

        distributeur.insererPiece();
        distributeur.ejecterPiece();
        distributeur.insererPiece();
        distributeur.tournerPoignee();
        distributeur.delivrerBonbon();

        // SECOND TEST

        distributeur.insererPiece();
        distributeur.ejecterPiece();
        distributeur.insererPiece();
        distributeur.tournerPoignee();
        distributeur.delivrerBonbon();

        // THIRD TEST

        distributeur.insererPiece();
        distributeur.ejecterPiece();
        distributeur.insererPiece();
        distributeur.tournerPoignee();
        distributeur.delivrerBonbon();
        distributeur.ejecterPiece();

    }
}
