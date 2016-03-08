package TwoWayList;
import Exception.*;
/**
 * CSimple implementation of two directional list
 */
public class List<E> extends AbstractClasses.List<E> {
    private Node<E> head;
    private Node<E> tail;

    public List() {

    }

    /**
     * Adds element to end of the List
     *
     * @param o Element to be added
     */
    @Override
    public void addElement(E o) {
        switch (size) {
            case 0:
                head = new Node<>(o, null, null);
                tail = head;

                break;
            case 1:
                tail = new Node<>(o, head, null);
                head.setNextNode(tail);
                break;
            default:
                tail.setNextNode(new Node<>(o, null, tail));
                tail = (Node<E>) tail.getNextNode();
                break;
        }
        size++;
    }

    /**
     * Removes element at specified index in List
     * @param index Index of element to be Removeds
     */
    @Override
    public void removeElement(int index){
        if(index> getSize() - 1){
            throw new RemoveMethodException(index);
        }
        if (index == 1) {
            removeFirst();
        }else
        if (index == size-1) {
            tail = tail.getPreviousNode();
            tail.setNextNode(null);
        }else{
            Node<E> tmpNode = getNode(index);
            Node<E> tmpNode2;
            tmpNode.getPreviousNode().setNextNode(tmpNode.getNextNode());
            tmpNode2= (Node<E>) tmpNode.getNextNode();
            tmpNode.getPreviousNode().setNextNode(tmpNode2.getPreviousNode());
        }

    }

    /**
     * Removes firs element of List
     */
    @Override
    public void removeFirst() {
        if (size > 1) {
            head = (Node<E>) head.getNextNode();
            head.setPreviousNode(null);
            size--;
        } else {
            head = null;
        }
    }

    /**
     * Remove all elements from List. After Calling this list size is 0
     */
    @Override
    public void clear() {
        size = 0;
        head = null;
        tail = null;
    }


    /**
     * returns List Item at specified index
     *
     * @param index index of element to return
     * @return List item at specified index
     */
    @Override
    public E get(int index){
        if(index < 0 || index > (getSize() - 1)){
            throw new GetMethodException(index);
        }
        if (index / 2 <= size / 2) {                     //if index is smaller than size/2 iterate from beggining, otherwise iterate from tail
            return getNodeFromHead(index).getData();
        } else {
            return getNodeFromTail(index).getData();
        }
    }

    private Node<E> getNode(int index) {

        if (index / 2 < size / 2) {                     //if index is smaller than size/2 iterate from beggining, otherwise iterate from tail
            return getNodeFromHead(index);
        } else {
            return getNodeFromTail(index);
        }
    }

    private Node<E> getNodeFromTail(int index) {
        Node<E> tmpNode = tail;
        for (int i = size; i > index; i--) {     //iterathe through Nodes From tal
            tmpNode = tmpNode.getPreviousNode();
        }
        return tmpNode;
    }

    private Node<E> getNodeFromHead(int index) {
        Node<E> tmpNode = head;
        for (int i = 0; i < index; i++) {           //iterate through all nodes to specified index
            tmpNode = (Node<E>) tmpNode.getNextNode();
        }
        return tmpNode;             //node at specified index
    }

}
