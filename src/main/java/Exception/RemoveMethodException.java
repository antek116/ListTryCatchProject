package Exception;

/**
 * Class of RemoveMethodException.
 */
public class RemoveMethodException extends ListException {

    /**
     * Constructor of RemoveMethodException
     *
     * @param index number of index
     */
    public RemoveMethodException(int index) {
        super("There's no object with index " + index + " to remove or IndexOutOfRange");
    }
}
