package Interfaces;
import Exception.*;
/**
 * Root interface of List collection hierarhy
 */
public interface List<E> {
    /**
     * Return size of List
     * @return size of list
     */
    int getSize();

    /**
     * Adds element to end of the List
     * @param o Element to be added
     */
    void addElement(E o);

    /**
     * Removes element at specified index in List
     * @param index Index of element to be Removed
     */
    void removeElement(int index);

    /**
     * Removes firs element of List
     */
    void removeFirst();

    /**
     * Remove all elements from List. After Calling this list size is 0
     */
    void clear();

    /**
     * checks if List contains specified elements
     * @param o List element to check
     * @return  true if list contains specified element
     */
    boolean contains(E o);

    /**
     * return true if list is empty
     * @return true  if list is empty
     */
    boolean isEmpty();

    /**
     * returns List Item at specified index
     * @param index index of element to return
     * @return  List item at specified index
     */
    E get(int index);


}
