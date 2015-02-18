/**
 * Created by amineboufatah on 14/02/15.
 */
public class NoCoin implements State {

    Distributeur distributeur ;

    /**
     * Constructor
     * @param distributeur
     */
    public NoCoin(Distributeur distributeur){
        this.distributeur = distributeur ;
    }

    @Override
    public void insererPiece() {
        System.out.println("Vous venez d'inserer une pièce !");
        distributeur.setEtat(new HasOneCoin(distributeur));
    }

    @Override
    public void ejecterPiece() throws ImpossibleOperationException {
        System.out.println("VOUS N'AVEZ PAS INSERER DE PIECE !");
        throw new ImpossibleOperationException();
    }

    @Override
    public void tournerPoignee() {
        System.out.println("Veuillez inserer une piece pour tourner la poignée ");
    }

    @Override
    public void delivrerBonbon() throws ImpossibleOperationException {
        System.out.println("On ne peut vous délivrer de bonbon");
        throw new ImpossibleOperationException();
    }
}
