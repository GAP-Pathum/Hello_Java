import java.util.*;

public class stack {

    // ArrayList to store stack elements
    private ArrayList<Integer> elements;

    // Constructor to create an empty stack
    public stack() {
        elements = new ArrayList<>();
    }

    // Function to push an element onto the top of the stack
    public void push(int element) {
        elements.add(element);
    }

    // Function to pop an element from the top of the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // Or throw an exception
        } else {
            return elements.remove(elements.size() - 1);
        }
    }

    // Function to display elements in the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = elements.size() - 1; i >= 0; i--) {
                System.out.println(elements.get(i));
            }
        }
    }

    // Function to check if the stack is empty
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    // Function to get the size of the stack
    public int size() {
        return elements.size();
    }
}
