import java.util.*;

public class main3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        System.out.println(solve(n));
        
        
    }
    public static int solve(int n) {
        String binary = Integer.toBinaryString(12);

        for(int i=binary.length()-1; i>=0; i--){
            
            if(binary.charAt(i) == '1' ) return binary.length() - i;
        }

        return 0;
    }
}
