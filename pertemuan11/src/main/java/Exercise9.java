import java.util.PriorityQueue;

public class Exercise9 {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Kucing");
        queue.add("Kerang");
        queue.add("Kuda");
        queue.add("Kambing");
        queue.add("Kalkun");
        System.out.println("Elements of the Priority Queue: ");
        System.out.println(queue);
    }
}
