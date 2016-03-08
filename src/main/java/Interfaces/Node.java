package Interfaces;

/**
 * Node Interface
 */
public interface Node<E> {
    /**
     * returns current Node Data
     *
     * @return NodeData
     */
    E getData();

    /**
     * set Node data to specified in param
     *
     * @param data data to set in node
     */
    void setData(E data);

}
