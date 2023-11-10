import java.util.HashMap;

public class Exercise12 {
    public static void main(String args[]) {
        HashMap<Integer,String> hash_map = new HashMap <Integer,String> ();
        hash_map.put(1, "Senin");
        hash_map.put(2, "Selasa");
        hash_map.put(3, "Rabu");
        hash_map.put(4, "Kamis");
        hash_map.put(5, "Jumat");
        hash_map.put(6, "Sabtu");
        hash_map.put(7, "Minggu");
        // print the map
        System.out.println("The Original linked map: " + hash_map);
        // Removing all the elements from the linked map
        hash_map.clear();
        System.out.println("The New map: " + hash_map);
    }
}
