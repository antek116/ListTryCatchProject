import TwoWayList.List;
import Exception.*;
/**
 *
 * Main class of program
 */
public class Main {
    public static void main(String args[]) {
        List<Integer> list = new List<>();
        List<Integer> list2 = new List<>();
        list.addElement(1);
        list.addElement(1);
        list.addElement(3);
        list.addElement(2);
        list2.getSize();
        System.out.println(list2.getSize());

        list.removeElement(10);
        System.out.println(list.get(10));
        printWholeList(list);
        printWholeList(list);
    }

    static void printWholeList(List list) {
        for (int i = 0; i < list.getSize(); i++) {
                System.out.println(list.get(i));
        }
    }
}
