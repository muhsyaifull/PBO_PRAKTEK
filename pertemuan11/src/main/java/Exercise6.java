import java.util.HashSet;

public class Exercise6 {
    public static void main(String[] args) {
        // Create a empty hash set
        HashSet<String> h_set = new HashSet();
        // use add() method to add values in the hash set
        h_set.add("Rusa");
        h_set.add("Rakun");
        h_set.add("Rubah");
        h_set.add("Rajawali");
        h_set.add("Rangkong");
        h_set.add("Rawa");
        System.out.println("Original Hash Set: " + h_set);
        System.out.println("Apakah array kosong "+h_set.isEmpty());
        System.out.println("menghapus semua array ");
        h_set.removeAll(h_set);
        System.out.println("setelah di hapus"+h_set);
    }
}
