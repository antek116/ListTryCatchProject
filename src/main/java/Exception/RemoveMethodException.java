package Exception;

/**
 *
 * Class of RemoveMethodException.
 */
public class RemoveMethodException extends ListException {

    /**
     * Constructor of RemoveMethodException
     * @param index number of index
     */
    public RemoveMethodException(int index) {
        super();
        this.index = index;
        System.out.println("You Cant remove Object with index : " + index);
    }
}
