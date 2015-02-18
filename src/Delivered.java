/**
 * Created by amineboufatah on 14/02/15.
 */
public class Delivered implements State {

    Distributeur distributeur;

    /**
     * Constructor
     * @param distributeur
     */
    public Delivered(Distributeur distributeur){
        this.distributeur = distributeur ;
    }

    @Override
    public void insererPiece() {
        System.out.println("Veuillez patienter on vous délivre le bonbon");
    }

    @Override
    public void ejecterPiece() throws ImpossibleOperationException {
        throw new ImpossibleOperationException();
    }

    @Override
    public void tournerPoignee() {
        System.out.println("Please Wait ..");
    }

    @Override
    public void delivrerBonbon() {
      System.out.println("bonbon délivré !!");
      distributeur.setEtat(new NoCoin(distributeur));
    }
}
