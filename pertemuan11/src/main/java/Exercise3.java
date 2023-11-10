import java.util.LinkedList;

public class Exercise3 {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Senin");
        l_list.add("Selasa");
        l_list.add("Rabu");
        l_list.add("Kamis");
        l_list.add("Jumat");
        l_list.add("Sabtu");
        l_list.add("Minggu");

        // print the list
        System.out.println("The linked list: " + l_list);
    }
}
