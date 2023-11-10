import java.util.TreeMap;

public class Exercise14 {
    public static void main(String args[]){

        TreeMap<String,String> tree_map1=new TreeMap<String,String>();

        tree_map1.put("C1", "Biru");
        tree_map1.put("C2", "Kuning");
        tree_map1.put("C3", "Ungu");
        tree_map1.put("C4", "Oranye");

        if(tree_map1.containsValue("Kuning")){
            System.out.println("TreeMap berisi nilai Kuning");
        } else {
            System.out.println("TreeMap tidak berisi nilai Kuning");
        }
        if(tree_map1.containsValue("Merah")){
            System.out.println("TreeMap berisi nilai Merah");
        } else {
            System.out.println("TreeMap tidak berisi nilai Merah");
        }
    }
}
