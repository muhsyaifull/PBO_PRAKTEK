import java.util.Map;
import java.util.TreeMap;

public class Exercise13 {
    public static void main(String args[]){
        // Create a tree map
        TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();
        // Put elements to the map
        tree_map.put(1, "Senin");
        tree_map.put(2, "Selasa");
        tree_map.put(3, "Rabu");
        tree_map.put(4, "Kamis");
        tree_map.put(5, "Jumat");
        tree_map.put(6, "Sabtu");
        tree_map.put(7, "Minggu");

        for (Map.Entry<Integer,String> entry : tree_map.entrySet())
        {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
    }
}
