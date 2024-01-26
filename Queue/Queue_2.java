package Queue;

public class Queue_2 {
    class Node {
        String data;
        Node next;
      
        Node(String data) {
          this.data = data;
          this.next = null;
        }
      }
      
      class Queue {
        Node front, rear;
      
        Queue() {
          front = rear = null;
        }
      
        void enqueue(String item) {
          Node newNode = new Node(item);
          if (isEmpty()) {
            front = rear = newNode;
          } else {
            rear.next = newNode;
            rear = newNode;
          }
        }
      
        String dequeue() {
          if (isEmpty()) {
            return null;
          }
          String item = front.data;
          if (front == rear) {
            front = rear = null;
          } else {
            front = front.next;
          }
          return item;
        }
      
        String peek() {
          if (isEmpty()) {
            return null;
          }
          return front.data;
        }
      
        boolean isEmpty() {
          return front == null;
        }
      
        void printQueue() {
          Node temp = front;
          while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
          }
          System.out.println("NULL");
        }
      }
      
      public class Main {
        public static void main(String[] args) {
          Queue wishlist = new Queue();
      
          wishlist.enqueue("HBD banner");
          wishlist.enqueue("Foil curtain");
          wishlist.enqueue("Star foil balloon");
          wishlist.enqueue("Garland tape");
      
          System.out.println("First item in WISHLIST: " + wishlist.peek());
      
          wishlist.dequeue();
          wishlist.dequeue();
      
          System.out.println("First item in WISHLIST after removing items: " + wishlist.peek());
      
          wishlist.printQueue(); // Prints the remaining items in the queue
        }
      }
}
