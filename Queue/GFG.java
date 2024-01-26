package Queue;
import java.util.*;

public class GFG{
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>();
        
        pq.add("Hello");
        pq.add("to");
        pq.add("Programming");

        System.out.println("Initial Queue " + pq);
        pq.remove("to");
        System.out.println("After Remove " + pq);
        System.out.println("Poll Method " + pq.poll());
        System.out.println("Final Queue " + pq);
    }
}