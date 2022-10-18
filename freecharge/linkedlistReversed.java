// 3 pointer method
import java.util.*;

class Node {
    int data;
    Node next = null;

    Node(int data) {
        this.data = data;
    }

}

public class linkedlistReversed {


    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static Node nodeReverse(Node head) {
        if(head.next == null) return head;
        
        Node prev = null;
        Node curr = head;
        Node next = null;

        while( curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void main(String[] args) {

        Node head = new Node(85);
        head.next = new Node(15);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);

        System.out.println("Given Linked list");
        printList(head);
        head = nodeReverse(head);
        System.out.println();
        System.out.println("Reversed linked list ");
        printList(head);
    }
}
