package Exception;

/**
 * Class of GetMethodException
 */
public class GetMethodException extends ListException {
    /**
     * Construcor of GetMethodException
     * @param index number of index
     */
    public GetMethodException(int index) {
        super();
        this.index = index;
        System.out.println("You cant get value of index " + index + ", Element does not exist.");
    }
}
