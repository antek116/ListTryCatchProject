package List;
import Exception.*;
/**
 * Simple implementation of one directional List
 */
public class List<E> extends AbstractClasses.List<E> {
    //private Node<E> head;

    public List() {
        head = new Node<E>();
        size = 0;
    }


    /**
     * Adds element to end of the List
     *
     * @param o Element to be added
     */
    public void addElement(E o) {
        if (size == 0) {
            head.setData(o);
        } else {

            Node<E> tmpNode = (Node<E>) head;
            while (tmpNode.getNextNode() != null) {
                tmpNode = (Node<E>) tmpNode.getNextNode();                //interate to end of the list
            }
            tmpNode.setNextNode(new Node<>(o, null));
        }
        size++;
    }

    /**
     * Removes element at specified index in List
     *
     * @param index Index of element to be Removed
     */
    public void removeElement(int index){
        if(index> getSize() - 1){
            throw new RemoveMethodException(index);
        }
        if (index == 0) {
            removeFirst();
        }
        if (index > 0) {
            Node<E> tmpNode = getNode(index - 1);
            tmpNode.setNextNode(tmpNode.getNextNode().getNextNode());
            size--;
        }
    }


    /**
     * Removes firs element of List
     */
    public void removeFirst() {
        if(getSize() != 0){
            head = head.getNextNode();
            head.setNextNode(head.getNextNode());
//            Node<E> tmpNode = (Node<E>) head;
//            tmpNode.setNextNode(head);
            size--;
        }

    }

    /**
     * Remove all elements from List. After Calling this list size is 0
     */
    public void clear() {
        /*Node tmpNode=head;
        for(int i=0;i<size;i++){

        }*/
        head = null;
        size = 0;
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
        return getNode(index).getData();}                      //List element at specified index


    /**
     * replaces value at specified index of list
     *
     * @param index index of element to replace
     * @param o     Element that will be added to specified index
     */
    public void set(int index, E o)
    {
        Node<E> tmpNode = (Node<E>) head;
        for (int i = 0; i < index; i++) {       //iterate to specified node
            tmpNode = (Node<E>) tmpNode.getNextNode();
        }
        tmpNode.setData(o);                  //switch current List Element with given as parameter
    }


    /**
     * Returns node of list at specified index
     *
     * @param index index of node
     * @return node at given index of list
     */
    private Node<E> getNode(int index) {
        Node<E> tmpNode = (Node<E>) head;
        for (int i = 0; i < index; i++) {           //iterate through all nodes to specified index
            tmpNode = (Node<E>) tmpNode.getNextNode();
        }
        return tmpNode;             //node at specified index
    }



}
