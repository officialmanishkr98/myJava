import java.util.*;

public class main {
    public static void main(String[] args){
        String a = "11";
        String b = "1";

        System.out.println( addBinary(a, b) + "<---ans");

    }   
    public static String addBinary(String a, String b) {
        
        int size = Math.max(a.length() , b.length());
        
        int lenA = a.length()-1;
        int lenB = b.length()-1;
        
        char[] ans = new char[size+1];
        char carry = '0';
        
        for(int i=size; i>=0; i--){
            char tempA = ( lenA >= 0 ) ? a.charAt(lenA) : '0';
            char tempB = ( lenB >= 0 ) ? b.charAt(lenB) : '0';
            
            lenA--;lenB--;
            
            char sum = '0';
            
            if( tempA == '0' && tempB == '0' && carry == '0') {
                ans[i] = '0';
                carry = '0';
            }
            
            if( tempA == '1' && tempB == '1' && carry == '0') {
                ans[i] = '0';
                carry = '1';
            }
            
            if( tempA == '1' && tempB == '0' && carry == '0') {
                ans[i] = '1';
                carry = '0';
            }
            
            if( tempA == '0' && tempB == '1' && carry == '0') {
                ans[i] = '1';
                carry = '0';
            }
            
            //............................
            
            if( tempA == '0' && tempB == '0' && carry == '1') {
                ans[i] = '1';
                carry = '0';
            }
            
            if( tempA == '1' && tempB == '1' && carry == '1') {
                ans[i] = '1';
                carry = '1';
            }
            
            if( tempA == '1' && tempB == '0' && carry == '1') {
                ans[i] = '0';
                carry = '1';
            }
            
            if( tempA == '0' && tempB == '1' && carry == '1') {
                ans[i] = '1';
                carry = '0';
            }
            
        }
        
        // System.out.println(ans.toString());
        
        String solution = "";
        // boolean flag = false;
        
        for(int i=0; i < ans.length; i++){
            // if(ans[i] == '')
            System.out.print(ans[i]);
            solution = ans[i] + solution;
        }
        
        System.out.println();
        
        // System.out.println(solution);
        return solution;
        
    } 
}
