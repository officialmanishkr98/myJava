import java.util.*;


class SinglyLinkedListNode{
    int data;
    SinglyLinkedListNode next;
}

public class main4 {
    public static void main(String[] args) {
        

        SinglyLinkedListNode l1 = new SinglyLinkedListNode();
        SinglyLinkedListNode l2 = new SinglyLinkedListNode();

        l1.data = 4;
        l1.next = new SinglyLinkedListNode();
        l1.next.data = 5;

        // display(l1);
        
        l2.data = 3;
        l2.next = new SinglyLinkedListNode();
        l2.next.data = 4;

        SinglyLinkedListNode solve = addListNumbvers(l1, l2);



        System.out.println();
        System.out.print("from main - ");
        display(solve);
        


        
    }
    public static SinglyLinkedListNode addListNumbvers(SinglyLinkedListNode l1 , SinglyLinkedListNode l2) {
        
        
        SinglyLinkedListNode ans = new SinglyLinkedListNode();
        
        SinglyLinkedListNode solve = ans;
        
        int carry = 0;

        while( l1 != null || l2 != null || carry != 0){
        
            int n1 = ( l1 != null ) ? l1.data : 0;
            if(l1 != null) l1 = l1.next;
            
            int n2 = ( l2 != null ) ? l2.data : 0;
            if(l2 != null) l2 = l2.next;
            
            int sum = n1+n2+carry;
            carry = sum/10;
            sum = sum%10;

            ans.next = new SinglyLinkedListNode();
            ans.next.data = sum;
            ans = ans.next;
            
        }

        return solve.next;
    }
    
    public static void display( SinglyLinkedListNode list ) {
        while(list != null){
            System.out.print( list.data + " ");
            list = list.next;
        }
    }
}

