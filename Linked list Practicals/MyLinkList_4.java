public class MyLinkList_4 {
    public static class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
            next = null;
            prev = null;
        }
    }
    
    Node head;
    public void printlist(){
        Node current = head;
        while(current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    // prepend
    public void insertAtBegining(int New_Data){
        Node newNode = new Node(New_Data);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode; 
            head = newNode;
        }
    }

    //insert after a node
    public void insertAfter(Node preNode,int New_Data){
        if (preNode == null) {
            System.out.println("Preveous one can't be null!!!");
            return;
        }
        Node newNode = new Node(New_Data);
        newNode.next = preNode.next;
        preNode.next = newNode;
        newNode.prev = preNode;
        if (newNode.next == null) {
            newNode.next.prev = newNode;
        }
    }

    //insert before a node
     public void insertBefore(Node nxtNode,int New_Data){
        if (nxtNode == null) {
            System.out.println("Next one can't be null!!!");
            return;
        }
        Node newNode = new Node(New_Data);
        newNode.prev = nxtNode.prev;
        nxtNode.prev = newNode;
        newNode.next = nxtNode;
        if (newNode.prev != null) {
            newNode.prev.next = newNode;
        }else{
            head = newNode;
        }
    }

    //append
    public void insertAtEnd(int New_Data){
        Node newNode = new Node(New_Data);
        if (head == null) {
            head = newNode;            
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        newNode.prev = currentNode;
        currentNode.next = newNode;
    }

    //delete by node
    public void deleteByNode(Node node){
            if (head == node){
                head = head.next;
                return;
            }
            Node currNode = head;

            while (currNode != node) {
                currNode = currNode.next;
            }
            if (currNode.next == null) {
                currNode.prev.next = null;
                return;
            }

            currNode.prev.next = currNode.next;
            currNode.next.prev = currNode.prev;
    }

    //delete by value
    public void deleteByValue(int value){
        if (head.value == value){
            head = head.next;
            return;
        }
        Node currNode = head;

        while (currNode.value != value) {
            currNode = currNode.next;
        }
        if (currNode.next == null) {
            currNode.prev.next = null;
        }
        else{
            currNode.prev.next = currNode.next;
            currNode.next.prev = currNode.prev;
        }

    }

    public static void main(String[] args) {
        MyLinkList_4 dll = new MyLinkList_4();
        dll.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        dll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        fifth.prev = fourth;
        fourth.prev = third;
        third.prev = second;
        second.prev = dll.head;

        dll.printlist();

        //dll.insertAtBegining(05);
        //dll.insertAfter(second,25);
        //dll.insertBefore(third,15);
        //dll.insertAtEnd(55);
        //dll.deleteByNode(second);
        dll.deleteByValue(30);
        dll.printlist();

    }
}
