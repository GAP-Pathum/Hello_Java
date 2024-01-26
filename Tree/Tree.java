package Tree;

class Node {
    int data ;
    Node left;
    Node right ;

    public Node (int data) {
        this.data = data;
        left = null;
        right = null ;
    }
}

public class Tree {

    Node root ;

    public Tree() {
        root = null ;
    }

    //insert new node
    public void insert (int data) {
        root = insertRec (root , data );
    }
    Node insertRec (Node root , int data) {
        if (root == null ) {
            root = new Node(data);
            return root ;
        }

        if ( data < root.data ) {
            root.left = insertRec(root.left , data);
        }
        else if (data > root.data ) {
            root.right = insertRec(root.right, data);
        }

        return root ;
    }



    //in order traversal
    void inorder(){
            inorderRec(root);
        }
    void inorderRec (Node root){
        if (root != null ) {
            inorderRec(root.left);
            System.out.print(root.data + " " );
            inorderRec(root.right);
        }
    }


    //preorder traversal
    void preorderRec(Node root){
        if (root != null ) {
            System.out.print(root.data + " " );
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
    void preorder() {
        preorderRec(root);
    }


    //postorder traversal
    void postorderRec (Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }
    void postorder () {
        postorderRec(root);
    }


    //delete

    Node deleteRec (Node root, int value) {
        if (root == null) {
            return root;
        }

        if (value< root.data){
            root.left = deleteRec(root.left , value);
        }
        else if (value > root.data) {
            root.right = deleteRec(root.right, value);
        }
        else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            //node with 2 children
            root.data = minValue(root.right);
            //delete inorder successor
            root.right = deleteRec(root.right , root.data) ;
        }
        return root;
    }
    void delete(int value) {
        root = deleteRec(root, value);
    }

    int minValue(Node root) {
        int minValue = root.data ;

        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    //search
    boolean searchRec(Node root , int value) {
        if (root == null) {
            return false;
        }
        if (value == root.data) {
            return true;
        }
        else if (value < root.data) {
            return searchRec(root.left ,value) ;
        }
        else {  // value > root.data
            return searchRec(root.right, value);
        }
    }

    boolean search (int value) {
        return searchRec(root, value) ;
    }

    public static void main ( String[] args) {

        Tree tree = new Tree();

        /*
        tree.insert(45);
        tree.insert(10);
        tree.insert(7);
        tree.insert(90);
        tree.insert(12);
        tree.insert(50);
        tree.insert(13);
        tree.insert(39);
        tree.insert(57);

         */

        tree.insert(9);
        tree.insert(5);
        tree.insert(2);
        tree.insert(1);
        tree.insert(4);
        tree.insert(7);
        tree.insert(6);
        tree.insert(8);
        tree.insert(12);
        tree.insert(17);
        tree.insert(13);
        tree.insert(11);

        // Print in-order traversal
        System.out.println("In-order traversal:");
        tree.inorder();

        // Print pre-order traversal
        System.out.println("\n\nPre-order traversal:");
        tree.preorder();

        // Print post-order traversal
        System.out.println("\n\nPost-order traversal:");
        tree.postorder();
        if (tree.search(12)) {
            System.out.println("\n\n 12 is present in the tree.");
        }
        else {
            System.out.println("\n\n12 is not present in the tree.");
        }

        tree.delete(7);
        tree.delete(90);
        tree.delete(10);

        // Print in-order traversal after deletion
        System.out.println("\n\nIn-order traversal after deletion:");
        tree.inorder();

    }
}