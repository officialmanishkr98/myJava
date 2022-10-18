import java.util.*;

class Node {
    int data;

    Node left;
    Node right;

    Node(int num) {
        data = num;
        left = null;
        right = null;
    }
}


class boundaryTraversal {

    public static void printBoundary(Node rootnode) {

        if( rootnode == null) return;
        System.out.print(rootnode.data + " ");

        printRightBoundary(rootnode.right) ;

        printLeafNodes(rootnode.right) ;

        printLeafNodes(rootnode.left) ;

        printLeftBoundary(rootnode.left) ;
    }

    public static void printRightBoundary(Node nod) {

        if( nod == null) return;
        
        if(nod.right != null || nod.left != null) System.out.print(nod.data + " ");
        
        printRightBoundary(nod.right);
        
    }
    
    public static void printLeafNodes(Node nod) {
        
        if(nod == null) return;
        
        if(nod.right == null && nod.left == null) System.out.print(nod.data + " ");
        
        printLeafNodes(nod.right);
        printLeafNodes(nod.left);
    }
    
    public static void printLeftBoundary(Node nod) {
        
        if( nod == null) return;

        if(nod.right != null || nod.left != null) System.out.print(nod.data + " ");
        
        printLeftBoundary(nod.left);
        
    }
    
    public static void main(String[] args) {

        // BinaryTree tree = new BinaryTree();
        Node root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right = new Node(22);
        root.right.right = new Node(25);
        printBoundary(root);


/*       
                   20      
                 /    \
               8       22
             /   \       \
           4     12      25
                /  \
             10     14

*/
    }

}