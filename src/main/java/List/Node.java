package List;

/**
 * Node class for one direcional list
 */

class Node<E> extends AbstractClasses.Node<E> {


    /**
     * Empty constructor that sets data and nextNode to null
     */
    public Node() {
        data = null;
        nextNode = null;
    }

    /**
     * Constructor that creates new node with given parameters
     *
     * @param data     to be stored in node
     * @param nextNode refference to nex node in List
     */
    public Node(E data, Node<E> nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }


}
