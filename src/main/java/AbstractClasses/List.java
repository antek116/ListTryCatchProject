package AbstractClasses;

/**
 * Abstract class
 */
public abstract class List<E> implements Interfaces.List<E> {
    protected int size;
    protected Node<E> head;

    /**
     * Return size of List
     *
     * @return size of list
     */
    public int getSize(){
        return size;
    }

    /**
     * return true if list is empty
     *
     * @return true  if list is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }


    /**
     * checks if List contains specified elements
     *
     * @param o List element to check
     * @return true if list contains specified element
     */
    public boolean contains(E o) {
        Node tmpNode = head;
        for (int i = 0; i < size; i++) {
            if (tmpNode.getNextNode() != null && tmpNode.getNextNode().getData().equals(o)) {
                return true;
            }
                tmpNode = tmpNode.getNextNode();}
        return false;
    }

}


