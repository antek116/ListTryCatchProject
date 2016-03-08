package Exception;

/**
 * Class of GetMethodException
 */
public class GetMethodException extends ListException {

    public GetMethodException(int index) {
        super("Value of index" + index + ",Element not exist");
    }
}