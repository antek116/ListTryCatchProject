import List.List;
import Exception.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * Class to Tests.
 */
public class ListTest {
    private List<Integer> list, listSecond;

    @Before
    public void setList() {
        this.list = new List<Integer>();
        this.listSecond = new List<Integer>();
        this.listSecond.addElement(0);
        this.listSecond.addElement(-50);
        this.listSecond.addElement(10000);
        this.listSecond.addElement(85723);

    }

    @After
    public void removeList() {
        this.listSecond = null;
        this.list = null;
    }

    @Test
    public void testGetSizeForTwoElements() throws Exception {
        list.addElement(1);
        list.addElement(2);
        assertEquals("Incorrect size after adding element to List", 2, list.getSize());
    }

    @Test
    public void testGetSizeForTenThousandElements() throws Exception {
        for (int i = 0; i < 10000; i++) {
            list.addElement(i);
        }
        assertEquals("Incorrect list size after adding 10000 elements in loop", 10000, list.getSize());
    }

    @Test
    public void testGetSizeForSameElements() throws Exception {
        Integer value = 2;
        list.addElement(value);
        list.addElement(value);
        assertEquals("incorrect list size after adding 2 same elements", 2, list.getSize());
    }

    @Test
    public void testGetSizeForEmptyList() throws Exception {
        assertEquals("Incorrect list size for empty list", 0, list.getSize());
    }

    @Test
    public void testGetSizeAfterAddOneElement() throws Exception {
        list.addElement(1);
        assertEquals("incorrect size after adding one element", 1, list.getSize());
    }

    @Test
    public void testGetSizeAfterAddTwoSame() throws Exception {
        list.addElement(1);
        list.addElement(1);
        assertEquals("incorrect size after adding one element", 2, list.getSize());
    }

    @Test
    public void testGetSizeAfterAddManyElementsAndRemoveOneOfThem() throws Exception {
        list.addElement(1);
        list.addElement(5);
        list.addElement(10000);
        list.addElement(-5);
        list.removeElement(2);

        assertEquals("incorrect size after adding many elements and remove one of them", 3, list.getSize());
    }

    @Test
    public void testGetSizeAfterRemoveFirst() throws Exception {
        list.addElement(1);
        list.addElement(5);
        list.addElement(100);
        list.removeFirst();
        assertEquals("incorrect size after remove first element", 2, list.getSize());
    }

    @Test
    public void testGetSizeAfterClearList() throws Exception {
        list.addElement(1);
        list.addElement(5);
        list.addElement(100);
        list.clear();
        assertEquals("incorrect size after clear list", 0, list.getSize());
    }


    @Test
    public void testIsEmptyWhenHasElements() throws Exception {
        assertEquals("incorrect status of list", false, listSecond.isEmpty());
    }

    @Test
    public void testIsEmptyWhenHasNoElements() throws Exception {
        assertEquals("incorrect status of list", true, list.isEmpty());
    }

    @Test
    public void testIsEmptyAfterAddElementsToEmptyList() throws Exception {
        list.addElement(5);
        list.addElement(500);
        list.addElement(-55);
        assertEquals("incorrect status of list", false, list.isEmpty());
    }

    //TODO append if to method below
   /* @Test
    public void testIsEmptyAfterRemoveOnlyElement() throws Exception {
        list.addElement(5);
        list.removeElement(0);
        assertEquals("incorrect status of list", true, list.isEmpty());
    }*/
    @Test
    public void testIsEmptyAfterClearList() throws Exception {
        listSecond.clear();
        assertEquals("incorrect status of list", true, listSecond.isEmpty());
    }


    @Test
    public void testContainsWhileHasNotElement() throws Exception {

        assertEquals("incorrect status of element", false, listSecond.contains(154));
    }

    @Test
    public void testContainsAfterAddElement() throws Exception {
        listSecond.addElement(99);
        assertEquals("incorrect status of element", true, listSecond.contains(99));
    }

    @Test
    public void testContainsAfterRemoveElement() throws Exception {
        listSecond.removeElement(0);
        assertEquals("incorrect status of element", false, listSecond.contains(0));
    }

    @Test
    public void testGetWhileElementIsCorrect() throws Exception {
        assertEquals("incorrect element of this index", -50, (int) listSecond.get(1));
    }
    @Test
    public void testGetAfterRemoveElementOfThisIndex() throws Exception {
        listSecond.removeElement(2);
        assertEquals("incorrect element of this index after remove", 85723, (int) listSecond.get(2));
    }

    @Test
    public void testSetPositiveChange() throws Exception {
        listSecond.set(0, -123);
        assertEquals("incorrect element of index after set", -123 , (int) listSecond.get(0));
    }

    @Test (expected = GetMethodException.class)
    public void shouldCatchGetMethodException() throws GetMethodException {
        //given
        List<Integer> list = new List<Integer>();
        //when
        int index = 10;
        //then
        list.get(index);
    }
    @Test
    public void shouldNotCatchGetMethodException() throws GetMethodException{
        //given
        List<Integer> list = new List<Integer>();
        list.addElement(23);
        list.addElement(41);
        list.addElement(32);
        //when
        int index = 1;
        //then
        list.get(index);
    }
    @Test (expected = RemoveMethodException.class)
    public void shouldCatchRemoveMethodException() throws RemoveMethodException {
        //given
        List<Integer> list = new List<Integer>();
        //when
        int index = 10;
        //then
        list.removeElement(index);
    }
    @Test(expected = GetMethodException.class)
    public void shouldNotCatchGetMethodExceptionForStringToInteger() throws GetMethodException {
        //given
        List<Integer> list = new List<Integer>();
        //when
        int index =Integer.parseInt("123");
        //then
        list.get(index);
    }
    @Test(expected = GetMethodException.class)
    public void shouldReturnGetMethodExceptionWhenElementNotExist() throws GetMethodException {
        //given
        List<Integer> list = new List<Integer>();
        //when
        int index = 0;
        //then
        list.get(index);
    }
    @Test
    public void shouldReturnFalseIfElementNotExist(){
        //given
        List<Integer> list = new List<Integer>();
        list.addElement(null);
        list.addElement(null);
        list.addElement(null);
        list.addElement(null);
        list.addElement(null);
        list.addElement(null);
        //when
        boolean is = list.contains(1);
        //then
        assertFalse(is);
    }
    @Test (expected = RemoveMethodException.class)
    public void shouldReturnRemoveMethodExceptionWhenTryToRemoveMoreThanOneTIme() throws RemoveMethodException {
        //given
        class tmpClass {
            public int tmpInt;
            public String tmpString;

            tmpClass(int tmpInt, String tmpString) {
                this.tmpInt = tmpInt;
                this.tmpString = tmpString;
            }
        }

        tmpClass tmpClass1 = new tmpClass(1,"Abc");
        List<tmpClass> list = new List<tmpClass>();
        list.addElement(tmpClass1);
        list.addElement(null);
        list.removeElement(0);
        //when
        list.removeElement(1);
        //then Exception
    }
}