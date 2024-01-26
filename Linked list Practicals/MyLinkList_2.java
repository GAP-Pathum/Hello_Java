public class MyLinkList_2 {

    static class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
            next = null;
        }
    }

    Node head;

    public static void main(String[] args) {
        MyLinkList_2 MyList = new MyLinkList_2();
        MyList.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(60);

        MyList.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = null;
        
        Node currunt = MyList.head;

        while (currunt != null) {
            System.out.print(currunt.value+" ");
            currunt = currunt.next;
        }
        System.out.println();

        //insert at beginig
        System.out.println("After insert begining");
        MyList.insertAtBegining(70);
        currunt = MyList.head;
        while (currunt != null) {
            System.out.print(currunt.value+" ");
            currunt = currunt.next;
        }
        System.out.println();
        
        //insert at middle
        System.out.println("After insert middle");
        MyList.insertAtMiddle(second, 45);
        currunt = MyList.head;

        while (currunt != null) {
            System.out.print(currunt.value+" ");
            currunt = currunt.next;
        }
        System.out.println();

        //insert at end
        System.out.println("After insert at end");
        MyList.insertAtEnd(85);
        currunt = MyList.head;

        while (currunt != null) {
            System.out.print(currunt.value+" ");
            currunt = currunt.next;
        }
        System.out.println();
    }

    //inserrt at begining
    public void insertAtBegining(int New_Data){
        Node newNode = new Node(New_Data);
        newNode.next = head;
        head = newNode;
    }

    //insert at middle
    public void insertAtMiddle(Node prev_Node, int New_Data){
        if(prev_Node == null){
            System.out.println("Previou node can't be null!!!");
        }
        Node newNode = new Node(New_Data);
        newNode.next = prev_Node.next;
        prev_Node.next = newNode;
    }

    //insert at end
    public void insertAtEnd(int New_Data){
        Node newNode = new Node(New_Data);

        if(head == null){
            head = newNode;
        }
        newNode.next = null;

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }
}
