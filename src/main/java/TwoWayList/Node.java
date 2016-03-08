package TwoWayList;

/**
 *
 * Created by INV-6179 on 04.03.2016.
 */
class Node<E> extends AbstractClasses.Node<E> {
    private Node<E> previousNode;

    /**
     * Empty constructor that sets data, nextNode and previousNode to null
     */
    public Node() {
        super();
        previousNode = null;
    }

    /**
     * Constructor that creates new node with given parameters
     *
     * @param data     to be stored in node
     * @param nextNode refference to nex node in List
     */
    public Node(E data, Node<E> nextNode, Node<E> previousNode) {
        this.data = data;
        this.nextNode = nextNode;
        this.previousNode = previousNode;
    }

    public Node<E> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node<E> previousNode) {
        this.previousNode = previousNode;
    }
}
