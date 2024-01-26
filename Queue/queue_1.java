package Queue;
import java.util.*;
public class queue_1 {
    public static void main(String[] args) {
        Queue <Integer> myQueue = new LinkedList<>();
        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);
        myQueue.add(40);
        myQueue.add(50);
         
        System.out.println(myQueue);
       
        myQueue.remove();
        System.out.println(myQueue);
        
        myQueue.remove(30);
        System.out.println(myQueue);

        myQueue.poll();
        System.out.println(myQueue);

        System.out.println(myQueue.peek());

    }
}
