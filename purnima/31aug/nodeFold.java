import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class nodeFold {
    public static void main(String[] args) {
        // 4 5 3 1 2 6
        Node nod                        = new Node(4);
        nod.next                       = new Node(5);
        nod.next.next                  = new Node(3);
        nod.next.next.next             = new Node(1);
        nod.next.next.next.next        = new Node(2);
        nod.next.next.next.next.next   = new Node(6);

        // display(nod);
        display(foldAndMerge(nod));

        // foldAndMerge(nod);
        
    }
    public static Node foldAndMerge(Node nod) {

        Node slow = nod;
        Node fast = nod.next;
        ArrayList<Integer> frstHalf = new ArrayList<>();

        while(fast.next != null){
            
            frstHalf.add(slow.data);

            slow = slow.next;
            fast = fast.next.next;
        }

        frstHalf.add(slow.data);

        fast = slow.next;

        Node ans = new Node(-1);
        Node temp = ans;
        for(int i=frstHalf.size()-1; i>=0; i--){
            temp.next = new Node(frstHalf.get(i) * fast.data );

            temp = temp.next;
            fast = fast.next;
        }

        return ans.next;
        
    }
    public static void display(Node nod) {

        while(nod != null){
            System.out.print(nod.data + " ");
            nod = nod.next;
        }
    }
}