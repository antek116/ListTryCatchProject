package Exception;

/**
 *
 * Class of ListException
 */
public abstract class ListException extends RuntimeException{
    /**
     * Number of index.
     */
    protected int index ;
    ListException(){super();}
}
