public class MyLinkList_3 {
    static class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
            next = null;
        }
    }
    Node head;
    //print
    public void printlist(){
        Node current = head;
        while (current != null){
            System.out.print(current.value +" ");
            current = current.next;
        }
        System.out.println();
    }

    //delete by node
    public void deleteByNode(Node node){
        Node current = head;
        while(current.next != node){
            current = current.next;
        }
        current.next = current.next.next;
    }

    //delete by value
    public void deleteByValue(int value){
        Node current = head;
        while(current.next.value != value){
            current = current.next;
        }
        current.next = current.next.next;
    }

    public static void main(String[] args) {
        MyLinkList_3 linkList = new MyLinkList_3();
        linkList.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        linkList.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        linkList.printlist();

        linkList.deleteByValue(40);
        linkList.printlist();
    }
}
