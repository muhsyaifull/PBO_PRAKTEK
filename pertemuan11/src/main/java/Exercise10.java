import java.util.PriorityQueue;

public class Exercise10 {
    public static void main(String[] args) {

        // Create Priority Queue
        PriorityQueue<String> pq1 = new PriorityQueue<String>();
        // use add() method to add values in the Priority Queue
        pq1.add("Senin");
        pq1.add("Selasa");
        pq1.add("Rabu");
        pq1.add("Kamis");
        System.out.println("Original Priority Queue: "+pq1);

        // Inserts the specified element into this priority queue.
        pq1.offer("Blue");

        System.out.println("The New Priority Queue: " + pq1);
    }
}
