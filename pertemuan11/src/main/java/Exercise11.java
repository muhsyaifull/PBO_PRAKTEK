import java.util.HashMap;
import java.util.Map;

public class Exercise11 {
    public static void main(String args[]) {
        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
        hash_map.put(1, "Senin");
        hash_map.put(2, "Selasa");
        hash_map.put(3, "Rabu");
        hash_map.put(4, "Kamis");
        hash_map.put(5, "Jumat");
        hash_map.put(6, "Sabtu");
        hash_map.put(7, "Minggu");
        for(Map.Entry x:hash_map.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }
}
