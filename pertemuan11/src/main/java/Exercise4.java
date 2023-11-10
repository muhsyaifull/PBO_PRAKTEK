import java.util.Iterator;
import java.util.LinkedList;

public class Exercise4 {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Macan");
        l_list.add("Harimau");
        l_list.add("Gajah");
        l_list.add("Singa");
        l_list.add("Ular");

        // print original list
        System.out.println("Original linked list:" + l_list);

        Iterator it = l_list.descendingIterator();

        // Print list elements in reverse order
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
