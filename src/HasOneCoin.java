/**
 * Created by amineboufatah on 14/02/15.
 */
public class HasOneCoin implements State {

    Distributeur distributeur ;

    /**
     * Constructor
     * @param distributeur
     */
    public HasOneCoin(Distributeur distributeur){
        this.distributeur = distributeur ;
    }

    @Override
    public void insererPiece() throws ImpossibleOperationException {
        System.out.println("vous avez dèja inséré une pièce ");
        throw new ImpossibleOperationException();
    }

    @Override
    public void ejecterPiece() {
        System.out.println("vous venez d'éjecter votre pièce");
        distributeur.setEtat(new NoCoin(distributeur));

    }

    @Override
    public void tournerPoignee() {
        System.out.println("Vous avez tourner la poignée");
        distributeur.setEtat(new Delivered(distributeur));

    }

    @Override
    public void delivrerBonbon() throws ImpossibleOperationException {
        System.out.println("Vous devez faire tourner la poignée pour vous faire délivrer le bonbon");
        throw new ImpossibleOperationException();
    }
}
