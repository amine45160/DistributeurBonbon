/**
 * Created by amineboufatah on 14/02/15.
 */
public interface State {

    /**
     * Method that puts a coin on the machine
     * @throws ImpossibleOperationException
     */
    public void insererPiece() throws ImpossibleOperationException;

    /**
     * Method that pulls the coin from the machine
     * @throws ImpossibleOperationException
     */
    public void ejecterPiece() throws ImpossibleOperationException;

    /**
     * Method that turns on the machine
     * @throws ImpossibleOperationException
     */
    public void tournerPoignee() throws ImpossibleOperationException;

    /**
     * Method that delivers the candy
     * @throws ImpossibleOperationException
     */
    public void delivrerBonbon() throws ImpossibleOperationException;

}
