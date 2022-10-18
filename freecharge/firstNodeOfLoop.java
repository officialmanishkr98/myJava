import java.util.*;

class Node {
    int key;
    Node next = null;
    Node(int key){
        this.key = key;
    }
};

public class firstNodeOfLoop {

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.key + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node detectAndRemoveLoop(Node head) {

        if(head == null || head.next == null) return null;
        
        Node slow = head;
        Node fast = head;

        slow = slow.next;
        fast = fast.next.next;

        while( fast != null || fast.next != null) {
            if(slow == fast) break;

            slow = slow.next;
            fast = fast.next.next;
        }

        if(slow != fast) return null;

        slow = head;

        while(slow.next != fast.next){
            slow = slow.next;
            fast = fast.next;
        }

        Node temp = fast.next;
        fast.next = null;
        return temp;
    }

    public static void main(String[] args) {
        Node head = new Node(50);
        head.next = new Node(20);
        head.next.next = new Node(15);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(10);     
                                                                                                                                                                                                        
        // Create a loop
        head.next.next.next.next.next = head.next.next;

        Node res = detectAndRemoveLoop(head);
        if (res == null)
            System.out.println("Loop does not exist");
        else
            System.out.println("Loop starting node is " + res.key);

        printList(head);
    }
}



    

    

    // // Function to detect and remove loop
    // // in a linked list that may contain loop
    // static Node detectAndRemoveLoop(Node head) {
    //     // If list is empty or has
    //     // only one node without loop
    //     if (head == null || head.next == null)
    //         return null;

    //     Node slow = head, fast = head;

    //     // Move slow and fast 1
    //     // and 2 steps ahead
    //     // respectively.
    //     slow = slow.next;
    //     fast = fast.next.next;

    //     // Search for loop using
    //     // slow and fast pointers
    //     while (fast != null &&
    //             fast.next != null) {
    //         if (slow == fast)
    //             break;
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }

    //     // If loop does not exist
    //     if (slow != fast)
    //         return null;

    //     // If loop exists. Start slow from
    //     // head and fast from meeting point.
    //     slow = head;
    //     while (slow != fast) {
    //         slow = slow.next;
    //         fast = fast.next;
    //     }

    //     return slow;
    // }

 