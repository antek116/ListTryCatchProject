package AbstractClasses;

/**
 * Class that have implemented basic methods of Node Class
 */
public abstract class Node<E> implements Interfaces.Node<E> {
    protected E data;
    protected Node<E> nextNode;

    /**
     * returns current Node Data
     *
     * @return NodeData
     */
    public E getData() {
        return data;
    }

    /**
     * set Node data to specified in param
     *
     * @param data data to set in node
     */
    public void setData(E data) {
        this.data = data;
    }

    /**
     * @return refference to next Node
     */
    public Node<E> getNextNode() {
        return nextNode;
    }

    /**
     * @param nextNode tp be set as refference to nextNode in Node
     */
    public void setNextNode(Node<E> nextNode) {
        this.nextNode = nextNode;
    }

}
