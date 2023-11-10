import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Pahing");
        list_Strings.add("Wage");
        list_Strings.add("Kliwon");
        list_Strings.add("legi");
        list_Strings.add("Pon");
        // Print the list
        System.out.println(list_Strings);
        // Now insert a color at the first and last position of the list
        list_Strings.add(0, "Abang");
        list_Strings.add(5, "Ijo");
        // Print the list
        System.out.println(list_Strings);
    }
}
