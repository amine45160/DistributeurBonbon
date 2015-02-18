/**
 * Created by amineboufatah on 14/02/15.
 */
public class Distributeur {

    State etat = new NoCoin(this);
    public static int nbBonbons = 2 ;

    /**
     * Default Constructor
     */
    public Distributeur(){

    }

    public void insererPiece(){
        try {
            etat.insererPiece();
        } catch (ImpossibleOperationException e) {
            e.printStackTrace();
        }
    }

    public void ejecterPiece(){
        try {
            etat.ejecterPiece();
        } catch (ImpossibleOperationException e) {
            e.printStackTrace();
        }
    }

    public void delivrerBonbon(){
        try {
            if ( nbBonbons>0) {
                nbBonbons--;
                etat.delivrerBonbon();
            }else{
                System.out.println("Nous ne disposons plus de bonbon veuillez nous excuser !");
                this.setEtat(new NoCandy(this));
            }
        } catch (ImpossibleOperationException e) {
            e.printStackTrace();
        }
    }

    public void tournerPoignee(){
        try {
            etat.tournerPoignee();
        } catch (ImpossibleOperationException e) {
            e.printStackTrace();
        }
    }

    public void setEtat(State etat) {
        System.out.println("Je suis dans l'etat "+etat.getClass().getName());
        this.etat = etat;
    }

}
