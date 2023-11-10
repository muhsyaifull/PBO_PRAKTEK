import java.util.Iterator;
import java.util.TreeSet;

public class Exercise8 {
    public static void main(String[] args) {
        // create an empty tree set
        TreeSet<String> t_set = new TreeSet<String>();
        // use add() method to add values in the tree set
        t_set.add("Jeruk");
        t_set.add("Kelapa");
        t_set.add("Labu");
        t_set.add("Mentimun");
        t_set.add("Apel");
        // print original list
        System.out.println("Urutan Asli:" + t_set);
        Iterator it = t_set.descendingIterator();
        // Print list elements in reverse order
        System.out.println("Setelah dibalik:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
