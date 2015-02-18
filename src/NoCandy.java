/**
 * Created by amineboufatah on 14/02/15.
 */
public class NoCandy implements State {

    Distributeur distributeur ;

    /**
     * Constructor
     * @param distributeur
     */
    public NoCandy(Distributeur distributeur){
        this.distributeur = distributeur ;
    }

    @Override
    public void insererPiece() throws ImpossibleOperationException {
        throw new ImpossibleOperationException();
    }

    @Override
    public void ejecterPiece() {
        distributeur.setEtat(new NoCoin(distributeur));
    }

    @Override
    public void tournerPoignee() {
        System.out.println("il n'y a plus de bonbon disponible ");
    }

    @Override
    public void delivrerBonbon() {
        System.out.println("Il n'y plus de bonbons disponible");
    }
}
