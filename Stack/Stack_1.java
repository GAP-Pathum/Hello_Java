package Stack;
import java.util.Stack;

public class Stack_1{
public static void main(String[] args) {
    Stack <Integer> MyStack = new Stack<>();
    //push
    MyStack.push(10);
    MyStack.push(20);
    MyStack.push(30);
    MyStack.push(40);
    MyStack.push(50);

    System.out.println(MyStack);

    //pop
    MyStack.pop();
    int popped = MyStack.pop();
    System.out.println(MyStack);
    System.out.println("Popped: "+popped);

    //search
    System.out.println(MyStack.search(20));

    //peek
    System.out.println(MyStack.peek());

    //isempty
    System.out.println(MyStack.isEmpty());

}
}