import java.util.*;

public class minimumCoinChange {
    public static int fans = Integer.MAX_VALUE;
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();
        int t = scn.nextInt();
        
        coinchange(arr, t , 0 , 0);

        System.out.println(fans);
    }    

    public static void coinchange( int[]arr , int t , int sum , int ans){

        if( sum >= t) {
            if( sum == t) {
                if(ans < fans) fans = ans;
                return;
            }
            else return;
        }

        for(int i=0; i<arr.length; i++) {
            coinchange(arr, t, sum+arr[i] , ans+1 );
        }


    }
}
