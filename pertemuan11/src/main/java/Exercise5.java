import java.util.HashSet;

public class Exercise5 {
    public static void main(String[] args) {
        // Create a empty hash set
        HashSet<String> h_set = new HashSet<String>();
        // use add() method to add values in the hash set
        h_set.add("Kucing");
        h_set.add("Kambing");
        h_set.add("Koi");
        h_set.add("Kuda");
        h_set.add("Kura");
        h_set.add("Kijang");

        // print the hash set
        System.out.println("The Hash Set: " + h_set);
    }
}
