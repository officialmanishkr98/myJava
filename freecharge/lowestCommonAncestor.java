// Youtube -> https://www.youtube.com/watch?v=_-QHfMDde90
import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

class Node {
    int data;
    Node left = null;
    Node right = null;

    Node(int data) {
        this.data = data;
    }

}

public class lowestCommonAncestor {

    public static void main(String[] args) {
        
        Node root = new Node(1);
        
        root.left = new Node(2);
        root.right = new Node(3);
        
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node ans = lowestCommonNode(root , 2 , 7 );
        System.out.println( ans.data );
        
    }

    public static Node lowestCommonNode( Node root , int nod1 , int nod2 ) {

        if( root == null || root.data == nod1 || root.data == nod2 ){
            return root;
        }

        Node left = lowestCommonNode(root.left, nod1, nod2);
        Node right = lowestCommonNode(root.right, nod1, nod2);

        if(left == null) return right;

        else if(right == null) return left;

        else return root;

    }

}
/*
                 1
            /        \
          2          3
       /    \     /    \
     4       5   6      7
 */

